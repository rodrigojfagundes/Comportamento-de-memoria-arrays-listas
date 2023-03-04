package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
	
	//falando sobre o GARBAGE COLLECTOR... ele serve basicamente para fazer com q VARIAVEIS q NAO
	//sao mais UTILIZADAS sejam removidas da memoria RAM...
	
		void method1() {
		int x = 10;
		
		if (x > 10) {
		//neste momento a VAR X ali de cima nao é mais nescessaria... entao o GARBAGE COLECTOR pd deletar ele
		//da memoria ram
			int y = 20;
		}
		System.out.println(x);
		}
	}

