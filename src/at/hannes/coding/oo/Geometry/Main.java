package at.hannes.coding.oo.Geometry;

public class Main
{
    public static void main(String[] args)
    {
        Circle C1 = new Circle("C1",15);
        Cube c1 = new Cube("c1",4);
        Rectangle r1 = new Rectangle("r1",4,2);
        Square s1 = new Square("s1", 2.3);

        C1.getName();
        C1.getArea();

        c1.getName();
        c1.getArea();

        r1.getName();
        r1.getArea();

        s1.getName();
        s1.getArea();
    }
}
