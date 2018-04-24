/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egitim_yazilimi;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Egitim_Yazilimi {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        int sayi1=0;
        int sayi2=0;
        int yenisayi=0;
      
        String romanum1,romanum2;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first Roma Number:");
        romanum1=(scanner.next());
         int boyut1= romanum1.length();
         
         KontrolEt kontrol1=new KontrolEt(); //Rakamdaki TEkrar Icin
         kontrol1.KontrolTekrar(boyut1,romanum1);
       
         
        
        System.out.println("Enter second Roma Number:");
        romanum2=(scanner.next());
        int boyut2=romanum2.length();
        
        KontrolEt kontrol2=new KontrolEt(); //Rakamdaki TEkrar Icin
        kontrol2.KontrolTekrar(boyut2,romanum2);
       
       
        Sayiya_Cevir sayi1cevir=new Sayiya_Cevir();
        sayi1=sayi1cevir.Cevir(boyut1, romanum1);
         
        Sayiya_Cevir sayi2cevir=new Sayiya_Cevir();
        sayi2=sayi2cevir.Cevir(boyut2, romanum2);
          
        
        yenisayi=sayi1 +sayi2;
        if(yenisayi>3000){
            System.out.print("Sayilarin Toplami 3000'den buyuk\n");
            System.exit(0);
        }
        System.out.print(romanum1+"+"+romanum2+"=");
        
        RomaRakamı rr=new RomaRakamı();
        rr.SayiyiCevir(yenisayi);
        System.out.println();
    }
    
}
