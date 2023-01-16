package conversor;
import javax.swing.JOptionPane;


import conversor.unidad.ConversorBase;
import conversor.unidad.ConversorMoneda;
import conversor.unidad.TipoDeConversionBase;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int continuar = JOptionPane.YES_OPTION;
		
		while (continuar== JOptionPane.YES_OPTION) {
			ConversorBase[] colores = { new ConversorMoneda() };
			ConversorBase opcion = (ConversorBase) JOptionPane.showInputDialog(null, "Selecciona una Conversión", "Elegir",
					JOptionPane.QUESTION_MESSAGE, null, colores, colores[0]);
			Double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el Valor", opcion.getNombre(),
					JOptionPane.QUESTION_MESSAGE));
			TipoDeConversionBase tipodeconversion = (TipoDeConversionBase) JOptionPane.showInputDialog(null,
					"Selecciona una Conversión", "Elegir", JOptionPane.QUESTION_MESSAGE, null,
					opcion.getTiposDeConversion(), null);
			Double valorConvertido = tipodeconversion.convertir(valor);
			JOptionPane.showConfirmDialog(null, "Resultado de la conversión : " + valorConvertido, "Resultado",
					JOptionPane.OK_OPTION);
			continuar = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?", "Resultado", JOptionPane.YES_NO_OPTION);
		} 

	}

}
