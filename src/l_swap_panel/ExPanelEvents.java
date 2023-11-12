package l_swap_panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class ExPanelEvents extends JPanel implements KeyListener{

    JLabel result;
 
    ExPanelEvents(){
        super(new BorderLayout());
        result = new JLabel();
        result.setText("   Presiona una tecla: ");
        add(result,BorderLayout.CENTER);
      
        addKeyListener(this);
      
    }

//KeyListener events
public void keyTyped(KeyEvent e) {
  result.setText("    Presionado: " 
                  + e.getKeyChar());
}

public void keyPressed(KeyEvent e) { }

public void keyReleased(KeyEvent e) { }

}