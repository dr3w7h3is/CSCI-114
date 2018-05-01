/**
 * CSIS 114 Lab Balloon
 *
 * @author Drew Theis
 * @version 3/1/2018
 */
public class Balloon
{
    //Constant Pi that equals pi to the 7th decimal
    public static final double PI = 3.1415926;
    //Declare variables to be used that are from user input
    private String userColor;
    private double userSize;
    /**
     * Constructor for objects of class Ballon
     */
    public Balloon(String color, double size)
    {
        //Set balloons color
        userColor = color;
        //Set balloon size
        userSize = size;
    }
    /**
     * Method for inflate
     * @param userSize uses equation 4/3pisize^3 from lab description
     */
    public void inflate()
    {
        userSize = ((4/3 * PI) * (userSize * userSize * userSize));
    }
    /**
     * Method for volume
     * @param return userSize
     */
    public double volume()
    {
        //Returns the total size of ballon
        return userSize;
    }
    /**
     * Method for returnColor
     * @param return userColor
     */
    public String returnColor()
    {
        //Returns the color of the balloon
        return userColor;
    }
}
