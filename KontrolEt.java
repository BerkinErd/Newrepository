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
public class KontrolEt {
    
    int teksay=1; //tekar sayisi icin kullaniliyor
    int i;
    
    void KontrolTekrar(int boyut, String romarakam) {

         if(boyut>3){
             
            for(i=0;i<boyut-1;i++){
             
                char x=romarakam.charAt(i);
                char y=romarakam.charAt(i+1);
                if(x==y){
                    
                    teksay++;
                    
                }else{
                   teksay=1;
                }
                if(teksay==4){
                    System.out.println("Bir harf en fazla 3 kere tekar edebilir.");
                    System.exit(0);
                }
            }
         }
    }
    
    
}
