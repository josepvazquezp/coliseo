package testInterfaz;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class selec_material_armor extends JFrame {
	
	private JButton a1, a2, a3;
	private JLabel gold, iron, copper, fondo, title;

	public selec_material_armor(int id) {
		
		switch(id) {
		case 1:
			a1 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\breastplate_c.png"));
			a2 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\breastplate_c.png"));
			a3 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\breastplate_c.png"));
			break;
		case 2:
			a1 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\helmet_c.png"));
			a2 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\helmet_c.png"));
			a3 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\helmet_c.png"));
			break;
		default: break; 
		}
		
		setLayout(null);
		a1.setBounds(75, 200, 125, 120); add(a1);
		a2.setBounds(290, 200, 125, 120); add(a2);
		a3.setBounds(500, 200, 125, 120); add(a3);
		a1.setBackground(new Color(196,156,72));
		a2.setBackground(new Color(161,157,148));
		a3.setBackground(new Color(191,125,92));
		
		gold = new JLabel("GOLD");
		iron = new JLabel("IRON");
		copper = new JLabel("COPPER");
		gold.setForeground(new Color(248,243,43));
		iron.setForeground(new Color(248,243,43));
		copper.setForeground(new Color(248,243,43));
		gold.setBounds(120, 280, 100, 100); add(gold);
		iron.setBounds(335, 280, 100, 100); add(iron);
		copper.setBounds(540, 280, 100, 100); add(copper);
		
		title = new JLabel("Choose the material");
		title.setForeground(new Color(248,243,43));
		title.setFont(new Font("Yu Gothic", Font.BOLD, 24));
		title.setBounds(220, 5, 300, 200); add(title);
		
		
		fondo = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\fondo_weaponsB.jpg"));
		 
		fondo.setBounds(0, 0, 700, 500); add(fondo);
		
		setVisible(true);
		setLocationRelativeTo(null);
		setBounds(0,0,700,500);
	}
	public static void main(String[] args) {
		selec_material_armor ventana = new selec_material_armor(2);
	}

}
