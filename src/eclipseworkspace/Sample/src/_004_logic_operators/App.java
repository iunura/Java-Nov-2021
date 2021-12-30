package _004_logic_operators;
/*2 fonksiyon yazilacak her fonksiyon icinde foo da foo bar da bar tanimlayacaksin.foo'dan true bardan false tureyecek*/
public class App {

	public static void main(String[] args) {
		
		if (Sample.bar() && Sample.bar() || Sample.bar()) {
			System.out.println("True kolu");			
		} else {
			System.out.println("False kolu");
		}

	}

}
class Sample {
	public static boolean foo() {
		
		System.out.println("foo");
		return true;
	}		
	public static boolean bar() {
		
		System.out.println("bar");
		return false;
	
	}
}