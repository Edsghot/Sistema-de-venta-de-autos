package clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class regulador extends JFrame {

	private JPanel contentPane;

	
	public void Getregulador(JLabel lblFondo,String direccion) {
		
		ImageIcon imagenes = new ImageIcon(direccion);
		Icon icono  = new ImageIcon(imagenes.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
		lblFondo.setIcon(icono);
		this.repaint();
		
	}
	public void Getregulador2(JButton lblFondo,String direccion) {
		
		ImageIcon imagenes = new ImageIcon(direccion);
		Icon icono  = new ImageIcon(imagenes.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
		lblFondo.setIcon(icono);
		this.repaint();
		
	}
}
