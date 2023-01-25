package conversor.unidad;

public class ConversorTemperatura extends ConversorBase {
	public String toString() {
		return "Conversor Temperatura";

	}

	@Override
	public TipoDeConversionBase[] getTiposDeConversion() {
		return new TipoDeConversionBase[] { 
			new ConversionLineal(5.0/9.0,-32.0*5.0/9.0, "Fahrenheit a Cent�grados"),
				new ConversionLineal(9.0/5.0,32.0, "Cent�grados a Fahrenheit "),
				new ConversionLineal(1.0, 273.15, "Cent�grados a Kelvin"),
				new ConversionLineal(1.0, -273.15, "Kelvin a Cent�grados"),
				new ConversionLineal(5.0/9.0,-32.0*5.0/9.0+273.15,"Fahrenheit a Kelvin"),
				new ConversionLineal(9.0/5.0,32.0-273.15, "Kelvin a Fahrenheit ")};
		
		        

	}

}
