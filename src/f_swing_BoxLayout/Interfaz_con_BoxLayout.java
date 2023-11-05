package f_swing_BoxLayout;
import javax.swing.*;
import java.awt.*;

/**
 * Programa que corresponde al siguiente ejercicio:
 * Creación con Java Swing de un interfaz con BoxLayout
 * 
 * Noviembre 2023
 */
public class Interfaz_con_BoxLayout extends JFrame {

    public Interfaz_con_BoxLayout() {
        
    // Configuramos los parámetros de la ventana
        setTitle("Ejemplo de BoxLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 150);
    // Creamos componentes 
        JButton boton1 = new JButton("Botón 1");
        JButton boton2 = new JButton("Botón 2");
        JButton boton3 = new JButton("Botón 3");
        boton1.setAlignmentX(Component.CENTER_ALIGNMENT);
        boton2.setAlignmentX(Component.CENTER_ALIGNMENT);
        boton3.setAlignmentX(Component.CENTER_ALIGNMENT);
    // Creamos un panel con BoxLayout vertical
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    // Agregamos los componentes
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
    // Agregamos el panel al JFrame
        getContentPane().add(panel);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setVisible(true);
    }

 	/**
	 * Main es el método al que se llama por defecto
	 * Ejecutamos ejemplo de Interfaces.
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
    public static void main(String[] args) {
            new Interfaz_con_BoxLayout();
    }
}
