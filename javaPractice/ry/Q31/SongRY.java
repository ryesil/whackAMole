package javaPractice.ry.Q31;

public class SongRY {
    private String title;
    private double duration;

    public SongRY(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public java.lang.String toString() {
        return this.title + ": " + this.duration;
    }

//    2.  SongRY
//    -   It has two fields, a String called title and a double called duration.
//    -  A constructor that accepts a String (title of the song) and a double (duration of the song). It initialises title and duration.
//    -  And two methods, they are:
//            -  getTitle(), getter for title.
//        -  toString(), Songs overriding toString method. Returns a String in the following format: "title: duration"
}
