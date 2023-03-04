package course;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//matriz de 3x3 q sera digitado 9 valores...
		//e sera calculado os vallores da diagnla principal...
		//e a quantidade de numeros negativo digitados..
		
		int n = sc.nextInt();

		int [][] mat = new int[n][n];
		
		//laco FOR para percorrer as linhas
		for (int i=0; i<n; i++) {
			//laco FOR para percorrer as colunas
			for (int j =0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		//imprimindo a diagonal principal da matriz
		System.out.println("main diagonal: ");
		for (int i=0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		//
		//contar a qtde numero negativos

		int count = 0;
		//pecorrendo a matriz
		for (int i=0; i<n; i++) {
		for (int j=0; j<n; j++) {
			//verificando se a MATRIZ tem valores NEGATIVO
			if(mat[i][j] < 0) {
				count++;
			}
		}	
		}
		System.out.println("negative number: " + count);
		sc.close();
	}
}
