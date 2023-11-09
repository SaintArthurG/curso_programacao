package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary(){
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage){
        double aumento = (grossSalary * percentage) / 100;
        grossSalary += aumento;
    }
}
