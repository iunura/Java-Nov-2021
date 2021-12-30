package _003_comparison_operator;
/*
 Klavyeden girilen 2 sayinin tum karsilastirma operatorlerini kullanarak ekrana basan program*/
public class App {

	public static void main(String[] args) {
	   java.util.Scanner kb =new java.util.Scanner(System.in);
	
	   int a,b;
	 
	   System.out.print("a degerini giriniz :");
	   a =Integer.parseInt(kb.nextLine());
	
	   System.out.print("b degerini giriniz :");
	   b =Integer.parseInt(kb.nextLine());

	   System.out.printf("%d > %d = %b%n", a, b, a > b);
	   System.out.printf("%d < %d = %b%n", a, b, a < b);
	   System.out.printf("%d >= %d = %b%n", a, b, a >= b);
	   System.out.printf("%d <= %d = %b%n", a, b, a <= b);
	   System.out.printf("%d == %d = %b%n", a, b, a == b);
	   System.out.printf("%d != %d = %b%n", a, b, a != b);
	   

	}

}
