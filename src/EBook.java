public class EBook extends Book {
    public EBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void getFormat() {
        System.out.println("Digital format");
    }
}