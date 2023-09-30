DROP DATABASE IF EXISTS bookshelf;
CREATE DATABASE bookshelf;

-- Create the Author table
CREATE TABLE IF NOT EXISTS authors (
  author_id serial PRIMARY KEY,
  author_name VARCHAR(255) NOT NULL
);

-- Create the Genre table
CREATE TABLE IF NOT EXISTS genres (
  genre_id serial PRIMARY KEY,
  genre_name VARCHAR(255) NOT NULL,
  description TEXT
);

-- Create the Book table
CREATE TABLE IF NOT EXISTS books (
  book_id serial PRIMARY KEY,
  title VARCHAR(255) NOT NULL,
  year INT,
  isbn VARCHAR(13),
  book_language VARCHAR(50),
  cover_url VARCHAR(255)
);

-- Create the Shelf table
CREATE TABLE IF NOT EXISTS shelves (
  shelf_id serial PRIMARY KEY,
  shelf_name VARCHAR(255) NOT NULL,
  description TEXT
);

-- Create the reader table
CREATE TABLE IF NOT EXISTS readers (
  reader_id serial PRIMARY KEY,
  reader_name VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  birthdate DATE,
  join_date DATE
);

-- Create the Many-to-Many relationship table for Author and Book
CREATE TABLE IF NOT EXISTS reader_books (
  reader_id INT NOT NULL,
  book_id INT NOT NULL,
  purchase_date DATE,
  rating INT,
  PRIMARY KEY(reader_id, book_id),
  FOREIGN KEY (reader_id) REFERENCES readers (reader_id),
  FOREIGN KEY (book_id) REFERENCES books (book_id)
);

-- Create the Many-to-Many relationship table for Author and Book
CREATE TABLE IF NOT EXISTS author_books (
  author_id INT NOT NULL,
  book_id INT NOT NULL,
  PRIMARY KEY (author_id, book_id),
  FOREIGN KEY (author_id) REFERENCES authors (author_id),
  FOREIGN KEY (book_id) REFERENCES books (book_id)
);

-- Create the Many-to-Many relationship table for Genre and Book
CREATE TABLE IF NOT EXISTS genre_books (
  genre_id INT NOT NULL,
  book_id INT NOT NULL,
  PRIMARY KEY (genre_id, book_id),
  FOREIGN KEY (genre_id) REFERENCES genres (genre_id),
  FOREIGN KEY (book_id) REFERENCES books (book_id)
);

-- Create the Many-to-Many relationship table for Shelf and Book
CREATE TABLE IF NOT EXISTS shelf_books (
  shelf_id INT NOT NULL,
  book_id INT NOT NULL,
  PRIMARY KEY (shelf_id, book_id),
  FOREIGN KEY (shelf_id) REFERENCES shelves (shelf_id),
  FOREIGN KEY (book_id) REFERENCES books (book_id)
);