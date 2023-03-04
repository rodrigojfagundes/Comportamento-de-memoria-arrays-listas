//https://www.youtube.com/watch?v=Xj-osdBe3TE

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//criando uma LISTA do tipo employee... Lista para armazenar os funcionarios
		//o nome dela vai ser LIST
		List<Employee> list = new ArrayList<>();
		
		System.out.print("how many employees will be registred? ");
		int N = sc.nextInt();

		for (int i =0; i<N; i++) {
			System.out.println("Employee #" + (i + 1) +  ":");
			System.out.println("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();		
			System.out.println("salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp  = new Employee(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.print("enter the eployee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		
		Integer pos = position(list, idsalary);
		
		if (pos == null) {
			System.out.println("this id does not exist!");
			
		} else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee emp : list) {
			System.out.println(emp);
		}
		sc.close();
	}
	
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
