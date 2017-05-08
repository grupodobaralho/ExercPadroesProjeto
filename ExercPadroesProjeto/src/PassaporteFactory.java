
public class PassaporteFactory {

	public Passaporte fazPassaporte(String novoTipoPassaporte, String nomeCliente, int nroDias, double valorBasico,
			int dia, int mes, int ano) {

		switch (novoTipoPassaporte.toUpperCase()) {
		case "E":
			return new EstudanteUniversitario(new PassaporteBasico(nomeCliente, nroDias, valorBasico, dia, mes, ano));
		case "S":
			return new SeguroGarantido(new PassaporteBasico(nomeCliente, nroDias, valorBasico, dia, mes, ano));
		case "P":
			return new CCPagueBem(new PassaporteBasico(nomeCliente, nroDias, valorBasico, dia, mes, ano));
		case "I":
			return new CCPagueBem(new PassaporteBasico(nomeCliente, nroDias, valorBasico, dia, mes, ano));
		case "ES" : 
		default:
			break;

		}
		return null;
	}

}
