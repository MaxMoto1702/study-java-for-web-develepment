IF OBJECT_ID('AUTHOR', 'U') IS NOT NULL DROP TABLE AUTHOR;
IF OBJECT_ID('BOOK', 'U') IS NOT NULL DROP TABLE BOOK;
IF OBJECT_ID('CATEGORY', 'U') IS NOT NULL DROP TABLE CATEGORY;

CREATE TABLE CATEGORY
(
  ID INT NOT NULL PRIMARY KEY IDENTITY ,
  CATEGORY_DESCRIPTION VARCHAR(20) NOT NULL
);

CREATE TABLE BOOK
(
  ID INT NOT NULL IDENTITY ,
  CATEGORY_ID INT NOT NULL ,
  BOOK_TITLE VARCHAR(60) NOT NULL,
  PUBLISHER VARCHAR(60) NOT NULL ,
  PRIMARY KEY (ID) ,
  CONSTRAINT FK_BOOK_1 FOREIGN KEY (CATEGORY_ID) REFERENCES CATEGORY(ID)
);

CREATE TABLE AUTHOR
(
  ID INT NOT NULL IDENTITY ,
  BOOK_ID INT NOT NULL,
  FIRST_NAME VARCHAR(20) NOT NULL,
  LAST_NAME VARCHAR(20) NOT NULL,
  PRIMARY KEY (ID),
  CONSTRAINT FK_AUTHOR_1 FOREIGN KEY (BOOK_ID) REFERENCES BOOK(ID)
);

INSERT INTO CATEGORY (CATEGORY_DESCRIPTION) VALUES ('Clojure');
INSERT INTO CATEGORY (CATEGORY_DESCRIPTION) VALUES ('Groovy');
INSERT INTO CATEGORY (CATEGORY_DESCRIPTION) VALUES ('Java');
INSERT INTO CATEGORY (CATEGORY_DESCRIPTION) VALUES ('Scala');

INSERT INTO BOOK (CATEGORY_ID, BOOK_TITLE, PUBLISHER) VALUES (1, 'Practical Clojure', 'Apress');
INSERT INTO BOOK (CATEGORY_ID, BOOK_TITLE, PUBLISHER) VALUES (2, 'Beginning Groovy, Grails and Griffon', 'Apress');
INSERT INTO BOOK (CATEGORY_ID, BOOK_TITLE, PUBLISHER) VALUES (2, 'Definitive Guide to Grails 2', 'Apress');
INSERT INTO BOOK (CATEGORY_ID, BOOK_TITLE, PUBLISHER) VALUES (2, 'Groovy and Grails Recipes', 'Apress');
INSERT INTO BOOK (CATEGORY_ID, BOOK_TITLE, PUBLISHER) VALUES (3, 'Modern Java Web Development', 'Apress');
INSERT INTO BOOK (CATEGORY_ID, BOOK_TITLE, PUBLISHER) VALUES (3, 'Java 7 Recipes', 'Apress');
INSERT INTO BOOK (CATEGORY_ID, BOOK_TITLE, PUBLISHER) VALUES (3, 'Java EE 7 Recipes', 'Apress');
INSERT INTO BOOK (CATEGORY_ID, BOOK_TITLE, PUBLISHER) VALUES (3, 'Beginning Java 7 ', 'Apress');
INSERT INTO BOOK (CATEGORY_ID, BOOK_TITLE, PUBLISHER) VALUES (3, 'Pro Java 7 NIO.2', 'Apress');
INSERT INTO BOOK (CATEGORY_ID, BOOK_TITLE, PUBLISHER) VALUES (3, 'Java 7 for Absolute Beginners', 'Apress');
INSERT INTO BOOK (CATEGORY_ID, BOOK_TITLE, PUBLISHER) VALUES (3, 'Oracle Certified Java Enterprise Architect Java EE7', 'Apress');
INSERT INTO BOOK (CATEGORY_ID, BOOK_TITLE, PUBLISHER) VALUES (4, 'Beginning Scala', 'Apress');

INSERT INTO AUTHOR (BOOK_ID, FIRST_NAME, LAST_NAME) VALUES (1, 'Luke', 'VanderHart');
INSERT INTO AUTHOR (BOOK_ID, FIRST_NAME, LAST_NAME) VALUES (2, 'Vishal', 'Layka');
INSERT INTO AUTHOR (BOOK_ID, FIRST_NAME, LAST_NAME) VALUES (3, 'Jeff', 'Brown');
INSERT INTO AUTHOR (BOOK_ID, FIRST_NAME, LAST_NAME) VALUES (4, 'Bashar', 'Jawad');
INSERT INTO AUTHOR (BOOK_ID, FIRST_NAME, LAST_NAME) VALUES (5, 'Vishal', 'Layka');
INSERT INTO AUTHOR (BOOK_ID, FIRST_NAME, LAST_NAME) VALUES (6, 'Josh', 'Juneau');
INSERT INTO AUTHOR (BOOK_ID, FIRST_NAME, LAST_NAME) VALUES (7, 'Josh', 'Juneau');
INSERT INTO AUTHOR (BOOK_ID, FIRST_NAME, LAST_NAME) VALUES (8, 'Jeff', 'Friesen');
INSERT INTO AUTHOR (BOOK_ID, FIRST_NAME, LAST_NAME) VALUES (9, 'Anghel', 'Leonard');
INSERT INTO AUTHOR (BOOK_ID, FIRST_NAME, LAST_NAME) VALUES (10, 'Jay', 'Bryant');
INSERT INTO AUTHOR (BOOK_ID, FIRST_NAME, LAST_NAME) VALUES (11, 'B V', 'Kumar');
INSERT INTO AUTHOR (BOOK_ID, FIRST_NAME, LAST_NAME) VALUES (12, 'David', 'Pollak');
