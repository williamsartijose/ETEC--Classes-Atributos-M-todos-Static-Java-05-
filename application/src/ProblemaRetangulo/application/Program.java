
package ProblemaRetangulo.application;

import java.util.Locale;
import java.util.Scanner;
import ProblemaRetangulo.entities.Rectangle;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rect = new Rectangle();

		System.out.println("Entre com a largura e altura do retângulo:");
		rect.width = sc.nextDouble();
		rect.height = sc.nextDouble();

		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERÍMETRO = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		sc.close();
	}
}