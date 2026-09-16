package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Work {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Funcionarios funcao = new Funcionarios();
		
		System.out.print("Nome: ");
		funcao.name = sc.nextLine();
		System.out.print("Gross salary: ");
		funcao.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		funcao.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + funcao);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		funcao.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + funcao);
			
		sc.close();
	}

}
