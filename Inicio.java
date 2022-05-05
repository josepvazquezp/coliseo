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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Inicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Inicio.class.getResource("/proyecto/images/coliseo.png")));
		lblNewLabel.setBounds(211, 130, 178, 115);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Clic START to continue");
		lblNewLabel_2.setForeground(Color.YELLOW);
		lblNewLabel_2.setFont(new Font("Malgun Gothic", Font.BOLD, 17));
		lblNewLabel_2.setBounds(211, 314, 203, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Coliseo");
		lblNewLabel_1_1.setForeground(new Color(238, 232, 170));
		lblNewLabel_1_1.setFont(new Font("Yu Gothic", Font.BOLD, 40));
		lblNewLabel_1_1.setBounds(229, 31, 203, 75);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Coliseo");
		lblNewLabel_1.setForeground(new Color(238, 232, 170));
		lblNewLabel_1.setFont(new Font("Yu Gothic", Font.BOLD, 40));
		lblNewLabel_1.setBounds(229, 31, 203, 75);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Todo lo que quiero que se haga cuando se de clic al boton
				Ventana3 newframe = new Ventana3();
				
				newframe.setVisible(true);
				
				Inicio.this.dispose();
			}
		});
		btnNewButton.setBounds(240, 350, 120, 30);
		contentPane.add(btnNewButton);
	}

}
