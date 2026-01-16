import java.util.Locale;
import java.util.Scanner;

public class StockApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Product Name: ");
        product.name = sc.nextLine();
        System.out.print("Product Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();


        System.out.println("Product data: " + product);
        sc.nextLine();
        System.out.print("Remove or Add from stock? [rm/add]: ");
        String choice =  sc.nextLine();
        //System.out.println(choice.toLowerCase());

        if (choice.equalsIgnoreCase("rm")) {
            System.out.println("Enter the number of products to be removed from the stock: ");
            int quantity = sc.nextInt();
            product.removeProducts(quantity); //atualiza a quantidade
            System.out.println("Product removed successfully!");
            System.out.println("Updated data: " + product);
        }
        else if (choice.equalsIgnoreCase("add")) {
            System.out.println("Enter the number of products to be added in stock: ");
            int quantity = sc.nextInt();
            product.addProducts(quantity); //atualiza a quantidade
            System.out.println("Product added successfully!");
            System.out.println("Updated data: " + product);
        }
        else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
