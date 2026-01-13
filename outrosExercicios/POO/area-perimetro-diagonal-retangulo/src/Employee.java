public class Employee {
    String name;
    double grossSalary, tax;

    public double netSalary() {
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage ) {
        grossSalary += grossSalary * (percentage/100);
    }

}
