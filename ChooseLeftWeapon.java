package proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.iteso.motor.Equipment;

public class ChooseLeftWeapon extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ChooseLeftWeapon frame = new ChooseLeftWeapon();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public ChooseLeftWeapon(Equipment equipment) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Choose your left weapon");
		title.setFont(new Font("Tahoma", Font.PLAIN, 24));
		title.setForeground(Color.ORANGE);
		title.setBounds(198, 30, 326, 39);
		contentPane.add(title);
		
		JButton axe = new JButton("");
		axe.setBackground(Color.BLACK);
		axe.setIcon(new ImageIcon(ChooseRightWeapon.class.getResource("/proyecto/images/axe_c.png")));
		axe.setBounds(101, 95, 125, 92);
		contentPane.add(axe);
		axe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				equipment.setWeaponL(Weapons.COPPER_AXE.getWeapon());
				
				ChooseLeftWeapon.this.dispose();
			}
		});
		
		JButton sword = new JButton("");
		sword.setIcon(new ImageIcon(ChooseRightWeapon.class.getResource("/proyecto/images/sword_c.png")));
		sword.setBackground(Color.BLACK);
		sword.setBounds(292, 95, 125, 92);
		contentPane.add(sword);
		sword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				equipment.setWeaponL(Weapons.COPPER_SWORD.getWeapon());
				
				ChooseLeftWeapon.this.dispose();
			}
		});
		
		JButton kunai = new JButton("");
		kunai.setIcon(new ImageIcon(ChooseRightWeapon.class.getResource("/proyecto/images/kunai_c.png")));
		kunai.setBackground(Color.BLACK);
		kunai.setBounds(471, 95, 125, 92);
		contentPane.add(kunai);
		kunai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				equipment.setWeaponL(Weapons.COPPER_KUNAI.getWeapon());
				
				ChooseLeftWeapon.this.dispose();
			}
		});
		
		JButton shield = new JButton("");
		shield.setIcon(new ImageIcon(ChooseRightWeapon.class.getResource("/proyecto/images/shield_c.png")));
		shield.setBackground(Color.BLACK);
		shield.setBounds(292, 250, 125, 92);
		contentPane.add(shield);
		shield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				equipment.setWeaponL(Weapons.IRON_SHIELD.getWeapon());
				
				ChooseLeftWeapon.this.dispose();
			}
		});
		
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
		
		JLabel info_shield = new JLabel("Shield     Capacity = 1");
		info_shield.setFont(new Font("Tahoma", Font.PLAIN, 10));
		info_shield.setForeground(Color.WHITE);
		info_shield.setBounds(302, 353, 115, 14);
		contentPane.add(info_shield);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon(ChooseRightWeapon.class.getResource("/proyecto/images/fondo_weaponsB.jpg")));
		Fondo.setBounds(0, 0, 684, 461);
		contentPane.add(Fondo);
		
		
	}

}
