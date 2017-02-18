/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jocalc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Jennie
 */
public class JOcalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many tasks do you have?");
        int JOtasks = keyboard.nextInt();
       
        System.out.println("Enter JO number.");
        int JOnum = keyboard.nextInt();
        
        System.out.println("How many hours did you work?");
        int JOhours = keyboard.nextInt();
        
        // example JO number is 123456
        // example JO % is .30

        // if they don't then create a dictionary
        // ex: 
        Map< String , String > map = new HashMap< String , String > ();
        map.put("123456", ".30");
        System.out.println(map.get("123456"));
        boolean json = false;
        System.out.println(json);
    }
    
}
