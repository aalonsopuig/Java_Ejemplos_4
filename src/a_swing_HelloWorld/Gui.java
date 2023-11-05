package a_swing_HelloWorld;
import javax.swing.*;

/**
 * Programa que corresponde al siguiente ejercicio:
 * Creación con Java Swing de una ventana gráfica (JFrame) que tenga un título y que muestre un saludo 
 * y al cerrar la ventana finalice el programa
 * 
 * Basado en https://docs.oracle.com/javase/tutorial/uiswing/examples/start/HelloWorldSwingProject/src/start/HelloWorldSwing.java
 * 
 * Noviembre 2023
 */
public class Gui {

	/**
	 * Create the GUI and show it.  
	 */
	private static void createAndShowGUI() {

		JFrame frame = new JFrame("HelloWorldSwing");		//Crea el frame dándole un título
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//Cierra el programa al cerrar el frame
		frame.setSize(300, 100);

		JLabel label = new JLabel("Hello World");			//Crea la etiqueta
		frame.getContentPane().add(label);						//La asocia al frame

		frame.setVisible(true);								//Muestra el frame con su contenido
	}

	/**
	 * Main es el método al que se llama por defecto
	 * Ejecutamos ejemplo de Interfaces.
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
	public static void main(String[] args) {
		createAndShowGUI();
	}
}
