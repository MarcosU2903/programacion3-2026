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

        setBackground(new Color(173, 216, 230)); // Azul claro (RGB)

        PanelLogin panelitoLogin = new PanelLogin();
        panelitoLogin.setBounds(250, 125, 300, 250);

        add(panelitoLogin);
        setVisible(true);

	}
}
