/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storefront;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class StoreFront {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("++++++++++++++++++++++++++\n" + 
                "+Welcome to the store!...+\n"+"++++++++++++++++++++++++++\n");
        
        
        Menu menu1 = new Menu();
        menu1.menu();
        
    }
    
}
