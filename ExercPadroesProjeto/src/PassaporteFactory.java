import java.util.ArrayList;

public class PassaporteFactory {

	public Passaporte fazPassaporte(String nomeCliente, int nroDias, double valorBasico, int dia, int mes, int ano,
			ArrayList<String> listaPromo) {

		Passaporte passaporte = new PassaporteBasico(nomeCliente, nroDias, valorBasico, dia, mes, ano);

		for (String s : listaPromo) {
			if (s.equals("E"))
				passaporte = new EstudanteUniversitario(passaporte);
			else if (s.equals("S"))
				passaporte = new SeguroGarantido(passaporte);
			else if (s.equals("P"))
				passaporte = new CCPagueBem(passaporte);
			else if (s.equals("I"))
				passaporte = new Idoso(passaporte);
		}
		return passaporte;
	}

}
