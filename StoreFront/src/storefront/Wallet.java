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
class Wallet {
    
    private Double amtinwallet = 50000.00;

    public void setAmtinwallet(Double amtinwallet) {
        this.amtinwallet = amtinwallet;
    }
    
    public void wallet()    {
        System.out.println(getAmtinwallet());
    }

    private Double getAmtinwallet() {
        return amtinwallet;
    }
    
    
}
