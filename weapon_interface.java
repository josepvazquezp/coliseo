package testInterfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class weapon_interface extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					weapon_interface frame = new weapon_interface();
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
	public weapon_interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Choose your right weapon");
		title.setFont(new Font("Tahoma", Font.PLAIN, 24));
		title.setForeground(Color.ORANGE);
		title.setBounds(198, 30, 326, 39);
		contentPane.add(title);
		
		JButton axe = new JButton("");
		axe.setBackground(Color.BLACK);
		axe.setIcon(new ImageIcon(weapon_interface.class.getResource("/coliseo/images/axe_c.png")));
		axe.setBounds(101, 95, 125, 92);
		contentPane.add(axe);
		
		JButton sword = new JButton("");
		sword.setIcon(new ImageIcon(weapon_interface.class.getResource("/coliseo/images/sword_c.png")));
		sword.setBackground(Color.BLACK);
		sword.setBounds(292, 95, 125, 92);
		contentPane.add(sword);
		
		JButton Kunai = new JButton("");
		Kunai.setIcon(new ImageIcon(weapon_interface.class.getResource("/coliseo/images/kunai_c.png")));
		Kunai.setBackground(Color.BLACK);
		Kunai.setBounds(471, 95, 125, 92);
		contentPane.add(Kunai);
		
		JButton Mace = new JButton("");
		Mace.setIcon(new ImageIcon(weapon_interface.class.getResource("/coliseo/images/mace_c.png")));
		Mace.setBackground(Color.BLACK);
		Mace.setBounds(101, 250, 125, 92);
		contentPane.add(Mace);
		
		JButton longaxe = new JButton("");
		longaxe.setIcon(new ImageIcon(weapon_interface.class.getResource("/coliseo/images/lonaxe_c.png")));
		longaxe.setBackground(Color.BLACK);
		longaxe.setBounds(292, 250, 125, 92);
		contentPane.add(longaxe);
		
		JButton shield = new JButton("");
		shield.setIcon(new ImageIcon(weapon_interface.class.getResource("/coliseo/images/shield_c.png")));
		shield.setBackground(Color.BLACK);
		shield.setBounds(471, 250, 125, 92);
		contentPane.add(shield);
		
		JLabel info_axe = new JLabel("Axe         Capacity = 1");
		info_axe.setFont(new Font("Tahoma", Font.PLAIN, 10));
		info_axe.setForeground(Color.WHITE);
		info_axe.setBounds(111, 198, 135, 14);
		contentPane.add(info_axe);
		
		JLabel info_sword = new JLabel("Sword      Capacity = 1");
		info_sword.setFont(new Font("Tahoma", Font.PLAIN, 10));
		info_sword.setForeground(Color.WHITE);
		info_sword.setBounds(302, 198, 140, 14);
		contentPane.add(info_sword);
		
		JLabel info_kunai = new JLabel("Kunai       Capacity = 1");
		info_kunai.setFont(new Font("Tahoma", Font.PLAIN, 10));
		info_kunai.setForeground(Color.WHITE);
		info_kunai.setBounds(481, 198, 115, 14);
		contentPane.add(info_kunai);
		
		JLabel info_mace = new JLabel("Mace      Capacity = 2");
		info_mace.setFont(new Font("Tahoma", Font.PLAIN, 10));
		info_mace.setForeground(Color.WHITE);
		info_mace.setBounds(111, 350, 125, 14);
		contentPane.add(info_mace);
		
		JLabel info_longaxe = new JLabel("LongAxe  Capacity = 2");
		info_longaxe.setFont(new Font("Tahoma", Font.PLAIN, 10));
		info_longaxe.setForeground(Color.WHITE);
		info_longaxe.setBounds(302, 353, 115, 14);
		contentPane.add(info_longaxe);
		
		JLabel info_shield = new JLabel("Shield     Capacity = 1");
		info_shield.setFont(new Font("Tahoma", Font.PLAIN, 10));
		info_shield.setForeground(Color.WHITE);
		info_shield.setBounds(481, 353, 115, 14);
		contentPane.add(info_shield);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(weapon_interface.class.getResource("/coliseo/images/fondo_weaponsB.jpg")));
		Fondo.setBounds(0, 0, 684, 461);
		contentPane.add(Fondo);
		
		
	}
}
