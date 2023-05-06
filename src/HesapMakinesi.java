import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		double sonuc ;
		int secenek ;
		Double istenilen1 ;
		Double istenilen2 ;
		    try (Scanner tara = new Scanner(System.in)) {
		    	
		    	System.out.println("Yapmak istediğiniz aşağıdan seçiniz:");
		    	System.out.println("1 Toplama") ;
		    	System.out.println("2 Çıkarma") ;
		    	System.out.println("3 Çarpma") ;
		    	System.out.println("4 Bölme");
		    	secenek = tara.nextInt() ;
		    	
				System.out.println("Lüfen işlem yapmak istediğiniz ilk sayıyı giriniz.");
					istenilen1 = tara.nextDouble() ;
				System.out.println("Lütfen işlem yapmak istediğiniz ikinci sayıyı giriniz.");
					istenilen2 = tara.nextDouble() ;
					
							
							switch (secenek) {
							case 1: {
								sonuc = istenilen1 + istenilen2 ;
								System.out.println("Toplamınız " + sonuc);
								break ;
							}
							case 2: {
								sonuc = istenilen1 - istenilen2 ;
								System.out.println("Farkınız " + sonuc);
								break ;
							}
							
							case 3:{
								sonuc = istenilen1 * istenilen2 ;
								System.out.println("Çarpımınız " + sonuc);
								break ;
							}		
							case 4:{
								sonuc = istenilen1 / istenilen2 ;
								System.out.println("Bölümünüz " + sonuc);
								break ;
							}
							default:{
								System.out.println("Lütfen 1,2,3,4 seçeneklerinden birini seçiniz.");
								secenek = tara.nextInt() ;
									
							}
							
							}
		    }
			}

}
