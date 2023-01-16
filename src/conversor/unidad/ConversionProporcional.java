package conversor.unidad;

public class ConversionProporcional extends TipoDeConversionBase {

	private double factor;
	private String nombre;
	
	public ConversionProporcional(double factor, String nombre) {
		this.factor = factor;
		this.nombre = nombre;
	}
	@Override
	public double convertir(double valor) {
	
		return factor*valor;
	}

	@Override
	public String getNombre() {
	
		return nombre;
	}

}
