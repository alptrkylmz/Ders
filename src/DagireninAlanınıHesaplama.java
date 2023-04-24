import java.util.Scanner;

public class DagireninAlanınıHesaplama {

	public static void main(String[] args) {
		try (Scanner tara = new Scanner(System.in)) {
			double dagireninAlani ;
			int cap ;
			int r ;
				System.out.println("Lütfen dairenin yarı çapını giriniz...");
					r = tara.nextInt() ;
						cap = 2*r ;
						 	double π =  3.14 ;
							dagireninAlani = π*cap*cap ;
								System.out.println("Dağirenizin alanı : " + dagireninAlani);
		}
	}	
	}

