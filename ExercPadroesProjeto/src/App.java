import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		PassaporteFactory passaporteFactory = new PassaporteFactory();

		Passaporte passaporte;

		String nomeCliente = "";
		int nroDias;
		double valorBasico = 100;
		int dia;
		int mes;
		int ano;
		ArrayList<String> lista = new ArrayList<>();

		// ########################################################################

		System.out.println("######### FORMULÁRIO COMPRA PASSAPORTE #########\n");

		System.out.println("\nNome do cliente:");
		nomeCliente = in.nextLine();

		System.out.println("\nNumero de dias:");
		nroDias = Integer.parseInt(in.nextLine());

		System.out.println("\n--Data de Entrada--");

		System.out.println("\nDia:");
		dia = Integer.parseInt(in.nextLine());

		System.out.println("\nMes:");
		mes = Integer.parseInt(in.nextLine());

		System.out.println("\nAno:");
		ano = Integer.parseInt(in.nextLine());

		// #########################################################################

		System.out.println("Por favor, informe  E, S, P, ou I, para sair digite exit ");
		String entra="";
		int cont = 0;
		while (!entra.equals("exit") || cont<4) {
			entra = in.nextLine();
			if (entra.equalsIgnoreCase("E") || entra.equalsIgnoreCase("S") || entra.equalsIgnoreCase("P")
					|| entra.equalsIgnoreCase("I"))  lista.add(entra.toUpperCase());
			cont++;	
                 }

		passaporte = passaporteFactory.fazPassaporte(nomeCliente, nroDias, valorBasico, dia, mes, ano, lista);

		System.out.println("Valor Total: " + passaporte.valorTotal());

		Passaporte passaporteBasico = new EstudanteUniversitario(
				new PassaporteBasico(nomeCliente, nroDias, valorBasico, dia, mes, ano));

	}

}
