package tp1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.Assert.assertTrue;

public class Exe3 {
	//Année bissextile

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une année :");
		int year = sc.nextInt();

		if (isBissextile(year)) {
			System.out.println("L'année " + year + " est bissextile");
		} else {
			System.out.println("L'année " + year + " n'est pas bissextile");
		}

		sc.close();
	}

	public static boolean isBissextile(int year) {
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				return year % 400 == 0;
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}

	@Test
	public void test() {
		Assertions.assertTrue(isBissextile(2000));
		Assertions.assertFalse(isBissextile(2001));
	}
}
