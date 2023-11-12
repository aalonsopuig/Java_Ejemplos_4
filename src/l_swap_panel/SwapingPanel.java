package l_swap_panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwapingPanel extends JPanel implements ActionListener{

    JPanel firstPanel = new ExPanelEvents();
    JPanel secondPanel = new ExPanelMouseListener();
    
    public SwapingPanel() {
        super(new BorderLayout());

        JButton swap1 = new JButton("Cambiar ventana");
        swap1.addActionListener(this);
        firstPanel.add(swap1,BorderLayout.NORTH);
        add(firstPanel);
    }
    
    public void actionPerformed(ActionEvent e) {
        for (Component component : getComponents())
            if (firstPanel == component) {
                remove(firstPanel);
                add(secondPanel);
            } else {
                remove(secondPanel);
                add(firstPanel);
            }
        repaint();
        revalidate();
     }
}

