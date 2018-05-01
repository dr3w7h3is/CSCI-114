import java.awt.Rectangle; 
/**
 * CSCI 114 online, Objects homework
 *
 * @author    Drew Theis   
 * @version   2/10/2018
 */
public class Rectangles
{
    public static void main(String[] args)
    {
        // Creates rectangle1 with predefined postions per the homework
        Rectangle rectangle1 = new Rectangle(0,0,10,20);
        // Creates rectangle2 with predefined positions per the homework
        Rectangle rectangle2 = new Rectangle(5,10,20,10);
        // Prints the position, width, and height of rectangle1
        System.out.println("rectangle1 is: " + rectangle1.toString());
        // Prints the position, width, and height of rectangle2
        System.out.println("rectangle2 is: " + rectangle2.toString());
        // Creates rectangle3 base on the intersection point
        // of rectangle1 and rectangle2
        Rectangle rectangle3 = rectangle1.intersection(rectangle2);
        // Prints the position, width, and height of rectangle3
        System.out.println("rectangle3 is: " + rectangle3.toString());
        // Create new rectangle for use in next function intersection
        Rectangle anotherRectangle = new Rectangle(100,200,10,10);
        // Creates rectangle5 based on the intersection of rectangle1
        // and anotherRectangle
        Rectangle rectangle5 = rectangle1.intersection(anotherRectangle);
        // Prints the position, width, and height of rectangle5
        System.out.println("rectangle5 is: " + rectangle5.toString());
        // Prints a statment of ture or flase if (rectangle5) is empty
        // per homework the defined angles are ment to return a value
        // for height and width that are less than 0
        System.out.println("rectangle5 is empty: " + rectangle5.isEmpty());
    }
}