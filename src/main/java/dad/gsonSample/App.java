package dad.gsonSample;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Persona p = new Persona();
		int i = 0;
		int j = 0;
		int l = 0;
		char caracterActual;
		while (j == 0) {
			j = 1;

			System.out.println("Introduce tu nombre");
			p.Nombre = teclado.nextLine();
			for (int r = 0; r <= p.Nombre.length() - 1; r++) {
				caracterActual = p.Nombre.charAt(r);

				if (Character.isDigit(caracterActual)) {
					j = 0;
				} else {

				}
			}
		}

		while (l == 0) {
			l = 1;

			System.out.println("Introduce tu apellido");
			p.Apellido = teclado.nextLine();
			for (int s = 0; s <= p.Apellido.length() - 1; s++) {
				caracterActual = p.Apellido.charAt(s);

				if (Character.isDigit(caracterActual)) {
					l = 0;
				} else {

				}
			}
		}
		while (i == 0) {
			i = 1;
			try {
				System.out.println("Introduce tu edad");
				p.Edad = teclado.nextInt();
			} catch (Exception e) {

				teclado.nextLine();
				i = 0;
			}
		}

	}

}
