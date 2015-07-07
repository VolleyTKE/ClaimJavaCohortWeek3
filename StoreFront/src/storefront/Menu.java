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
class Menu {
    String menuchoices = "Please enter a number for each option!\n"+
                "1 See All Products\n"+
                "2 Sort Products\n"+
                "3 View Cart\n"+
                "4 View Wallet\n"+
                "5 Exit\n";
    
    Scanner input = new Scanner(System.in);
    InventoryManager items = new InventoryManager();  
    
    public void menu()    {
        
        System.out.println(menuchoices);
        int choice;
        choice = input.nextInt();
            
              
        switch(choice)  {
            case 1 : 
                //System.out.println("See All Products");
                getInventory();
                break;
            case 2 : //System.out.println("sort products");
                //items.printInventory(items.getInventory());
                break;
            case 3 : //System.out.println("View Cart");
                break;
            case 4 : //System.out.println("View Wallet");
                //getWallet(dao1);
                break;
            case 5 : //System.out.println("Exit");
                System.exit(0);
                break;
            //Default : System.out.println("Please enter 1-5");
                //break;
        }
        
    }
    public void getInventory(){
        items.printInventory(items.getInventory());
    }

    
    private void sortInventory(InventoryManager items) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please select 1,2 or 3 to sort\n"+
                "1 sort by Category\n"+
                "2 Sort by Name\n"+
                "3 Sort by Price\n"+
                "press 0 at anytime to exit\n");
        
        int choice = input1.nextInt();
        switch(choice)  {
            case 1 : System.out.println("sort by Category");
                items.sortCategory();
                break;
            case 2 : System.out.println("sort by Name");
                //dao.inventory.sortName();
                break;
            case 3 : System.out.println("sort by Price");
                //dao.inventory.sortPrice();
                break;
    }
    }

    
    
}
