public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Джордж Оруэлл", 46);
        Author author2 = new Author("Александр", 22);

        Book book1 = new Book("1984", "Антиутопия", author1);
        Book book2 = new Book("Скотный двор", "Сатира", author1);

        Book book3 = new Book("Школа", "Лирика", author2);

        book1.getName();

        author1.writeBook(book1);
        author1.writeBook(book2);
        author1.getBooks();

        Reader reader1 = new Reader("Алексей", 30);
        reader1.readBook(book1);
        System.out.println("-------------------------");
        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.getAllBooks();
        System.out.println("-------------------------");
        library.getBooksByAuthor(author2);
        System.out.println("-------------------------");
        author1.getInfo();
        reader1.getInfo();
    }
}