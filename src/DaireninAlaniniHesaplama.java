import java.util.Scanner;

public class DaireninAlaniniHesaplama {

	public static void main(String[] args) {
		
		try (Scanner tara = new Scanner(System.in)) {
			
			double daireninAlani ;
			double pi =  3.14 ;
			int r ;
			
				System.out.println("Lütfen dairenin yarı çapını giriniz...");
				r = tara.nextInt() ;
				
					daireninAlani = pi*(r*r) ;
						System.out.println("Dairenizin alanı : " + daireninAlani);
		}
	}	
	}

