
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Egemen
 */
public class Gaming extends Smartphone {

    @Override
    public void batterySaver() {
        
        if(getBattery_status() <= 500){
         
           System.out.println("Battery saver mode on: ");
           System.out.println("Your phone has a "+ (getBattery_status() / 1.5) + " minute battery");
        }
        else{
            System.out.println("Battery saver mode off: ");
           System.out.println("Your phone has a "+ (getBattery_status() / 2.5) + " minute battery");
            
        }
    }

    @Override
    public void options() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("You can buy gamepad option, Would you want to add ? ");
        System.out.println("Only press 'Y' OR 'N' ");        
        char c = scanner.next().charAt(0);
        if(c == 'Y'){
            setPrice(1100);  
        }
        
    }
    
    
    
}
