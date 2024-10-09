public class Book {
    public String bookName;
    public String genre;
    public Author authorName;
    public Book (String bookName, String genre, Author name) {
        this.bookName = bookName;
        this.genre = genre;
        this.authorName = name;
    }

    public void getName() {
        System.out.println("Название: " + this.bookName);
    }
}
