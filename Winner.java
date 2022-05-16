package proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Winner extends JFrame {

	private JPanel contentPane;
	private JLabel W, im, fondo, P;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Winner frame = new Winner(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Winner(boolean w) {
		if(w) {
			W = new JLabel("WINNER");
			W.setBounds(280, 100, 200, 200);
			W.setFont(new Font("Yu Gothic", Font.BOLD, 24));
			W.setForeground(Color.CYAN);
			P = new JLabel(new ImageIcon(Winner.class.getResource("/proyecto/images/p1_im.jpg")));
			P.setBounds(230, 200, 200, 200);
			add(W);
			add(P);
		}
		else {
			W = new JLabel("WINNER");
			W.setBounds(280, 100, 200, 200);
			W.setFont(new Font("Yu Gothic", Font.BOLD, 24));
			W.setForeground(Color.ORANGE);
			P = new JLabel(new ImageIcon(Winner.class.getResource("/proyecto/images/p2.png")));
			P.setBounds(230, 200, 200, 200);
			add(W);
			add(P);
		}
		
		fondo = new JLabel(new ImageIcon(Winner.class.getResource("/proyecto/images/fondoB.png")));
		fondo.setBounds(0, 0, 700, 500); add(fondo);
		
		fondo.setBounds(0, 0, 700, 500); add(fondo);
		setVisible(true);
		setLocationRelativeTo(null);
		setBounds(100, 100, 700, 500);
		
	}

}
