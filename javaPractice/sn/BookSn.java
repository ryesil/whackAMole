package javaPractice.sn;

public class BookSn extends LibraryItemSn{

    private String author;
    private int pages;

    public BookSn(String title, int id, String author, int pages) {
        super(title, id);
        this.author = author;
        this.pages = pages;
    }


    @Override
    public String getDetails() {
        return "Book - Title: " + getTitle()
                + ", Author: " + author +
                ", Pages: " + pages +
                ", ID: " + getId();
    }
}
