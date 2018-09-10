/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;




public class Wine extends Product{
    
    
    
    
    
    double zapremina;
    
    final double DODATNI_POREZ = 1.1;
    
    
     
 
         
        Wine (String name,String barcode,double price,double zapremina){
            
           
            super ("Wine", "12345", 4.0);
            this.zapremina = zapremina;

           this.price = price * POREZ * DODATNI_POREZ;
           
             this.name=name;
        this.barcode = barcode;
        } 
         
         @Override
         public double countPrice() 
	 {
         return price * POREZ * DODATNI_POREZ;
	 }
         
         
         @Override
    public String toString(){
        
  
       return super.toString()+"zapremina: "+zapremina+"l.";
        
    }
         
         
         
         
         
         
}

