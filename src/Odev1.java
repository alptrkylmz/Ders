import java.util.Scanner;

public class Odev1 {
	
    public static void main ( String [] args ) {
    	int iste, toplamSayi = 0 ;
    	
		try (Scanner tara = new Scanner ( System.in )) {
			
			System.out.println ( " Lütfen bir sayı giriniz. " ) ;
			
			iste = tara.nextInt () ;

			for ( int x = 1 ; x <= iste ; x++ ) {
				 System.out.println( "x değeri " + x ) ;     
				 System.out.println( " Toplam değeri " + toplamSayi ) ;       	
				 toplamSayi +=  x ;
			}
		}
        
        System.out.println ( " Toplamınız : " + toplamSayi ) ;
    }
}