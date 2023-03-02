package at.hannes.coding.oo.Geometry;

public class Square extends Base
{
    public Square(String name, double a) {
        super(name, a);
    }

    @Override
    public void getArea()
    {
        setSurfaceArea(getA()*4);
        System.out.println(getSurfaceArea());
    }
}
