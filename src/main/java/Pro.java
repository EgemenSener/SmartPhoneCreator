/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Egemen
 */
public class Pro extends Smartphone {

    
    
    @Override
    public void batterySaver() {
        
        if(getBattery_status() <= 500){
         
           System.out.println("Battery saver mode on: ");
           System.out.println("Your phone has a "+ (getBattery_status() / 1) + " minute battery");
        }
        else{
            System.out.println("Battery saver mode off: ");
           System.out.println("Your phone has a "+ (getBattery_status() / 2) + " minute battery");
            
        }
        
        
    }
    
    
    
    
    
    
    
    
    
}
