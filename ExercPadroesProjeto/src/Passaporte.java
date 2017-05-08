import java.util.GregorianCalendar;

public interface Passaporte {

	String getNomeCliente();

	int getNroDias();

	double valorBasico();

	double valorDoDia(int nrodia);

	double valorTotal();

	GregorianCalendar dataInicial();

}
