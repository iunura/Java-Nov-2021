/*
----------------------------------------------------------------------------------------------------------------------
1. Klavyeden alınan int türden üç sayı arasındaki büyüklük-küçüklük ilişkisini küçükten büyüğe doğru < ve = sembolleriyle gösteriniz:
Açıklama : Program üç tane int türden sayı isteyecektir, aralarındaki ilişkiyi ekranda gösterecektir. İşte birkaç örnek :
Giriş: 10 20 30 Yanıt: 10 < 20 < 30
Giriş: 30 10 20 Yanıt: 10 < 20 < 30
Giriş: 10 10 15 Yanıt: 10 = 10 < 15
Giriş: 40 50 50 Yanıt: 40 < 50 = 50

2. Parametresi ile aldığı int türden 3 sayıdan ortancasına geri dönen mid isimli metodu yazınız ve test ediniz. 
Metot sayıların aynı olması durumunda da ortanca değere geri dönecektir. Örneğin sayılar 10, 10, 20 ise ortanca değer 10 olacaktır.
Açıklama: Üç tane sayının ortancası sayıların toplamından sayıların en küçüğünün ve en büyüğünün toplamını çıkartmakla bulunabilir.
Metot bu şekilde yazılmayacaktır. Yani metot içerisinde sayıların en büyüğünün ve en küçüğünün bulunmasına gerek yoktur.

3. Parametresi ile aldığı int türden bir sayının negatif mi, 0(sıfır) mı, pozitif mi olduğunu test eden signum isimli metodu yazınız ve test ediniz. 
Metot pozitif için 1(bir), negatif için -1(eksi bir) ve sıfır için 0(sıfır) döndürecektir. Math sınıfının signum metodu kullanılmayacaktır.
----------------------------------------------------------------------------------------------------------------------*/
package _009_homework1;

class App {
	public static void main(String [] args) {
		
		NumberUtil.run();
	}
}

class NumberUtil {
	
	public static void run() {
		java.util.Scanner kb = new java.util.Scanner(System.in);
			
		System.out.print("1.sayiyi giriniz :");
		int a = Integer.parseInt(kb.nextLine());
			
		System.out.print("2.sayiyi giriniz :");
		int b = Integer.parseInt(kb.nextLine());
			
		System.out.print("3.sayiyi giriniz :");
		int c = Integer.parseInt(kb.nextLine());
		
		
		int min = min(a ,b, c);
		int mid = mid(a, b, c);
		int max = max(a, b, c);
		
		display(min, mid, max);
		
		
		System.out.println("min= " + min);
		System.out.println("mid= " + mid);
		System.out.println("max= " + max);
		
		System.out.println("signum(5)= " + signum(5));
		System.out.println("signum(-5)= " + signum(-5));
		System.out.println("signum(0)= " + signum(0));
		
				

	}
	
	public static int max(int a, int b, int c) {
		
		if (a >= b && a >= c) {
			return a;
		} else if (b >= a && b >= c) {
			return b;
		}
		return c;	
	}
	
	public static int min(int a, int b, int c) {
		
		if (a <= b && a <= c) {
			return a;
		} else if (b <= a && b <= c) {
			return b;
		}
		return c;
		
	}
	
	public static int mid(int a, int b, int c) {
		
		if (a >= b && a <= c || a <= b && a >= c) {
			return a;
		} else if (b >= a && b <= c || b <= a && b >= c) {
			return b;
		} 
		return c;
		
	}
	
	public static void display(int min, int mid, int max) {
		
		if (min < mid && mid < max) {
			System.out.printf("%d < %d < %d%n", min, mid, max);
		} else if (min == mid && mid < max) {
			System.out.printf("%d = %d < %d%n", min, mid, max);			
		} else if (min < mid && mid == max) {
			System.out.printf("%d < %d = %d%n", min, mid, max);
		} else {
			System.out.printf("%d = %d = %d%n", min, mid, max);
		}
		
	}
	
	public static int signum (int val) {
		
		if (val > 0) {
			return 1;
		} else if (val < 0) {
			return -1;
		}
		return 0;
	}

}


	