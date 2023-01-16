package conversor.unidad;

public class ConversorMoneda extends ConversorBase {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Conversor Moneda";

	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoDeConversionBase[] getTiposDeConversion() {
		// TODO Auto-generated method stub
		return new TipoDeConversionBase[] {
				new ConversionProporcional(0.1, "Bolivares a Dolares 0.1"),
				new ConversionProporcional(0.25, "Bolivares a Dolares 0.25"),
				new ConversionProporcional(0.5, "Bolivares a Dolares 0.5"),
				new ConversionProporcional(1, "Bolivares a Dolares 1")};
	}

}
