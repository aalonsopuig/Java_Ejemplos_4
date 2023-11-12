package l_swap_panel;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class MainClass {
 
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo Listeners");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setBounds(100, 100, 400, 400);

        JComponent newContentPane = new SwapingPanel();
        newContentPane.setOpaque(true); frame.setContentPane(newContentPane);
        
        frame.setVisible(true);
    }    
}
