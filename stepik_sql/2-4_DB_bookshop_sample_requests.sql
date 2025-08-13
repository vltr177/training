# Вывести все заказы Баранова Павла (id заказа, какие книги, по какой цене и в каком количестве он заказал) в отсортированном по номеру заказа и названиям книг виде.
SELECT DISTINCT buy_book.buy_id, book.title, book.price, buy_book.amount
FROM client
INNER JOIN buy ON client.client_id = buy.client_id
INNER JOIN buy_book ON buy_book.buy_id = buy.buy_id
INNER JOIN book ON buy_book.book_id=book.book_id
WHERE name_client = "Баранов Павел"
ORDER BY buy_id, title; 

# Посчитать, сколько раз была заказана каждая книга, для книги вывести ее автора (нужно посчитать, в каком количестве заказов фигурирует каждая книга).
# Вывести фамилию и инициалы автора, название книги, последний столбец назвать Количество. Результат отсортировать сначала  по фамилиям авторов, а потом по названиям книг.
SELECT author.name_author, book.title, count(buy_book.amount) AS Количество
FROM book
JOIN author ON book.author_id = author.author_id
LEFT JOIN buy_book ON buy_book.book_id = book.book_id
GROUP BY name_author, title
ORDER BY name_author, title;

# Вывести города, в которых живут клиенты, оформлявшие заказы в интернет-магазине. Указать количество заказов в каждый город, этот столбец назвать Количество. Информацию вывести по убыванию количества заказов, а затем в алфавитном порядке по названию городов.
SELECT city.name_city, COUNT(buy.buy_id) AS Количество
FROM client
JOIN city ON client.city_id = city.city_id
LEFT JOIN buy ON buy.client_id = client.client_id
GROUP BY name_city
ORDER BY Количество DESC, name_city;

# Вывести номера всех оплаченных заказов и даты, когда они были оплачены.
SELECT buy_id, date_step_end
FROM buy_step
WHERE step_id = 1 and date_step_end IS NOT NULL;

# Вывести информацию о каждом заказе: его номер, кто его сформировал (фамилия пользователя) и его стоимость (сумма произведений количества заказанных книг и их цены), в отсортированном по номеру заказа виде. Последний столбец назвать Стоимость.
SELECT buy_book.buy_id, client.name_client, SUM(buy_book.amount * book.price) as Стоимость
FROM buy_book
INNER JOIN book ON buy_book.book_id = book.book_id
INNER JOIN buy ON buy_book.buy_id = buy.buy_id
INNER JOIN client ON buy.client_id = client.client_id
GROUP BY buy_book.buy_id
ORDER BY buy_book.buy_id

# Вывести номера заказов (buy_id) и названия этапов,  на которых они в данный момент находятся. Если заказ доставлен –  информацию о нем не выводить. Информацию отсортировать по возрастанию buy_id.
SELECT buy_step.buy_id, step.name_step
FROM buy_step
INNER JOIN step ON buy_step.step_id = step.step_id
WHERE buy_step.date_step_beg IS NOT NULL and buy_step.date_step_end IS NULL
ORDER BY buy_id;

# В таблице city для каждого города указано количество дней, за которые заказ может быть доставлен в этот город (рассматривается только этап Транспортировка).
# Для тех заказов, которые прошли этап транспортировки, вывести количество дней за которое заказ реально доставлен в город. А также, если заказ доставлен с опозданием, указать количество дней задержки, в противном случае вывести 0.
# В результат включить номер заказа (buy_id), а также вычисляемые столбцы Количество_дней и Опоздание. Информацию вывести в отсортированном по номеру заказа виде.
SELECT buy_step.buy_id, DATEDIFF(buy_step.date_step_end, buy_step.date_step_beg) AS Количество_дней, IF(city.days_delivery < (DATEDIFF(buy_step.date_step_end, buy_step.date_step_beg)), (DATEDIFF(buy_step.date_step_end, buy_step.date_step_beg)) - city.days_delivery, 0) AS Опоздание
FROM buy_step
INNER JOIN buy ON buy_step.buy_id = buy.buy_id
INNER JOIN client ON buy.client_id = client.client_id
INNER JOIN city ON client.city_id = city.city_id
WHERE buy_step.step_id = 3 and buy_step.date_step_beg IS NOT NULL and buy_step.date_step_end IS NOT NULL
ORDER BY buy_step.buy_id

# Выбрать всех клиентов, которые заказывали книги Достоевского, информацию вывести в отсортированном по алфавиту виде. В решении используйте фамилию автора, а не его id.
SELECT client.name_client
FROM buy_book
INNER JOIN book ON buy_book.book_id = book.book_id
INNER JOIN author ON book.author_id = author.author_id
INNER JOIN buy ON buy_book.buy_id = buy.buy_id
INNER JOIN client ON buy.client_id = client.client_id
WHERE author.name_author = "Достоевский Ф.М."
GROUP BY client.name_client
ORDER BY client.name_client

# Вывести жанр (или жанры), в котором было заказано больше всего экземпляров книг, указать это количество. Последний столбец назвать Количество.
SELECT genre.name_genre, SUM(buy_book.amount) AS Количество
FROM buy_book
INNER JOIN book ON buy_book.book_id = book.book_id
INNER JOIN genre ON book.genre_id = genre.genre_id
GROUP BY genre.name_genre
HAVING SUM(buy_book.amount) =
    (
    SELECT MAX(sum_amount)
    FROM
        (
        SELECT SUM(buy_book.amount) as sum_amount
        FROM buy_book
        INNER JOIN book ON buy_book.book_id = book.book_id
        INNER JOIN genre ON book.genre_id = genre.genre_id
        GROUP BY genre.name_genre
        ) query_in
    )

# Сравнить ежемесячную выручку от продажи книг за текущий и предыдущий годы. Для этого вывести год, месяц, сумму выручки в отсортированном сначала по возрастанию месяцев, затем по возрастанию лет виде. Название столбцов: Год, Месяц, Сумма.
SELECT Y AS Год, M AS Месяц, sum(C) AS Сумма
FROM
    (
    SELECT buy_id, client_id, book_id, date_payment, amount, PRICE, MONTHNAME(date_payment) AS M, YEAR(date_payment) AS Y, (amount * PRICE) as C
    FROM buy_archive
    UNION ALL
    SELECT buy.buy_id, client_id, book_id, date_step_end, buy_book.amount, price, MONTHNAME(date_step_end) AS M, YEAR(date_step_end) AS Y, (buy_book.amount * PRICE) as C
    FROM book INNER JOIN buy_book USING(book_id)
    INNER JOIN buy USING(buy_id)
    INNER JOIN buy_step USING(buy_id)
    INNER JOIN step USING(step_id)
    WHERE  date_step_end IS NOT Null and name_step = "Оплата"
    ) query_in
GROUP BY Y,M
ORDER BY Месяц, Год

# Для каждой отдельной книги необходимо вывести информацию о количестве проданных экземпляров и их стоимости за 2020 и 2019 год . За 2020 год проданными считать те экземпляры, которые уже оплачены. Вычисляемые столбцы назвать Количество и Сумма. Информацию отсортировать по убыванию стоимости.
SELECT title, sum(amount) As Количество, sum(Cost) AS Сумма
FROM
    (
    SELECT book.title, buy_archive.amount, (buy_archive.amount * buy_archive.price) as Cost
    FROM book INNER JOIN buy_archive USING(book_id)
    UNION ALL
    SELECT book.title, buy_book.amount, (buy_book.amount * PRICE) as Cost
    FROM book INNER JOIN buy_book USING(book_id)
    INNER JOIN buy USING(buy_id)
    INNER JOIN buy_step USING(buy_id)
    INNER JOIN step USING(step_id)
    WHERE  date_step_end IS NOT Null and name_step = "Оплата"
    ) query_in
GROUP BY title
ORDER BY Сумма DESC
