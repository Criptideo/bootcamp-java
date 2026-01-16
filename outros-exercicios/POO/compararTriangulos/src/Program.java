import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ler os dados de dois triangulos X e Y
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Enter the measuares of the first triangle (X): ");
        x.ladoUm = sc.nextDouble();
        x.ladoDois = sc.nextDouble();
        x.ladoTres = sc.nextDouble();

        System.out.println("Enter the measuares of the second triangle (Y): ");
        y.ladoUm = sc.nextDouble();
        y.ladoDois = sc.nextDouble();
        y.ladoTres = sc.nextDouble();

        double areaX = x.AreaTriangle();
        double  areaY = y.AreaTriangle();

        if (areaX > areaY) {
            System.out.printf("Higher triangle area is %.4f%n", areaY);
        }
        else if (areaX < areaY) {
            System.out.printf("Higher triangle area is %.4f%n", areaY);
        }
        else {
            System.out.println("ERROR, PLEASE TRY AGAIN");
        }
        sc.close();
    }
}

//quais os benefícios de calcular a área do triangulo por meio de um método integrado dentro da classe
//cada classe é resposável por si mesma
//1) Reaproveitamento de código;
//2) Delegação de responsabilidades.

