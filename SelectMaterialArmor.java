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

public class SelectMaterialArmor extends JFrame {

	private JPanel contentPane;
	public static int i = 1;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SelectMaterialArmor frame = new SelectMaterialArmor(i);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//	
	private JButton a1, a2, a3;
	private JLabel gold, iron, copper, fondo, title;

	/**
	 * Create the frame.
	 */
	public SelectMaterialArmor(Equipment equipment, int id) {
		switch(id) {
		case 1:
			a1 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/breastplate_c.png")));
			a1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					equipment.setArmorB(Armors.GOLD_BREASTPLATE.getArmor());
					
					SelectMaterialArmor.this.dispose();
				}
			});
			a2 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/breastplate_c.png")));
			a2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					equipment.setArmorB(Armors.IRON_BREASTPLATE.getArmor());
					
					SelectMaterialArmor.this.dispose();
				}
			});
			a3 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/breastplate_c.png")));
			a3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					equipment.setArmorB(Armors.COPPER_BREASTPLATE.getArmor());
					
					SelectMaterialArmor.this.dispose();
				}
			});
			break;
		case 2:
			a1 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/helmet_c.png")));
			a1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					equipment.setArmorH(Armors.GOLD_HELMET.getArmor());
					
					SelectMaterialArmor.this.dispose();
				}
			});
			a2 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/helmet_c.png")));
			a2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					equipment.setArmorH(Armors.IRON_HELMET.getArmor());
					
					SelectMaterialArmor.this.dispose();
				}
			});
			a3 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/helmet_c.png")));
			a3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					equipment.setArmorH(Armors.COPPER_HELMET.getArmor());
					
					SelectMaterialArmor.this.dispose();
				}
			});
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
		
		
		fondo = new JLabel(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/fondo_weaponsB.jpg")));
		 
		fondo.setBounds(0, 0, 700, 500); add(fondo);
		
		setVisible(true);
		setLocationRelativeTo(null);
		setBounds(0, 0, 700, 500);
	}

}
