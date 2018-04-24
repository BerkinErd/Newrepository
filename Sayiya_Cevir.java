/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egitim_yazilimi;


public class Sayiya_Cevir {
 
    int Cevir(int boyut, String romarakam){
           
        int toplam=0;
        int onceki=0;
        int sayi=0;  
        int i;  
        
        for(i=0;i<boyut;i++){
               
                char x=romarakam.charAt(i);
               
               if(x=='I'){
                  
                   toplam=1;
                   
                   if(onceki==0){
                       sayi+=toplam;
                   }
                   if(onceki==1){
                       sayi+=toplam;
                   }
                   if(onceki>toplam){
                       
                     if(i+1<boyut){
                         
                            char sonraki=romarakam.charAt(i+1);
                           
                            if(sonraki=='I'){
                                
                                sayi+=toplam;
                            }else
                               sayi-=toplam; 

                     }else
                        sayi+=toplam;
                   }
                   
                   onceki=toplam;
               }
               
               if(x=='V'){
                   if(onceki==5){
                       System.out.print("V ya da L Rakami Cikarma Isleminde Kullanilmaz.");
                       System.exit(0);
                   }
                  toplam=5;
                   if(sayi<toplam){
                       
                      sayi=toplam-sayi;  
                   }else{
                       
                   sayi+=toplam;
                
                   }
                   onceki=toplam;
               }
               if(x=='X'){
                   
                   if(onceki==5){
                       System.out.print("V ya da L Rakami Cikarma Isleminde Kullanilmaz.");
                       System.exit(0);
                   }
                   toplam=10;
                   if(sayi<toplam ){
                       
                      sayi=toplam-sayi;  
                   }else{
                       
                   sayi+=toplam;
                   }
                   onceki=toplam;
               }
               if(x=='L'){
                   if(onceki==5 || onceki==50){
                       System.out.print("V ya da L Rakami Cikarma Isleminde Kullanilmaz.");
                       System.exit(0);
                   }
                   toplam=50;
                   if(sayi<toplam){
                       
                      sayi=toplam-sayi;  
                   }else{
                       
                   sayi+=toplam;
                   }
                   onceki=toplam;
               }
               if(x=='C'){
                   if(onceki==5 || onceki==50){
                       System.out.print("V ya da L Rakami Cikarma Isleminde Kullanilmaz.");
                       System.exit(0);
                   }
                   toplam=100;
                   if(onceki!=0&&(onceki*10)<toplam){
                       System.out.print(romarakam+" Gecersiz Roma Rakamı");
                       System.exit(0);
                   }
                   if(sayi<toplam){
                       
                      sayi=toplam-sayi;  
                   }else{
                       
                   sayi+=toplam;
                   }
                   onceki=toplam;
               }
               if(x=='D'){
                   if(onceki==5 || onceki==50){
                       System.out.print("V ya da L Rakami Cikarma Isleminde Kullanilmaz.");
                       System.exit(0);
                   }
                   toplam=500;
                   if(sayi<toplam){
                       
                      sayi=toplam-sayi;  
                   }else{
                       
                   sayi+=toplam;
                   }
                   onceki=toplam;
               }
               if(x=='M'){
                   if(onceki==5 || onceki==50){
                       System.out.print("V ya da L Rakami Cikarma Isleminde Kullanilmaz.");
                       System.exit(0);
                   }
                   toplam=1000;
                   if(sayi<toplam){
                       
                      sayi=toplam-sayi;  
                   }else{
                       
                   sayi+=toplam;
                   }
                   onceki=toplam;
               }      
               
            }
        return sayi;
    }
}
