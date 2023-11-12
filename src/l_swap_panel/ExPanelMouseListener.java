package l_swap_panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * ExPanelMouseListener es un panel que responde a eventos del ratón.
 * Muestra un mensaje diferente en una etiqueta dependiendo del evento del ratón y dibuja un círculo donde se hace clic.
 */
public class ExPanelMouseListener extends JPanel implements MouseListener, MouseMotionListener {

    private JLabel etiqueta; // Etiqueta para mostrar el evento del ratón

    /**
     * Constructor de ExPanelMouseListener.
     * Aquí se inicializan y configuran los componentes del panel.
     */
    ExPanelMouseListener() {
        addMouseListener(this); // Se añade el propio panel como oyente de los eventos del ratón
        setLayout(null); // Se establece un diseño nulo para un posicionamiento absoluto

        // Creación y configuración de la etiqueta
        etiqueta = new JLabel();
        etiqueta.setBounds(20, 50, 100, 20); // Se posiciona la etiqueta en el panel
        add(etiqueta); // Se añade la etiqueta al panel
    }

    // Los siguientes métodos son implementaciones de MouseListener y MouseMotionListener

    @Override
    public void mouseClicked(MouseEvent e) {
        etiqueta.setText("Clic del Ratón");
        Graphics g = getGraphics(); // Se obtiene el contexto gráfico del panel para dibujar
        g.setColor(Color.BLUE); // Se establece el color azul para el círculo
        g.fillOval(e.getX() - 15, e.getY() - 15, 30, 30); // Se dibuja un círculo en la posición del clic
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        etiqueta.setText("Ratón Entró");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        etiqueta.setText("Ratón Salió");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        etiqueta.setText("Ratón Presionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        etiqueta.setText("Ratón Soltado");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Este método podría implementarse para manejar eventos de arrastre del ratón
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // Este método podría implementarse para manejar eventos de movimiento del ratón
    }
}