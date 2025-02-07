package javaPractice.sn;

public abstract class LibraryItemSn {
    private String title;
    private int id;

    public LibraryItemSn(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public abstract String  getDetails();

}
