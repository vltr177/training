# Создать таблицу fine следующей структуры
CREATE TABLE fine (
  fine_id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(30), number_plate VARCHAR(6), violation VARCHAR(60), sum_fine DECIMAL(8,2), date_violation DATE, date_payment DATE
)

# В таблицу fine первые 5 строк уже занесены. Добавить в таблицу записи с ключевыми значениями 6, 7, 8.
INSERT INTO fine
(name, number_plate, violation, sum_fine, date_violation, date_payment)
VALUES
('Баранов П.Е.', 'Р523ВТ', 'Превышение скорости(от 40 до 60)', Null, '2020-02-14', Null),
('Абрамова К.А.', 'О111АВ', 'Проезд на запрещающий сигнал', Null, '2020-02-23', Null),
('Яковлев Г.Р.', 'Т330ТТ', 'Проезд на запрещающий сигнал', Null, '2020-03-03', Null);
SELECT * FROM fine

# Занести в таблицу fine суммы штрафов, которые должен оплатить водитель, в соответствии с данными из таблицы traffic_violation. При этом суммы заносить только в пустые поля столбца  sum_fine.
# Таблица traffic_violation создана и заполнена.
UPDATE fine f, traffic_violation tv
SET f.sum_fine = tv.sum_fine
WHERE (f.violation = tv.violation) AND f.sum_fine IS NULL;
SELECT * FROM fine

# Вывести фамилию, номер машины и нарушение только для тех водителей, которые на одной машине нарушили одно и то же правило   два и более раз. При этом учитывать все нарушения, независимо от того оплачены они или нет.
# Информацию отсортировать в алфавитном порядке, сначала по фамилии водителя, потом по номеру машины и, наконец, по нарушению.
SELECT name, number_plate, violation
FROM fine
GROUP BY name, number_plate, violation
HAVING count(*) >= 2

# В таблице fine увеличить в два раза сумму неоплаченных штрафов для отобранных на предыдущем шаге записей. 
CREATE TABLE temp
SELECT name, number_plate, violation
FROM fine
GROUP BY name, number_plate, violation HAVING count(*) >= 2;

UPDATE fine AS f, temp AS t
SET f.sum_fine = IF(date_payment IS NULL, f.sum_fine * 2, f.sum_fine)
WHERE f.name = t.name
AND f.number_plate = t.number_plate

# Водители оплачивают свои штрафы. В таблице payment занесены даты их оплаты.
# Необходимо: в таблицу fine занести дату оплаты соответствующего штрафа из таблицы payment;
# уменьшить начисленный штраф в таблице fine в два раза  (только для тех штрафов, информация о которых занесена в таблицу payment) , если оплата произведена не позднее 20 дней со дня нарушения.
UPDATE 
    fine, payment
SET 
    fine.date_payment = payment.date_payment,
    fine.sum_fine = IF (DATEDIFF(payment.date_payment, fine.date_violation) <= 20, fine.sum_fine /2, fine.sum_fine)
WHERE fine.name = payment.name
AND fine.number_plate = payment.number_plate
AND fine.violation = payment.violation
AND fine.date_payment IS NULL

# Создать новую таблицу back_payment, куда внести информацию о неоплаченных штрафах (Фамилию и инициалы водителя, номер машины, нарушение, сумму штрафа  и  дату нарушения) из таблицы fine.
CREATE TABLE back_payment (
SELECT fine.name, fine.number_plate, fine.violation, fine.sum_fine, fine.date_violation
FROM fine
WHERE fine.date_payment IS NULL
);
SELECT * FROM back_payment

# Удалить из таблицы fine информацию о нарушениях, совершенных раньше 1 февраля 2020 года.
DELETE FROM fine
WHERE date_violation < '2020-02-01';
SELECT * FROM fine
