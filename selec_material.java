package testInterfaz;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class selec_material extends JFrame {
	
	private JButton w1, w2, w3;
	private JLabel gold, iron, copper, fondo, title;
	
	public selec_material(int id) {
		switch(id) {
		case 1:
			w1 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\axe_c.png"));
			w2 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\axe_c.png"));
			w3 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\axe_c.png"));
			break;
		case 2:
			w1 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\sword_c.png"));
			w2 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\sword_c.png"));
			w3 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\sword_c.png"));
			break;
		case 3:
			w1 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\kunai_c.png"));
			w2 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\kunai_c.png"));
			w3 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\kunai_c.png"));
			break;
		case 4:
			w1 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\mace_c.png"));
			w2 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\mace_c.png"));
			w3 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\mace_c.png"));
			break;
		case 5:
			w1 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\lonaxe_c.png"));
			w2 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\lonaxe_c.png"));
			w3 = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\lonaxe_c.png"));
			break;
		default: break;
		}
		setLayout(null);
		w1.setBounds(75, 200, 125, 90); add(w1);
		w2.setBounds(290, 200, 125, 90); add(w2);
		w3.setBounds(500, 200, 125, 90); add(w3);
		w1.setBackground(new Color(196,156,72));
		w2.setBackground(new Color(161,157,148));
		w3.setBackground(new Color(191,125,92));
		
		gold = new JLabel("GOLD");
		iron = new JLabel("IRON");
		copper = new JLabel("COPPER");
		gold.setForeground(new Color(248,243,43));
		iron.setForeground(new Color(248,243,43));
		copper.setForeground(new Color(248,243,43));
		gold.setBounds(120, 250, 100, 100); add(gold);
		iron.setBounds(340, 250, 100, 100); add(iron);
		copper.setBounds(540, 250, 100, 100); add(copper);
		
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
		selec_material prueba = new selec_material(4);

	}

}
