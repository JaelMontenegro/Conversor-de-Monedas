package conversor.unidad;

public class ConversorTemperatura extends ConversorBase {
	public String toString() {
		return "Conversor Temperatura";

	}

	@Override
	public TipoDeConversionBase[] getTiposDeConversion() {
		return new TipoDeConversionBase[] { 
			new ConversionLineal(5.0/9.0,-32.0*5.0/9.0, "Fahrenheit a Centígrados"),
				new ConversionLineal(9.0/5.0,32.0, "Centígrados a Fahrenheit "),
				new ConversionLineal(1.0, 273.15, "Centígrados a Kelvin"),
				new ConversionLineal(1.0, -273.15, "Kelvin a Centígrados"),
				new ConversionLineal(5.0/9.0,-32.0*5.0/9.0+273.15,"Fahrenheit a Kelvin"),
				new ConversionLineal(9.0/5.0,32.0-273.15, "Kelvin a Fahrenheit ")};
		
		        

	}

}
