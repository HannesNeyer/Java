package at.hannes.coding.oo.Geometry;

public class Base
{
    private String name ="";
    private double surfaceArea = 0;
    private double a = 0;
    private double b = 0;

    public Base(String name, double a, double b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public Base(String name, double a)
    {
        this.name = name;
        this.a = a;
    }

    public void getName(){
        System.out.println(name);
    }

    public void getArea(){
        surfaceArea = a * b;
        System.out.println(surfaceArea);
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
