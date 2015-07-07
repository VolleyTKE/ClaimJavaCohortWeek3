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
public class Cart   {
    public void cart()  {
        
    }
    
    public void viewCart()  {
        
    
    }
    
    public void purchase()  {
        //determine total cost
        //Wallet-total cost;
        //if total cost > wallet; decline transaction>>return to cart;
            //don't update Inventory Array; don't zero out cart item count
        //else Zero out cart item count> update inventory array and clear cart items
    }
    
    //public void updateCart()    {
    //    
    //}
    
    public void addToCart() {
        //add inventory item to cart
        //updateCart();
        //addToInventory();
        //increase cartcount;
    }
    
    public void deleteFromCart()    {
        //remove from cart object
        //updateCart()
        //deleteFromInventory();
        //if cart item = 0; don't allow deleteFromCart();
    }
    
}
