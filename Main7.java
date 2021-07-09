
/**
 * Write a description of class Main7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main7
{
    public static void main(String[] args)
    {
        Square sq1 = new Square(10, "yellow");
        Square sq2 = new Square(10);
        Square sq3 = new Square();
        
        sq2.setColor("blue");
        
        System.out.println("compare sq1 and sq2 " + Square.compare(sq1, sq2));
        System.out.println("compare sq1 and sq3 " + Square.compare(sq1, sq3));
        System.out.println("compare sq2 and sq3 " + Square.compare(sq2, sq3));
        
        sq1.mix("red");
        System.out.println("mix color s1 yellow + red = " + sq1.getColor());
        sq2.mix("yellow");
        System.out.println("mix color s2 blue + yellow = " + sq2.getColor());
        sq3.mix("blue");
        System.out.println("mix color s3 red + blue = " + sq3.getColor());
    }
}
