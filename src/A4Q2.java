
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author birss0828
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make Scanner 
        
        Scanner input = new Scanner (System.in);
        
   //convert cm into inch 
        System.out.println("Please convert cm into inches ");
        System.out.println("Please enter number you want to convert: ");
        double userNumber = input.nextDouble();
        
        //2.54 cm is exactly 1 inch 
        double inchesConvertion = 2.54;
       
        double cmConvertion = inchesConvertion * userNumber;
        
        //correct conversiom
        System.out.println("Convertion for " + userNumber + "inches to cm is: " + cmConvertion);
        
        
        
        
        
    }
    
}
