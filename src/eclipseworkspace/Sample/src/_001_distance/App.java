package _001_distance;

public class App {
	public static void main(String[] args) {
		MathUtil.run();

	}
}

class MathUtil {
	public static void run() {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.print("x1 : ");
		int x1 = Integer.parseInt(kb.nextLine());
		System.out.print("y1 : ");
		int y1 = Integer.parseInt(kb.nextLine());
		System.out.print("x2 : ");
		int x2 = Integer.parseInt(kb.nextLine());
		System.out.print("y2 : ");
		int y2 = Integer.parseInt(kb.nextLine());
		
		NumberUtil.distance(x1,y1,x2,y2);
		
		double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.printf("distance = %.3f" ,result );
	}
	
}
class NumberUtil {
	public static double distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
}
