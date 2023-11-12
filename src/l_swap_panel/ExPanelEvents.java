package l_swap_panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * ExPanelEvents es un panel que contiene un botón y una etiqueta. 
 * Cuando se hace clic en el botón, el texto de la etiqueta cambia entre "Activado" y "Desactivado".
 */
public class ExPanelEvents extends JPanel implements ActionListener {

    private JLabel result; // Etiqueta para mostrar el estado actual
    private JButton miBoton; // Botón que el usuario puede presionar
    private String texto = "Desactivado"; // Texto inicial de la etiqueta

    /**
     * Constructor de ExPanelEvents.
     * Aquí se inicializan y configuran los componentes del panel.
     */
    ExPanelEvents() {
        // Creación y configuración del botón
        miBoton = new JButton("Haz click aquí");
        miBoton.addActionListener(this); // Se añade el propio panel como oyente de los eventos del botón

        // Creación y configuración de la etiqueta
        result = new JLabel(texto);
        setLayout(new BorderLayout()); // Se establece BorderLayout como el administrador de diseño del panel
        add(miBoton, BorderLayout.EAST); // Se añade el botón a la derecha (este) del panel
        add(result, BorderLayout.WEST); // Se añade la etiqueta a la izquierda (oeste) del panel
    }

    /**
     * Este método se invoca cuando se realiza una acción (como un clic) en el botón.
     * Cambia el texto de la etiqueta entre "Activado" y "Desactivado".
     * @param e El evento de acción.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Cambia el texto y actualiza la etiqueta
        texto = texto.equals("Desactivado") ? "Activado" : "Desactivado";
        result.setText(texto);
    }
}