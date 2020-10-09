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
