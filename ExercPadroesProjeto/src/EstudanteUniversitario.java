public class EstudanteUniversitario extends PromocoesDecorator {

	public EstudanteUniversitario(Passaporte novoPassaporte) {
		super(novoPassaporte);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double valorDoDia(int nrodia) {
		double valorDia = valorBasico();
		for (int i = 0; i < nrodia - 1; i++) {
			if (nrodia >= 2 && getNroDias() >= 5) {
				valorDia = valorDia - (valorDia * 0.3);
			} else {
				valorDia = valorDia - (valorDia * 0.2);
			}
		}
		return valorDia;
	}


	public String toString() {
		return super.toString() + "\n[Estudante Universitario]";
	}

}
