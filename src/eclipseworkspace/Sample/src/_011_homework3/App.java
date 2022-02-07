package _011_homework3;

public class App {

	public static void main(String[] args) {

		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.println("n sayisini giriniz :");
		int n = Integer.parseInt(kb.nextLine());

		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print (" ");
			for (int k = 1; k <= 2 * i - 1 ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (int k =2 * i - 1 ; k >= 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	}

}
