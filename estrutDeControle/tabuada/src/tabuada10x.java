// Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

import java.util.Scanner;

public class tabuada10x {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numInformado = sc.nextInt();

        System.out.println("Seu número escolhido foi: " + numInformado);

        for (int i = 1; i<=10; i++) {
            System.out.println(i + " x " + numInformado + " = " + i*numInformado);
        }
        System.out.println("FIM");
        sc.close();
    }
}