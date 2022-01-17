package _009_Homework1;

public class Homework1 {

	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		int x, y, z;
		
		System.out.print("x: ");
		x = Integer.parseInt(kb.nextLine());
		
		System.out.print("y: ");
		y = Integer.parseInt(kb.nextLine());
		
		
		System.out.print("z: ");
		z = Integer.parseInt(kb.nextLine());
		
		int min = RelationSolver.min(x, y, z);
		int mid = RelationSolver.mid(x, y, z);
		int max = RelationSolver.max(x, y, z);
		
		System.out.println("min = " + min);
		System.out.println("mid = " + mid);
		System.out.println("max = " + max);
		
		RelationSolver.show(min, mid, max);
		
	}

} 

class RelationSolver {
	
	public static int min(int x, int y, int z) {
		
		if (x < y && x < z) {
			return x;
		}else if ( y < x && y < z) {
			return y;
		}else {
			return z;
		}		
	} 
	
	public static int mid(int x, int y, int z) {
		
		if (x < z && x > y || x < y && x > z) {
			return x;
		}else if (y < z && y > x || y < x && y > z) {
			return y;
		}else {
			return z;
		}
	} 
	
	public static int max(int x, int y, int z) {
		
		if (x > y && x > z) {
			return x;
		}else if (y > x && y > z) {
			return y;
		}else {
			return z;
		}
	}
	
	public static void show(int min, int mid, int max) {
		
		if (min < mid && mid < max) {
			System.out.printf("%d < %d < %d" , min, mid, max);
		}else if (min == mid && mid == max) {
			System.out.printf("%d = %d = %d" , min, mid, max);
		}else if (min == mid && mid < max) {
			System.out.printf("%d = %d < %d" , min, mid, max);
		}else {
			System.out.printf("%d < %d = %d" , min, mid, max);
		}
	}
}
