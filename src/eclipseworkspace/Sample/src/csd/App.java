/*----------------------------------------------------------------------------------------------------------------------
	Sınıf Çalışması: Parametresi ile aldığı int türden bir sayının basamak sayısını döndüren digitsSum
	isimli
	metodu yazınız ve aşağıdaki kod ile test ediniz 	
----------------------------------------------------------------------------------------------------------------------*/

package csd;

class App {
	public static void main(String [] args)
	{		
		PowTest.run();
	}
}


class PowTest {
	public static void run()
	{
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		for (;;) {
			System.out.print("Tabani giriniz :");
			int a = Integer.parseInt(kb.nextLine());
			
			System.out.print("Ussu giriniz :");
			int b = Integer.parseInt(kb.nextLine());
			
//			System.out.printf("pow(%d, %d) = %d%n", a, b, NumberUtil.pow(a,b));
			
//			if (b < 0);
			
			return;
			
		}
	}
	
class NumberUtil {
	
	public static int run (int a, int b) {
	
	int result = 1;
	
	while (b --> 0)
		result *=a;
	
	return result;
	}	
	
 }
}