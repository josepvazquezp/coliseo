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
	public ActionDirection(RoleColiseo r, RoleColiseo r2, Weapon o, Weapon o2) {
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setIcon(new ImageIcon(Battle.class.getResource("/proyecto/images/bc2.png")));
		lblNewLabel.setBounds(0, 0, 700, 310);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Battle.class.getResource("/proyecto/images/p1_im.png")));
		lblNewLabel_1.setBounds(25, 320, 219, 118);
		contentPane.add(lblNewLabel_1);
		
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
	}
}
