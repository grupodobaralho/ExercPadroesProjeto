public class Idoso extends PromocoesDecorator {

	public Idoso(Passaporte novoPassaporte) {
		super(novoPassaporte);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double valorDoDia(int nrodia) {
		double valorDia = valorBasico();
		for (int i = 0; i < nrodia - 1; i++) {
			if(nrodia >= 3 && getNroDias() >= 4){
				valorDia = valorDia - (valorDia * 0.35);
			}
			else{
				valorDia = valorDia - (valorDia * 0.2);				
			}
		}
		return valorDia;
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
		return super.toString() + "\n[Idoso]" ;
	}
	
}
