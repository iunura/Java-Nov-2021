package _005_compare_three_numbers;

/*
 Klavyeden girilen 3 farkli sayinin ortancasini ekrana yazdiran program*/

public class App3 {

	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("a degerini giriniz : ");
		a = Integer.parseInt(kb.nextLine());
		
		System.out.print("b degerini giriniz : ");
		b = Integer.parseInt(kb.nextLine());
		
		System.out.print("c degerini giriniz : ");
		c = Integer.parseInt(kb.nextLine());
		
		if (a > b  && a < c || a > c && a < b) {
			System.out.println ("a ortanca sayidir...");
		}else if (b > a && b < c || b > c && b < a) {
			System.out.println ("b ortanca sayidir...");
		} else {
			System.out.println ("c ortanca sayidir...");
		}
			

	}

}
