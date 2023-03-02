package at.hannes.coding.oo.Geometry;

public class Cube extends Base
{
    public Cube(String name, double a) {
        super(name, a);
    }

    @Override public void getArea()
    {
        setSurfaceArea((getA()*getA())*6);
        System.out.println(getSurfaceArea());
    }
}
