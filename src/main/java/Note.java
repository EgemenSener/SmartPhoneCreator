
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
public class Note extends Smartphone {

    @Override
    public void batterySaver() {
        super.batterySaver(); 
    }

    @Override
    public void options() {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("You can buy pencil option, Would you want to add ? ");
        System.out.println("Only press 'Y' OR 'N' ");        
        char c = scanner.next().charAt(0);
        if(c == 'Y'){
            setPrice(750);  
        }
    }
    
    
}
