package tp1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Exe2 {
	int a,b;

	public static void main(String[] args) {

		int[] input = input();

		swap(input[0], input[1]);
		randoMaths(input[0], input[1]);
		isGreater(input[0], input[1]);
	}

	/**
	 * @description:  Function that asks the user for two numbers and returns them in an array
	 * @return int[] tab
	 */
	public static int[] input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez un nombre");
		int a = sc.nextInt();
		System.out.println("Entrez un autre nombre");
		int b = sc.nextInt();
		return new int[]{a, b};
	}

	/**
	 * @description: Fonction that double the first parameter and divides the second parameter by two
	 *
	 * @param a int
	 * @param b int
	 * @return int[] tab
	 */
	static int[] swap(int a, int b) {
		int[] tab = new int[2];
		int temp = a;
		a = b;
		b = temp;
		tab[0] = a;
		tab[1] = b;
		System.out.println("\n========== swap() ==========");
		System.out.println("a <=> b");
		System.out.println("> a = " + a + "\n> b = " + b);
		return tab;
	}

	/**
	 * @description: Fonction that double the first parameter and divides the second parameter by two
	 *
	 * @param a int
	 * @param b int
	 * @return int[] tab
	 */
	static int[] randoMaths(int a, int b) {
		int[] tab = new int[2];
		tab[0] = a*2;
		tab[1] = b/2;
		System.out.println("\n========== randoMaths() ==========");
		System.out.println("> a*2 = " + a*2 + "\n> b/2 = " + b/2);
		return tab;
	}

	/**
	 * @description: Fonction that checks if the first parameter is greater than the second parameter
	 *
	 * @param a int
	 * @param b int
	 * @return boolean
	 */
	public static boolean isGreater(int a, int b) {
		if(a > b) {
			System.out.println("\n========== isGreater() ==========");
			System.out.println("a est plus grand que b");
			return true;
		} else if (a < b) {
			System.out.println("\n========== isGreater() ==========");
			System.out.println("b est plus grand que a");
			return false;
		} else {
			System.out.println("\n========== isGreater() ==========");
			System.out.println("a et b sont égaux");
			return false;
		}
	}

	/*
	 * Unit test for the Exe2 class.
	 */

	/**
	 * Tests the swap() method.
	 */
	@Test
	public void testSwap() {
		int[] tab = swap(1, 2);
		Assertions.assertEquals(2, tab[0]);
		Assertions.assertEquals(1, tab[1]);
	}

	/**
	 * Tests the input() method.
	 */
	@Test
	public void testInput() {

		String input1 = "5\n10";
		InputStream in1 = new ByteArrayInputStream(input1.getBytes());
		System.setIn(in1);
		Assertions.assertArrayEquals(new int[]{5, 10} , input());

		String input2 = "a\nl";
		InputStream in2 = new ByteArrayInputStream(input2.getBytes());
		System.setIn(in2);
	}

	/**
	 * Tests the randoMaths() method.
	 */
	@Test
	public void testRandomMaths() {
		Assertions.assertArrayEquals(new int[]{10, 15}, randoMaths(5, 30));
		Assertions.assertArrayEquals(new int[]{0, 0}, randoMaths(0, 0));
		Assertions.assertArrayEquals(new int[]{-10, -15}, randoMaths(-5, -30));
	}

	/**
	 * Tests the isGreater() method.
	 */
	@Test
	public void testIsGreater() {
		Assertions.assertTrue(isGreater(10, 5));
		Assertions.assertFalse(isGreater(5, 10));
		Assertions.assertFalse(isGreater(0,0));
		Assertions.assertTrue(isGreater(-5, -10));
	}
}
