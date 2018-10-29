/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2_a3_arrays3;

//Imports a text scanner in console
import java.util.Scanner;

public class U2_A3_Arrays3 {

    
    public static void main(String[] args) {
        
        //Initializes the text scanner
        Scanner keyedInput = new Scanner (System.in);
        
        //Declares and initializes an array for 9 double values
        double [ ] marks = {34.7, 54.1, 34.8, 99.6, 43.6, 43.2, 65.8, 44.8, 88.6};
        //Declare and initialize a total and average double value
        double total=0;
        double average;
        
        //Displays the marks previously initalized
        System.out.println("These are the marks:");
        for (int i = 0; i<=8; i= i + 1)
        {
           System.out.println(marks[i]);
        }
        
        //Declares total value as the sum of all numbers/marks
        for (int i = 0; i<=8; i= i + 1)
        {
            total += marks[i];
        }
        
        //Declares the average of the numbers/marks
        average = Math.round((total/9)*10)/10;
        
        //Displays the average mark
        System.out.println("The average mark is:");
        System.out.println(average);
    }
    
}
