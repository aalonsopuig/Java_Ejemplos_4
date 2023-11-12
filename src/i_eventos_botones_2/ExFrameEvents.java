package i_eventos_botones_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Clase ExFrameEvents que extiende de JFrame e implementa ActionListener.
 * Contiene dos botones para salir de la aplicación y cambiar el color de fondo del panel.
 */
public class ExFrameEvents extends JFrame implements ActionListener {

    // Botones para la funcionalidad de salir y cambiar color.
    JButton botonExit, botonCambiarColor;
    JPanel panel;

    /**
     * Constructor que configura el panel y los botones.
     */
    public ExFrameEvents() {

        // Configuramos los parámetros de la ventana
        setTitle("Botones y acciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);

        // Creamos un panel con BorderLayout
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
 
        // Agregamos el panel al JFrame
        getContentPane().add(panel);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Inicialización y configuración del botón de salida.
        botonExit = new JButton("Salir");
        panel.add(botonExit, BorderLayout.SOUTH); // Se añade el botón al sur del BorderLayout.
        botonExit.addActionListener(this); // Se registra el panel como listener del botón.

        // Inicialización y configuración del botón para cambiar el color de fondo.
        botonCambiarColor = new JButton("Cambiar color");
        panel.add(botonCambiarColor, BorderLayout.WEST); // Se añade al oeste del BorderLayout.
        botonCambiarColor.addActionListener(this); // Se registra el panel como listener.

         //Hacemos visible la ventana
        setVisible(true);
    }



    /**
     * Método sobreescrito de la interfaz ActionListener.
     * Aquí se manejan los eventos de los botones.
     * @param e El evento de acción generado por los botones.
     */
    public void actionPerformed(ActionEvent e) {
        // Si la fuente del evento es el botón de salida, termina la aplicación.
        if (e.getSource() == botonExit) {
            System.exit(0);
        }
        // Si la fuente del evento es el botón de cambiar color, cambia el color de fondo del panel.
        if (e.getSource() == botonCambiarColor) {
            panel.setBackground(getRandomColor());
        }
    }


    /**
     * Método para obtener un color aleatorio.
     * @return Un nuevo color generado aleatoriamente.
     */
    public Color getRandomColor() {
        // Generación de valores aleatorios para rojo, verde y azul.
        int R = (int) (Math.random() * 256);
        int G = (int) (Math.random() * 256);
        int B = (int) (Math.random() * 256);

        // Retorna un nuevo color con los valores RGB generados.
        return new Color(R, G, B);
    }

}