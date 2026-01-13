public class SeparandoNomes {
    public static void main(String[] args) {
        String nome1 = "Maria Clara Rangel e Souza";
        String nome2 = "Wilbur Lucht Flamel";
        String[] separarNomes = nome1.split(" ");
        String[] separarNomes2 = nome2.split(" ");
        System.out.println(separarNomes[1]+" " +separarNomes[2]);
        System.out.println(separarNomes2[0]+" " +separarNomes2[2]);

    }
}
