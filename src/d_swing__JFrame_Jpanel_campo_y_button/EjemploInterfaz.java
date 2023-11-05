package d_swing__JFrame_Jpanel_campo_y_button;
import javax.swing.*;

// 1) Creamos la clase ventana
public class EjemploInterfaz extends JFrame {

    public EjemploInterfaz() {
 
        // 2) Configuramos los parámetros de la ventana
        setTitle("Entrada de datos");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // 3) Crear los componentes
        JLabel etiqueta1 = new JLabel("Mensaje");
        JTextField campoDeTexto = new JTextField(20);
        JButton boton = new JButton("Aceptar");

        // 4) Crear un contenedor
        JPanel panelDeContenido = new JPanel();

        // 5) Asociar los componentes al contenedor
        panelDeContenido.add(etiqueta1);
        panelDeContenido.add(campoDeTexto);
        panelDeContenido.add(boton);

        // 6) Asociar el contenedor a la ventana
        setContentPane(panelDeContenido);
        
        // 7) Hacer visible la ventana
        setVisible(true);
    }
}