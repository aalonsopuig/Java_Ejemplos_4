package l_swap_panel;

import javax.swing.JFrame;

/**
 * Clase principal MainClass.
 * Crea la ventana principal y añade el SwapingPanel a ella.
 */
public class MainClass {

    public static void main(String[] args) {
        
        // Creación y configuración de la ventana principal
        JFrame frame = new JFrame("Ejemplo de Listeners");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 400, 400);

        // Creación y adición de SwapingPanel a la ventana
        SwapingPanel newContentPane = new SwapingPanel();
        frame.setContentPane(newContentPane);

        frame.setVisible(true); // Hace visible la ventana
    }
}