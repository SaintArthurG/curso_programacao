package zztudao.entities;

public class Alturas{
    private String name;
    private int age;
    private double lenght;

    public Alturas(String name, int age, double lenght) {
        this.name = name;
        this.age = age;
        this.lenght = lenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void ageUnderSix(int age){
        this.age += age;
    }


}
