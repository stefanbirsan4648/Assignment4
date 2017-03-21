
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author birss0828
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Do a scanner
        Scanner input = new Scanner(System.in);
        
        //make string
        String name;
        
        //input words
        System.out.println("Please Enter Your Name: ");
        name = input.nextLine();
        
        //it will print hello and my name
        System.out.println("Hello Stefan. How are you today? " + name + "!");
    }
}
