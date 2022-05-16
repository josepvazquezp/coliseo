package testInterfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.iteso.motor.Weapon;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class WeaponDirection extends JFrame {

	private JPanel contentPane;
	private JLabel WR, WL;
	private JButton right, left;
	private int idW, capacityW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeaponDirection frame = new WeaponDirection(6, 6, new Weapon());
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
	public WeaponDirection(int id_weaponR, int id_weaponL, Weapon o) {
		
		switch(id_weaponR) {
		case 1:
			WR = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\axe_c.png"));
			capacityW = 1;
			break;
		case 2:
			WR = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\sword_c.png"));
			capacityW = 1;
			break;
		case 3:
			WR = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\kunai_c.png"));
			capacityW = 1;
			break;
		case 4:
			WR = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\mace_c.png"));
			capacityW = 2;
			break;
		case 5:
			WR = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\lonaxe_c.png"));
			capacityW = 2;
			break;
		case 6:
			WR = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\shield_c.png"));
			capacityW = 1;
			break;
		default: break;
		}
		
		switch(id_weaponL) {
		case 1:
			WL = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\axe_c.png"));
			break;
		case 2:
			WL = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\sword_c.png"));
			break;
		case 3:
			WL = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\kunai_c.png"));
			break;
		case 4:
			WL = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\mace_c.png"));
			break;
		case 5:
			WL = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\lonaxe_c.png"));
			break;
		case 6:
			WL = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\shield_c.png"));
			break;
		default: break;
		}
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		if(capacityW == 1) {
			WR.setBounds(100, 100, 200, 200); add(WR);
			WL.setBounds(400, 100, 200, 200); add(WL);
			
			left = new JButton("LEFT");
			left.setVerticalAlignment(SwingConstants.BOTTOM);
			left.setBackground(new Color(128, 128, 0));
			left.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			left.setForeground(Color.WHITE);
			left.setBounds(350, 383, 100, 30);
			left.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Todo lo que quiero que se haga cuando se de clic al boton
					o.setX(1);
					
					WeaponDirection.this.dispose();
				}
			});
			contentPane.add(left);
		
			right = new JButton("RIGHT");
			right.setVerticalAlignment(SwingConstants.BOTTOM);
			right.setForeground(Color.WHITE);
			right.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			right.setBackground(new Color(0, 0, 139));
			right.setBounds(503, 383, 100, 30);
			right.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Todo lo que quiero que se haga cuando se de clic al boton
					o.setX(2);
					
					WeaponDirection.this.dispose();
				}
			});
			contentPane.add(right);
		}
		
		if(capacityW == 2) {
			WR.setBounds(250, 100, 200, 200);add(WR);
			
			right = new JButton("RIGHT");
			right.setVerticalAlignment(SwingConstants.BOTTOM);
			right.setForeground(Color.WHITE);
			right.setFont(new Font("Yu Gothic", Font.BOLD, 11));
			right.setBackground(new Color(0, 0, 139));
			right.setBounds(410, 383, 100, 30);
			right.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Todo lo que quiero que se haga cuando se de clic al boton
					o.setX(2);
					
					WeaponDirection.this.dispose();
				}
			});
			contentPane.add(right);
			
		}
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\bc2.png"));
		lblNewLabel.setBounds(0, 0, 700, 310);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\p1_im.jpg"));
		lblNewLabel_1.setBounds(25, 320, 219, 118);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Choose your weapon");
		lblNewLabel_2.setFont(new Font("Yu Gothic", Font.BOLD, 25));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(340, 321, 305, 51);
		contentPane.add(lblNewLabel_2);
		
	}
}