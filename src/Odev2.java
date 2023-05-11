import java.util.Scanner;

public class Odev2 {
	
    public static void main ( String [] args ) {
    	int iste, carpim = 1 ;
    	
		try (Scanner tara = new Scanner ( System.in )) {
			
			System.out.println ( " Lütfen bir sayı giriniz. " ) ;
			
			iste = tara.nextInt () ;

			for ( int x = 1 ; x <= iste ; x++ ) {
				 carpim *=  x ;
			}
		}
        
        System.out.println ( " Çarpımınız : " + carpim ) ;
    }
}