package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {

//Boxing, unboxing, wrapper classes
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	//
	//boxing e unboxing
	//
	//int x = 20;
	//Object obj = x;
	//System.out.println(obj);
	
	//int y = (int) obj;
	
	//wrapper classes
	
	int x = 20;
	Integer obj = x;
	
	System.out.println(obj);
	
	int y = obj * 2;
	
	System.out.println(y);
	
	sc.close();
	
	}

}
