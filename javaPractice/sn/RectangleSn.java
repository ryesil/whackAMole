package javaPractice.sn;

public class RectangleSn {
    private double width;
    private double length;

    public RectangleSn(double width, double length) {
        this.width = width;
        this.length = length;
    }

    //setter
    public double setWidth(double width) {
        this.width = width < 0 ? 0 : width;
        return width;
    }

    public double setLength(double length) {
        this.length = length<0? 0: length;
        return length;
    }
    //getter
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return width*length;
    }
}
