public class CCPagueBem extends PromocoesDecorator {

	public CCPagueBem(Passaporte novoPassaporte) {
		super(novoPassaporte);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double valorTotal() {
		return super.getTempPassaporte().valorTotal() * 0.98;
	}

	public String toString() {
		return super.toString() + "\n[CC Pague Bem]";
	}

}
