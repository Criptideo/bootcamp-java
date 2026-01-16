public class SobreStrings {
    public static void main(String[] args) {
        String original = " Clara Rangel ";

        //converter para minúsculas
        String lowerCase = original.toLowerCase();
        System.out.println("Inpute original: " + original);
        System.out.println("Lower Case: " + lowerCase);

        //converter para maiúsculas
        String upperCase = original.toUpperCase();
        System.out.println("Inpute original: " + original);
        System.out.println("Upper Case: " + upperCase);

        //trim: mantem a string original mas elimina os espaços em branco
        String trimFunction = original.trim();
        System.out.println("Inpute original: " + original);
        System.out.println("Trim Function: " + trimFunction);

        //substring pegar o caracter da posição escolhida e continuar por ele
        String caractere = original.substring(3);
        System.out.println("Original: " + original);
        System.out.println("Cortar String: "+ caractere);

        //quando quero recortar e qual o limite
        String caractere2 = original.substring(0,7).trim();
        System.out.println("Original: " + original);
        System.out.println("Cortar String: "+ caractere2);

        //trocar de lugar
        String trocarLugar = original.replace('a','4');
        System.out.println("Original: " + original);
        System.out.println("Cortar String: "+ trocarLugar);

        //qqual a primeira posição
        int qualPosicao = original.indexOf('a');
        System.out.println("Qual a posição do primeiro A: "+qualPosicao);

        //QUAL A ULTIMA OCORRENCIA DO A
        int ultimaPosicao = original.lastIndexOf('a');
        System.out.println("Qual a posição do último A : "+ultimaPosicao);
    }
}
