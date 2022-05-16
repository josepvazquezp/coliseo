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

public class SelectMaterial extends JFrame {

	private JPanel contentPane;
//	public static int i = 1;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SelectMaterial frame = new SelectMaterial(i);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	private JButton w1, w2, w3;
	private JLabel gold, iron, copper, fondo, title;

	/**
	 * Create the frame.
	 */
	public SelectMaterial(Equipment equipment, int id, boolean right) {
		switch(id) {
			case 1:
				w1 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/axe_c.png")));
				w1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// Todo lo que quiero que se haga cuando se de clic al boton
						if(right)
							equipment.setWeaponR(Weapons.GOLD_AXE.getWeapon());
						else
							equipment.setWeaponL(Weapons.GOLD_AXE.getWeapon());
						
						SelectMaterial.this.dispose();
					}
				});
				w2 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/axe_c.png")));
				w2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// Todo lo que quiero que se haga cuando se de clic al boton
						if(right)
							equipment.setWeaponR(Weapons.IRON_AXE.getWeapon());
						else
							equipment.setWeaponL(Weapons.IRON_AXE.getWeapon());
						
						SelectMaterial.this.dispose();
					}
				});
				w3 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/axe_c.png")));
				w3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// Todo lo que quiero que se haga cuando se de clic al boton
						if(right)
							equipment.setWeaponR(Weapons.COPPER_AXE.getWeapon());
						else
							equipment.setWeaponL(Weapons.COPPER_AXE.getWeapon());
						
						SelectMaterial.this.dispose();
					}
				});
				break;
			case 2:
				w1 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/sword_c.png")));
				w1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// Todo lo que quiero que se haga cuando se de clic al boton
						if(right)
							equipment.setWeaponR(Weapons.GOLD_SWORD.getWeapon());
						else
							equipment.setWeaponL(Weapons.GOLD_SWORD.getWeapon());
						
						SelectMaterial.this.dispose();
					}
				});
				w2 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/sword_c.png")));
				w2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// Todo lo que quiero que se haga cuando se de clic al boton
						if(right)
							equipment.setWeaponR(Weapons.IRON_SWORD.getWeapon());
						else
							equipment.setWeaponL(Weapons.IRON_SWORD.getWeapon());
						
						SelectMaterial.this.dispose();
					}
				});
				w3 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/sword_c.png")));
				w3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// Todo lo que quiero que se haga cuando se de clic al boton
						if(right)
							equipment.setWeaponR(Weapons.COPPER_SWORD.getWeapon());
						else
							equipment.setWeaponL(Weapons.COPPER_SWORD.getWeapon());
						
						SelectMaterial.this.dispose();
					}
				});
				break;
			case 3:
				w1 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/kunai_c.png")));
				w1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// Todo lo que quiero que se haga cuando se de clic al boton
						if(right)
							equipment.setWeaponR(Weapons.GOLD_KUNAI.getWeapon());
						else
							equipment.setWeaponL(Weapons.GOLD_KUNAI.getWeapon());
						
						SelectMaterial.this.dispose();
					}
				});
				w2 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/kunai_c.png")));
				w2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// Todo lo que quiero que se haga cuando se de clic al boton
						if(right)
							equipment.setWeaponR(Weapons.IRON_KUNAI.getWeapon());
						else
							equipment.setWeaponL(Weapons.IRON_KUNAI.getWeapon());
						
						SelectMaterial.this.dispose();
					}
				});
				w3 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/kunai_c.png")));
				w3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// Todo lo que quiero que se haga cuando se de clic al boton
						if(right)
							equipment.setWeaponR(Weapons.COPPER_KUNAI.getWeapon());
						else
							equipment.setWeaponL(Weapons.COPPER_KUNAI.getWeapon());
						
						SelectMaterial.this.dispose();
					}
				});
				break;
			case 4:
				w1 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/mace_c.png")));
				w1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// Todo lo que quiero que se haga cuando se de clic al boton
						if(right)
							equipment.setWeaponR(Weapons.GOLD_MACE.getWeapon());
						else
							equipment.setWeaponL(Weapons.GOLD_MACE.getWeapon());
						
						SelectMaterial.this.dispose();
					}
				});
				w2 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/mace_c.png")));
				w2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// Todo lo que quiero que se haga cuando se de clic al boton
						if(right)
							equipment.setWeaponR(Weapons.IRON_MACE.getWeapon());
						else
							equipment.setWeaponL(Weapons.IRON_MACE.getWeapon());
						
						SelectMaterial.this.dispose();
					}
				});
				w3 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/mace_c.png")));
				w3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// Todo lo que quiero que se haga cuando se de clic al boton
						if(right)
							equipment.setWeaponR(Weapons.COPPER_MACE.getWeapon());
						else
							equipment.setWeaponL(Weapons.COPPER_MACE.getWeapon());
						
						SelectMaterial.this.dispose();
					}
				});
				break;
			case 5:
				w1 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/lonaxe_c.png")));
				w1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// Todo lo que quiero que se haga cuando se de clic al boton
						if(right)
							equipment.setWeaponR(Weapons.GOLD_LONG_AXE.getWeapon());
						else
							equipment.setWeaponL(Weapons.GOLD_LONG_AXE.getWeapon());
						
						SelectMaterial.this.dispose();
					}
				});
				w2 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/lonaxe_c.png")));
				w2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// Todo lo que quiero que se haga cuando se de clic al boton
						if(right)
							equipment.setWeaponR(Weapons.IRON_LONG_AXE.getWeapon());
						else
							equipment.setWeaponL(Weapons.IRON_LONG_AXE.getWeapon());
						
						SelectMaterial.this.dispose();
					}
				});
				w3 = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/lonaxe_c.png")));
				w3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						// Todo lo que quiero que se haga cuando se de clic al boton
						if(right)
							equipment.setWeaponR(Weapons.COPPER_LONG_AXE.getWeapon());
						else
							equipment.setWeaponL(Weapons.COPPER_LONG_AXE.getWeapon());
						
						SelectMaterial.this.dispose();
					}
				});
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
		
		
		fondo = new JLabel(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/fondo_weaponsB.jpg")));
		 
		fondo.setBounds(0, 0, 700, 500); add(fondo);
		
		setVisible(true);
		setLocationRelativeTo(null);
		setBounds(100, 100, 700, 500);
	}

}
