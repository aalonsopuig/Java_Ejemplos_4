package j_eventos_teclado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * ExKeyboard es una clase que extiende JFrame e implementa KeyListener.
 * Muestra una ventana con un JLabel que cambia su texto cuando el usuario
 * presiona una tecla.
 */
public class ExKeyboard extends JFrame implements KeyListener {

    private JLabel result;
    private JPanel panel;

    /**
     * Constructor de ExKeyboard.
     * Configura la ventana y sus componentes.
     */
    public ExKeyboard() {
        // Configuración de la ventana
        setTitle("Texto y acciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Creación y configuración del panel
        panel = new JPanel(new BorderLayout());
        getContentPane().add(panel);

        // Configuración de la etiqueta de resultado
        result = new JLabel("   Presiona una tecla: ");
        panel.add(result, BorderLayout.CENTER);

        // Agregar KeyListener a la ventana
        addKeyListener(this);

        // Hacer visible la ventana
        setVisible(true);
    }

    /**
     * Este método se llama cuando se presiona y luego se suelta una tecla.
     * @param e El evento de teclado.
     */
    public void keyTyped(KeyEvent e) {
        result.setText("    Presionado: "  + e.getKeyChar());
    }

    /**
     * Este método se llama cuando se presiona una tecla.
     * @param e El evento de teclado.
     */
    public void keyPressed(KeyEvent e) {
        // No se requiere implementación actualmente
    }

    /**
     * Este método se llama cuando se suelta una tecla.
     * @param e El evento de teclado.
     */
    public void keyReleased(KeyEvent e) {
        // No se requiere implementación actualmente
    }

}
