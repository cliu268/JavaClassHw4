import java.util.ArrayList;
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Person
{
    private String address;
    private int numCourses = 0;
    private ArrayList<Integer> grades;
    
    public Student(String name, int height, String address)
    {
        super(name, height, "Student");
        this.address = address;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public String toString()
    {
        return super.getName() + ":" + super.getHeight() + ":" + this.address;
    }
    
    public void addGrade(int grade)
    {
        this.grades.add(grade);
    }
    
    public void addCourse()
    {
        this.numCourses += 1;
    }
    
    public String getName()
    {
        return "Student" + super.getName();
    }
    
    public boolean canTryOutForBasketball()
    {
        return this.getHeight() > 6;
    }
    
    // Q: What methods in Student override methods in Person?
    // A: getName()
    
    // Q: What methods in Student require the usage of variables/methods available in the parent class Person?
    // A: the ones that call super. so they are toString() and getName()
}
