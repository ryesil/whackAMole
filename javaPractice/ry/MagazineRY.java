package javaPractice.ry;

public class MagazineRY extends LibraryItemRY{
    private int issueNumber;
    private String publisher;

    public MagazineRY(String title, int id, int issueNumber, String publisher) {
        super(title, id);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }

    @Override
    public String getDetails() {
        return "title: " +getTitle() + "id: " +getId() + "issueNumber: " + issueNumber + " publisher: " + publisher;
    }
}
