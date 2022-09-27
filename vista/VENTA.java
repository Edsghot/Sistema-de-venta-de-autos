
package vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VENTA extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	
	
	public VENTA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 915, 611);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Men\u00FA");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Regresar");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Salir");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnNewMenu_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("");
		buttonGroup.add(chckbxNewCheckBox_3);
		chckbxNewCheckBox_3.setBackground(Color.BLUE);
		chckbxNewCheckBox_3.setBounds(298, 469, 47, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("");
		buttonGroup.add(chckbxNewCheckBox_4);
		chckbxNewCheckBox_4.setBackground(Color.WHITE);
		chckbxNewCheckBox_4.setBounds(224, 469, 47, 23);
		contentPane.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
		buttonGroup.add(chckbxNewCheckBox_2);
		chckbxNewCheckBox_2.setBackground(Color.BLACK);
		chckbxNewCheckBox_2.setBounds(154, 469, 46, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_4 = new JLabel("Color");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(19, 442, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		buttonGroup.add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.setBackground(Color.GREEN);
		chckbxNewCheckBox_1.setBounds(82, 469, 47, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		buttonGroup.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setBackground(Color.RED);
		chckbxNewCheckBox.setBounds(18, 469, 47, 23);
		contentPane.add(chckbxNewCheckBox);

		
		
		JLabel lblNewLabel_3 = new JLabel("TOYOTA");
		lblNewLabel_3.setForeground(Color.DARK_GRAY);
		lblNewLabel_3.setFont(new Font("Bauhaus 93", Font.BOLD, 30));
		lblNewLabel_3.setBounds(20, 66, 129, 44);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_2 = new JButton("COMPRAR!");
		btnNewButton_2.setIcon(new ImageIcon(VENTA.class.getResource("/img/LogoFacturacion.png")));
		btnNewButton_2.setBounds(408, 503, 165, 39);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("$/.");
		textField.setBounds(770, 25, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "CONFIGURACION", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(408, 56, 462, 436);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(14, 295, 442, 2);
		panel.add(separator_1);
		
		JLabel lblNewLabel_5 = new JLabel("Informacion General");
		lblNewLabel_5.setBounds(10, 274, 133, 23);
		panel.add(lblNewLabel_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Aire acondicionado");
		chckbxNewCheckBox_6.setBounds(10, 312, 152, 23);
		panel.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_6_1 = new JCheckBox("Bluetooth");
		chckbxNewCheckBox_6_1.setBounds(10, 338, 152, 23);
		panel.add(chckbxNewCheckBox_6_1);
		
		JCheckBox chckbxNewCheckBox_6_2 = new JCheckBox("Reproductor MP3");
		chckbxNewCheckBox_6_2.setBounds(10, 369, 152, 23);
		panel.add(chckbxNewCheckBox_6_2);
		
		JCheckBox chckbxNewCheckBox_6_3 = new JCheckBox("Entrada USB");
		chckbxNewCheckBox_6_3.setBounds(10, 395, 152, 23);
		panel.add(chckbxNewCheckBox_6_3);
		
		JCheckBox chckbxNewCheckBox_6_4 = new JCheckBox("Frenos ABS");
		chckbxNewCheckBox_6_4.setBounds(263, 312, 152, 23);
		panel.add(chckbxNewCheckBox_6_4);
		
		JCheckBox chckbxNewCheckBox_6_1_1 = new JCheckBox("AM/FM");
		chckbxNewCheckBox_6_1_1.setBounds(263, 338, 152, 23);
		panel.add(chckbxNewCheckBox_6_1_1);
		
		JCheckBox chckbxNewCheckBox_6_2_1 = new JCheckBox("Airbag conductor");
		chckbxNewCheckBox_6_2_1.setBounds(263, 369, 152, 23);
		panel.add(chckbxNewCheckBox_6_2_1);
		
		JCheckBox chckbxNewCheckBox_6_2_1_1 = new JCheckBox("Airbag conductor y pasajero");
		chckbxNewCheckBox_6_2_1_1.setBounds(263, 395, 174, 23);
		panel.add(chckbxNewCheckBox_6_2_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "EXTERIOR", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 25, 199, 213);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbxAro = new JCheckBox("Aro");
		chckbxAro.setBounds(6, 21, 97, 23);
		panel_1.add(chckbxAro);
		
		JCheckBox chckbxFarosDelanteras = new JCheckBox("faros delanteras");
		chckbxFarosDelanteras.setBounds(6, 53, 120, 23);
		panel_1.add(chckbxFarosDelanteras);
		
		JCheckBox chckbxFrontis = new JCheckBox("frontis");
		chckbxFrontis.setBounds(6, 94, 97, 23);
		panel_1.add(chckbxFrontis);
		
		JCheckBox chckbxLaterales = new JCheckBox("laterales");
		chckbxLaterales.setBounds(6, 132, 97, 23);
		panel_1.add(chckbxLaterales);
		
		JCheckBox chckbxPuertasLateras = new JCheckBox("Puertas lateras");
		chckbxPuertasLateras.setBounds(6, 169, 120, 23);
		panel_1.add(chckbxPuertasLateras);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "INTERIOR", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1_1.setBounds(234, 25, 199, 213);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JCheckBox chckbxTimon = new JCheckBox("timon");
		chckbxTimon.setBounds(6, 169, 97, 23);
		panel_1_1.add(chckbxTimon);
		
		JCheckBox chckbxTableroDeKilometros = new JCheckBox("tablero de kilometros ");
		chckbxTableroDeKilometros.setBounds(6, 132, 133, 23);
		panel_1_1.add(chckbxTableroDeKilometros);
		
		JCheckBox chckbxTableroDeConsolas = new JCheckBox("tablero de consolas");
		chckbxTableroDeConsolas.setBounds(6, 94, 133, 23);
		panel_1_1.add(chckbxTableroDeConsolas);
		
		JCheckBox chckbxSistemaDeControl = new JCheckBox("sistema de control");
		chckbxSistemaDeControl.setBounds(6, 53, 133, 23);
		panel_1_1.add(chckbxSistemaDeControl);
		
		JCheckBox chckbxAsientosDelanteras = new JCheckBox("Asientos delanteras");
		chckbxAsientosDelanteras.setBounds(6, 21, 133, 23);
		panel_1_1.add(chckbxAsientosDelanteras);
		
		JButton btnNewButton_3 = new JButton("Galeria");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							EXTERIOR frame = new EXTERIOR();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_3.setBounds(131, 249, 78, 23);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("Galeria");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							INTERIOR frame = new INTERIOR();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		btnNewButton_3_1.setBounds(349, 249, 78, 23);
		panel.add(btnNewButton_3_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(VENTA.class.getResource("/img/IconoVolver - copia.png")));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 65));
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setBounds(173, 379, 47, 31);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(VENTA.class.getResource("/img/IconoVolver.png")));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 65));
		btnNewButton.setBounds(102, 379, 47, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(10, 108, 388, 311);
		lblNewLabel_2.setIcon(new ImageIcon(VENTA.class.getResource("/img/BMW-Wallpapers-5.jpg")));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("VENTA AUTOS");
		lblNewLabel.setBounds(10, 11, 474, 63);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 43));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 911, 561);
		lblNewLabel_1.setIcon(new ImageIcon(VENTA.class.getResource("/img/FF.jpg")));
		contentPane.add(lblNewLabel_1);
	}
}
