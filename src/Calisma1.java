import java.util.Scanner;

public class Calisma1 {

public static void main ( String [] args ) {
    	
		try (Scanner tara = new Scanner ( System.in )) {
			int tabanDegeri ;
			
			String deger = "*" ;
			
			System.out.println ( " Lütfen üçgenin taban değerini giriniz... " ) ;
			
			tabanDegeri = tara.nextInt () ;
			for ( int satir = 1 ; satir <= tabanDegeri ; satir++ ) {   
				
				for (int sutun = 1 ; sutun <= satir ; sutun++ ) {
					
					System.out.print(deger);
				}
				
				System.out.println() ;  
			}
		}catch (Exception e) {
			System.out.println("Lütfen bir tam sayı girerek tekrar deneyiniz.");
		}
    }


}


//Lütfen dairenin yarıçapını giriniz ... 5
//Dairenin alanını hesaplama formülünü bul
//double alan = 2*girilen_deger +5; * / + - **2 
//Bu dairenin alanı = 120 