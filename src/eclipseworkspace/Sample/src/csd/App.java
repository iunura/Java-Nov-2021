/*----------------------------------------------------------------------------------------------------------------------
	boolean türden geri dönüş değeri olan bir metodun if deyiminin koşul ifadesinde çağrılması
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {

		public static void main(String [] args)
		{	
			int a, b;
			
			a = 2;

			b = ++a;
			b += a-- * --a;		
	
			
			System.out.printf("a = %d%n", a);
			System.out.printf("b = %d%n", b);
			
		}
}


