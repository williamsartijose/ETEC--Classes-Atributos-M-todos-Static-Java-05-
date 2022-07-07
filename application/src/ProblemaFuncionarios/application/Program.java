package ProblemaFuncionarios.application;

import java.util.Locale;
import java.util.Scanner;

import ProblemaFuncionarios.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.println("Nome: ");
		employee.name = sc.nextLine();

		System.out.print("Salário Bruto: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Imposto: ");
		employee.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Funcionário: " + employee);
		System.out.println();
		System.out.print("Qual a porcentagem para aumentar o salário? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);

		System.out.println();
		System.out.println("Dados atualizados: " + employee);
		sc.close();
	}
}