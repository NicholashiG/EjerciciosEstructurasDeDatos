package logica;

import javax.swing.JOptionPane;

public class Utils {
	
	public static String pedirTexto(String mensaje) {
		String texto = JOptionPane.showInputDialog(mensaje);
		return texto;
	}
	
	public static int pedirEntero(String mensaje) {
		String texto = JOptionPane.showInputDialog(mensaje);
		int entero = Integer.parseInt(texto);
		return entero;
	}
	
	public static double pedirDecimal(String mensaje) {
		String texto = JOptionPane.showInputDialog(mensaje);
		double decimal = Double.parseDouble(texto);
		return decimal;
	}
	
	public static void mostrarMensaje(String mensaje){
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
