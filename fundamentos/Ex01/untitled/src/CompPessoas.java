import java.util.Scanner;

public class CompPessoas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite o nome do seu amigo: ");
        String nome2 = sc.nextLine();
        System.out.print("Digite a idade do seu amigo: ");
        int idade2 = sc.nextInt();

        System.out.println("Vocês têm " + (idade - idade2) + " anos de diferença.");

    }
}