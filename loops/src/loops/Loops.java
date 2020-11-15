/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author mayank
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int start = 15;
        int finalnum = 13;
        start = finalnum % 5; 
        finalnum *= start; 
        System.out.println(finalnum);
        
        int j = 10; 
        
        do {
            j--; 
            System.out.println("1 time"); 
         
        } while (j>10); 
        System.out.println(j);
        
        
        int num1 = 5; 
        int num2 = 10;
        
        if ((num1 > num2) || (num1 == 5)) {
            num1 = 10; 
        } else {
            num2 = 15; 
        }
        System.out.println(num1 + " " + num2);
        
        
        String message = "Hello, the price is: "; 
        double price = 19.99;
        int myNum = 4; 
        for (int i = 1; i < myNum; i++) {
            System.out.println(message + price); 
            price--; 
        }
        System.out.println(message + (int)price); 
        int intmypet= 1, intMyPet = 0;
        System.out.println();
        
        
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "\t" + 2 * i + "\t" + 3 * i + "\t" + 4 * i + "\t" + 5 * i + "\t"); 
        }
        
       
    }
    
}
