package Head4.Task1_2_3;

import java.util.Objects;

public class Point {
    protected Double x,y;

    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }


    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(x, point.x)
                && Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
