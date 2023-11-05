package c_swing__JFrame_Jpanel_y_button_herencia;
import javax.swing.*;

// 1) Creamos la clase ventana
class ExFrameClass extends JFrame {

  public ExFrameClass() {

    // 2) Configuramos los parámetros de la ventana
    setTitle("Ejemplo de JFrame con JPanel");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 500, 200); //(pos_pantalla(x,y), size(x,y))
    //frame.setSize(500, 300); //Similar set size and default position. pixels 

    // 3) Crear los componentes
    JButton initButton = new JButton("Presionar");  
    initButton.setBounds(200, 50, 100, 50); //(pos_pantalla(x,y), size(x,y))
    
    // 4) Crear un contenedor
    JPanel contentPane = new JPanel();

    // 5) Asociar los componentes al contenedor
    contentPane.add(initButton);     

    // 6) Asociar el contenedor a la ventana
    setContentPane(contentPane);
    contentPane.setLayout(null); 

    // 7) Hacer visible la ventana
    setVisible(true);   //Hace visible todo
  }
}

