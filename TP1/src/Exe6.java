package tp1;

import java.util.*;

public class Exe6 {
	//Conversion secondes

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le nombre de secondes");
		int s = sc.nextInt();
		int d = s / 86400;
		int h = (s % 86400) / 3600;
		int m = ((s % 86400) % 3600) / 60;
		int sec = ((s % 86400) % 3600) % 60;
		System.out.println(d + "d" + h + "h" + m + "m" + sec + "s");
	}
}
