package _006_EquationExample;

public class App {

	public static void main(String[] args) {	
		EquationSolver.run();
	}

}
class EquationSolver {
	
	public static double delta (int a, int b, int c) {
		return b * b - 4 * a * c;		
	}

	public static void solve (int a, int b, int c ) {
		double delta = delta(a, b, c);
		double x1,x2;
		double sqrtDelta = Math.sqrt(delta);
		
		
		if (delta > 0) {
			x1 =(-b +sqrtDelta)/ 2 * a;
			x2 =(-b -sqrtDelta)/ 2 * a;
		}else if (delta == 0) {
			x1 =x2 = -b / 2 * a;
		}else {
			System.out.println("Kok yoktur...");
			return;
		}
		
		System.out.printf("x1 = %.2f%n", x1);
		System.out.printf("x2 = %.2f%n", x2);
	}
	
	public static void printEquation (int a, int b, int c ) {
		System.out.printf("%dx^2 + %dx + %d = 0%n",a, b, c);	
	}

	public static void run () {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("a degerini giriniz : ");
		a = Integer.parseInt(kb.nextLine());
		
		System.out.print("b degerini giriniz : ");
		b = Integer.parseInt(kb.nextLine());
		
		System.out.print("c degerini giriniz : ");
		c = Integer.parseInt(kb.nextLine());
		
		printEquation(a, b, c);
		solve (a, b, c);
	}
}
