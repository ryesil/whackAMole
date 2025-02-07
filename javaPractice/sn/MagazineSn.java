package javaPractice.sn;

public class MagazineSn extends LibraryItemSn {

    private int issueNumber;
    private String publisher;

    public MagazineSn(String title, int id, int issueNumber, String publisher) {
        super(title, id);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }

    @Override
    public String getDetails() {
        return "Magazine - Title: " + getTitle() +
                ", Issue Number: " + issueNumber +
                ", Publisher: " + publisher +
                ", ID: " + getId();
    }
}
