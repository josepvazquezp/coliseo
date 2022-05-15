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

public class ChooseCharacter extends JFrame {
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ChooseCharacter frame = new ChooseCharacter();
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
	public ChooseCharacter(RoleColiseo r) {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		JLabel tanque;
		JLabel standard;
		JLabel asesino;
		JLabel title;
		JLabel fondo;
		JButton tanque_im;
		JButton standard_im;
		JButton asesino_im;
			
		title = new JLabel("Choose your role");
		tanque = new JLabel("Tank");
		standard = new JLabel("Knight");
		asesino = new JLabel("Ninja");
		
		title.setForeground(new Color(248,243,43));
		title.setFont(new Font("Yu Gothic", Font.BOLD, 24));
		tanque.setForeground(new Color(248,243,43));
		
		tanque.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		standard.setForeground(new Color(248,243,43));
		standard.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		asesino.setForeground(new Color(248,243,43));
		asesino.setFont(new Font("Yu Gothic", Font.BOLD, 18));
		
		fondo = new JLabel(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/fondoB.png")));
		tanque_im = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/tanque_c.png")));
		tanque_im.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				
				RoleColiseo temp = Roles.TANK.getRole();
				r.setHp(temp.getHp());
				r.setBaseSpeed(temp.getBaseSpeed());
				r.setLong(temp.getLong());
				r.setHeight(temp.getHeight());
				
				ChooseCharacter.this.dispose();
			}
		});
		
		standard_im = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/standard_c.png")));
		standard_im.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				
				RoleColiseo temp = Roles.STANDAR.getRole();
				r.setHp(temp.getHp());
				r.setBaseSpeed(temp.getBaseSpeed());
				r.setLong(temp.getLong());
				r.setHeight(temp.getHeight());
				
				ChooseCharacter.this.dispose();
			}
		});
		asesino_im = new JButton(new ImageIcon(ChooseCharacter.class.getResource("/proyecto/images/asesino_c.png")));
		asesino_im.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				
				RoleColiseo temp = Roles.ASSESSIN.getRole();
				r.setHp(temp.getHp());
				r.setBaseSpeed(temp.getBaseSpeed());
				r.setLong(temp.getLong());
				r.setHeight(temp.getHeight());
				
				ChooseCharacter.this.dispose();
			}
		});
		
		getContentPane().setLayout(null);
		
		tanque_im.setBounds(100, 150, 110, 200); getContentPane().add(tanque_im);
		standard_im.setBounds(295, 150, 110, 200); getContentPane().add(standard_im);
		asesino_im.setBounds(490, 150, 110, 200); getContentPane().add(asesino_im);
		
		title.setBounds(250, 20, 250, 100); getContentPane().add(title);
		
		standard_im.setBackground(Color.black);
		tanque_im.setBackground(Color.black);
		asesino_im.setBackground(Color.black);
		
		tanque.setBounds(135, 350, 100, 50); getContentPane().add(tanque); 
		standard.setBounds(320, 350, 100, 50); getContentPane().add(standard); 
		asesino.setBounds(520, 350, 100, 50); getContentPane().add(asesino);
		
		fondo.setBounds(0, 0, 700, 500); getContentPane().add(fondo);
	}

}
