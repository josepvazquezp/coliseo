package testInterfaz;
import javax.swing.*;
import java.awt.*;

public class interfaz_grafica extends JFrame{
		private JLabel tanque;
		private JLabel standard;
		private JLabel asesino;
		private JLabel title;
		private JLabel fondo;
		private JButton tanque_im;
		private JButton standard_im;
		private JButton asesino_im;
		public interfaz_grafica() {
			super("Selection");
			
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
			
			fondo = new JLabel(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\fondoB.png"));
			tanque_im = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\tanque_c.png"));
			standard_im = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\standard_c.png"));
			asesino_im = new JButton(new ImageIcon("C:\\Users\\gerog\\eclipse-workspace\\Prueba\\src\\coliseo\\images\\asesino_c.png"));
			
			setLayout(null);
			
			tanque_im.setBounds(100, 150, 110, 200); add(tanque_im);
			standard_im.setBounds(295, 150, 110, 200); add(standard_im);
			asesino_im.setBounds(490, 150, 110, 200); add(asesino_im);
			
			title.setBounds(250, 20, 250, 100); add(title);
			
			standard_im.setBackground(Color.black);
			tanque_im.setBackground(Color.black);
			asesino_im.setBackground(Color.black);
			
			tanque.setBounds(135, 350, 100, 50); add(tanque); 
			standard.setBounds(320, 350, 100, 50); add(standard); 
			asesino.setBounds(520, 350, 100, 50); add(asesino);
			
			fondo.setBounds(0, 0, 700, 500); add(fondo);
			
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaz_grafica ventana = new interfaz_grafica() ;
		ventana.setBounds(0, 0, 700, 500);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		
	}

}
