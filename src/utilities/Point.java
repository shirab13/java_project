package utilities;

public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        if (x < 0 || x > 1000000 || y < 0 || y > 800) {
            throw new IllegalArgumentException("Invalid point coordinates");
        }
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if (x < 0 || x > 1000000) {
            throw new IllegalArgumentException("Invalid x coordinate");
        }
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        if (y < 0 || y > 800) {
            throw new IllegalArgumentException("Invalid y coordinate");
        }
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }
}
