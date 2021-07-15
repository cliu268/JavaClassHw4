
/**
 * Write a description of class Main8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main8
{
    public static void main(String[] args)
    {
        Student s = new Student("Dumbo", 6, "Alderton");
        
        System.out.println("student is " + s.toString());
        System.out.println("student address " + s.getAddress());
        s.setAddress("Rego Park");
        System.out.println("student address " + s.getAddress());
        System.out.println("student is " + s.toString());
        System.out.println("student name is " + s.getName());
        System.out.println("student tall? " + s.canTryOutForBasketball());
    }
}
