/*Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
 * Se for menor ou igual a 18,5 "Abaixo do peso";
 * se for entre 18,6 e 24,9 "Peso ideal";
 * Se for entre 25,0 e 29,9 "Levemente acima do peso";
 * Se for entre 30,0 e 34,9 "Obesidade Grau I";
 * Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
 * Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
 */


import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura, peso, imc;
        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();
        System.out.print("Digite seu peso: ");
        peso = sc.nextDouble();
        imc = peso/(altura*altura);
        imc = Math.round(imc * 100.0) / 100.0;

        if (imc < 18.5) {
            System.out.println("Seu IMC é " +imc+", portanto, você está ABAIXO DO PESO.");
        }
        else if (imc > 18.5 && imc < 24.9) {
            System.out.println("Seu IMC é "+imc+", portanto, você está com o PESO IDEAL.");
        }
        else if (imc > 24.9 && imc < 29.9) {
            System.out.println("Seu IMC é "+imc+", portanto, você está LEVEMENTE ACIMA DO PESO.");
        }
        else if (imc > 29.9 && imc < 34.9) {
            System.out.println("Seu IMC é "+imc+", portanto, você está com OBSEDIDADE GRAU I.");
        }
        else if (imc > 34.9 && imc < 39.9) {
            System.out.println("Seu IMC é "+imc+", portanto, você está com OBSEDIDADE GRAU II  (severa).");
        }
        else if (imc > 39.9 && imc < 41.9) {
            System.out.println("Seu IMC é "+imc+", portanto, você está com OBSEDIDADE GRAU III  (mórbida).");
        }
        else{
            System.out.println("ERRO");
        }

    }
}