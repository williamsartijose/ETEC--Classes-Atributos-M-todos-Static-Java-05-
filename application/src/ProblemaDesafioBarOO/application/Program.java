package ProblemaDesafioBarOO.application;

import java.util.Locale;
import java.util.Scanner;

import ProblemaDesafioBarOO.entities.Bill;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bill bill = new Bill();

		System.out.println("Sexo: ");
		bill.gender = sc.next().charAt(0);
		System.out.println("Quantidade de cervejas:  ");
		bill.beer = sc.nextInt();
		sc.nextLine();
		System.out.println("Quantidade de refrigerantes:   ");
		bill.softDrink = sc.nextInt();
		sc.nextLine();
		System.out.println("Quantidade de espetinhos:  ");
		bill.barbecue = sc.nextInt();
		sc.nextLine();

		System.out.println();

		System.out.println("RELATÓRIO: ");

		System.out.printf("Consumo = R$ %.2f%n", bill.feeding());

		if (bill.cover() == 0.00) {
			System.out.println("Insento de Couver ");

		} else {
			System.out.printf("Couvert = R$ %.2f%n", bill.cover());
		}
		System.out.printf("Ingresso = R$ %.2f%n", bill.ticket());

		System.out.println();

		System.out.printf("Valor a pagar = R$ %.2f", bill.total());
		sc.close();
	}
}