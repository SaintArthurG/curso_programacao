package entities;

public class Rectangle {
    public double largura;
    public double altura;

    public double area(){
        return largura * altura;
    }
    public double perietro(){
        return largura * 2 + altura * 2;
    }
    public double diagonal(){
        double d = largura * largura + altura * altura;
        return Math.sqrt(d);
    }

}
