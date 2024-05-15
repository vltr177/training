# Создадим таблицу genre
CREATE TABLE book(
  book_id INT PRIMARY KEY AUTO_INCREMENT, title VARCHAR(50), author VARCHAR(30), price DECIMAL(8,2), amount INT
)
# Занесите новую строку в таблицу book (текстовые значения (тип VARCHAR) заключать либо в двойные, либо в одинарные кавычки):
INSERT INTO book(title, author, price, amount) VALUES('Мастер и Маргарита','Булгаков М.А.', 670.99, 3);
SELECT * FROM book
# Занесите три последние записи в таблицуbook,  первая запись уже добавлена на предыдущем шаге
INSERT INTO book(title, author, price, amount) VALUES('Белая гвардия' ,'Булгаков М.А.' ,540.5 ,5);
INSERT INTO book(title, author, price, amount) VALUES('Идиот' ,'Достоевский Ф.М.' ,460 ,10);
INSERT INTO book(title, author, price, amount) VALUES('Братья Карамазовы', 'Достоевский Ф.М.' ,799.01 ,2);
SELECT * FROM book
