package tp2;
import java.util.Scanner;

public class Exe3 {
	// Somme de 1 à n
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un nombre :");
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println("Le nombre doit être positif");
		} else {
			StringBuilder sb = new StringBuilder();
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum += i;
				sb.append(i);
				if (i != n) {
					sb.append(" + ");
				}
			}
			sb.append(" = ");
			sb.append(sum);
			System.out.println(sb.toString());
		}
	}

}
