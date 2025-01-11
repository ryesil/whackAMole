package javaPractice.ry;

public class BookRY extends LibraryItemRY{

    private String author;
    private int pages;

    public BookRY(String title, int id, String author, int pages) {
        super(title, id);
        this.author = author;
        this.pages = pages;
    }


    @Override
    public String getDetails() {
        return "title: " +getTitle() + "id: " +getId() + "author: " + author + " pages: " + pages;
    }
}
