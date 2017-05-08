import java.util.GregorianCalendar;

public class SeguroGarantido extends PromocoesDecorator {

	public SeguroGarantido(Passaporte novoPassaporte) {
		super(novoPassaporte);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getNomeCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getNroDias() {
		// TODO Auto-generated method stub
		return super.getTempPassaporte().getNroDias();
	}

	@Override
	public double valorBasico() {
		// TODO Auto-generated method stub
		return super.getTempPassaporte().valorBasico();
	}

	@Override
	public double valorDoDia(int nrodia) {
		// TODO Auto-generated method stub
		return super.getTempPassaporte().valorDoDia(nrodia);
	}

	@Override
	public double valorTotal() {
		if(getNroDias()==7){
			return super.getTempPassaporte().valorTotal() * 0.98;
		} else {		
			return super.getTempPassaporte().valorTotal();
		}
	}

	@Override
	public GregorianCalendar dataInicial() {
		// TODO Auto-generated method stub
		return super.getTempPassaporte().dataInicial();
	}

}