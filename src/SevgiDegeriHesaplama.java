import java.util.Random;
import java.util.Scanner;

public class SevgiDegeriHesaplama {

	public static void main(String[] args) {
		
		int sevgiDegeri ;
		String birinciKisi ;
		String ikinciKisi ;
		
		try (Scanner tara = new Scanner ( System.in )) { 
		Random rastgele = new Random() ;
		
		System.out.println("Lütfen birinci kişinin adını yazınız.") ;
			birinciKisi = tara.next() ;
			
		System.out.println("Lütfen ikinci kişinin adını yazınız") ;
			ikinciKisi = tara.next() ;
					
		sevgiDegeri = rastgele.nextInt(101) ;
				
				System.out.println(birinciKisi + " ile " + ikinciKisi + " birbirini % " + sevgiDegeri + " seviyor.");
		}
	}

}
