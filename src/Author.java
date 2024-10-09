import java.util.*;


public class Author extends Person {
    private List<Book> writeBooks = new ArrayList<>();

    public Author(String name, int age) {
        super(name, age);
    }

    public void writeBook(Book book) {
        writeBooks.add(book);
    }

    public void getBooks() {
        System.out.println("Автор: " + this.name);
        for(int i = 0; i < writeBooks.size(); i++) {
            System.out.println((i + 1) + " "  +writeBooks.get(i).bookName + " " + writeBooks.get(i).genre);
        }
    }

}
