package Interfaces;

public class Visitor {
    private double height;
    private int age;
    private double money;

    public  Visitor(double height, int age, double money){
        this.height = height;
        this.age = age;
        this.money = money;
    }
    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }


}
