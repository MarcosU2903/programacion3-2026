package main;

import java.awt.Color;

import javax.swing.JPanel;

public class MiPanel extends JPanel
{
	public MiPanel() 
	{
		//setBackground(Color.BLUE); // se importa Color para darnos distintos colores
		setBackground(new Color(210,125,35)); // se crea el objeto anonimo para crear nuestro color
		setVisible(true);
	}
}
