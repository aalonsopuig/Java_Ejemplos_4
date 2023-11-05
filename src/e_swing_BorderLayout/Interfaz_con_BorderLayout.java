package e_swing_BorderLayout;
import javax.swing.*;
import java.awt.*;

/**
 * Programa que corresponde al siguiente ejercicio:
 * Creación con Java Swing de un interfaz con BorderLayout
 * 
 * Noviembre 2023
 */
public class Interfaz_con_BorderLayout extends JFrame {

    public Interfaz_con_BorderLayout() {
 
        // Configuramos los parámetros de la ventana
        setTitle("Ejemplo de BorderLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Creamos componentes para cada región
        JButton botonNorte = new JButton("Norte");
        JButton botonSur = new JButton("Sur");
        JButton botonEste = new JButton("Este");
        JButton botonOeste = new JButton("Oeste");
        JButton botonCentro = new JButton("Centro");

        // Establecemos el layout de JFrame en BorderLayout
        setLayout(new BorderLayout());

        // Agregamos los componentes a las regiones del BorderLayout
        add(botonNorte, BorderLayout.NORTH);
        add(botonSur, BorderLayout.SOUTH);
        add(botonEste, BorderLayout.EAST);
        add(botonOeste, BorderLayout.WEST);
        add(botonCentro, BorderLayout.CENTER);

        //Hacemos visible la ventana
        setVisible(true);
    }

	/**
	 * Main es el método al que se llama por defecto
	 * Ejecutamos ejemplo de Interfaces.
	 * @param args argumentos de entrada, que en este caso no se usan
	 */
    public static void main(String[] args) {
            new Interfaz_con_BorderLayout();
    }
}