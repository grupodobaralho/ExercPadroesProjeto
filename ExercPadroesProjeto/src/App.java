import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.ThrowableContainerPropertySet;

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
		ArrayList<String> listaPromo = new ArrayList<>();

		// ########################################################################

		// System.out.println("######### FORMULÁRIO COMPRA PASSAPORTE
		// #########\n");
		//
		// System.out.println("\nNome do cliente:");
		// nomeCliente = in.nextLine();
		//
		// System.out.println("\nNumero de dias:");
		// nroDias = Integer.parseInt(in.nextLine());
		//
		// System.out.println("\n--Data de Entrada--");
		//
		// System.out.println("\nDia:");
		// dia = Integer.parseInt(in.nextLine());
		//
		// System.out.println("\nMes:");
		// mes = Integer.parseInt(in.nextLine());
		//
		// System.out.println("\nAno:");
		// ano = Integer.parseInt(in.nextLine());

		// #########################################################################

		nomeCliente = "Tini";
		nroDias = 5;
		dia = 10;
		mes = 6;
		ano = 2017;

		// Sabemos que o ideal eh limitar ao maximo a visao do usuario da parte
		// interna do sistema,
		// sabemos que poderiamos esconder ainda mais o codigo do usuario, mas
		// decidimos que
		// para este exercicio, estaria OK tratarmos tudo na classe de testes

		
		int count = 0;
		System.out.println("Por favor, informe E, S, P, ou I.... PARA SAIR DIGITE exit");
		String entra = "";
		while (count < 4) {
			entra = in.nextLine();
			entra.toUpperCase();
          
		
			if (entra.equalsIgnoreCase("exit"))
				break;
			
			if (listaPromo.contains(entra))
				System.out.println("Promoção já selecionada");
			if (!listaPromo.contains(entra)) {
				if (entra.equalsIgnoreCase("E") || entra.equalsIgnoreCase("S") || entra.equalsIgnoreCase("P")
						|| entra.equalsIgnoreCase("I")) {
					listaPromo.add(entra.toUpperCase());
					count++;
				}

			}
		}

		passaporte = passaporteFactory.fazPassaporte(nomeCliente, nroDias, valorBasico, dia, mes, ano, listaPromo);

		System.out.println(passaporte.toString());
		System.out.println("\n Valor Total do Passaporte: " + passaporte.valorTotal());

	}

}
