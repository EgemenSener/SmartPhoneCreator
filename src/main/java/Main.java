
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
public class Main {
    
    
    
    public static void main(String[] args){
        
        Smartphone smartphone = new Smartphone();
        Pro pro = new Pro();
        Gaming gaming = new Gaming();
        Note note = new Note();
        
        Scanner scanner = new Scanner(System.in);
        
        
        //<editor-fold defaultstate="collapsed" desc="REQUEST AND SET PHONE INFO">
        System.out.println("Please enter screen technology ");  
        smartphone.setScreen_tech(scanner.nextLine());
        System.out.println("Please enter processor model ");  
        smartphone.setProcessors(scanner.nextLine());
        System.out.println("Please enter memory ");
        smartphone.setMemory(scanner.nextInt());
        System.out.println("Please enter storage size ");
        smartphone.setStorage(scanner.nextInt());
        System.out.println("Please enter camera mp ");
        smartphone.setCamera(scanner.nextInt());
        
        System.out.println("Please enter battery size ");
        smartphone.setBattery(scanner.nextInt());
        //</editor-fold>
        
        
        System.out.println("Please enter the remaining mAh: ");
        int mAh = scanner.nextInt();
        smartphone.setBattery_status(mAh);
        
        
        
        System.out.println("Please choose your phone series by press numbers : (Pro: 1, Gaming: 2 or Note: 3 ) ");
        int series;
        series = scanner.nextInt();
        
        
        if(series == 1){
            pro.setBattery_status(mAh);
            pro.batterySaver();
            System.out.println("Your price is " +(smartphone.getPrice() + pro.getPrice())  + " $");
        }
        else if(series == 2){
            gaming.setBattery_status(mAh);
            gaming.batterySaver();
            gaming.options();
            System.out.println("Your price is " + (smartphone.getPrice() + gaming.getPrice()) + " $");
        }
        else if(series == 3) {
            note.setBattery_status(mAh);
            note.batterySaver();
            note.options();
            System.out.println("Your price is " + (smartphone.getPrice() + note.getPrice()) + " $");
        }
        
       
        
        
        
        
        
        
        
        
    }
}
