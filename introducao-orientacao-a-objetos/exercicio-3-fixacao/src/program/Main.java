package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno stud = new Aluno();
		
		stud.name = sc.nextLine();
		stud.nota1 = sc.nextDouble();
		stud.nota2 = sc.nextDouble();
		stud.nota3 = sc.nextDouble();

		System.out.println(stud);

		sc.close();
	}

}
