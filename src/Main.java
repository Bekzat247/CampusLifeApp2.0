import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        library.add(new EBook("Digital Fortress", "Dan Brown"));
        library.add(new PrintedBook("Clean Code", "Robert Martin"));

        for (Book book : library) {
            System.out.print(book.getTitle() + " by " + book.getAuthor() + " - ");
            book.getFormat();
        }
    }
}