
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author birss0828
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make scanner
        Scanner input = new Scanner(System.in);

        //input 4 numbers
        System.out.println("Please enter 4 different numbers on 4 separate lines:");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();
        double fourthNumber = input.nextDouble();

        //user will tell numbers in order
        System.out.print("The numbers were " + firstNumber + ", ");
        System.out.print(secondNumber + ",");
        System.out.print(thirdNumber + ",");
        System.out.println("and " + fourthNumber + ".");


    }
}
