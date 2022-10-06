package tp3;

public class Exe1 {
	// Écrire une fonction pour afficher toutes les lettres de l’alphabet en
	// minuscule

	// Écrire une fonction pour afficher toutes les lettres de l’alphabet en
	// majuscule dans l’ordre inverse

	public static void main(String[] args) {
		// Appeler vos fonctions ici
		alphabet();
		alphabetReverse();
	}

	public static void alphabet() {
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void alphabetReverse() {
		for (char i = 'Z'; i >= 'A'; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
