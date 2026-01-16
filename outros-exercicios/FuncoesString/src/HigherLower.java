import java.util.Scanner;

public class HigherLower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int higher = max(num1,num2,num3);
        int lower = minimum(num1,num2,num3);

        showResult(higher,lower);

        input.close();
    }

    public static int max(int a, int b, int c){
        int aux;
        if(a>b&&a>c){
            aux=a;
        }
        else if(b>c){
            aux=b;
        }
        else{
            aux=c;
        }
        return aux;
    }
    public static int minimum(int a, int b, int c) {
        int aux;
        if (a < b && a < c) {
            aux = a;
        } else if (b < c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }
    public static void showResult(int higher, int lower) {
        System.out.println("Higher = " + higher);
        System.out.println("Lower = " + lower);
    }
}

