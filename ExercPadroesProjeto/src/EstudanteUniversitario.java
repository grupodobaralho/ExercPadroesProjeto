import java.util.GregorianCalendar;

public class EstudanteUniversitario extends PromocoesDecorator {

	public EstudanteUniversitario(Passaporte novoPassaporte) {
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
		double valorDia = valorBasico();
		for (int i = 0; i < nrodia - 1; i++) {
			if(nrodia >= 2 && getNroDias() >= 5){
				valorDia = valorDia - (valorDia * 0.3);
			}
			else{
				valorDia = valorDia - (valorDia * 0.2);				
			}
		}
		return valorDia;
	}

	@Override
	public double valorTotal() {
		double valorTotal = 0.0;
		for (int d = 1; d <= getNroDias(); d++) {
			valorTotal += valorDoDia(d);
		}
		return valorTotal;
	}

	@Override
	public GregorianCalendar dataInicial() {
		// TODO Auto-generated method stub
		return super.getTempPassaporte().dataInicial();
	}

}
