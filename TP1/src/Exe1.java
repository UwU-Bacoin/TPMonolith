package tp1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exe1 {
	public static String s = "Hello World";
	public static void main(String[] args) {
		System.out.println(s);
	}

	@Test
	public void test() {
		assertEquals("Hello World", s);
	}
}