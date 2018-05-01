import java.util.Scanner;
/**
 * Tests Balloon
 * 
 * @author Drew Theis
 * @version 3/1/2018
 */
public class Tester
{
    /**
     * main() method
     */
    public static void main(String[] args)
    {
        //New instants of Scanner method
        Scanner scan = new Scanner(System.in);
        //Prompts user to enter color
        System.out.print("Enter color: ");
        //Scanner gets input as string
        String color = scan.next();
        //Prompts user to enter a size
        System.out.print("Enter size: ");
        //Scanner gets input as double
        double size = scan.nextDouble();
        //Creates new balloon objext with color and size
        Balloon userIn = new Balloon(color, size);
        //Calls balloon method inflate
        userIn.inflate();
        //Prints the color the user entered into the console window calls returnColor
        System.out.println("\n" + "For the " + userIn.returnColor() + " ballon");
        //Prints the new size of the balloon from user input call balloon method volume
        System.out.printf("Volume is now: %.2f", userIn.volume());   
    }
}