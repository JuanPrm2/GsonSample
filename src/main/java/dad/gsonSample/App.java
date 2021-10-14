
package dad.gsonSample;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {

	private static Scanner teclado = new Scanner(System.in);		

	public static void main(String[] args) {

		Persona p = new Persona();
		p.setNombre(readString("Introduce tu nombre: "));
		p.setApellido(readString("Introduce tus apellidos: "));
		p.setEdad(readInt("Introduce tus edad: "));
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
	}

	private static String readString(String title) {
		System.out.print(title);
		String texto = teclado.nextLine();		
		while (hasDigits(texto)) {
			texto = teclado.nextLine();					
		}
		return texto;
	}
	
	private static int readInt(String title) {
		System.out.print(title);
		String texto = teclado.nextLine();		
		while (!hasDigits(texto)) {
			texto = teclado.nextLine();					
		}
		return Integer.parseInt(texto);
	}
	
	public static boolean hasDigits(String s) {
		for (int i = 0; i < s.length(); i++) {
			char caracterActual = s.charAt(i);
			if (Character.isDigit(caracterActual)) {
				return true;
			}
		}
		return false;
	}

}
