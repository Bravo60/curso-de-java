package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler dois n�meros inteiros M e N, e depois ler uma
		 * matriz de M linhas por N colunas contendo n�meros inteiros, podendo haver
		 * repeti��es. Em seguida, ler um n�mero inteiro X que pertence � matriz. Para
		 * cada ocorr�ncia de X, mostrar os valores � esquerda, acima, � direita e
		 * abaixo de X, quando houver, conforme exemplo.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qtde de linhas: ");		
		int l = sc.nextInt();
		
		System.out.println();
		
		System.out.print("Qtde de colunas: ");
		int c = sc.nextInt();
		
		System.out.println();
		
		// Instaciar a matriz na memoria
		int[][] mat = new int[l][c];
		
		for (int i=0; i<mat.length; i++) {
			System.out.println("Valores da linha: " + i);
			for (int j=0; j<mat[i].length; j++) {
				
				mat[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.print("Numero pertencente a matriz: ");
		int n = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == n) {
					System.out.println("Posi��o " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Acima: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Abaixo: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
