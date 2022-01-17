package _007_whileExample;

public class App {

	public static void main(String[] args) {
		// klavyeden 0 girilene kadar  kullanicidan input isteyen program
		
		java.util.Scanner kb = new java.util.Scanner (System.in);
		
		int a ;
//		
//		System.out.print("deger giriniz : ");
//		a = Integer.parseInt(kb.nextLine());
//		
//		while (a != 0) {
//			System.out.print("Deger giriniz:");
//			a = Integer.parseInt(kb.nextLine());
//			
//		}
		
		do {
			System.out.print("deger giriniz : ");
			a = Integer.parseInt(kb.nextLine());
		} while (a != 0);
		

		System.out.println("Program sonlanmistir...");
	}

}