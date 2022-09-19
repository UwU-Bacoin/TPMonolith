package tp1;

import java.util.Scanner;

public class Exe4 {
	//Parité d'une somme

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, c;
		System.out.println("Entrez 3 entiers");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();

		if((a+b+c)%2 == 0) {
			System.out.println("La somme est paire");
		}
		else {
			System.out.println("La somme est impaire");
		}
	}
}
