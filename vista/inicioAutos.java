package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import clases.*
;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;public class inicioAutos extends JFrame {

    

    /**
     * Creates new form inicioAutos
     */
    public inicioAutos() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton1.addMouseListener(new MouseAdapter() {
        	
        	public void mouseExited(MouseEvent e) {
        		jButton1.setBackground(Color.WHITE);
        		
        	}
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		jButton1.setBackground(Color.GREEN);
        	}
        });
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		new nimbus_linux();
        		java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new seleccionAutosBmw().setVisible(true);
                    }
                });
        	}
        });
        jButton2 = new javax.swing.JButton();
        jButton2.addMouseListener(new MouseAdapter() {
        	public void mouseExited(MouseEvent e) {
        		jButton2.setBackground(Color.WHITE);
        	}
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		
        		jButton2.setBackground(Color.GREEN);
        	}
        });
        jButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		nimbus_linux s = new nimbus_linux();
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new seleccionAutosLamb().setVisible(true);
                    }
                });
        	}
        });
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu1.setBackground(Color.RED);
        jMenu1.addMouseListener(new MouseAdapter() {
        	
        });
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem2.setBackground(Color.DARK_GRAY);
        jMenuItem2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		System.exit(WIDTH);
        	}
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		jMenuItem2.setBackground(Color.darkGray);
        	}
        });
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jButton1.setText("BMW");

        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jButton2.setText("LAMBHOGINI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(288)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
        			.addGap(52)
        			.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(407, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        jMenu1.setText("Men�");
        jMenu1.setActionCommand("Men ");

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Configuraci�n");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);
        
        JLabel lblAuto = new JLabel("New label");
        lblAuto.setIcon(new ImageIcon("src\\extras\\auto.gif"));
  
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 1015, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(lblAuto, GroupLayout.PREFERRED_SIZE, 1005, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(lblAuto, GroupLayout.PREFERRED_SIZE, 545, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(21, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    	System.exit(WIDTH);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    regulador regu = new regulador();
}