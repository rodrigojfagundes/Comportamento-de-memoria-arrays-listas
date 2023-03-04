package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	//for each... Sintaxe opcional e simplificada para percorrer colecoes
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	String[] vect = new String [] {"maria", "bob", "alex"};
	
	for (int i =0; i<vect.length; i++) {
		System.out.println(vect[i]);
		
	}
	
	System.out.println("--------------");
	for (String obj:vect) {
		System.out.println(obj);
	}
	sc.close();
	}
}
