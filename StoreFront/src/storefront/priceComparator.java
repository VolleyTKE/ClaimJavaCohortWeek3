/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storefront;

import java.util.Comparator;

/**
 *
 * @author Chris
 */
public class priceComparator implements Comparator<InventoryItem>{


    @Override
    public int compare(InventoryItem o1, InventoryItem o2) {

        return Double.compare(o1.getPrice(), o2.getPrice());
    }
    
    
}
