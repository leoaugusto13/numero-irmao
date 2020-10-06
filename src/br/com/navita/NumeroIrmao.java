package br.com.navita;

import java.util.Scanner;

public class NumeroIrmao {
	
	public static int solution(int n) {
		char arrayNumeros[] = (""+n).toCharArray();
		char temp;
		
		for (int i = 1; i < arrayNumeros.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arrayNumeros[i] >= arrayNumeros[j]) {
					temp = arrayNumeros[i];
					arrayNumeros[i] = arrayNumeros[j];
					arrayNumeros[j] = temp;
				}
			}
		}
		
		int numeroIrmao = Integer.parseInt(new String(arrayNumeros));
		return (numeroIrmao > 100000000) ? -1 : numeroIrmao;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrada: ");
		/* int irmao = scanner.nextInt(); */	
		System.out.println("Saída: "+ solution(scanner.nextInt()));	
		
		scanner.close();
	}

}


