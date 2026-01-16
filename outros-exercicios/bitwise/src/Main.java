public class Main {
    public static void main(String[] args) {
        int n1 = 89;
        int n2 = 60;
        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);
        System.out.println(~n1);
        System.out.println(~n2);
        /* Exemplos de operadores

        & (AND): Retorna 1 se ambos os bits forem 1.
        | (OR): Retorna 1 se um dos bits for 1.
        ^ (XOR): Retorna 1 se os bits forem diferentes.
        ~ (NOT): Inverte todos os bits (0 vira 1, 1 vira 0).*/
    }
}

//onde se aplica isso: programação de baixo nível, redes, arduino, etc.
//por enquanto não preciso ter tanto foco nisso