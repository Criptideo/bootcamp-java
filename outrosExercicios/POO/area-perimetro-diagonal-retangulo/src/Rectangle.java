public class Rectangle {
    double width, height;

    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return ((width * 2) + (height * 2));
    }
    public double getDiagonal() {
        return Math.sqrt((width * width) + (height * height));
    }
}
