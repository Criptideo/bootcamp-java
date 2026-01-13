import java.util.Scanner;

public class CadastroEmployee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name  = input.nextLine();
        System.out.print("Gross Salary: $");
        employee.grossSalary = input.nextDouble();
        System.out.print("Taxes: $");
        employee.tax =  input.nextDouble();

        System.out.println();
        System.out.println("Employee: " +employee.name + ", Net Salary: $" + employee.netSalary());

        System.out.print("Which percentage to increase your salary: ");
        double percentage = input.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee.name + ", Net Salary Increased: " + employee.netSalary());

        input.close();
    }
}
