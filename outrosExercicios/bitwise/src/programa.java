import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mask = 0b100000; //0b para mostrar que é em binário
        int n = sc.nextInt();

        if((n&mask)!=0){
            System.out.println("6th bit is true!");
        }
        else{
            System.out.println("6th bit is false!");
        }
    }
}
