/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;




public abstract class Product {

   
          
    public String name;
    public  String barcode;
    public   double price;
     
    public  final double POREZ= 1.2;
    
    
 


   public Product (String name, String barcode, double price) {
     
     this.name=name;
     this.barcode=barcode; 
     this.price= price * POREZ;

    }
   
   public double countPrice(){
        
     return price * POREZ;
   
    } 
   
   
   
   
    @Override
    public String toString(){
        

        return "Ovo je "+ name  + ", barkod je: " + barcode + ", cijena je: " + price +"$"+ ", ";
        
        
    }
    }


  
    
   
    
    
    
    
    
   
        
        
        
       
        
        
        
        
        
        
    
    


