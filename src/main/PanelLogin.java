package main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelLogin extends JPanel
{
	public PanelLogin() 
	{
		setLayout(null);
        setBackground(new Color(0, 102, 204)); // Azul más oscuro

        JLabel saludo = new JLabel("Bienvenido");
        saludo.setForeground(Color.WHITE);
        saludo.setBounds(50, 20, 200, 40);
        saludo.setFont(new Font("Arial", Font.PLAIN, 24));
        add(saludo);

        JLabel usuario = new JLabel("Usuario:");
        usuario.setForeground(Color.WHITE);
        usuario.setBounds(50, 70, 200, 30);
        usuario.setFont(new Font("Arial", Font.PLAIN, 20));
        add(usuario);

        JTextField texto = new JTextField();
        texto.setBounds(50, 100, 200, 30);
        texto.setFont(new Font("Arial", Font.PLAIN, 18));
        add(texto);

        JLabel contrasenia = new JLabel("Contraseña:");
        contrasenia.setForeground(Color.WHITE);
        contrasenia.setBounds(50, 140, 200, 30);
        contrasenia.setFont(new Font("Arial", Font.PLAIN, 20));
        add(contrasenia);

        JPasswordField password = new JPasswordField();
        password.setBounds(50, 170, 200, 30);
        password.setFont(new Font("Arial", Font.PLAIN, 18));
        add(password);

        setVisible(true);

	}
}
