package k_eventos_mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Ex_Mouse es una clase que extiende JFrame e implementa MouseListener y MouseMotionListener.
 * Muestra una ventana que rastrea y responde a varios eventos del ratón.
 */
public class Ex_Mouse extends JFrame implements MouseListener, MouseMotionListener {

    private JPanel panel;
    private JLabel result;

    /**
     * Constructor de Ex_Mouse.
     * Configura la ventana y sus componentes.
     */
    public Ex_Mouse() {
        // Configuración de la ventana
        setTitle("Mouse y acciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Creación y configuración del panel
        panel = new JPanel();
        getContentPane().add(panel);

        // Configuración de la etiqueta de resultado
        result = new JLabel("   Mueve el ratón: ");
        panel.add(result, BorderLayout.CENTER);

        // Agrega listeners de eventos del ratón
        addMouseListener(this);

        // Hacer visible la ventana
        setVisible(true);
    }

    /**
     * Este método se llama cuando se hace clic con el ratón.
     * @param e El evento de ratón.
     */
    public void mouseClicked(MouseEvent e) {
        result.setText("Clic del Ratón");
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX() - 15, e.getY() - 15, 30, 30);
    }

    /**
     * Este método se llama cuando el ratón entra en un componente.
     * @param e El evento de ratón.
     */
    public void mouseEntered(MouseEvent e) {
        result.setText("Ratón Entró");
    }

    /**
     * Este método se llama cuando el ratón sale de un componente.
     * @param e El evento de ratón.
     */
    public void mouseExited(MouseEvent e) {
        result.setText("Ratón Salió");
    }

    /**
     * Este método se llama cuando se presiona un botón del ratón.
     * @param e El evento de ratón.
     */
    public void mousePressed(MouseEvent e) {
        result.setText("Ratón Presionado");
    }

    /**
     * Este método se llama cuando se suelta un botón del ratón.
     * @param e El evento de ratón.
     */
    public void mouseReleased(MouseEvent e) {
        result.setText("Ratón Soltado");
    }

    /**
     * Este método se llama cuando se arrastra el ratón.
     * @param e El evento de ratón.
     */
    public void mouseDragged(MouseEvent e) {
        // Implementación vacía ya que no se requiere funcionalidad específica
    }

    /**
     * Este método se llama cuando se mueve el ratón.
     * @param e El evento de ratón.
     */
    public void mouseMoved(MouseEvent e) {
        // Implementación vacía ya que no se requiere funcionalidad específica
    }

}

