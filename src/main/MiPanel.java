package main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class MiPanel extends JPanel
{
	public MiPanel() 
	{
		setLayout(null);
		//setBackground(Color.BLUE); // se importa Color para darnos distintos colores
		setBackground(new Color(75,185,50)); // se crea el objeto anonimo para crear nuestro color
		
		JLabel saludo = new JLabel("Bienvenido");
		saludo.setForeground(Color.WHITE);
		saludo.setBounds(250, 50, 200, 40);
		saludo.setFont(new Font("Arial",Font.PLAIN,30));
		add(saludo);
		
		JLabel usuario = new JLabel("Usuario:");
		usuario.setForeground(Color.WHITE);
		usuario.setBounds(250,150, 200, 40);
		usuario.setFont(new Font("Arial",Font.PLAIN,30));
		add(usuario);
		
		JTextField texto = new JTextField("nombre123");
		texto.setForeground(Color.LIGHT_GRAY);
		texto.setBounds(250,200,200,40);
		texto.setFont(new Font("Arial",Font.PLAIN,30));
		add(texto);
		
		
		JLabel contrasenia = new JLabel("Contrasenia:");
		contrasenia.setForeground(Color.WHITE);
		contrasenia.setBounds(250,250, 200, 40);
		contrasenia.setFont(new Font("Arial",Font.PLAIN,30));
		add(contrasenia);
		
		JPasswordField password = new JPasswordField("ejemplo");
		password.setBounds(250,300,200,50);
		password.setForeground(Color.LIGHT_GRAY);
		password.setFont(new Font("Arial",Font.PLAIN,30));
		add(password);
		
		setVisible(true);
	}
}
