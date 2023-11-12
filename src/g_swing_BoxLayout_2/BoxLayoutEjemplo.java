package g_swing_BoxLayout_2;

import javax.swing.*;
import java.awt.*;

/**
 * Programa que corresponde al siguiente ejercicio:
 * Escribe un programa Java Swing que utilice BoxLayout para mostrar arriba el texto "Indícame tu nombre", 
 * a continuación, un campo de texto rellenable, a continuación, un espacio y a continuación el botón "Enviar"
 * 
 * Noviembre 2023
 */
public class BoxLayoutEjemplo extends JFrame {
    public BoxLayoutEjemplo() {
        
        // Configuramos los parámetros de la ventana
        setTitle("Formulario Simple");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 120);

        // Crear un panel con BoxLayout vertical
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Etiqueta de texto
        JLabel etiqueta = new JLabel("Dime tu nombre:");
        etiqueta.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(etiqueta);

        // Campo de texto
        JTextField campoTexto = new JTextField(20);
        campoTexto.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(campoTexto);

        // Espacio en blanco
        panel.add(Box.createVerticalStrut(10));

        // Botón "Enviar"
        JButton botonEnviar = new JButton("Enviar");
        botonEnviar.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(botonEnviar);


        // Agregar el panel al JFrame
        getContentPane().add(panel);

        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setVisible(true);
    }

	/**
	 * Main es el método al que se llama por defecto
	 * Ejecutamos ejemplo de Interfaces.
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
    public static void main(String[] args) {
            new BoxLayoutEjemplo();
    }
}
