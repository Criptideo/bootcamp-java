//Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados


import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número base: ");
        int base = sc.nextInt();

        int numero;

        while(true){
            System.out.print("Insira um número: ");
            numero = sc.nextInt();

            if(numero<base){
                System.out.println("Numero invalido pois tem o mesmo valor ou menor valor do que a base");
                continue;
            }
            if(numero%base!=0){
                System.out.println("Resto é diferente de 0. Programa finalizado");
                break;
            }
            System.out.println("Divisão de "+numero+ "/" +base+ "=" + numero/base + " é exata, portanto, continue...");
        }
        sc.close();
    }
}