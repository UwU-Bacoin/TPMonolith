package tp1;

import java.util.*;

public class Exe6 {
	//Conversion secondes

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] duration = {24, 60 , 60 };
		String[] units = {"jour", "heures", "minutes", "secondes"};
		int[] result = new int[4];


		System.out.println("Entrez le nombre de secondes");
		int secondes = sc.nextInt();

		int u = 0;
		for (int i : duration) {
			result[0] = secondes / duration[u];
			secondes %= duration[u];
			u++;
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i] + " " + units[i]);
		}

	}
}
