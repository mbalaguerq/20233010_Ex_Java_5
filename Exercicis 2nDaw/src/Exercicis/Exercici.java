package Exercicis;
/*Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0 debe
pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en la última
posición debe pasar a la posición 0. Finalmente, muestra el contenido del array.*/

import java.util.Scanner;

public class Exercici {
	public static void main(String[] args) {

		int[] numeros = new int[15];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 15; i++) {
			System.out.print("Introdueix un número " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}

		int temp = numeros[14];
		for (int i = 14; i > 0; i--) {
			numeros[i] = numeros[i - 1];
		}
		numeros[0] = temp;

		System.out.println("Els números endreçats són:");
		for (int i = 0; i < 15; i++) {
			System.out.println(numeros[i]);
		}

		scanner.close();

	}
}
