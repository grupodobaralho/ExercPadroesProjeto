import java.util.ArrayList;

public class PassaporteFactory {

	public Passaporte fazPassaporte(String nomeCliente, int nroDias, double valorBasico,
			int dia, int mes, int ano, ArrayList<String> listaPromo) {

		PassaporteBasico passaporte = new PassaporteBasico(nomeCliente, nroDias, valorBasico, dia, mes, ano);
		
		
		//for(String s : listaPromo) {
		//	if(s.equals(E)
		//}
		
		
//		switch (novoTipoPassaporte.toUpperCase()) {
//		case "E":
//			return new EstudanteUniversitario(new PassaporteBasico(nomeCliente, nroDias, valorBasico, dia, mes, ano));
//		case "S":
//			return new SeguroGarantido(new PassaporteBasico(nomeCliente, nroDias, valorBasico, dia, mes, ano));
//		case "P":
//			return new CCPagueBem(new PassaporteBasico(nomeCliente, nroDias, valorBasico, dia, mes, ano));
//		case "I":
//			return new CCPagueBem(new PassaporteBasico(nomeCliente, nroDias, valorBasico, dia, mes, ano));
//		case "ES" : 
//		default:
//			break;

		//}
		return null;
	}

}
