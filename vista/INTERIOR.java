package vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class INTERIOR extends JFrame {

	private JPanel contentPane;

	public INTERIOR() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 538);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Men\u00FA");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Regresar");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				VENTA vent = new VENTA();
				vent.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon("C:\\Users\\erick\\eclipse-workspace\\A_Venta_de_Autos\\src\\extras\\bmw\\1 BMW I4\\INTERIOR\\tablero de consolas.JPEG"));
		lblNewLabel_1_3.setBackground(Color.GRAY);
		lblNewLabel_1_3.setBounds(127, 295, 212, 145);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\erick\\eclipse-workspace\\A_Venta_de_Autos\\src\\extras\\bmw\\1 BMW I4\\INTERIOR\\cajuela.JPEG"));
		lblNewLabel_1_2.setBackground(Color.GRAY);
		lblNewLabel_1_2.setBounds(505, 73, 212, 145);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\erick\\eclipse-workspace\\A_Venta_de_Autos\\src\\extras\\bmw\\1 BMW I4\\INTERIOR\\botones de puerta.JPEG"));
		lblNewLabel_1_1.setBackground(Color.GRAY);
		lblNewLabel_1_1.setBounds(263, 73, 212, 145);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_4 = new JLabel("");
		lblNewLabel_1_4.setIcon(new ImageIcon("C:\\Users\\erick\\eclipse-workspace\\A_Venta_de_Autos\\src\\extras\\bmw\\1 BMW I4\\INTERIOR\\tablero de kilometraje.JPEG"));
		lblNewLabel_1_4.setBackground(Color.GRAY);
		lblNewLabel_1_4.setBounds(391, 295, 212, 145);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\erick\\eclipse-workspace\\A_Venta_de_Autos\\src\\extras\\bmw\\1 BMW I4\\INTERIOR\\asientos traceros.JPEG"));
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setBounds(20, 73, 212, 145);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("INTERIOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(10, 32, 181, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("ACCESORIO 1");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		lblNewLabel_2.setBounds(20, 230, 121, 22);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("ACCESORIO 1");
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		lblNewLabel_2_1.setBounds(263, 229, 121, 22);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("ACCESORIO 1");
		lblNewLabel_2_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		lblNewLabel_2_2.setBounds(504, 229, 121, 22);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("ACCESORIO 1");
		lblNewLabel_2_3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		lblNewLabel_2_3.setBounds(127, 451, 121, 22);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("ACCESORIO 1");
		lblNewLabel_2_4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 19));
		lblNewLabel_2_4.setBounds(391, 451, 121, 22);
		contentPane.add(lblNewLabel_2_4);
	}

}
