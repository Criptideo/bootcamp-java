import java.util.Scanner;

public class calcAreaQuad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double lado;

        System.out.print("Informe o tamanho do lado da altura e largura do quadrado em cm: ");
        lado = sc.nextDouble();

        double area = lado * lado;
        System.out.println("A área tem: " + area + "cm");

    }
}
