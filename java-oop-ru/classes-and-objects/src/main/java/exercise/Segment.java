package exercise;

// BEGIN
public class Segment {
    Point point1;
    Point point2;
    public Segment(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getBeginPoint() {
        return this.point1;
    }

    public Point getEndPoint() {
        return this.point2;
    }

    public Point getMidPoint() {
        int newX = (point1.getX() + point2.getX()) / 2;
        int newY = (point1.getY() + point2.getY()) / 2;
        return new Point(newX, newY);
    }
}
// END
