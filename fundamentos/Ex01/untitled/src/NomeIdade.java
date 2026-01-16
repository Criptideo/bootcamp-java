import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        String idade = sc.nextLine();

        System.out.println("Olá, " + nome + ", você tem " + idade + " anos.");
    }

}