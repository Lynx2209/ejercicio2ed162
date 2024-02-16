package Controladores;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el palindromo");
		String palabra = sc.next();
		String invertida = "";
		for (int i = palabra.length() - 1; i >= 0; i--) {
			invertida += palabra.charAt(i);
		}
		if (palabra.equals(invertida)) {
			System.out.println("La palabra es polindroma");
		} else {
			System.out.println("La palabra no es polindroma");
		}

	}

}