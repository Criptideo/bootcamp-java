import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o valor do primeiro depósito: ");
        double depositoInicial = sc.nextDouble();

        BankingFunctions functions = new BankingFunctions(depositoInicial);

        System.out.println("Sua conta foi criada com êxito! :D");
        System.out.printf("Saldo: R$%.2f%n", functions.getSaldo());

        System.out.printf(("O valor do seu cheque especial disponível é: R$%.2f%n"), functions.getCheque());
        System.out.println();
        int escolha;

        do {
            System.out.println();
            System.out.println("""
                    O que você gostaria de fazer?
                    \s
                    (0) Sair;
                    (1) Consultar Saldo;
                    (2) Consultar Cheque Especial;
                    (3) Deposito;
                    (4) Saque;
                    (5) Pagar Boleto;
                    (6) Verificar se a conta está usando cheque especial.
                    """);
            System.out.print("Escreva aqui sua escolha: ");
            escolha = sc.nextInt();

            if (escolha == 1) {
                System.out.println("Saldo: R$" + String.format("%.2f", functions.getSaldo()));
            } else if (escolha == 2) {
                functions.getCheque();
                System.out.println("Valor cheque especial: R$" + String.format("%.2f", functions.getCheque()));
            } else if (escolha == 3) {
                System.out.print("Escreva a quantia que queira depositar: R$");
                double valorDeposito = sc.nextDouble();
                System.out.println("Saldo: R$" + String.format("%.2f", functions.Deposito(valorDeposito)));
            } else if (escolha == 4) {
                System.out.print("Escreva a quantia que queira sacar: R$");
                double valorSacar = sc.nextDouble();

                boolean saqueIsTrue = functions.Saque(valorSacar);

                if (saqueIsTrue) {
                    System.out.println("Saque realizado com sucesso!");
                    System.out.println("Saldo: R$" + String.format("%.2f", functions.getSaldo()));
                } else {
                    System.out.println("Não foi possível realizar o saque.");
                }
            } else if (escolha == 5) {
                System.out.print("Insira o valor do boleto para pagar: R$");
                double valorBoleto = sc.nextDouble();
                System.out.println("Processando...");

                if (functions.pagarBoleto(valorBoleto)) {
                    System.out.println("Boleto realizado com sucesso!");
                    System.out.println("Saldo: R$" + String.format("%.2f", functions.getSaldo()));
                } else {
                    System.out.println("Não é possível pagar o boleto. Saldo insuficiente.");
                }

            } else if (escolha == 6) {
                if (functions.estaUsandoCheque()) {
                    System.out.println("Você está usando cheque especial!");
                } else {
                    System.out.println("Você não está usando cheque especial :(");
                }

            } else {
                System.out.println("Saindo...");
                return;
            }
        } while(escolha != 0);
        sc.close();
    }
}

