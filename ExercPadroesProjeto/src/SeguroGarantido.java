public class SeguroGarantido extends PromocoesDecorator {

	public SeguroGarantido(Passaporte novoPassaporte) {
		super(novoPassaporte);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double valorTotal() {
		if(getNroDias()==7){
			return super.getTempPassaporte().valorTotal() * 0.98;
		} else {		
			return super.getTempPassaporte().valorTotal();
		}
	}
	
	public String toString(){
		return super.toString() + "\n[Seguro Garantido]";
	}
}
