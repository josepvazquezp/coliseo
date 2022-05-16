package testInterfaz;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class winner extends JFrame {
	private JLabel W, im, fondo, P;

	public static void main(String[] args) {
		winner w = new winner(true);

	}
	
	public winner(boolean w) {
		if(w) {
			W = new JLabel("WINNER");
			W.setBounds(280, 100, 200, 200);
			W.setFont(new Font("Yu Gothic", Font.BOLD, 24));
			W.setForeground(Color.CYAN);
			P = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\p1_im.jpg"));
			P.setBounds(230, 200, 200, 200);
			add(W);
			add(P);
		}
		else {
			W = new JLabel("WINNER");
			W.setBounds(280, 100, 200, 200);
			W.setFont(new Font("Yu Gothic", Font.BOLD, 24));
			W.setForeground(Color.ORANGE);
			P = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\p2_im.jpg"));
			P.setBounds(230, 200, 200, 200);
			add(W);
			add(P);
		}
		
		fondo = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\fondoB.png"));
		fondo.setBounds(0, 0, 700, 500); add(fondo);
		
		fondo.setBounds(0, 0, 700, 500); add(fondo);
		setVisible(true);
		setLocationRelativeTo(null);
		setBounds(0,0,700,500);
	}
	

}
