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

import com.iteso.motor.Direction;
import com.iteso.motor.Weapon;

public class MapShot extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MapShot frame = new MapShot(true);
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
	public MapShot(RoleColiseo r, RoleColiseo r2, boolean turn, Weapon o) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setIcon(new ImageIcon(Battle.class.getResource("/proyecto/images/bc2.png")));
		lblNewLabel.setBounds(0, 0, 700, 310);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Battle.class.getResource("/proyecto/images/p1_im.png")));
		lblNewLabel_1.setBounds(25, 320, 219, 118);
		contentPane.add(lblNewLabel_1);
		
		if(turn) {
			JLabel lblNewLabel_2 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(Battle.class.getResource("/proyecto/images/p1_im.png")));
			lblNewLabel_1.setBounds(29, 320, 219, 118);
			contentPane.add(lblNewLabel_1);
		}
		else {
			JLabel lblNewLabel_2 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(Battle.class.getResource("/proyecto/images/p2.png")));
			lblNewLabel_1.setBounds(29, 320, 219, 118);
			contentPane.add(lblNewLabel_1);
		}
		JButton btnNewButton_4 = new JButton("s1");
		btnNewButton_4.setBackground(new Color(201, 164, 97));
		btnNewButton_4.setBounds(0, 204, 140, 35);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r.shot(ArenaMap.S1X, ArenaMap.S1Y, r2, o.getX() == 1? Direction.LEFT : Direction.RIGHT, r.getX() < r2.getX()? Direction.RIGHT : Direction.LEFT);
				
				o.setX(99);
				
				MapShot.this.dispose();
			}
		});
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("s2");
		btnNewButton_4_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_1.setBounds(0, 239, 140, 35);
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r.shot(ArenaMap.S2X, ArenaMap.S2Y, r2, o.getX() == 1? Direction.LEFT : Direction.RIGHT, r.getX() < r2.getX()? Direction.RIGHT : Direction.LEFT);
				
				o.setX(99);
				
				MapShot.this.dispose();
			}
		});
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_1_1 = new JButton("s3");
		btnNewButton_4_1_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_1_1.setBounds(0, 274, 140, 35);
		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r.shot(ArenaMap.S3X, ArenaMap.S3Y, r2, o.getX() == 1? Direction.LEFT : Direction.RIGHT, r.getX() < r2.getX()? Direction.RIGHT : Direction.LEFT);
				
				o.setX(99);
				
				MapShot.this.dispose();
			}
		});
		contentPane.add(btnNewButton_4_1_1);
		
		JButton btnNewButton_4_2 = new JButton("s4");
		btnNewButton_4_2.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2.setBounds(140, 204, 140, 35);
		btnNewButton_4_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r.shot(ArenaMap.S4X, ArenaMap.S4Y, r2, o.getX() == 1? Direction.LEFT : Direction.RIGHT, r.getX() < r2.getX()? Direction.RIGHT : Direction.LEFT);
				
				o.setX(99);
				
				MapShot.this.dispose();
			}
		});
		contentPane.add(btnNewButton_4_2);
		
		JButton btnNewButton_4_2_1 = new JButton("s5");
		btnNewButton_4_2_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_1.setBounds(140, 239, 140, 35);
		btnNewButton_4_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r.shot(ArenaMap.S5X, ArenaMap.S5Y, r2, o.getX() == 1? Direction.LEFT : Direction.RIGHT, r.getX() < r2.getX()? Direction.RIGHT : Direction.LEFT);
				
				o.setX(99);
				
				MapShot.this.dispose();
			}
		});
		contentPane.add(btnNewButton_4_2_1);
		
		JButton btnNewButton_4_2_1_1 = new JButton("s6");
		btnNewButton_4_2_1_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_1_1.setBounds(140, 274, 140, 35);
		btnNewButton_4_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r.shot(ArenaMap.S6X, ArenaMap.S6Y, r2, o.getX() == 1? Direction.LEFT : Direction.RIGHT, r.getX() < r2.getX()? Direction.RIGHT : Direction.LEFT);
				
				o.setX(99);
				
				MapShot.this.dispose();
			}
		});
		contentPane.add(btnNewButton_4_2_1_1);
		
		JButton btnNewButton_4_2_2 = new JButton("s7");
		btnNewButton_4_2_2.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_2.setBounds(280, 204, 140, 35);
		btnNewButton_4_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r.shot(ArenaMap.S7X, ArenaMap.S7Y, r2, o.getX() == 1? Direction.LEFT : Direction.RIGHT, r.getX() < r2.getX()? Direction.RIGHT : Direction.LEFT);
				
				o.setX(99);
				
				MapShot.this.dispose();
			}
		});
		contentPane.add(btnNewButton_4_2_2);
		
		JButton btnNewButton_4_2_2_1 = new JButton("s8");
		btnNewButton_4_2_2_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_2_1.setBounds(280, 239, 140, 35);
		btnNewButton_4_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r.shot(ArenaMap.S8X, ArenaMap.S8Y, r2, o.getX() == 1? Direction.LEFT : Direction.RIGHT, r.getX() < r2.getX()? Direction.RIGHT : Direction.LEFT);
				
				o.setX(99);
				
				MapShot.this.dispose();
			}
		});
		contentPane.add(btnNewButton_4_2_2_1);
		
		JButton btnNewButton_4_2_2_1_1 = new JButton("s9");
		btnNewButton_4_2_2_1_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_2_1_1.setBounds(280, 274, 140, 35);
		btnNewButton_4_2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r.shot(ArenaMap.S9X, ArenaMap.S9Y, r2, o.getX() == 1? Direction.LEFT : Direction.RIGHT, r.getX() < r2.getX()? Direction.RIGHT : Direction.LEFT);
				
				o.setX(99);
				
				MapShot.this.dispose();
			}
		});
		contentPane.add(btnNewButton_4_2_2_1_1);
		
		JButton btnNewButton_4_2_2_1_1_1 = new JButton("s10");
		btnNewButton_4_2_2_1_1_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_2_1_1_1.setBounds(420, 204, 140, 35);
		btnNewButton_4_2_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r.shot(ArenaMap.S10X, ArenaMap.S10Y, r2, o.getX() == 1? Direction.LEFT : Direction.RIGHT, r.getX() < r2.getX()? Direction.RIGHT : Direction.LEFT);
				
				o.setX(99);
				
				MapShot.this.dispose();
			}
		});
		contentPane.add(btnNewButton_4_2_2_1_1_1);
		
		JButton btnNewButton_4_2_2_1_1_1_1 = new JButton("s11");
		btnNewButton_4_2_2_1_1_1_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_2_1_1_1_1.setBounds(420, 239, 140, 35);
		btnNewButton_4_2_2_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r.shot(ArenaMap.S11X, ArenaMap.S11Y, r2, o.getX() == 1? Direction.LEFT : Direction.RIGHT, r.getX() < r2.getX()? Direction.RIGHT : Direction.LEFT);
				
				o.setX(99);
				
				MapShot.this.dispose();
			}
		});
		contentPane.add(btnNewButton_4_2_2_1_1_1_1);
		
		JButton btnNewButton_4_2_2_1_1_1_1_1 = new JButton("s12");
		btnNewButton_4_2_2_1_1_1_1_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_2_1_1_1_1_1.setBounds(420, 274, 140, 35);
		btnNewButton_4_2_2_1_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r.shot(ArenaMap.S12X, ArenaMap.S12Y, r2, o.getX() == 1? Direction.LEFT : Direction.RIGHT, r.getX() < r2.getX()? Direction.RIGHT : Direction.LEFT);
				
				o.setX(99);
				
				MapShot.this.dispose();
			}
		});
		contentPane.add(btnNewButton_4_2_2_1_1_1_1_1);
		
		JButton btnNewButton_4_2_2_1_1_1_2 = new JButton("s13");
		btnNewButton_4_2_2_1_1_1_2.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_2_1_1_1_2.setBounds(560, 204, 140, 35);
		btnNewButton_4_2_2_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r.shot(ArenaMap.S13X, ArenaMap.S13Y, r2, o.getX() == 1? Direction.LEFT : Direction.RIGHT, r.getX() < r2.getX()? Direction.RIGHT : Direction.LEFT);
				
				o.setX(99);
				
				MapShot.this.dispose();
			}
		});
		contentPane.add(btnNewButton_4_2_2_1_1_1_2);
		
		JButton btnNewButton_4_2_2_1_1_1_2_1 = new JButton("s14");
		btnNewButton_4_2_2_1_1_1_2_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_2_1_1_1_2_1.setBounds(560, 239, 140, 35);
		btnNewButton_4_2_2_1_1_1_2_1.setEnabled(true);
		btnNewButton_4_2_2_1_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r.shot(ArenaMap.S14X, ArenaMap.S14Y, r2, o.getX() == 1? Direction.LEFT : Direction.RIGHT, r.getX() < r2.getX()? Direction.RIGHT : Direction.LEFT);
				
				o.setX(99);
				
				MapShot.this.dispose();
			}
		});
		contentPane.add(btnNewButton_4_2_2_1_1_1_2_1);
		
		JButton btnNewButton_4_2_2_1_1_1_2_1_1 = new JButton("s15");
		btnNewButton_4_2_2_1_1_1_2_1_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_2_1_1_1_2_1_1.setBounds(560, 274, 140, 35);
		btnNewButton_4_2_2_1_1_1_2_1_1.setEnabled(true);
		btnNewButton_4_2_2_1_1_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				r.shot(ArenaMap.S15X, ArenaMap.S15Y, r2, o.getX() == 1? Direction.LEFT : Direction.RIGHT, r.getX() < r2.getX()? Direction.RIGHT : Direction.LEFT);
				
				o.setX(99);
				
				MapShot.this.dispose();
			}
		});
		contentPane.add(btnNewButton_4_2_2_1_1_1_2_1_1);
		
		int x, y, x2, y2;
		if(turn) {
			x = r.getX();
			y = r.getY();
			x2 = r2.getX();
			y2 = r2.getY();
		}
		else {
			x = r2.getX();
			y = r2.getY();
			x2 = r.getX();
			y2 = r.getY();
		}
		
		JLabel lblNewLabel_2 = new JLabel("P1");
		lblNewLabel_2.setForeground(Color.BLUE);
		lblNewLabel_2.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblNewLabel_2.setBounds(x, y, 49, 33);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("P2");
		lblNewLabel_2_1.setForeground(Color.RED);
		lblNewLabel_2_1.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(x2, y2, 49, 33);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("P1:");
		lblNewLabel_3.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(291, 357, 109, 49);
		if(turn) {
			if(r.getX() == ArenaMap.S1X && r.getY() == ArenaMap.S1Y)
				lblNewLabel_3.setText("P1: s1");
			else if(r.getX() == ArenaMap.S2X && r.getY() == ArenaMap.S2Y)
				lblNewLabel_3.setText("P1: s2");
			else if(r.getX() == ArenaMap.S3X && r.getY() == ArenaMap.S3Y)
				lblNewLabel_3.setText("P1: s3");
			else if(r.getX() == ArenaMap.S4X && r.getY() == ArenaMap.S4Y)
				lblNewLabel_3.setText("P1: s4");
			else if(r.getX() == ArenaMap.S5X && r.getY() == ArenaMap.S5Y)
				lblNewLabel_3.setText("P1: s5");
			else if(r.getX() == ArenaMap.S6X && r.getY() == ArenaMap.S6Y)
				lblNewLabel_3.setText("P1: s6");
			else if(r.getX() == ArenaMap.S7X && r.getY() == ArenaMap.S7Y)
				lblNewLabel_3.setText("P1: s7");
			else if(r.getX() == ArenaMap.S8X && r.getY() == ArenaMap.S8Y)
				lblNewLabel_3.setText("P1: s8");
			else if(r.getX() == ArenaMap.S9X && r.getY() == ArenaMap.S9Y)
				lblNewLabel_3.setText("P1: s9");
			else if(r.getX() == ArenaMap.S10X && r.getY() == ArenaMap.S10Y)
				lblNewLabel_3.setText("P1: s10");
			else if(r.getX() == ArenaMap.S11X && r.getY() == ArenaMap.S11Y)
				lblNewLabel_3.setText("P1: s11");
			else if(r.getX() == ArenaMap.S12X && r.getY() == ArenaMap.S12Y)
				lblNewLabel_3.setText("P1: s12");
			else if(r.getX() == ArenaMap.S13X && r.getY() == ArenaMap.S13Y)
				lblNewLabel_3.setText("P1: s13");
			else if(r.getX() == ArenaMap.S14X && r.getY() == ArenaMap.S14Y)
				lblNewLabel_3.setText("P1: s14");
			else if(r.getX() == ArenaMap.S15X && r.getY() == ArenaMap.S15Y)
				lblNewLabel_3.setText("P1: s15");
		}
		else {
			if(r2.getX() == ArenaMap.S1X && r2.getY() == ArenaMap.S1Y)
				lblNewLabel_3.setText("P1: s1");
			else if(r2.getX() == ArenaMap.S2X && r2.getY() == ArenaMap.S2Y)
				lblNewLabel_3.setText("P1: s2");
			else if(r2.getX() == ArenaMap.S3X && r2.getY() == ArenaMap.S3Y)
				lblNewLabel_3.setText("P1: s3");
			else if(r2.getX() == ArenaMap.S4X && r2.getY() == ArenaMap.S4Y)
				lblNewLabel_3.setText("P1: s4");
			else if(r2.getX() == ArenaMap.S5X && r2.getY() == ArenaMap.S5Y)
				lblNewLabel_3.setText("P1: s5");
			else if(r2.getX() == ArenaMap.S6X && r2.getY() == ArenaMap.S6Y)
				lblNewLabel_3.setText("P1: s6");
			else if(r2.getX() == ArenaMap.S7X && r2.getY() == ArenaMap.S7Y)
				lblNewLabel_3.setText("P1: s7");
			else if(r2.getX() == ArenaMap.S8X && r2.getY() == ArenaMap.S8Y)
				lblNewLabel_3.setText("P1: s8");
			else if(r2.getX() == ArenaMap.S9X && r2.getY() == ArenaMap.S9Y)
				lblNewLabel_3.setText("P1: s9");
			else if(r2.getX() == ArenaMap.S10X && r2.getY() == ArenaMap.S10Y)
				lblNewLabel_3.setText("P1: s10");
			else if(r2.getX() == ArenaMap.S11X && r2.getY() == ArenaMap.S11Y)
				lblNewLabel_3.setText("P1: s11");
			else if(r2.getX() == ArenaMap.S12X && r2.getY() == ArenaMap.S12Y)
				lblNewLabel_3.setText("P1: s12");
			else if(r2.getX() == ArenaMap.S13X && r2.getY() == ArenaMap.S13Y)
				lblNewLabel_3.setText("P1: s13");
			else if(r2.getX() == ArenaMap.S14X && r2.getY() == ArenaMap.S14Y)
				lblNewLabel_3.setText("P1: s14");
			else if(r2.getX() == ArenaMap.S15X && r2.getY() == ArenaMap.S15Y)
				lblNewLabel_3.setText("P1: s15");
		}
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("P2:");
		lblNewLabel_3_1.setForeground(Color.WHITE);
		lblNewLabel_3_1.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		if(turn) {
			if(r2.getX() == ArenaMap.S1X && r2.getY() == ArenaMap.S1Y)
				lblNewLabel_3_1.setText("P2: s1");
			else if(r2.getX() == ArenaMap.S2X && r2.getY() == ArenaMap.S2Y)
				lblNewLabel_3_1.setText("P2: s2");
			else if(r2.getX() == ArenaMap.S3X && r2.getY() == ArenaMap.S3Y)
				lblNewLabel_3_1.setText("P2: s3");
			else if(r2.getX() == ArenaMap.S4X && r2.getY() == ArenaMap.S4Y)
				lblNewLabel_3_1.setText("P2: s4");
			else if(r2.getX() == ArenaMap.S5X && r2.getY() == ArenaMap.S5Y)
				lblNewLabel_3_1.setText("P2: s5");
			else if(r2.getX() == ArenaMap.S6X && r2.getY() == ArenaMap.S6Y)
				lblNewLabel_3_1.setText("P2: s6");
			else if(r2.getX() == ArenaMap.S7X && r2.getY() == ArenaMap.S7Y)
				lblNewLabel_3_1.setText("P2: s7");
			else if(r2.getX() == ArenaMap.S8X && r2.getY() == ArenaMap.S8Y)
				lblNewLabel_3_1.setText("P2: s8");
			else if(r2.getX() == ArenaMap.S9X && r2.getY() == ArenaMap.S9Y)
				lblNewLabel_3_1.setText("P2: s9");
			else if(r2.getX() == ArenaMap.S10X && r2.getY() == ArenaMap.S10Y)
				lblNewLabel_3_1.setText("P2: s10");
			else if(r2.getX() == ArenaMap.S11X && r2.getY() == ArenaMap.S11Y)
				lblNewLabel_3_1.setText("P2: s11");
			else if(r2.getX() == ArenaMap.S12X && r2.getY() == ArenaMap.S12Y)
				lblNewLabel_3_1.setText("P2: s12");
			else if(r2.getX() == ArenaMap.S13X && r2.getY() == ArenaMap.S13Y)
				lblNewLabel_3_1.setText("P2: s13");
			else if(r2.getX() == ArenaMap.S14X && r2.getY() == ArenaMap.S14Y)
				lblNewLabel_3_1.setText("P2: s14");
			else if(r2.getX() == ArenaMap.S15X && r2.getY() == ArenaMap.S15Y)
				lblNewLabel_3_1.setText("P2: s15");
		}
		else {
			if(r.getX() == ArenaMap.S1X && r.getY() == ArenaMap.S1Y)
				lblNewLabel_3_1.setText("P2: s1");
			else if(r.getX() == ArenaMap.S2X && r.getY() == ArenaMap.S2Y)
				lblNewLabel_3_1.setText("P2: s2");
			else if(r.getX() == ArenaMap.S3X && r.getY() == ArenaMap.S3Y)
				lblNewLabel_3_1.setText("P2: s3");
			else if(r.getX() == ArenaMap.S4X && r.getY() == ArenaMap.S4Y)
				lblNewLabel_3_1.setText("P2: s4");
			else if(r.getX() == ArenaMap.S5X && r.getY() == ArenaMap.S5Y)
				lblNewLabel_3_1.setText("P2: s5");
			else if(r.getX() == ArenaMap.S6X && r.getY() == ArenaMap.S6Y)
				lblNewLabel_3_1.setText("P2: s6");
			else if(r.getX() == ArenaMap.S7X && r.getY() == ArenaMap.S7Y)
				lblNewLabel_3_1.setText("P2: s7");
			else if(r.getX() == ArenaMap.S8X && r.getY() == ArenaMap.S8Y)
				lblNewLabel_3_1.setText("P2: s8");
			else if(r.getX() == ArenaMap.S9X && r.getY() == ArenaMap.S9Y)
				lblNewLabel_3_1.setText("P2: s9");
			else if(r.getX() == ArenaMap.S10X && r.getY() == ArenaMap.S10Y)
				lblNewLabel_3_1.setText("P2: s10");
			else if(r.getX() == ArenaMap.S11X && r.getY() == ArenaMap.S11Y)
				lblNewLabel_3_1.setText("P2: s11");
			else if(r.getX() == ArenaMap.S12X && r.getY() == ArenaMap.S12Y)
				lblNewLabel_3_1.setText("P2: s12");
			else if(r.getX() == ArenaMap.S13X && r.getY() == ArenaMap.S13Y)
				lblNewLabel_3_1.setText("P2: s13");
			else if(r.getX() == ArenaMap.S14X && r.getY() == ArenaMap.S14Y)
				lblNewLabel_3_1.setText("P2: s14");
			else if(r.getX() == ArenaMap.S15X && r.getY() == ArenaMap.S15Y)
				lblNewLabel_3_1.setText("P2: s15");
		}
		lblNewLabel_3_1.setBounds(484, 357, 109, 49);
		contentPane.add(lblNewLabel_3_1);
		
	}
}
