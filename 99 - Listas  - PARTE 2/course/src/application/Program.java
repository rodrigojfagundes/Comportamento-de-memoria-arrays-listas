package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Program {

	//listas
	//-é tipo um vetor, só q pode ser iniciada vazia
	//-o tamanho da lista pode variar conforme executa o codigo (no vetor o tamanho e fixo)
	//-facilidade para add e remover dados
	//-desvantagem é q o acesso dos elementos e sequencial... ACHO Q para encontrar um ELEMENTO
	//na lista tem q passar por "todos" os elementos primeiro... 
	
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	List <String> list = new ArrayList<>();
	
	list.add("maria");
	list.add("alex");
	list.add("bob");
	list.add("anna");
	
	//
	//da forma a baixo nos vamos add um ELEMENTO/NOME numa POSICAO ESPECIFICA... no CASO a 2
	list.add(2, "Marco");
	
	System.out.println(list.size());


	for (String x : list) {
	System.out.println(x);	
	}
	
	System.out.println("--------------------------");
	
	//removendo valor da lista... no caso removendo a anna
		list.remove("anna");
	//
	//tambem podemos remover o nome numero 1 da lista LEMBRANDO a lista comeca pelo 0
		list.remove(1);
	//
	//removendo por predicado
	//no caso vamos remover todo mundo q comece com a letra M
	list.removeIf(x -> x.charAt(0) == 'm');
	
	for(String x: list) {
		System.out.println(x);
		
	}
	//mostrando apenas um nome especifico
	System.out.println("----------------");
	System.out.println("index of bob" + list.indexOf("bob"));
	//
	//Manter na lista apenas os nomes q comecem com uma determinada letra
	//
	System.out.println("------------------");
	List<String> result = list.stream().filter(x -> x.charAt(0) == 'a').collect(Collectors.toList());
	
	for (String x : result) {
		System.out.println(x);
	}
	System.out.println("-------------------");
	String name = list.stream().filter(x -> x.charAt(0) == 'a').findFirst().orElse(null);
	System.out.println(name);
	}
}
