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

import com.iteso.motor.Armor;
import com.iteso.motor.Equipment;

public class SelectArmor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SelectArmor frame = new SelectArmor();
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
	public SelectArmor(Equipment equipment) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel title = new JLabel("Choose your armor");
		title.setForeground(Color.YELLOW);
		title.setFont(new Font("Tahoma", Font.PLAIN, 18));
		title.setBounds(239, 30, 165, 22);
		contentPane.add(title);
		
		JButton breastplate = new JButton("");
		breastplate.setBackground(Color.BLACK);
		breastplate.setIcon(new ImageIcon(SelectArmor.class.getResource("/proyecto/images/breastplate_c.png")));
		breastplate.setBounds(136, 119, 115, 114);
		contentPane.add(breastplate);
		breastplate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Armor temp = new Armor();
				equipment.setArmorB(temp);
				
				SelectArmor.this.dispose();
			}
		});
		
		JButton helmet = new JButton("");
		helmet.setBackground(Color.BLACK);
		helmet.setIcon(new ImageIcon(SelectArmor.class.getResource("/proyecto/images/helmet_c.png")));
		helmet.setBounds(386, 119, 115, 114);
		contentPane.add(helmet);
		helmet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Armor temp = new Armor();
				temp.setHelmet(true);
				equipment.setArmorH(temp);
				
				SelectArmor.this.dispose();
			}
		});
		
		JLabel name_breastplate = new JLabel("Breastplate");
		name_breastplate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		name_breastplate.setForeground(Color.ORANGE);
		name_breastplate.setBounds(158, 244, 81, 14);
		contentPane.add(name_breastplate);
		
		JLabel name_helmet = new JLabel("Helmet");
		name_helmet.setFont(new Font("Tahoma", Font.PLAIN, 14));
		name_helmet.setForeground(Color.ORANGE);
		name_helmet.setBounds(424, 244, 46, 14);
		contentPane.add(name_helmet);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(SelectArmor.class.getResource("/proyecto/images/fondo_weaponsB.jpg")));
		fondo.setBounds(0, 0, 684, 461);
		contentPane.add(fondo);
	}

}
