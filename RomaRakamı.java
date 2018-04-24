/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egitim_yazilimi;

/**
 *
 * @author User
 */
public class RomaRakamı {
    
   void SayiyiCevir(int sayi){
     
       while(sayi!=0){
        
                            
          while(sayi>999){
              sayi-=1000;
              System.out.print("M");
          }
          if(sayi>=900){
               sayi-=900;
               System.out.print("CM");
           }
          
          while(sayi>=500){
              sayi-=500;
              System.out.print("D");
          }
           if(sayi>=400){
               sayi-=400;
               System.out.print("CD");
           }
          while(sayi>99){
              sayi-=100;
              System.out.print("C");
          }
           if(sayi>=90){
               sayi-=90;
               System.out.print("XC");
           }
          while(sayi>=50){
              sayi-=50;
              System.out.print("L");
          }
          if(sayi>=40){
               sayi-=40;
               System.out.print("XL");
           }
          while(sayi>9){
              sayi-=10;
              System.out.print("X");
          }
          if(sayi==9){
               sayi-=9;
               System.out.print("IX");
           }
          while(sayi>=5){
              sayi-=5;
              System.out.print("V");
          }
          
           if(sayi==4){
               sayi-=4;
               System.out.print("IV");
           }
          while(sayi>0){
              sayi-=1;
              System.out.print("I");
          }
          
          
        }
       
    }
}

