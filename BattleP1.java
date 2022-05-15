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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class BattleP1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BattleP1 frame = new BattleP1();
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
	public BattleP1() {
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
				// Todo lo que quiero que se haga cuando se de clic al boton
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
		btnNewButton_1.setEnabled(true);
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setIcon(new ImageIcon(BattleP1.class.getResource("/proyecto/images/bc2.png")));
		lblNewLabel.setBounds(0, 0, 700, 310);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(BattleP1.class.getResource("/proyecto/images/p1_im.png")));
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
	}
}
