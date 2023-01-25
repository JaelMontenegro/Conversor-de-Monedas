package conversor.unidad;

public class ConversionLineal extends TipoDeConversionBase {

	private double factor;
	private String nombre;
	private double sumando;
	
	public ConversionLineal(double factor, String nombre) {
		this.factor = factor;
		this.nombre = nombre;
		this.sumando = 0;
	}
	
	public ConversionLineal(double factor, double sumando, String nombre) {
		super();
		this.factor = factor;
		this.sumando = sumando;
		this.nombre = nombre;
	}

	@Override
	public double convertir(double valor) {
	
		return factor*valor + sumando;
	}

	@Override
	public String getNombre() {
	
		return nombre;
	}

}
