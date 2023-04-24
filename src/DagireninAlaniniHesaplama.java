import java.util.Scanner;

public class DagireninAlaniniHesaplama {

	public static void main(String[] args) {
		try (Scanner tara = new Scanner(System.in)) {
			double dagireninAlani ;
			int cap ;
			int r ;
				System.out.println("Lütfen dairenin yarı çapını giriniz...");
					r = tara.nextInt() ;
						cap = 2*r ;
						 	double pi =  3.14 ;
							dagireninAlani = pi*cap*cap ;
								System.out.println("Dağirenizin alanı : " + dagireninAlani);
		}
	}	
	}

