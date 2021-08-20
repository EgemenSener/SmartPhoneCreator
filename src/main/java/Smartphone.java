/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Egemen
 */
public class Smartphone {
    
    private String processors;
    private int memory;
    private int storage;
    private int camera;
    private String tech;
    private int battery;
    private int battery_status;
    private double price;
    
//<editor-fold defaultstate="collapsed" desc="GETTER&SETTERS, EXCEPTIONS AND CALCULATE PRICE">
    public String getProcessors() {
        return processors;
    }

    public void setProcessors(String processors) {
        
        if(processors.equals("Snapdragon 888")){
            
            setPrice(1199.90);
            this.processors = processors;
        }
        else if(processors.equals("Snapdragon 855")){
            
            setPrice(799.90);
            this.processors = processors;
            
        }
        else if(processors.equals("Exynos 2100")){
            
            setPrice(1099.90);
            this.processors = processors;
                
                }
        else if(processors.equals("Kirin 9000")){
                
            setPrice(1000.0);
            this.processors = processors;
                }
        else{
            
        System.out.println(processors + " not on the stock ");
        System.exit(0);
        
        }
        
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        
        if(memory == 4){
            
            setPrice(209.90);
            this.memory = memory;
        }
        else if(memory == 6){
            
            setPrice(359.90);
            this.memory = memory;
            
        }
        else if(memory == 8){
            
            setPrice(599.90);
            this.memory = memory;
                
        }
       
        else{
            
        System.out.println(memory + " not on the stock ");
        System.exit(0);
        
        }
        
        
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
           if(storage == 32){
            
            setPrice(100.00);
            this.storage = storage;
        }
        else if(storage == 64){
            
            setPrice(150.00);
            this.storage = storage;
            
        }
        else if(storage == 128){
            
            setPrice(300.90);
            this.storage = storage;
                
        }
        else if(storage == 256){
            
            setPrice(550.90);
            this.storage = storage;
                
        }
       
        else{
            
        System.out.println(storage + " not on the stock ");
        System.exit(0);
        
        }
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        
        if(camera == 16){
            
            setPrice(400.30);
            this.camera = camera;
        }
        else if(camera == 32){
            
            setPrice( 900.70);
            this.camera = camera;
            
        }
        else if(camera == 64){
            
            setPrice( 1500.80);
            this.camera = camera;
                
        }
       
        else{
            
        System.out.println(camera + " not on the stock ");
        System.exit(0);
        
        }
    }

    public String getScreen_tech() {
        return tech;
    }

    public void setScreen_tech(String tech) {
     
        if(tech.equals("Amoled")|| tech.equals("AMOLED")){
            
            setPrice(999.99);
            this.tech = tech;
        }
        else if(tech.equals("IPS") || tech.equals("Ips") ){
            
            setPrice(500.59);
            this.tech = tech;
        }
        else{
            
            System.out.println(tech + " not on the stock ");
            
        }
             
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        if(battery == 4300){
            
            setPrice(400.95);
            this.battery = battery;
        }
        else if(battery == 5000){
            
            setPrice(690.50);
            this.battery = battery;
            
        }
        else if(battery == 6000){
            
            setPrice(890.20);
            this.battery = battery;
                
        }
       
        else{
            
        System.out.println(battery + " not on the stock ");
        System.exit(0);
        
        }
    }
    public int getBattery_status() {
        return battery_status;
    }

    public void setBattery_status(int battery_status) {
        this.battery_status = battery_status;
    }
     public double getPrice() {
        
       
       return price;
    
}
         
    

    public void setPrice(double price) {
        this.price = this.price + price;
    }
    
//</editor-fold>    


    public void showInfos(){
        
        System.out.println("Your selected options are " + this.processors+" " + this.memory+" " + this.storage+" " + this.camera+" " + this.tech+" " + this.battery);
    }
    
    public void batterySaver(){
        
        if(this.battery_status <= 500){
         
           System.out.println("Battery saver mode on: ");
           System.out.println("Your phone has a "+ (this.battery_status / 0.8) + " minute battery");
        }
        else{
            System.out.println("Battery saver mode off: ");
           System.out.println("Your phone has a "+ (this.battery_status / 1.5) + " minute battery");
            
        }
        
      }
    
    public void options(){
        
        
        
    }
    
     
    
}
