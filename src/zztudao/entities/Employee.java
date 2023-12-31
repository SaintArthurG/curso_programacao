package zztudao.entities;

import java.util.List;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer id,String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percent){
        this.salary += salary * percent / 100.00;
    }

    public String toString(){
        return "Id: "
                + id
                + ", Name: "
                + name
                + ", Salary: "
                + String.format("%.2f", salary);
    }

}
