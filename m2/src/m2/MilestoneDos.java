package m2;

public class MilestoneDos {

	public static void main(String[] args) {
		int numero = 6;
		
		for (int i = 1; i <= numero; i++) {
			//System.out.print(i + "\n");
			for (int x = 1; x <= i; ++x) {
				System.out.print(x);
			}
		System.out.print("\n");
		}
		
		System.out.println("--------------------------------------");
		
		int asteriscos = 8;
		
		for (int i = asteriscos; i >= 1; i--) {
		   for (int x = 1; x <= asteriscos-i; ++x) {
				System.out.print(" ");
			}
		   for (int n = 1; n <= (i*2)-1; ++n) {
				System.out.print("*");
			}
		System.out.print("\n");
		}

	}
}
