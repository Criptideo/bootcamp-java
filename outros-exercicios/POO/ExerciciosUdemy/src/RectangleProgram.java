import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = input.nextDouble();
        rectangle.height = input.nextDouble();

        System.out.println("AREA: "+ String.format("%.2f", rectangle.getArea()));
        System.out.println("PERIMETER: "+ String.format("%.2f", rectangle.getPerimeter()));
        System.out.println("DIAGONAL: "+ String.format("%.2f", rectangle.getDiagonal()));
    }
}
