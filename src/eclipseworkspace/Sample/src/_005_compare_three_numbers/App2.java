package _005_compare_three_numbers;
/*
 Klavyeden girilen 3 kenar uzunlugunun bir ucgen olusturup olusturmadigini ekrana yazdiran program.
 ucgen olma kosulu 
 a + b > c
 a + c > b ve b + c > a 
 
 Bu 3 kosulu beraber saglayan kenar bir ucgen olabilir.
 */

public class App2 {

	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("a degerini giriniz : ");
		a = Integer.parseInt(kb.nextLine());
		
		System.out.print("b degerini giriniz : ");
		b = Integer.parseInt(kb.nextLine());
		
		System.out.print("c degerini giriniz : ");
		c = Integer.parseInt(kb.nextLine());
		
		Triangle.isTriangle(a, b, c);
		Triangle.isEquilateralTriangle(a, b, c);
		Triangle.isIsoscelesTriangle(a, b, c);
	
		

	}

}
class Triangle {
	
	public static void isTriangle(int a, int b, int c) {
		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("Ucgen olusturur...");
		} else {
			System.out.println("Ucgen olusturmaz...");
		}	
	}	
	public static void isEquilateralTriangle(int a, int b, int c) {
		
		if (a == b && b == c) {
			System.out.println("Eskenardir...");
		} else {
			System.out.println("Eskenar degildir...");
		}
		
	}
	public static void isIsoscelesTriangle(int a, int b, int c) {
		
		if (a == b && a != c || b == c && b != a || a == c && a != b) {
			System.out.println("Ikizkenar ucgendir...");
		}else {
			System.out.println("Ikizkenar ucgen degildir...");
		}
	}
} 