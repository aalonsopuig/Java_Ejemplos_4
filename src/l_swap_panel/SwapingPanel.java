package l_swap_panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * SwapingPanel es un panel que permite intercambiar entre dos subpaneles: ExPanelEvents y ExPanelMouseListener.
 * El intercambio se realiza mediante un botón.
 */
public class SwapingPanel extends JPanel implements ActionListener {

    private JPanel firstPanel = new ExPanelEvents(); // Primer subpanel
    private JPanel secondPanel = new ExPanelMouseListener(); // Segundo subpanel

    /**
     * Constructor de SwapingPanel.
     * Aquí se inicializan y configuran los componentes del panel.
     */
    public SwapingPanel() {
        setLayout(new BorderLayout()); // Se establece BorderLayout como el administrador de diseño del panel

        // Creación y configuración del botón para cambiar de panel
        JButton botonSwap = new JButton("Cambiar ventana");
        botonSwap.addActionListener(this); // Se añade el propio panel como oyente de los eventos del botón
        add(botonSwap, BorderLayout.NORTH); // Se añade el botón en la parte superior del panel
        add(firstPanel, BorderLayout.CENTER); // Se añade el primer subpanel al centro
    }

    /**
     * Este método se invoca cuando se realiza una acción (como un clic) en el botón de cambio.
     * Cambia entre mostrar el primer y el segundo subpanel.
     * @param e El evento de acción.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        // Intercambia los subpaneles y actualiza la interfaz
        for (Component component : getComponents())
            if (firstPanel == component) {
                remove(firstPanel);
                add(secondPanel, BorderLayout.CENTER);
            } else {
                remove(secondPanel);
                add(firstPanel, BorderLayout.CENTER);
            }
        repaint(); // Redibuja el panel
        revalidate(); // Revalida la disposición de los componentes
    }
}


