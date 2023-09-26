-- Create the Author table
CREATE TABLE Author (
                        id LONG AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(255) NOT NULL
);

-- Create the Genre table
CREATE TABLE Genre (
                       id LONG AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(255) NOT NULL
);

-- Create the Book table
CREATE TABLE Book (
                      id LONG AUTO_INCREMENT PRIMARY KEY,
                      title VARCHAR(255) NOT NULL
);

-- Create the Shelf table
CREATE TABLE Shelf (
                       id LONG AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(255) NOT NULL
);

-- Create the Many-to-Many relationship table for Author and Book
CREATE TABLE Author_Book (
                             author_id LONG,
                             book_id LONG,
                             PRIMARY KEY (author_id, book_id),
                             FOREIGN KEY (author_id) REFERENCES Author (id),
                             FOREIGN KEY (book_id) REFERENCES Book (id)
);

-- Create the Many-to-Many relationship table for Genre and Book
CREATE TABLE Genre_Book (
                            genre_id LONG,
                            book_id LONG,
                            PRIMARY KEY (genre_id, book_id),
                            FOREIGN KEY (genre_id) REFERENCES Genre (id),
                            FOREIGN KEY (book_id) REFERENCES Book (id)
);

-- Create the Many-to-Many relationship table for Shelf and Book
CREATE TABLE Shelf_Book (
                            shelf_id LONG,
                            book_id LONG,
                            PRIMARY KEY (shelf_id, book_id),
                            FOREIGN KEY (shelf_id) REFERENCES Shelf (id),
                            FOREIGN KEY (book_id) REFERENCES Book (id)
);



