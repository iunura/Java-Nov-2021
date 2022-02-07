package _010_homework2;

public class App {

	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.println("n sayisini giriniz :");
		int n = Integer.parseInt(kb.nextLine());

		
		for (int i = 1;i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		
		for(int i = 1; i <= n; i++) {
			for(int j= n; j >=i; j--)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i = 1; i <= n; i++) {
			for(int j= 1; j <= n - i; j++)
				System.out.print(" ");
			for(int k = 1; k <= i; k++) {
				System.out.print("*");			
			}
			System.out.println();
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print (" ");
			for (int k = 1; k <= 2 * i - 1 ; k ++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
