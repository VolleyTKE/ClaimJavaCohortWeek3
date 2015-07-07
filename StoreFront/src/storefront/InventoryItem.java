/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storefront;

/**
 *
 * @author Chris
 */
public class InventoryItem {
    
    private int id;
    private String Category;
    private String Name;
    private Double price;
    private Integer stock;
    
    
   
    
    public InventoryItem(String Category, String Name, Double price, Integer stock) {
        
        this.Category = Category;
        this.Name = Name;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        
       // String title = "Category" + "\tName " + "\tprice " + "\tstock ";
        String list = String.format("%-27s%55s%10s%4s", Category, Name, price, stock);
        return list;
    }

        
    
}
