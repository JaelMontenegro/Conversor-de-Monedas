package conversor.unidad;

public class ConversorMoneda extends ConversorBase {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conversor Moneda";

	}

	
	

	@Override
	public TipoDeConversionBase[] getTiposDeConversion() {
		// TODO Auto-generated method stub
		return new TipoDeConversionBase[] {
				new ConversionLineal(801.45, "Dolares a Pesos Chilenos"),
				new ConversionLineal(1.0/801.45, "Pesos Chilenos a Dólares"),
				new ConversionLineal(872.31, "Euros a Pesos Chilenos"),
				new ConversionLineal(1.0/872.31, "Pesos Chilenos a Euros"),
				new ConversionLineal(1.09, "Euros a Dólares"),
				new ConversionLineal(1.0/1.09, "Dólares a Euros")};
	}

}
