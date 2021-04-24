package intro;

import javax.sound.midi.SysexMessage;

public class Main {

	public static void main(String[] args) {
		// camelCase kullanılır.
		// Don't Repeat Yourself
		String internetSubeButonu = "İnternet Şubesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.15;

		System.out.println(internetSubeButonu);
		System.out.println("Dolar Kuru " + dolarDun);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar Dusmus");
		}

		else if (dolarBugun > dolarDun) {
			System.out.println("Dolar Yukselmis");
		} else {
			System.out.println("Dolar Ayni");
		}

//		String kredi1="Hızlı Kredi";
//		String kredi2="Mutlu Emekli Kredi";
//		String kredi3="Kamu Çalışanı Kredi";
//		String kredi4="Konut Kredisi";
//		String kredi5="Msb Kredisi";
//		
//		System.out.println(kredi1);
//		System.out.println(kredi2);
//		System.out.println(kredi3);
//		System.out.println(kredi4);
//		System.out.println(kredi5);

		String[] krediler = { "Hızlı Kredi", "Mutlu Emekli Kredi", "Kamu Çalışanı Kredi", "Konut Kredisi",
				"Msb Kredisi" };
		// foreach in java
//		for( String kredi:krediler) {
//			System.out.println(kredi);
//			
//		}
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;// Burada Değer Ataması Yapılır Bağlantı Kesilir.
		sayi2 = 100;
		System.out.println(sayi1);

		int[] sayilar1 = { 1, 2, 3, 4, 5 };
		int[] sayilar2 = { 10, 20, 30, 40, 50 };
		sayilar2 = sayilar1;// Burada Referanslar Yani Gösterdiği Yerler Eşitlenir.Referansı Tutulmayan Veri
							// Uçar.
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);

		String sehir1 = "Ankara";
		String sehir2 = "İstanbul";
		sehir1 = sehir2;
		sehir2 = "İzmir";
		System.out.println(sehir1);

		String[] sehirler1 = { "Ankara", "İstanbul", "İzmir" };
		String[] sehirler2 = { "Adana", "Erzurum", "Eskişehir" };
		sehirler1 = sehirler2;// Burada Referanslar Yani Gösterdiği Yerler Eşitlenir.Referansı Tutulmayan Veri
								// Uçar.
		sehirler2[0] = "Amasya";
		for (String s : sehirler2) {
			System.out.println(s);
		}

		int sayi10 = 40;
		int sayi20 = 25;
		int sayi30 = 30;
		int enBuyuk = sayi10;
		if (enBuyuk < sayi20) {
			enBuyuk = sayi20;
		}
		if (enBuyuk < sayi30) {
			enBuyuk = sayi30;

		}
		System.out.println("En büyük sayı" + enBuyuk);
		char grade='H';
		switch(grade)
		{
		
		case 'A': 
			
			
			System.out.println("Mükemmel Geçtiniz.");
			break;
			case 'B':
				System.out.println("Çok güzel Geçtiniz.");
			break;
			case 'C':
				System.out.println(" güzel Geçtiniz.");
			break;
			case 'D':
				System.out.println(" Geçtiniz.");
			break;
			case 'F':
				System.out.println("Kaldınız");
		break;
		default:
			System.out.println(grade + "    Yanlış Bir Değer Girdiniz");
		}
		int number = 0;
		int remainder = number % 2;
		boolean isPrime = true;
		if (number<1) {
			System.out.println("Geçersiz bir sayı girdiniz.");
			return;
		}
		
		for(int i=2; i<number; i++) {
			
			
			if(number%i==0) {
				isPrime=false;
			}
			
		}
		if(isPrime==true) {
			System.out.println("Girdiğiniz   " +number + "  sayısı asaldır");
		}
		else {
			System.out.println("Girdiğiniz   " +number + "  sayısı asal değildir.");
		}



	}
}
