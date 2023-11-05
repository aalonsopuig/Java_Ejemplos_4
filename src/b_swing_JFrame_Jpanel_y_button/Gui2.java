package b_swing_JFrame_Jpanel_y_button;

import javax.swing.*;

/**
 * Programa que corresponde al siguiente ejercicio:
 * Creación con Java Swing de una ventana gráfica (JFrame) que tenga un título,
 * un botón pulsable (sin acción asociada)
 * 
 * Noviembre 2023
 */
public class Gui2 {

	/**
	 * Create the GUI and show it.
	 */
	private static void createAndShowGUI() {

		// Crea y configura ventana
		JFrame frame = new JFrame("Ejemplo de JFrame con JPanel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 500, 200); // (pos_pantalla(x,y), size(x,y))
		// frame.setSize(500, 300); //Similar set size and default position. pixels

		// Crea y configura JPanel
		JPanel contentPane = new JPanel();
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		// Crea y configura botón
		JButton initButton = new JButton("Presionar");
		initButton.setBounds(200, 50, 100, 50); // (pos_pantalla(x,y), size(x,y))
		contentPane.add(initButton);

		frame.setVisible(true); // Muestra ventana
	}

	/**
	 * Main es el método al que se llama por defecto
	 * Ejecutamos ejemplo de Interfaces.
	 * 
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
	public static void main(String[] args) {
		createAndShowGUI();
	}
}
