package at.hannes.coding.oo.Geometry;

public class Circle extends Base
{
    public Circle(String name, double a) {
        super(name, a);
    }

    @Override public void getArea()
    {
        double pie = 3.14159;
        setSurfaceArea(((getA()*getA())* pie)/2);
        System.out.println(getSurfaceArea());
    }
}
