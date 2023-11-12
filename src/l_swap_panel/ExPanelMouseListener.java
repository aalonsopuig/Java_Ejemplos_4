package l_swap_panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ExPanelMouseListener extends JPanel implements MouseListener, MouseMotionListener {

    Label l;

    ExPanelMouseListener(){  
        addMouseListener(this);
        setLayout(null);

        l=new Label();  
        l.setBounds(20,50,100,20); 
        add(l);  
        setSize(300,300);  
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX() - 15, e.getY() - 15, 30, 30);
    }

    // MouseListener events
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    // MouseMotionListener events
    public void mouseDragged(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
    }
}

