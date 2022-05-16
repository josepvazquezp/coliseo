package testInterfaz;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BattleP1 extends JFrame {

	private JPanel contentPane;
	private JLabel roleP1, roleP2, wP1R, wP1L, wP2R, wP2L, aP1, aP2;
	private int role1, role2;
	
	private int[] P1TRX = {60,55,60,70,70,40};
	private int[] P1TRY = {50,45,65,60,60,60};
	private int[] P1TLX = {130,120,130,110};
	private int[] P1TLY = {50,50,75,60};
	
	private int[] P2TRX = {355,360,355,420,420,380};
	private int[] P2TRY = {60,55,75,60,60,75};
	private int[] P2TLX = {420,430,425,450};
	private int[] P2TLY = {55,50,70,70};
	
	private int[] P1KRX = {70,63,68,75,75,30};
	private int[] P1KRY = {65,60,90,70,70,75};
	private int[] P1KLX = {120,115,120,100};
	private int[] P1KLY = {65,60,90,75};
	
	private int[] P2KRX = {355,360,355,400,400,380};
	private int[] P2KRY = {60,60,90,70,70,75};
	private int[] P2KLX = {410,420,410,459};
	private int[] P2KLY = {65,60,90,75};
	
	private int[] P1ARX = {65,55,60,70,70,20};
	private int[] P1ARY = {70,70,100,80,80,90};
	private int[] P1ALX = {100,90,100,80};
	private int[] P1ALY = {70,70,100,90};
	
	private int[] P2ARX = {350,360,360,390,390,370};
	private int[] P2ARY = {70,70,100,80,80,90};
	private int[] P2ALX = {390,395,400,400,430};
	private int[] P2ALY = {70,70,100,90};
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BattleP1 frame = new BattleP1(500, 300, 1, 2, 3, 4, 2, 2);
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
	public BattleP1(int RoleSpeedP1, int RoleSpeedP2, int P1_W_R, int P1_W_L,int P2_W_R, int P2_W_L, int P1_A, int P2_A) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("ATTACK");
		btnNewButton.setBackground(new Color(112, 128, 144));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				P1Direction newframe = new P1Direction();
				
				newframe.setVisible(true);
				
				BattleP1.this.dispose();
			}
		});
		
		
		switch(RoleSpeedP1) {
		case(300):
			roleP1 = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\tanque_g.png"));
			role1 = 1;
			break;
		case(500):
			roleP1 = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\standard_g.png"));
			role1 = 2;
			break;
		case(1000):
			roleP1 = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\asesino_g.png"));
			role1 = 3;
			break;
		default: break;
		}
		switch(RoleSpeedP2) {
		case(300):
			roleP2 = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\tanque_g.png"));
			role2 = 1;
			break;
		case(500):
			roleP2 = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\standard_g.png"));
			role2 = 2;
			break;
		case(1000):
			roleP2 = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\asesino_g.png"));
			role2 = 3;
			break;
		default: break;
		}
		
		switch(P1_W_R) {
		case 1:
			if(role1 == 1) {
				wP1R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\axe_R_g.png"));
				wP1R.setBounds(this.P1TRX[0], this.P1TRY[0], 200, 200);add(wP1R);
			}
			if(role1 == 2) {
				wP1R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\axe_R_g.png"));
				wP1R.setBounds(this.P1KRX[0], this.P1KRY[0], 200, 200);add(wP1R);
			}
			if(role1 == 3) {
				wP1R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\axe_R_g.png"));
				wP1R.setBounds(this.P1ARX[0], this.P1ARY[0], 200, 200);add(wP1R);
			}
			break;
		case 2:
			if(role1 == 1) {
				wP1R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\sword_R_g.png"));
				wP1R.setBounds(this.P1TRX[1], this.P1TRY[1], 200, 200);add(wP1R);
			}
			if(role1 == 2) {
				wP1R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\sword_R_g.png"));
				wP1R.setBounds(this.P1KRX[1], this.P1KRY[1], 200, 200);add(wP1R);
			}
			if(role1 == 3) {
				wP1R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\sword_R_g.png"));
				wP1R.setBounds(this.P1ARX[1], this.P1ARY[1], 200, 200);add(wP1R);
			}
			break;
		case 3:
			if(role1 == 1) {
				wP1R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\kunai_R_g.png"));
				wP1R.setBounds(this.P1TRX[2], this.P1TRY[2], 200, 200);add(wP1R);
			}
			if(role1 == 2) {
				wP1R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\kunai_R_g.png"));
				wP1R.setBounds(this.P1KRX[2], this.P1KRY[2], 200, 200);add(wP1R);
			}
			if(role1 == 3) {
				wP1R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\kunai_R_g.png"));
				wP1R.setBounds(this.P1ARX[2], this.P1ARY[2], 200, 200);add(wP1R);
			}
			break;
		case 4:
			if(role1 == 1) {
				wP1R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\mace_R_g.png"));
				wP1R.setBounds(this.P1TRX[3], this.P1TRY[3], 200, 200);add(wP1R);
			}
			if(role1 == 2) {
				wP1R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\mace_R_g.png"));
				wP1R.setBounds(this.P1KRX[3], this.P1KRY[3], 200, 200);add(wP1R);
			}
			if(role1 == 3) {
				wP1R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\mace_R_g.png"));
				wP1R.setBounds(this.P1ARX[3], this.P1ARY[3], 200, 200);add(wP1R);
			}
			break;
		case 5:
			if(role1 == 1) {
				wP1R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\longaxe_R_g.png"));
				wP1R.setBounds(this.P1TRX[4], this.P1TRY[4], 200, 200);add(wP1R);
			}
			if(role1 == 2) {
				wP1R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\longaxe_R_g.png"));
				wP1R.setBounds(this.P1KRX[4], this.P1KRY[4], 200, 200);add(wP1R);
			}
			if(role1 == 3) {
				wP1R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\longaxe_R_g.png"));
				wP1R.setBounds(this.P1ARX[4], this.P1ARY[4], 200, 200);add(wP1R);
			}
			break;
		case 6:
			if(role1 == 1) {
				wP1R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\shield_R_g.png"));
				wP1R.setBounds(this.P1TRX[5], this.P1TRY[5], 200, 200);add(wP1R);
			}
			if(role1 == 2) {
				wP1R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\shield_R_g.png"));
				wP1R.setBounds(this.P1KRX[5], this.P1KRY[5], 200, 200);add(wP1R);
			}
			if(role1 == 3) {
				wP1R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\shield_R_g.png"));
				wP1R.setBounds(this.P1ARX[5], this.P1ARY[5], 200, 200);add(wP1R);
			}
			break;
		default: break;
		}
		
		switch(P2_W_R) {
		case 1:
			if(role2 == 1) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\axe_L_g.png"));
				wP2R.setBounds(this.P2TRX[0], this.P2TRY[0], 200, 200);add(wP2R);
			}
			if(role2 == 2) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\axe_L_g.png"));
				wP2R.setBounds(this.P2KRX[0], this.P2KRY[0], 200, 200);add(wP2R);
			}
			if(role2 == 3) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\axe_L_g.png"));
				wP2R.setBounds(this.P2ARX[0], this.P2ARY[0], 200, 200);add(wP2R);
			}
			break;
		case 2:
			if(role2 == 1) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\sword_L_g.png"));
				wP2R.setBounds(this.P2TRX[1], this.P2TRY[1], 200, 200);add(wP2R);
			}
			if(role2 == 2) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\sword_L_g.png"));
				wP2R.setBounds(this.P2KRX[1], this.P2KRY[1], 200, 200);add(wP2R);
			}
			if(role2 == 3) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\sword_L_g.png"));
				wP2R.setBounds(this.P2ARX[1], this.P2ARY[1], 200, 200);add(wP2R);
			}
			break;
		case 3:
			if(role2 == 1) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\kunai_L_g.png"));
				wP2R.setBounds(this.P2TRX[2], this.P2TRY[2], 200, 200);add(wP2R);
			}
			if(role2 == 2) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\kunai_L_g.png"));
				wP2R.setBounds(this.P2KRX[2], this.P2KRY[2], 200, 200);add(wP2R);
			}
			if(role2 == 3) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\kunai_L_g.png"));
				wP2R.setBounds(this.P2ARX[2], this.P2ARY[2], 200, 200);add(wP2R);
			}
			break;
		case 4:
			if(role2 == 1) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\mace_L_g.png"));
				wP2R.setBounds(this.P2TRX[3], this.P2TRY[3], 200, 200);add(wP2R);
			}
			if(role2 == 2) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\mace_L_g.png"));
				wP2R.setBounds(this.P2KRX[3], this.P2KRY[3], 200, 200);add(wP2R);
			}
			if(role2 == 3) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\mace_L_g.png"));
				wP2R.setBounds(this.P2ARX[3], this.P2ARY[3], 200, 200);add(wP2R);
			}
			break;
		case 5:
			if(role2 == 1) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\longaxe_L_g.png"));
				wP2R.setBounds(this.P2TRX[4], this.P2TRY[4], 200, 200);add(wP2R);
			}
			if(role2 == 2) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\longaxe_L_g.png"));
				wP2R.setBounds(this.P2KRX[4], this.P2KRY[4], 200, 200);add(wP2R);
			}
			if(role2 == 3) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\longaxe_L_g.png"));
				wP2R.setBounds(this.P2ARX[4], this.P2ARY[4], 200, 200);add(wP2R);
			}
			break;
		case 6:
			if(role2 == 1) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\shield_R_g.png"));
				wP2R.setBounds(this.P2TRX[5], this.P2TRY[5], 200, 200);add(wP2R);
			}
			if(role2 == 2) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\shield_R_g.png"));
				wP2R.setBounds(this.P2KRX[5], this.P2KRY[5], 200, 200);add(wP2R);
			}
			if(role2 == 3) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\shield_R_g.png"));
				wP2R.setBounds(this.P2ARX[5], this.P2ARY[5], 200, 200);add(wP2R);
			}
			break;
		default: break;
		}
		
		switch(P1_W_L) {
		case 1:
			if(role1 == 1) {
				wP1L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\axe_R_g.png"));
				wP1L.setBounds(this.P1TLX[0], this.P1TLY[0], 200, 200);add(wP1L);
			}
			if(role1 == 2) {
				wP1L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\axe_R_g.png"));
				wP1L.setBounds(this.P1KLX[0], this.P1KLY[0], 200, 200);add(wP1L);
			}
			if(role1 == 3) {
				wP1L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\axe_R_g.png"));
				wP1L.setBounds(this.P1ALX[0], this.P1ALY[0], 200, 200);add(wP1L);
			}
			break;
		case 2:
			if(role1 == 1) {
				wP1L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\sword_R_g.png"));
				wP1L.setBounds(this.P1TLX[1], this.P1TLY[1], 200, 200);add(wP1L);
			}
			if(role1 == 2) {
				wP1L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\sword_R_g.png"));
				wP1L.setBounds(this.P1KLX[1], this.P1KLY[1], 200, 200);add(wP1L);
			}
			if(role1 == 3) {
				wP1L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\sword_R_g.png"));
				wP1L.setBounds(this.P1ALX[1], this.P1ALY[1], 200, 200);add(wP1L);
			}
			break;
		case 3:
			if(role1 == 1) {
				wP1L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\kunai_R_g.png"));
				wP1L.setBounds(this.P1TLX[2], this.P1TLY[2], 200, 200);add(wP1L);
			}
			if(role1 == 2) {
				wP1L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\kunai_R_g.png"));
				wP1L.setBounds(this.P1KLX[2], this.P1KLY[2], 200, 200);add(wP1L);
			}
			if(role1 == 3) {
				wP1L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\kunai_R_g.png"));
				wP1L.setBounds(this.P1ALX[2], this.P1ALY[2], 200, 200);add(wP1L);
			}
			break;
		case 4:
			if(role1 == 1) {
				wP1L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\shield_R_g.png"));
				wP1L.setBounds(this.P1TLX[3], this.P1TLY[3], 200, 200);add(wP1L);
			}
			if(role1 == 2) {
				wP1L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\shield_R_g.png"));
				wP1L.setBounds(this.P1KLX[3], this.P1KLY[3], 200, 200);add(wP1L);
			}
			if(role1 == 3) {
				wP1L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\shield_R_g.png"));
				wP1L.setBounds(this.P1ALX[3], this.P1ALY[3], 200, 200);add(wP1L);
			}
			break;
		default: break;
		}
		
		switch(P2_W_L) {
		case 1:
			if(role2 == 1) {
				wP2L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\axe_L_g.png"));
				wP2L.setBounds(this.P2TLX[0], this.P2TLY[0], 200, 200);add(wP2L);
			}
			if(role2 == 2) {
				wP2L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\axe_L_g.png"));
				wP2L.setBounds(this.P2KLX[0], this.P2KLY[0], 200, 200);add(wP2L);
			}
			if(role2 == 3) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\axe_L_g.png"));
				wP2R.setBounds(this.P2ALX[0], this.P2ALY[0], 200, 200);add(wP2R);
			}
			break;
		case 2:
			if(role2 == 1) {
				wP2L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\sword_L_g.png"));
				wP2L.setBounds(this.P2TLX[1], this.P2TLY[1], 200, 200);add(wP2L);
			}
			if(role2 == 2) {
				wP2L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\sword_L_g.png"));
				wP2L.setBounds(this.P2KLX[1], this.P2KLY[1], 200, 200);add(wP2L);
			}
			if(role2 == 3) {
				wP2L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\sword_L_g.png"));
				wP2L.setBounds(395, 70, 200, 200);add(wP2L);
			}
			if(role2 == 3) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\sword_L_g.png"));
				wP2R.setBounds(this.P2ALX[1], this.P2ALY[1], 200, 200);add(wP2R);
			}
			break;
		case 3:
			if(role2 == 1) {
				wP2L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\kunai_L_g.png"));
				wP2L.setBounds(this.P2TLX[2], this.P2TLY[2], 200, 200);add(wP2L);
			}
			if(role2 == 2) {
				wP2L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\kunai_L_g.png"));
				wP2L.setBounds(this.P2KLX[2], this.P2KLY[2], 200, 200);add(wP2L);
			}
			if(role2 == 3) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\kunai_L_g.png"));
				wP2R.setBounds(this.P2ALX[2], this.P2ALY[2], 200, 200);add(wP2R);
			}
			break;
		case 4:
			if(role2 == 1) {
				wP2L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\shield_R_g.png"));
				wP2L.setBounds(this.P2TLX[3], this.P2TLY[3], 200, 200);add(wP2L);
			}
			if(role2 == 2) {
				wP2L = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\shield_R_g.png"));
				wP2L.setBounds(this.P2KLX[3], this.P2KLY[3], 200, 200);add(wP2L);
			}
			if(role2 == 3) {
				wP2R = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\shield_R_g.png"));
				wP2R.setBounds(this.P2ALX[3], this.P2ALY[3], 200, 200);add(wP2R);
			}
			break;
		default: break;
		}
		
		
		switch(P1_A) {
		case 1:
			if(role1 == 1) {
				aP1 = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\breastplate_g.png"));
				aP1.setBounds(65, 70, 200, 200);add(aP1);
			}
			if(role1 == 2) {
				aP1 = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\breastplate_g.png"));
				aP1.setBounds(60, 100, 200, 200);add(aP1);
			}
			if(role1 == 3) {
				aP1 = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\breastplate_g.png"));
				aP1.setBounds(50, 120, 200, 200);add(aP1);
				break;
			}
			break;
		case 2:
			if(role1 == 1) {
				aP1 = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\helmet_g.png"));
				aP1.setBounds(65, 0, 200, 200);add(aP1);
			}
			if(role1 == 2) {
				aP1 = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\helmet_g.png"));
				aP1.setBounds(60, 25, 200, 200);add(aP1);
			}
			if(role1 == 3) {
				aP1 = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\helmet_g.png"));
				aP1.setBounds(50, 45, 200, 200);add(aP1);	
			}
			break;
		default: break;
		}
		
		switch(P2_A) {
		case 1:
			if(role2 == 1) {
				aP2 = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\breastplate_g.png"));
				aP2.setBounds(420, 70, 200, 200);add(aP2);
			}
			if(role2 == 2) {
				aP2 = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\breastplate_g.png"));
				aP2.setBounds(415, 100, 200, 200);add(aP2);
			}
			if(role2 == 3) {
				aP2 = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\breastplate_g.png"));
				aP2.setBounds(405, 120, 200, 200);add(aP2);	
			}
			break;
		case 2:
			if(role2 == 1) {
				aP2 = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\helmet_g.png"));
				aP2.setBounds(418, 0, 200, 200);add(aP2);
			}
			if(role2 == 2) {
				aP2 = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\helmet_g.png"));
				aP2.setBounds(415, 25, 200, 200);add(aP2);
			}
			if(role2 == 3) {
				aP2 = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\helmet_g.png"));
				aP2.setBounds(405, 45, 200, 200);add(aP2);	
			}
			break;
		default: break;
		}
		
		
		
		switch(role1) {
		case 1:
			roleP1.setBounds(95, 40, 132, 200);getContentPane().add(roleP1);
			break;
		case 2:
			roleP1.setBounds(95, 70, 132, 200);getContentPane().add(roleP1);
			break;
		case 3:
			roleP1.setBounds(95, 85, 132, 200);getContentPane().add(roleP1);
			break;
		default: break;
		}
		
		switch(role2) {
		case 1:
			roleP2.setBounds(450, 40, 132, 200);getContentPane().add(roleP2);
			break;
		case 2:
			roleP2.setBounds(450, 70, 132, 200);getContentPane().add(roleP2);
			break;
		case 3:
			roleP2.setBounds(450, 85, 132, 200);getContentPane().add(roleP2);
			break;
		default: break;
		}

		
		
		JLabel lblNewLabel_2 = new JLabel("P1");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblNewLabel_2.setBounds(70, 200, 49, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("P2");
		lblNewLabel_2_1.setForeground(Color.RED);
		lblNewLabel_2_1.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(581, 200, 49, 33);
		contentPane.add(lblNewLabel_2_1);
		btnNewButton.setBounds(550, 340, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("SHOT");
		btnNewButton_2.setBackground(new Color(25, 25, 112));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JButton btnNewButton_4 = new JButton("s1");
				btnNewButton_4.setBackground(new Color(201, 164, 97));
				btnNewButton_4.setBounds(0, 204, 140, 35);
				contentPane.add(btnNewButton_4);
				
				JButton btnNewButton_4_1 = new JButton("s2");
				btnNewButton_4_1.setBackground(new Color(201, 164, 97));
				btnNewButton_4_1.setBounds(0, 239, 140, 35);
				contentPane.add(btnNewButton_4_1);
				
				JButton btnNewButton_4_1_1 = new JButton("s3");
				btnNewButton_4_1_1.setBackground(new Color(201, 164, 97));
				btnNewButton_4_1_1.setBounds(0, 274, 140, 35);
				contentPane.add(btnNewButton_4_1_1);
				
				JButton btnNewButton_4_2 = new JButton("s4");
				btnNewButton_4_2.setBackground(new Color(201, 164, 97));
				btnNewButton_4_2.setBounds(140, 204, 140, 35);
				contentPane.add(btnNewButton_4_2);
				
				JButton btnNewButton_4_2_1 = new JButton("s5");
				btnNewButton_4_2_1.setBackground(new Color(201, 164, 97));
				btnNewButton_4_2_1.setBounds(140, 239, 140, 35);
				contentPane.add(btnNewButton_4_2_1);
				
				JButton btnNewButton_4_2_1_1 = new JButton("s6");
				btnNewButton_4_2_1_1.setBackground(new Color(201, 164, 97));
				btnNewButton_4_2_1_1.setBounds(140, 274, 140, 35);
				contentPane.add(btnNewButton_4_2_1_1);
				
				JButton btnNewButton_4_2_2 = new JButton("s7");
				btnNewButton_4_2_2.setBackground(new Color(201, 164, 97));
				btnNewButton_4_2_2.setBounds(280, 204, 140, 35);
				contentPane.add(btnNewButton_4_2_2);
				
				JButton btnNewButton_4_2_2_1 = new JButton("s8");
				btnNewButton_4_2_2_1.setBackground(new Color(201, 164, 97));
				btnNewButton_4_2_2_1.setBounds(280, 239, 140, 35);
				contentPane.add(btnNewButton_4_2_2_1);
				
				JButton btnNewButton_4_2_2_1_1 = new JButton("s9");
				btnNewButton_4_2_2_1_1.setBackground(new Color(201, 164, 97));
				btnNewButton_4_2_2_1_1.setBounds(280, 274, 140, 35);
				contentPane.add(btnNewButton_4_2_2_1_1);
				
				JButton btnNewButton_4_2_2_1_1_1 = new JButton("s10");
				btnNewButton_4_2_2_1_1_1.setBackground(new Color(201, 164, 97));
				btnNewButton_4_2_2_1_1_1.setBounds(420, 204, 140, 35);
				contentPane.add(btnNewButton_4_2_2_1_1_1);
				
				JButton btnNewButton_4_2_2_1_1_1_1 = new JButton("s11");
				btnNewButton_4_2_2_1_1_1_1.setBackground(new Color(201, 164, 97));
				btnNewButton_4_2_2_1_1_1_1.setBounds(420, 239, 140, 35);
				contentPane.add(btnNewButton_4_2_2_1_1_1_1);
				
				JButton btnNewButton_4_2_2_1_1_1_1_1 = new JButton("s12");
				btnNewButton_4_2_2_1_1_1_1_1.setBackground(new Color(201, 164, 97));
				btnNewButton_4_2_2_1_1_1_1_1.setBounds(420, 274, 140, 35);
				contentPane.add(btnNewButton_4_2_2_1_1_1_1_1);
				
				JButton btnNewButton_4_2_2_1_1_1_2 = new JButton("s13");
				btnNewButton_4_2_2_1_1_1_2.setBackground(new Color(201, 164, 97));
				btnNewButton_4_2_2_1_1_1_2.setBounds(560, 204, 140, 35);
				contentPane.add(btnNewButton_4_2_2_1_1_1_2);
				
				JButton btnNewButton_4_2_2_1_1_1_2_1 = new JButton("s14");
				btnNewButton_4_2_2_1_1_1_2_1.setBackground(new Color(201, 164, 97));
				btnNewButton_4_2_2_1_1_1_2_1.setBounds(560, 239, 140, 35);
				contentPane.add(btnNewButton_4_2_2_1_1_1_2_1);
				
				JButton btnNewButton_4_2_2_1_1_1_2_1_1 = new JButton("s15");
				btnNewButton_4_2_2_1_1_1_2_1_1.setBackground(new Color(201, 164, 97));
				btnNewButton_4_2_2_1_1_1_2_1_1.setBounds(560, 274, 140, 35);
				contentPane.add(btnNewButton_4_2_2_1_1_1_2_1_1);
			}
		});
		btnNewButton_2.setBounds(550, 390, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("MOVE");
		btnNewButton_1.setBackground(new Color(95, 158, 160));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(400, 340, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				P1Direction newframe = new P1Direction();
				
				newframe.setVisible(true);
				
				BattleP1.this.dispose();
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("JUMP");
		btnNewButton_3.setBackground(new Color(47, 79, 79));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBounds(400, 390, 89, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				JOptionPane.showMessageDialog(null, "JUMP");
			}
		});
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\p1_im.jpg"));
		lblNewLabel_1.setBounds(29, 320, 219, 118);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("HP: ");
		lblNewLabel_3.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(240, 330, 49, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("SPEED: ");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(240, 370, 100, 30);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\bc2.png"));
		lblNewLabel.setBounds(0, 0, 700, 310);
		contentPane.add(lblNewLabel);
		
	}
}
