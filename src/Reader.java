import java.util.ArrayList;
import java.util.List;

public class Reader extends Person{
    private List<Book> readBooks = new ArrayList<>();

    public Reader(String name, int age) {
        super(name, age);
    }

    public void readBook(Book book) {
        readBooks.add(book);
    }

}
