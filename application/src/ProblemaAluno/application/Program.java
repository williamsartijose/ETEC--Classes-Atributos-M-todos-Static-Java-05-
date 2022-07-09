package ProblemaAluno.application;

import java.util.Locale;
import java.util.Scanner;

import ProblemaAluno.entities.Student;
import ProblemaFuncionarios.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student stud = new Student();

		System.out.println("Nome: ");
		stud.name = sc.nextLine();
		stud.grade1 = sc.nextDouble();
		stud.grade2 = sc.nextDouble();
		stud.grade3 = sc.nextDouble();
		System.out.printf("NOTA FINAL = %.2f%n", stud.finalGrade());

		if (stud.finalGrade() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("FALTARAM %.2f PONTOS%n", stud.missingPoints());

		} else {
			System.out.println("APROVADO");
		}
		sc.close();
	}
}