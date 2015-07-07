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
public class NameComparator implements Comparator<InventoryItem>{

    @Override
    public int compare(InventoryItem o1, InventoryItem o2) {

        return o1.getName().compareTo(o2.getName());
    }
    

    
}
