package tp2;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Exe4 {

	// Deviner le nombre

	public static int entierAleatoire(int a, int b) {
		// Retourne un entier aléatoire entre a (inclus) et b (inclus)
		return ThreadLocalRandom.current().nextInt(a, b + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nombre = entierAleatoire(1, 100);
		int nbEssais = 0;
		int nb = 0;
		while (nb != nombre) {
			System.out.println("Entrez un nombre :");
			nb = sc.nextInt();
			nbEssais++;
			if (nb < nombre) {
				System.out.println("C'est plus");
			} else if (nb > nombre) {
				System.out.println("C'est moins");
			}
		}
		System.out.println("Bravo, vous avez trouvé en " + nbEssais + " essais");
		sc.close();

	}
}
