package tp2;

public class Exe2 {
	//Conversion degrés Fahrenheit vers Celsius
	
	public static void main(String[] args) {
		float f = 250;
		float c;

		while (f >= -20) {
			c = (f - 32) * 5 / 9;
			System.out.println(f + "°F =====> " + c + "°C");
			f -= 10;
		}
	}

}
