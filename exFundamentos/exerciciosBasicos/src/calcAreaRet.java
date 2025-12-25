import java.util.Scanner;

public class calcAreaRet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double lado1, lado2;

        System.out.print("Informe o tamanho do lado da largura do retângulo em cm: ");
        lado1 = sc.nextDouble();

        System.out.print("Informe o tamanho do lado da altura  do retângulo em cm: ");
        lado2 = sc.nextDouble();

        double area = lado1 * lado2;
        System.out.println("A área tem: " + area + "cm");

    }
}

