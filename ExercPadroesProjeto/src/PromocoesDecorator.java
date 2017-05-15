import java.util.GregorianCalendar;

abstract class PromocoesDecorator implements Passaporte {

	private Passaporte tempPassaporte;

	public PromocoesDecorator(Passaporte novoPassaporte) {
		tempPassaporte = novoPassaporte;
	}

	@Override
	public String getNomeCliente() {
		// TODO Auto-generated method stub
		return tempPassaporte.getNomeCliente();
	}

	@Override
	public int getNroDias() {
		// TODO Auto-generated method stub
		return tempPassaporte.getNroDias();
	}

	@Override
	public double valorBasico() {
		// TODO Auto-generated method stub
		return tempPassaporte.valorBasico();
	}

	@Override
	public double valorDoDia(int nrodia) {
		// TODO Auto-generated method stub
		return tempPassaporte.valorDoDia(nrodia);
	}

	@Override
	public double valorTotal() {
		// TODO Auto-generated method stub

		double valorTotal = 0;
		for (int d = 1; d <= getNroDias(); d++) {
			valorTotal += this.valorDoDia(d);
		}
		return valorTotal;
	}

	@Override
	public GregorianCalendar dataInicial() {
		// TODO Auto-generated method stub
		return tempPassaporte.dataInicial();
	}

	public Passaporte getTempPassaporte() {
		return tempPassaporte;
	}

	@Override
	public String toString() {
		return tempPassaporte.toString();
	}

}
