package main;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Ventana extends JFrame
{
	public Ventana() 
	{
		
		setSize(800,500); //tamanio
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //No realiza nada al cerrarce asi esta en default
		
		setLocation(100,100); //localizacion
		//setBounds(100,100,800,500); //combina el tamanio y localizacion en una linea
		setResizable(false);
		setTitle("Mi Ventana");
		setLocationRelativeTo(null); // Establece la localizacion realiva a otro objeto, si es null va al centro
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image icono = tk.getImage("src/img/iconoPrueba.png");
		setIconImage(icono);
		
		MiPanel panelito = new MiPanel();
		add(panelito);
		
		JFrame ventana2 = new JFrame();
		
		setVisible(true);
		//validate();
		//repaint();
	}
}
