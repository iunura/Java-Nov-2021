package _008_classExample1;

class App {
	public static void main(String [] args) 
	{	
		java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int n = Integer.parseInt(kb.nextLine());
		
		int i = n - 1;
		
		while (i >= 0) {
			System.out.printf("i: %d%n", i);
			--i;
		}
		
		System.out.printf("Döngü sonrası i: %d%n", i);
		System.out.println("Tekrar yapıyor musunuz?");		
	}
}