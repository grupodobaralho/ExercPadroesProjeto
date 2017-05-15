public class EstudanteUniversitario extends PromocoesDecorator {

	public EstudanteUniversitario(Passaporte novoPassaporte) {
		super(novoPassaporte);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double valorDoDia(int nrodia) {
		double valorDia = valorBasico();
		for (int i = 1; i <= nrodia ; i++) {
			if (nrodia >= 2 && getNroDias() >= 5) {
				valorDia = super.valorDoDia(i) - (super.valorDoDia(i) * 0.1);
			} else {
				valorDia = super.valorDoDia(i) ;
			}
		}
		return valorDia;
	}


	public String toString() {
		return super.toString() + "\n[Estudante Universitario]";
	}

}
