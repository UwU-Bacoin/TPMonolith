package tp1;
import java.util.Scanner;

public class Exe2 {
	//Sasie et opérations de base

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, temp;

		System.out.println("Entrez un nombre entier :");
		a = sc.nextInt();
		System.out.println("Entrez un autre nombre entier :");
		b = sc.nextInt();
		System.out.println("a = " + a + "\net b = " + b);

		temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a + "\net b = " + b);

		System.out.println("a*2 = " + a*2 + "\nb/2 = " + b/2);

		System.out.println("a/b = " + a/b + "\nb%a = " + b%a);

		System.out.println(a>b ? "a est plus grand que b" : "b est plus grand que a");

		sc.close();
	}
}
