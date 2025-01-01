package javaPractice.ry;

public abstract class LibraryItemRY {
    private String title;
    private int id;

    public LibraryItemRY(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public abstract String getDetails();
}
