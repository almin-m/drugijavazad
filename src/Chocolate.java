/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;





public class Chocolate extends Product {
    
 public double gramaza;
 
 
    public Chocolate (String name, String barcode, double price, double gramaza){
        
        
        super ("Cokolada", "54321", 5);
       
        this.gramaza=gramaza;
        this.name=name;
        this.barcode = barcode;
        this.price = price * POREZ;
       
    }
    
  
  public double countPrice(){
        
     return price * POREZ;
   
    }   
 
 @Override
    public  String toString(){
        
        
           return  super.toString() +  "gramaza: " + gramaza + "gr.";
        
    }
 
 
 
 
 
 
 
 
}


