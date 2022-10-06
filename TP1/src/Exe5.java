package tp1;

import java.util.Arrays;
import java.util.Scanner;

public class Exe5 {
	//Affichage dans l'ordre croissant

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez 3 nombres");

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();

		// sort the numberswith an if statement
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (a > c) {
			int temp = a;
			a = c;
			c = temp;
		}
		if (b > c) {
			int temp = b;
			b = c;
			c = temp;
		}

		System.out.println("Les nombres dans l'ordre croissant sont: " + a + ", " + b + ", " + c);


	}
}
