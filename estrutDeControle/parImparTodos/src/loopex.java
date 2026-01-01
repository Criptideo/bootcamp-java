//Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;

import java.util.Scanner;

public class loopex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        System.out.print("Digite outro número maior que o primeiro: ");
        int numero2 = input.nextInt();

        System.out.print("Par ou Impar: ");
        String escolha = input.next();

        if (escolha.equalsIgnoreCase("par")) {
            for (int i = numero2; i >= numero; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
        else if (escolha.equalsIgnoreCase("impar")) {
            for (int i = numero2; i >= numero; i--) {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
        else {
            System.out.println("Opção invalida");
        }
        input.close();
    }
}