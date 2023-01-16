package conversor.unidad;

public abstract class TipoDeConversionBase {
	public abstract double convertir(double valor);
	public abstract String getNombre();

	public String toString() {
		return getNombre();

	}

}
