package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;

    Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public double getArea() {
        return this.area;
    }

    public int compareTo(Home another) {
        if(this.getArea() > another.getArea()) {
            return 1;
        } else if (this.getArea() < another.getArea()) {
            return -1;
        } return 0;
    }

    public String toString() {
        var str = this.floorCount + " этажный коттедж площадью " + this.getArea() + " метров";
        return str;
    }
}
// END
