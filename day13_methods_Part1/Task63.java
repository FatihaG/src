package day13_methods_Part1;

public class Task63 {

	public static void main(String[] args) {
		celcius (32);
		celcius (50);

	}

	public static void celcius (int fahrenheit) {
		int cel=(fahrenheit-32)*5/9;
		System.out.println(cel);
	}
}
