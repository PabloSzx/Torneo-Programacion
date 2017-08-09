import java.util.*;

public class Files{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		String input;
		ArrayList<String> lineas = new ArrayList<String>();
		int n = 0;

		n = teclado.nextInt();
		teclado.nextLine();

		do {
				input = teclado.nextLine().trim();
				lineas.add(input);


		} while (!(input.equals("")));

		System.out.println("Ended");

		System.out.println("lineas: " + lineas + "    " + n );


	}

	public String procesar(){
		return "";
	}
}
