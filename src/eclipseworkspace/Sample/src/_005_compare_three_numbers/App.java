package _005_compare_three_numbers;
/*
 Klavyeden girilen 3 farkli sayinin en buyugunu ekrana yazdiran program ' sayilarin farkli girildigini kabul ediyoruz*/

public class App {

	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("a degerini giriniz : ");
		a = Integer.parseInt(kb.nextLine());
		
		System.out.print("b degerini giriniz : ");
		b = Integer.parseInt(kb.nextLine());
		
		System.out.print("c degerini giriniz : ");
		c = Integer.parseInt(kb.nextLine());
//Eski Yontem
//		if (a > b) {
//			if (a > c) {
//				System.out.println("a en buyuktur..");
//			} else {
//				System.out.println("c en buyuktur..");
//			}
//		} else if (b > c) {
//			System.out.println("b en buyuktur..");
//		} else {
//			System.out.println("c en buyuktur..");		
//		}
		
		if (a > b && a > c) {
			System.out.print("a en buyuktur...");
		}else if (b > a && b > c ) {
			System.out.print("b en buyuktur...");
		}else {
			System.out.print("c en buyuktur...");
		}
			
	} 
	

}
