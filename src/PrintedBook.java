public class PrintedBook extends Book {
    public PrintedBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void getFormat() {
        System.out.println("Paper format");
    }
}