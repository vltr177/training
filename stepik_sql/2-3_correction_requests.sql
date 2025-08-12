# Для книг, которые уже есть на складе (в таблице book), но по другой цене, чем в поставке (supply),  необходимо в таблице book увеличить количество на значение, указанное в поставке,  и пересчитать цену. А в таблице  supply обнулить количество этих книг.
UPDATE book 
    INNER JOIN author ON author.author_id = book.author_id 
    INNER JOIN supply ON book.title = supply.title
        and supply.author = author.name_author and supply.price != book.price
SET book.price = (book.price * book.amount + supply.price * supply.amount) / (book.amount + supply.amount),
    book.amount = book.amount + supply.amount, supply.amount = 0
WHERE book.price != supply.price; 
SELECT * FROM book; SELECT * FROM supply;

# Включить новых авторов в таблицу author с помощью запроса на добавление, а затем вывести все данные из таблицы author.  Новыми считаются авторы, которые есть в таблице supply, но нет в таблице author.
INSERT INTO author (name_author)
SELECT supply.author
FROM
    author 
        RIGHT JOIN supply on author.name_author = supply.author
WHERE name_author IS Null;
SELECT * FROM author;

# Добавить новые книги из таблицы supply в таблицу book на основе сформированного выше запроса. Затем вывести для просмотра таблицу book.
INSERT INTO book (title, author_id, price, amount)
SELECT title, author_id, price, amount
FROM
    author
        INNER JOIN supply ON author.name_author = supply.author
WHERE amount <> 0;
SELECT * FROM book;

# Занести для книги «Стихотворения и поэмы» Лермонтова жанр «Поэзия», а для книги «Остров сокровищ» Стивенсона - «Приключения». (Использовать два запроса).
UPDATE book
SET genre_id =
    (
         SELECT genre_id
         FROM genre
         WHERE name_genre = 'Поэзия'
     )
WHERE title = "Стихотворения и поэмы" and author_id =
    (
        SELECT author_id
        FROM author
        WHERE name_author = "Лермонтов М.Ю."
    );
UPDATE book
SET genre_id =
    (
         SELECT genre_id
         FROM genre
         WHERE name_genre = 'Приключения'
     )
WHERE title = "Остров сокровищ" and author_id =
    (
        SELECT author_id
        FROM author
        WHERE name_author = "Стивенсон Р.Л."
    );
SELECT * FROM book;

# Удалить всех авторов и все их книги, общее количество книг которых меньше 20.
DELETE FROM author
WHERE author_id IN
    (
        SELECT author_id
            FROM book
            GROUP BY author_id
        HAVING SUM(amount) < 20
        
    );

# Удалить все жанры, к которым относится меньше 4-х наименований книг. В таблице book для этих жанров установить значение Null.
DELETE FROM genre
WHERE genre_id IN
    (
        SELECT genre_id
        FROM book
        GROUP BY genre_id
        HAVING COUNT(title) < 4
    );

# Удалить всех авторов, которые пишут в жанре "Поэзия". Из таблицы book удалить все книги этих авторов. В запросе для отбора авторов использовать полное название жанра, а не его id.
DELETE FROM author
USING author
INNER JOIN book ON author.author_id = book.author_id
WHERE genre_id IN
    (
        SELECT genre_id
        FROM genre
        WHERE name_genre = "Поэзия"
    );
