package tp2;

import java.util.Scanner;

public class Exe5 {

	// Figures d'étoiles
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("veuillez choisir parmis les options suivantes :");
		System.out.println("1. Triangle rectangle");
		System.out.println("2. Carre vide");
		System.out.println("3. Z");
		System.out.println("4. pyramide");
		System.out.println("5. N");
		int choice = scanner.nextInt();

		System.out.println("veuillez choisir la taille de la figure");
		int size = scanner.nextInt();
		scanner.close();


		switch (choice) {
			case 1 -> triangle(size);
			case 2 -> carre(size);
			case 3 -> z(size);
			case 4 -> pyramide(size);
			case 5 -> n(size);
			default -> System.out.println("erreur");
		}
	}

	static void triangle(int size) {
		for (int i = 0; i <= size; i++) {
			for (int j = size; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}

	static void carre(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	// reversed but works
	static void z(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == 0 || i == size - 1 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}


	static void pyramide(int size) {
		// print a triangle
		for (int i = 0; i <= size; i++) {
			for (int j = size; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void n(int size) {
		for (int i = 0; i < size; i++) {
			System.out.print("*");
			for (int j = 0; j < size; j++) {
				if (i == j || j == size - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
