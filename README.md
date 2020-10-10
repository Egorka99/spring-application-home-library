# Home library application - storing a list of books and operation with them

## Used technologies:

- H2 Database
- Spring Boot
- Spring Data
- Spring AOP
- JPA (Hibernate)

## API:
### Author service:

| Method | Role |
|----------------|:---------:|
| ```void addNewAuthor(String firstName, String secondName, String lastName, LocalDate dateOfBirth) ``` | Adding new author |
| ```void deleteAuthorWithHisBooks(UUID authorId) ``` | Deleting author by id and books with this author |
| ```List<Author> getAllAuthors() ``` | Getting a list of all authors |

### BookService :

| Method | Role |
|----------------|:---------:|
| ```addNewBook(String bookName, int releaseYear, String isbn, String publisher, int pageCount, UUID authorId) ``` | Adding new book |
| ```deleteBook(UUID bookId) ``` | Deleting book by id |
| ``` List<Book> getAllBooks() ``` | Getting a list of all books |

### BookmarkService :

| Method | Role |
|----------------|:---------:|
| ``` void addNewBookmark(UUID userId, UUID bookId, int pageNumber) ``` | Adding new bookmark |
| ``` void deleteBookmark(UUID bookmarkId) ``` | Deleting bookmark by id |
| ``` List<Bookmark> getAllBookmarks() ``` | Getting a list of all bookmarks |

### HistoryService :

| Method | Role |
|----------------|:---------:|
| ``` void addHistory(UUID userId, String actionText) ``` | Adding new user action record |
| ``` void deleteHistory(UUID historyId) ``` | Deleting user action record by id |
| ``` List<History> getUserHistory(UUID userId) ``` | Getting a list of all user action record |

### SearchBookService :

| Method | Role |
|----------------|:---------:|
| ``` List<Book> searchBooksByPartOfName(String partOfName) ``` | Search books by book name or part of name |
| ``` Book searchBookByIsbn(String isbn) ``` | Search book by ISBN(International Standard Book Number) |
| ``` List<Book> searchBooksByReleaseYearRange(int startYear, int endYear) ``` | Search books by release year range (for example, 2011-2016) |
| ``` searchBooksByUserBookmark(UUID userId) ``` | Search books, which are contained in user bookmarks |
| ``` List<Book> searchBooksBySeveralWays(int year, int pageCount, String partOfName) ``` | Search books by release year, pageCount and book name |

### UserService :

| Method | Role |
|----------------|:---------:|
| ``` User login(String nickname, String password) ``` | Enter to system |
| ``` void register(String nickname, String password)  ``` | Register new user |
| ``` void unlockUser(UUID userId) ``` | Unlock user, which was blocked |
| ``` void lockUser(UUID userId) ``` | Block user |
