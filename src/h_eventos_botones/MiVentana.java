package h_eventos_botones;

import javax.swing.*;
import java.awt.event.*;

/**
 * Esta clase representa una ventana simple con un botón.
 * Al hacer clic en el botón, se muestra un mensaje en la consola.
 */
public class MiVentana extends JFrame implements ActionListener {
    private JButton miBoton;

    /**
     * Constructor para crear la ventana.
     * Aquí se inicializa el botón y se registra el listener de acción.
     */
    public MiVentana() {
        // Crear un nuevo botón y establecer su texto.
        miBoton = new JButton("Haz clic aquí");

        // Registrar 'this' como el listener para el botón.
        miBoton.addActionListener(this);

        // Agregar el botón a la ventana.
        this.add(miBoton);

        // Establecer las propiedades de la ventana.
        this.setSize(300, 200);
        this.setVisible(true);
    }

    /**
     * Este método es llamado cuando ocurre una acción en el botón.
     * @param e El evento de acción.
     */
    public void actionPerformed(ActionEvent e) {
        // Comprobar si la fuente del evento es el botón.
        if (e.getSource() == miBoton) {
            System.out.println("Botón pulsado!");
        }
    }

    /**
     * El punto de entrada del programa.
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crear una instancia de MiVentana para mostrar la GUI.
        new MiVentana();
    }
}
