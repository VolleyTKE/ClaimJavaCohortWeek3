/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storefront;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Chris
 */
public class InventoryManager {

    private ArrayList<InventoryItem> inventory = new ArrayList<InventoryItem>();
    String fileName = "C:\\Users\\Chris\\Desktop\\Claim\\ClaimJavaCohortWeek3\\Project3-Java061415-caebdf8c278b10bdbf3a98d67334b70de41291f1\\resources\\survival_store_inventory.csv";
    public InventoryManager(){
        inventory = new CsvReader().csvReader(fileName);
    }
    
    public static void printInventory(ArrayList<InventoryItem> inventory) {
        String header = String.format("%-27s%55s%10s%4s", "Category", "Name", "Price", "Stock");
        System.out.println(header);
        for(InventoryItem item : inventory){
        String list = String.format("%-27s%55s%10s%4s", item.getCategory(), item.getName(), item.getPrice(), item.getStock());
        System.out.println(list);
        }
        
        
    }
    
    
     //CsvReader reader1 = new CsvReader();
       
     public ArrayList<InventoryItem> getInventory() {
         
         return inventory;
     }
     
     
        
    //sortCategory, sortName, sortPrice()
    
    
     
     
    public void sortCategory()  {
        Collections.sort(getInventory(), new CategoryComparator());
        printInventory(getInventory()); 
    }
    
    public void sortName()  {
        Collections.sort(getInventory(), new NameComparator());
        printInventory(getInventory()); 
    }
    
    public void sortPrice()  {
        Collections.sort(getInventory(), new priceComparator());
        printInventory(getInventory());        
        
    }
    
    public boolean buy(String itemId){
        return false;
    }
    
    
    
    
}
