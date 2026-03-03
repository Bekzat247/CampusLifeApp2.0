public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void getFormat() {
        System.out.println("Generic book format");
    }

    @Override
    public String toString() {
        return "Book = {title='" + title + "', author='" + author + "'}";
    }
}