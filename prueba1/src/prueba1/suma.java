package prueba1;

import java.util.Scanner;

public class suma {

	public static void main(String[] args) {
		
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		num2 = sc.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2) );
		
		System.out.println("Nueva línea");

	}

}
