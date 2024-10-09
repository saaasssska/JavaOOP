import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> listBooks = new ArrayList<>();

    public void addBook(Book book) {
        listBooks.add(book);
    }

    public void getBooksByAuthor(Author author) {
        int col = 1;
        System.out.println("Автор: " + author.name);
        for(int i = 0; i < listBooks.size(); i++) {
            if (!listBooks.get(i).authorName.name.equals(author.name)) {
                continue;
            }
            System.out.println((col) + " " + listBooks.get(i).bookName + " " + listBooks.get(i).genre);
            col += 1;
        }
    }

    public void getAllBooks() {
        for(int i = 0; i < listBooks.size(); i++) {
            System.out.println((i + 1) + " " + listBooks.get(i).bookName + " " + listBooks.get(i).genre);
        }
    }
}
