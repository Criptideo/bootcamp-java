public class BankingFunctions {
    private double saldo, limiteCheque, chequeEspecialUsado;

    public BankingFunctions(double depositoInicial) {
        this.saldo = depositoInicial;
        if (depositoInicial <= 500) {
            this.limiteCheque = 50;
        }
        else {
            this.limiteCheque = this.limiteCheque = depositoInicial / 2;
        }
        this.chequeEspecialUsado = 0;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getCheque() {
        return limiteCheque - chequeEspecialUsado;
    }

    public double Deposito(double valorDeposito) {
        if (chequeEspecialUsado > 0){
            if(valorDeposito >= chequeEspecialUsado){
                valorDeposito -= chequeEspecialUsado;
                valorDeposito = 0;
            }
        }
        this.saldo +=valorDeposito;
        return this.saldo;
    }

    public boolean Saque(double valorSaque) {
        if (valorSaque  <= 0) return false;

        else if (this.saldo >= valorSaque) {
            this.saldo = this.saldo - valorSaque;
        }
        double resto = valorSaque - this.saldo;
        if (resto <=getCheque()) {
            chequeEspecialUsado += resto;
            return true;
        }
        return false;
    }

    public boolean pagarBoleto(double valorPagar) {
        return Saque(valorPagar);
    }

    public boolean estaUsandoCheque(){
        return chequeEspecialUsado > 0;
    }
    public void cobrarTaxaCheque(){
        if(chequeEspecialUsado > 0){
            double taxa = chequeEspecialUsado * 0.2;
            System.out.printf("Cobrado 20%% de taxa sobre o valor usado no cheque especial: R$%.2f%n", taxa);
            saldo -= taxa;
        }
    }
}
