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

import com.iteso.motor.Direction;
import com.iteso.motor.Weapon;

import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class ActionDirection extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ActionDirection frame = new ActionDirection();
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
	public ActionDirection(RoleColiseo r, RoleColiseo r2, Weapon o, Weapon o2, boolean turn) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		
		JButton btnNewButton = new JButton("DOWN");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBackground(new Color(128, 128, 0));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o.getX() == 1)
					r.attack(r2, o2.getX() == 1? Direction.LEFT : Direction.RIGHT, Direction.DOWN);
				else if(o.getX() == 2)
					r.move(0, ArenaMap.MAP_SPACE_Y, Direction.DOWN);
				
				o.setX(99);
				ActionDirection.this.dispose();
			}
		});
		btnNewButton.setBounds(585, 340, 110, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("DOWN_LEFT");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2.setBackground(new Color(128, 128, 0));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				if(o.getX() == 1)
					r.attack(r2, o2.getX() == 1? Direction.LEFT : Direction.RIGHT, Direction.DOWN_LEFT);
				else if(o.getX() == 2)
					r.move(ArenaMap.MAP_SPACE_X, ArenaMap.MAP_SPACE_Y, Direction.DOWN_LEFT);
				
				o.setX(99);
				ActionDirection.this.dispose();
			}
		});
		btnNewButton_2.setBounds(585, 390, 110, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("UP");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBackground(new Color(128, 128, 0));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(465, 340, 110, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				if(o.getX() == 1)
					r.attack(r2, o2.getX() == 1? Direction.LEFT : Direction.RIGHT, Direction.UP);
				else if(o.getX() == 2)
					r.move(0, ArenaMap.MAP_SPACE_Y, Direction.UP);
				
				o.setX(99);
				ActionDirection.this.dispose();
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("DOWN_RIGHT");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_3.setBackground(new Color(128, 128, 0));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBounds(465, 390, 110, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				if(o.getX() == 1)
					r.attack(r2, o2.getX() == 1? Direction.LEFT : Direction.RIGHT, Direction.DOWN_RIGHT);
				else if(o.getX() == 2)
					r.move(ArenaMap.MAP_SPACE_X, ArenaMap.MAP_SPACE_Y, Direction.DOWN_RIGHT);
				
				o.setX(99);
				ActionDirection.this.dispose();
			}
		});
		contentPane.add(btnNewButton_3);
		
		if(turn) {
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(Battle.class.getResource("/proyecto/images/p1_im.png")));
			lblNewLabel_1.setBounds(25, 320, 219, 118);
			contentPane.add(lblNewLabel_1);
		}
		else {
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(Battle.class.getResource("/proyecto/images/p2.png")));
			lblNewLabel_1.setBounds(25, 320, 219, 118);
			contentPane.add(lblNewLabel_1);
		}
		
		JButton btnNewButton_1_1 = new JButton("RIGHT");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setBackground(new Color(128, 128, 0));
		btnNewButton_1_1.setBounds(225, 340, 110, 23);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				if(o.getX() == 1)
					r.attack(r2, o2.getX() == 1? Direction.LEFT : Direction.RIGHT, Direction.RIGHT);
				else if(o.getX() == 2)
					r.move(ArenaMap.MAP_SPACE_X, 0, Direction.RIGHT);
				
				o.setX(99);
				ActionDirection.this.dispose();
			}
		});
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_3_1 = new JButton("UP_RIGHT");
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_3_1.setForeground(Color.WHITE);
		btnNewButton_3_1.setBackground(new Color(128, 128, 0));
		btnNewButton_3_1.setBounds(225, 390, 110, 23);
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				if(o.getX() == 1)
					r.attack(r2, o2.getX() == 1? Direction.LEFT : Direction.RIGHT, Direction.UP_RIGHT);
				else if(o.getX() == 2)
					r.move(ArenaMap.MAP_SPACE_X, ArenaMap.MAP_SPACE_Y, Direction.UP_RIGHT);
				
				o.setX(99);
				ActionDirection.this.dispose();
			}
		});
		contentPane.add(btnNewButton_3_1);
		
		JButton btnLeft = new JButton("LEFT");
		btnLeft.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLeft.setForeground(Color.WHITE);
		btnLeft.setBackground(new Color(128, 128, 0));
		btnLeft.setBounds(345, 340, 110, 23);
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				if(o.getX() == 1)
					r.attack(r2, o2.getX() == 1? Direction.LEFT : Direction.RIGHT, Direction.LEFT);
				else if(o.getX() == 2)
					r.move(ArenaMap.MAP_SPACE_X, 0, Direction.LEFT);
				
				o.setX(99);
				ActionDirection.this.dispose();
			}
		});
		contentPane.add(btnLeft);
		
		JButton btnNewButton_2_1 = new JButton("UP_LEFT");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_2_1.setForeground(Color.WHITE);
		btnNewButton_2_1.setBackground(new Color(128, 128, 0));
		btnNewButton_2_1.setBounds(345, 390, 110, 23);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				if(o.getX() == 1)
					r.attack(r2, o2.getX() == 1? Direction.LEFT : Direction.RIGHT, Direction.UP_LEFT);
				else if(o.getX() == 2)
					r.move(ArenaMap.MAP_SPACE_X, ArenaMap.MAP_SPACE_Y, Direction.UP_LEFT);
				
				o.setX(99);
				ActionDirection.this.dispose();
			}
		});
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_4 = new JButton("s1");
		btnNewButton_4.setBackground(new Color(201, 164, 97));
		btnNewButton_4.setBounds(0, 204, 140, 35);
		btnNewButton_4.setEnabled(true);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("s2");
		btnNewButton_4_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_1.setBounds(0, 239, 140, 35);
		btnNewButton_4_1.setEnabled(true);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_1_1 = new JButton("s3");
		btnNewButton_4_1_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_1_1.setBounds(0, 274, 140, 35);
		btnNewButton_4_1_1.setEnabled(true);
		contentPane.add(btnNewButton_4_1_1);
		
		JButton btnNewButton_4_2 = new JButton("s4");
		btnNewButton_4_2.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2.setBounds(140, 204, 140, 35);
		btnNewButton_4_2.setEnabled(true);
		contentPane.add(btnNewButton_4_2);
		
		JButton btnNewButton_4_2_1 = new JButton("s5");
		btnNewButton_4_2_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_1.setBounds(140, 239, 140, 35);
		btnNewButton_4_2_1.setEnabled(true);
		contentPane.add(btnNewButton_4_2_1);
		
		JButton btnNewButton_4_2_1_1 = new JButton("s6");
		btnNewButton_4_2_1_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_1_1.setBounds(140, 274, 140, 35);
		btnNewButton_4_2_1_1.setEnabled(true);
		contentPane.add(btnNewButton_4_2_1_1);
		
		JButton btnNewButton_4_2_2 = new JButton("s7");
		btnNewButton_4_2_2.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_2.setBounds(280, 204, 140, 35);
		contentPane.add(btnNewButton_4_2_2);
		
		JButton btnNewButton_4_2_2_1 = new JButton("s8");
		btnNewButton_4_2_2_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_2_1.setBounds(280, 239, 140, 35);
		btnNewButton_4_2_2_1.setEnabled(true);
		contentPane.add(btnNewButton_4_2_2_1);
		
		JButton btnNewButton_4_2_2_1_1 = new JButton("s9");
		btnNewButton_4_2_2_1_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_2_1_1.setBounds(280, 274, 140, 35);
		btnNewButton_4_2_2_1_1.setEnabled(true);
		contentPane.add(btnNewButton_4_2_2_1_1);
		
		JButton btnNewButton_4_2_2_1_1_1 = new JButton("s10");
		btnNewButton_4_2_2_1_1_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_2_1_1_1.setBounds(420, 204, 140, 35);
		btnNewButton_4_2_2_1_1_1.setEnabled(true);
		contentPane.add(btnNewButton_4_2_2_1_1_1);
		
		JButton btnNewButton_4_2_2_1_1_1_1 = new JButton("s11");
		btnNewButton_4_2_2_1_1_1_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_2_1_1_1_1.setBounds(420, 239, 140, 35);
		contentPane.add(btnNewButton_4_2_2_1_1_1_1);
		
		JButton btnNewButton_4_2_2_1_1_1_1_1 = new JButton("s12");
		btnNewButton_4_2_2_1_1_1_1_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_2_1_1_1_1_1.setBounds(420, 274, 140, 35);
		contentPane.add(btnNewButton_4_2_2_1_1_1_1_1);
		
		JButton btnNewButton_4_2_2_1_1_1_2_1_1 = new JButton("s15");
		btnNewButton_4_2_2_1_1_1_2_1_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_2_1_1_1_2_1_1.setBounds(560, 274, 140, 35);
		btnNewButton_4_2_2_1_1_1_2_1_1.setEnabled(true);
		contentPane.add(btnNewButton_4_2_2_1_1_1_2_1_1);
		
		JButton btnNewButton_4_2_2_1_1_1_2_1 = new JButton("s14");
		btnNewButton_4_2_2_1_1_1_2_1.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_2_1_1_1_2_1.setBounds(560, 239, 140, 35);
		btnNewButton_4_2_2_1_1_1_2_1.setEnabled(true);
		contentPane.add(btnNewButton_4_2_2_1_1_1_2_1);
		
		JButton btnNewButton_4_2_2_1_1_1_2 = new JButton("s13");
		btnNewButton_4_2_2_1_1_1_2.setBackground(new Color(201, 164, 97));
		btnNewButton_4_2_2_1_1_1_2.setBounds(560, 204, 140, 35);
		btnNewButton_4_2_2_1_1_1_2.setEnabled(true);
		contentPane.add(btnNewButton_4_2_2_1_1_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("P1:");
		lblNewLabel_2.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		lblNewLabel_2.setForeground(Color.WHITE);
		if(turn) {
			if(r.getX() == ArenaMap.S1X && r.getY() == ArenaMap.S1Y)
				lblNewLabel_2.setText("P1: s1");
			else if(r.getX() == ArenaMap.S2X && r.getY() == ArenaMap.S2Y)
				lblNewLabel_2.setText("P1: s2");
			else if(r.getX() == ArenaMap.S3X && r.getY() == ArenaMap.S3Y)
				lblNewLabel_2.setText("P1: s3");
			else if(r.getX() == ArenaMap.S4X && r.getY() == ArenaMap.S4Y)
				lblNewLabel_2.setText("P1: s4");
			else if(r.getX() == ArenaMap.S5X && r.getY() == ArenaMap.S5Y)
				lblNewLabel_2.setText("P1: s5");
			else if(r.getX() == ArenaMap.S6X && r.getY() == ArenaMap.S6Y)
				lblNewLabel_2.setText("P1: s6");
			else if(r.getX() == ArenaMap.S7X && r.getY() == ArenaMap.S7Y)
				lblNewLabel_2.setText("P1: s7");
			else if(r.getX() == ArenaMap.S8X && r.getY() == ArenaMap.S8Y)
				lblNewLabel_2.setText("P1: s8");
			else if(r.getX() == ArenaMap.S9X && r.getY() == ArenaMap.S9Y)
				lblNewLabel_2.setText("P1: s9");
			else if(r.getX() == ArenaMap.S10X && r.getY() == ArenaMap.S10Y)
				lblNewLabel_2.setText("P1: s10");
			else if(r.getX() == ArenaMap.S11X && r.getY() == ArenaMap.S11Y)
				lblNewLabel_2.setText("P1: s11");
			else if(r.getX() == ArenaMap.S12X && r.getY() == ArenaMap.S12Y)
				lblNewLabel_2.setText("P1: s12");
			else if(r.getX() == ArenaMap.S13X && r.getY() == ArenaMap.S13Y)
				lblNewLabel_2.setText("P1: s13");
			else if(r.getX() == ArenaMap.S14X && r.getY() == ArenaMap.S14Y)
				lblNewLabel_2.setText("P1: s14");
			else if(r.getX() == ArenaMap.S15X && r.getY() == ArenaMap.S15Y)
				lblNewLabel_2.setText("P1: s15");
		}
		else {
			if(r2.getX() == ArenaMap.S1X && r2.getY() == ArenaMap.S1Y)
				lblNewLabel_2.setText("P1: s1");
			else if(r2.getX() == ArenaMap.S2X && r2.getY() == ArenaMap.S2Y)
				lblNewLabel_2.setText("P1: s2");
			else if(r2.getX() == ArenaMap.S3X && r2.getY() == ArenaMap.S3Y)
				lblNewLabel_2.setText("P1: s3");
			else if(r2.getX() == ArenaMap.S4X && r2.getY() == ArenaMap.S4Y)
				lblNewLabel_2.setText("P1: s4");
			else if(r2.getX() == ArenaMap.S5X && r2.getY() == ArenaMap.S5Y)
				lblNewLabel_2.setText("P1: s5");
			else if(r2.getX() == ArenaMap.S6X && r2.getY() == ArenaMap.S6Y)
				lblNewLabel_2.setText("P1: s6");
			else if(r2.getX() == ArenaMap.S7X && r2.getY() == ArenaMap.S7Y)
				lblNewLabel_2.setText("P1: s7");
			else if(r2.getX() == ArenaMap.S8X && r2.getY() == ArenaMap.S8Y)
				lblNewLabel_2.setText("P1: s8");
			else if(r2.getX() == ArenaMap.S9X && r2.getY() == ArenaMap.S9Y)
				lblNewLabel_2.setText("P1: s9");
			else if(r2.getX() == ArenaMap.S10X && r2.getY() == ArenaMap.S10Y)
				lblNewLabel_2.setText("P1: s10");
			else if(r2.getX() == ArenaMap.S11X && r2.getY() == ArenaMap.S11Y)
				lblNewLabel_2.setText("P1: s11");
			else if(r2.getX() == ArenaMap.S12X && r2.getY() == ArenaMap.S12Y)
				lblNewLabel_2.setText("P1: s12");
			else if(r2.getX() == ArenaMap.S13X && r2.getY() == ArenaMap.S13Y)
				lblNewLabel_2.setText("P1: s13");
			else if(r2.getX() == ArenaMap.S14X && r2.getY() == ArenaMap.S14Y)
				lblNewLabel_2.setText("P1: s14");
			else if(r2.getX() == ArenaMap.S15X && r2.getY() == ArenaMap.S15Y)
				lblNewLabel_2.setText("P1: s15");
		}
		
		lblNewLabel_2.setBounds(235, 424, 86, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("P2:");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Yu Gothic", Font.BOLD, 15));
		if(turn) {
			if(r2.getX() == ArenaMap.S1X && r2.getY() == ArenaMap.S1Y)
				lblNewLabel_2_1.setText("P2: s1");
			else if(r2.getX() == ArenaMap.S2X && r2.getY() == ArenaMap.S2Y)
				lblNewLabel_2_1.setText("P2: s2");
			else if(r2.getX() == ArenaMap.S3X && r2.getY() == ArenaMap.S3Y)
				lblNewLabel_2_1.setText("P2: s3");
			else if(r2.getX() == ArenaMap.S4X && r2.getY() == ArenaMap.S4Y)
				lblNewLabel_2_1.setText("P2: s4");
			else if(r2.getX() == ArenaMap.S5X && r2.getY() == ArenaMap.S5Y)
				lblNewLabel_2_1.setText("P2: s5");
			else if(r2.getX() == ArenaMap.S6X && r2.getY() == ArenaMap.S6Y)
				lblNewLabel_2_1.setText("P2: s6");
			else if(r2.getX() == ArenaMap.S7X && r2.getY() == ArenaMap.S7Y)
				lblNewLabel_2_1.setText("P2: s7");
			else if(r2.getX() == ArenaMap.S8X && r2.getY() == ArenaMap.S8Y)
				lblNewLabel_2_1.setText("P2: s8");
			else if(r2.getX() == ArenaMap.S9X && r2.getY() == ArenaMap.S9Y)
				lblNewLabel_2_1.setText("P2: s9");
			else if(r2.getX() == ArenaMap.S10X && r2.getY() == ArenaMap.S10Y)
				lblNewLabel_2_1.setText("P2: s10");
			else if(r2.getX() == ArenaMap.S11X && r2.getY() == ArenaMap.S11Y)
				lblNewLabel_2_1.setText("P2: s11");
			else if(r2.getX() == ArenaMap.S12X && r2.getY() == ArenaMap.S12Y)
				lblNewLabel_2_1.setText("P2: s12");
			else if(r2.getX() == ArenaMap.S13X && r2.getY() == ArenaMap.S13Y)
				lblNewLabel_2_1.setText("P2: s13");
			else if(r2.getX() == ArenaMap.S14X && r2.getY() == ArenaMap.S14Y)
				lblNewLabel_2_1.setText("P2: s14");
			else if(r2.getX() == ArenaMap.S15X && r2.getY() == ArenaMap.S15Y)
				lblNewLabel_2_1.setText("P2: s15");
		}
		else {
			if(r.getX() == ArenaMap.S1X && r.getY() == ArenaMap.S1Y)
				lblNewLabel_2_1.setText("P2: s1");
			else if(r.getX() == ArenaMap.S2X && r.getY() == ArenaMap.S2Y)
				lblNewLabel_2_1.setText("P2: s2");
			else if(r.getX() == ArenaMap.S3X && r.getY() == ArenaMap.S3Y)
				lblNewLabel_2_1.setText("P2: s3");
			else if(r.getX() == ArenaMap.S4X && r.getY() == ArenaMap.S4Y)
				lblNewLabel_2_1.setText("P2: s4");
			else if(r.getX() == ArenaMap.S5X && r.getY() == ArenaMap.S5Y)
				lblNewLabel_2_1.setText("P2: s5");
			else if(r.getX() == ArenaMap.S6X && r.getY() == ArenaMap.S6Y)
				lblNewLabel_2_1.setText("P2: s6");
			else if(r.getX() == ArenaMap.S7X && r.getY() == ArenaMap.S7Y)
				lblNewLabel_2_1.setText("P2: s7");
			else if(r.getX() == ArenaMap.S8X && r.getY() == ArenaMap.S8Y)
				lblNewLabel_2_1.setText("P2: s8");
			else if(r.getX() == ArenaMap.S9X && r.getY() == ArenaMap.S9Y)
				lblNewLabel_2_1.setText("P2: s9");
			else if(r.getX() == ArenaMap.S10X && r.getY() == ArenaMap.S10Y)
				lblNewLabel_2_1.setText("P2: s10");
			else if(r.getX() == ArenaMap.S11X && r.getY() == ArenaMap.S11Y)
				lblNewLabel_2_1.setText("P2: s11");
			else if(r.getX() == ArenaMap.S12X && r.getY() == ArenaMap.S12Y)
				lblNewLabel_2_1.setText("P2: s12");
			else if(r.getX() == ArenaMap.S13X && r.getY() == ArenaMap.S13Y)
				lblNewLabel_2_1.setText("P2: s13");
			else if(r.getX() == ArenaMap.S14X && r.getY() == ArenaMap.S14Y)
				lblNewLabel_2_1.setText("P2: s14");
			else if(r.getX() == ArenaMap.S15X && r.getY() == ArenaMap.S15Y)
				lblNewLabel_2_1.setText("P2: s15");
		}
		lblNewLabel_2_1.setBounds(397, 424, 86, 28);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setIcon(new ImageIcon(Battle.class.getResource("/proyecto/images/bc2.png")));
		lblNewLabel.setBounds(0, 0, 700, 310);
		contentPane.add(lblNewLabel);
	}
}
