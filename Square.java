
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square
{
    // Create a Square class with the following attributes
    private int sidelength;
    private String color;
    
    // Write a constructor that takes in a sidelength and a color (and sets corresponding instance variables to those values, int for sidelength and String for color)
    public Square(int sidelength, String color)
    {
        this.sidelength = sidelength;
        this.color = color;
    }
    
    // Write a second constructor that only takes in a sidelength (and no color) and sets the default color to “red”
    public Square(int sidelength)
    {
        this.sidelength = sidelength;
        this.color = "red";
    }
    
    // Write a third constructor that takes in no inputs and sets the default sidelength to 10 and the default color to “red”
    public Square()
    {
        this.sidelength = 10;
        this.color = "red";
    }
    
    // getColor
    //      Inputs: N/A
    //      Outputs: String
    //      Returns the color of the square
    public String getColor()
    {
        return this.color;
    }
    
    // getSidelength
    //      Inputs: N/A
    //      Outputs: int
    //      Returns the side length of the square
    public int getSidelength()
    {
        return this.sidelength;
    }
    
    // setColor
    //      Inputs: String color
    //      Outputs: void
    //      Sets the color of the instance variable this.color to the input 
    public void setColor(String color)
    {
        this.color = color;
    }
    
    // setSidelength
    //      Inputs: int sidelength
    //      Outputs: void
    //      Sets the variable this.sidelength to be equal to the input
    public void setSidelength(int sidelength)
    {
        this.sidelength = sidelength;
    }
    
    // static compare 
    //      Inputs: Square one, Square two
    //      Outputs: boolean
    //      We first compare the one’s area with two’s area and return true if one has a larger area and false if two has a larger area. If they have equal areas, we compare the colors lexicographically (if one has a greater color return true and if two has a greater or equal string return false. 
    public static boolean compare(Square one, Square two)
    {
        if (one.getSidelength() > two.getSidelength()) {
            return true;
        } else if (one.getSidelength() < two.getSidelength()) {
            return false;
        } else { // one and two have equal sidelength so equal area
            if (one.getColor().compareTo(two.getColor()) > 0) {
                return true;
            }
            return false;
        }
    }
    
    // mix
    //      Inputs: String color
    //      Outputs: void
    //      The input color is going to be a primary color “red”, “yellow”, or “blue”. If this.color is equal to “blue”, “yellow”, or “red” (check the string using string1.equals(string2), look at Java String documentation), mix the two colors and set this.color to the result. 
    public void mix(String color)
    {
        switch(this.color) {
            case "red":
                if (color.equals("blue")) {
                    this.color = "purple";
                }
                if (color.equals("yellow")) {
                    this.color = "orange";
                }
                break;
            case "yellow":
                if (color.equals("blue")) {
                    this.color = "green";
                }
                if (color.equals("red")) {
                    this.color = "orange";
                }
                break;
            case "blue":
                if (color.equals("red")) {
                    this.color = "purple";
                }
                if (color.equals("yellow")) {
                    this.color = "green";
                }
                break;
            default:
                break;
        }
    }
}
