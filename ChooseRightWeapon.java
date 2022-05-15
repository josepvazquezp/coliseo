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

public class ChooseRightWeapon extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ChooseRightWeapon frame = new ChooseRightWeapon();
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
	public ChooseRightWeapon(Equipment equipment) {
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
		axe.setIcon(new ImageIcon(ChooseRightWeapon.class.getResource("/proyecto/images/axe_c.png")));
		axe.setBounds(101, 95, 125, 92);
		contentPane.add(axe);
		axe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				equipment.setWeaponR(Weapons.COPPER_AXE.getWeapon());
				
				ChooseRightWeapon.this.dispose();
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
				equipment.setWeaponR(Weapons.COPPER_SWORD.getWeapon());
				
				ChooseRightWeapon.this.dispose();
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
				equipment.setWeaponR(Weapons.COPPER_KUNAI.getWeapon());
				
				ChooseRightWeapon.this.dispose();
			}
		});
		
		JButton mace = new JButton("");
		mace.setIcon(new ImageIcon(ChooseRightWeapon.class.getResource("/proyecto/images/mace_c.png")));
		mace.setBackground(Color.BLACK);
		mace.setBounds(101, 250, 125, 92);
		contentPane.add(mace);
		mace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				equipment.setWeaponR(Weapons.COPPER_MACE.getWeapon());
				
				ChooseRightWeapon.this.dispose();
			}
		});
		
		JButton longaxe = new JButton("");
		longaxe.setIcon(new ImageIcon(ChooseRightWeapon.class.getResource("/proyecto/images/lonaxe_c.png")));
		longaxe.setBackground(Color.BLACK);
		longaxe.setBounds(292, 250, 125, 92);
		contentPane.add(longaxe);
		longaxe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				equipment.setWeaponR(Weapons.COPPER_LONG_AXE.getWeapon());
				
				ChooseRightWeapon.this.dispose();
			}
		});
		
		JButton shield = new JButton("");
		shield.setIcon(new ImageIcon(ChooseRightWeapon.class.getResource("/proyecto/images/shield_c.png")));
		shield.setBackground(Color.BLACK);
		shield.setBounds(471, 250, 125, 92);
		contentPane.add(shield);
		shield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				equipment.setWeaponR(Weapons.IRON_SHIELD.getWeapon());
				
				ChooseRightWeapon.this.dispose();
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
		Fondo.setIcon(new ImageIcon(ChooseRightWeapon.class.getResource("/proyecto/images/fondo_weaponsB.jpg")));
		Fondo.setBounds(0, 0, 684, 461);
		contentPane.add(Fondo);
	}

}
