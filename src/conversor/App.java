package conversor;

import javax.swing.JOptionPane;

import conversor.unidad.ConversorBase;
import conversor.unidad.ConversorMoneda;
import conversor.unidad.ConversorTemperatura;
import conversor.unidad.TipoDeConversionBase;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int continuar = JOptionPane.YES_OPTION;

		while (continuar == JOptionPane.YES_OPTION) {
			ConversorBase[] conversores = { new ConversorMoneda(), new ConversorTemperatura() };
			ConversorBase opcion = (ConversorBase) JOptionPane.showInputDialog(null, "Selecciona una Conversión",
					"Elegir", JOptionPane.QUESTION_MESSAGE, null, conversores, conversores[0]);
			if (opcion == null) {
				continuar = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?", "Resultado",
						JOptionPane.YES_NO_OPTION);
				continue;
			}
			String valorString = JOptionPane.showInputDialog(null, "Ingrese el Valor", opcion.toString(),
					JOptionPane.QUESTION_MESSAGE);
			if (valorString == null) {
				continuar = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?", "Resultado",
						JOptionPane.YES_NO_OPTION);
				continue;
			}
			Double valor = Double.parseDouble(valorString);

			TipoDeConversionBase tipodeconversion = (TipoDeConversionBase) JOptionPane.showInputDialog(null,
					"Selecciona una Conversión", "Elegir", JOptionPane.QUESTION_MESSAGE, null,
					opcion.getTiposDeConversion(), null);
			if (tipodeconversion == null) {
				continuar = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?", "Resultado",
						JOptionPane.YES_NO_OPTION);
				continue;
			}
			Double valorConvertido = tipodeconversion.convertir(valor);
			JOptionPane.showMessageDialog(null, "Resultado de la conversión : " + valorConvertido, "Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			continuar = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?", "Resultado",
					JOptionPane.YES_NO_OPTION);
		}

	}

}
