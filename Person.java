
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    private int height;
    private String occupation;

    /**
     * Constructor for objects of class Person
     */
    public Person(String name, int height, String occupation)
    {
        // initialise instance variables
        this.name = name;
        this.height = height;
        this.occupation = occupation;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getHeight()
    {
        return this.height;
    }
}
