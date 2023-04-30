import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		int toplam ;
		int secenek ;
		int istenilen1 ;
		int istenilen2 ;
		    try (Scanner tara = new Scanner(System.in)) {
				System.out.println("Lüfen işlem yapmak istediğiniz ilk sayıyı giriniz.");
					istenilen1 = tara.nextInt() ;
				System.out.println("Lütfen işlem yapmak istediğiniz ikinci sayıyı giriniz.");
					istenilen2 = tara.nextInt() ;
					
						System.out.println("Yapmak istediğiniz aşağıdan seçiniz:");
						System.out.println("1 Toplama") ;
						System.out.println("2 Çıkarma") ;
						System.out.println("3 Çarpma") ;
						System.out.println("4 Bölme");
							secenek = tara.nextInt() ;
							while (secenek >=5) {
								System.out.println(secenek + " 4'den büyük.Lütfen tekrar deneyiniz.");
								secenek = tara.nextInt() ;
							}
			}
		    
				switch (secenek) {
				case 1: {
					toplam = istenilen1 + istenilen2 ;
					System.out.println("Toplamınız " + toplam);
					break ;
			}
				case 2: {
					toplam = istenilen1 - istenilen2 ;
					System.out.println("Farkınız " + toplam);
					break ;
				}
				
				case 3:{
					toplam = istenilen1 * istenilen2 ;
					System.out.println("Çarpımınız " + toplam);
					break ;
				}		
				case 4:{
					toplam = istenilen1 / istenilen2 ;
					System.out.println("Bölümünüz " + toplam);
			}
			
			
			}
	}

}
