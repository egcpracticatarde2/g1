package test;

import main.Suma;

public class TestSuma {

	public static void main(String[] args) {
		Suma suma = new Suma();
		Integer res1 = suma.suma1(1, 2);
		Integer res2 = suma.suma2(1, 2, 3, 4);
		System.out.println(res1);
		System.out.println(res2);

	}

}
