package tp1;

import java.util.Arrays;
import java.util.Scanner;

public class Exe5 {
	//Affichage dans l'ordre croissant

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tab = new int[3];
		System.out.println("Entrez 3 nombres");
		tab[0] = sc.nextInt();
		tab[1] = sc.nextInt();
		tab[2] = sc.nextInt();

		Arrays.sort(tab);

		System.out.println("Les nombres dans l'ordre croissant sont :");
		for (int i : tab) {
			System.out.println(i);
		}

	}
}
