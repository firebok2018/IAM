package multiservicios;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class combustibles extends JDialog implements ActionListener, ItemListener {
	private JTextField txtPrecio;
	private JTextField txtGalones;
	private JButton btnVender;
	private JComboBox comboBox;
	private JTextField txtSoles;
	
	public double precio;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			combustibles dialog = new combustibles();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public combustibles() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(combustibles.class.getResource("/fds/estacion.jpg")));
		setTitle("Combustibles");
		setBounds(100, 100, 496, 326);
		getContentPane().setLayout(null);
		{
			JLabel lblTipoDeCombustible = new JLabel("Tipo de Combustible:");
			lblTipoDeCombustible.setBounds(20, 73, 149, 30);
			getContentPane().add(lblTipoDeCombustible);
		}
		
		comboBox = new JComboBox();
		comboBox.setBounds(148, 78, 133, 20);
		comboBox.addItemListener(this);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"--Seleccionar--", "Gasohol 90", "Gasohol 95", "Diesel"}));
		getContentPane().add(comboBox);
		
		JLabel lblSoles = new JLabel("precio:");
		lblSoles.setBounds(20, 114, 86, 14);
		getContentPane().add(lblSoles);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(148, 111, 86, 20);
		txtPrecio.setEnabled(false);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblGalones = new JLabel("Galones:");
		lblGalones.setBounds(20, 48, 73, 14);
		getContentPane().add(lblGalones);
		
		txtGalones = new JTextField();
		txtGalones.setBounds(148, 45, 86, 20);
		getContentPane().add(txtGalones);
		txtGalones.setColumns(10);
		
		btnVender = new JButton("Vender");
		btnVender.setBounds(280, 205, 111, 30);
		btnVender.setIcon(new ImageIcon(combustibles.class.getResource("/fds/vender.png")));
		btnVender.addActionListener(this);
		getContentPane().add(btnVender);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(85, 205, 114, 30);
		btnCancelar.setIcon(new ImageIcon(combustibles.class.getResource("/fds/cancelar.png")));
		getContentPane().add(btnCancelar);
		
		JLabel lblGrifero = new JLabel("Grifero:");
		lblGrifero.setBounds(20, 151, 73, 14);
		getContentPane().add(lblGrifero);
		
		JComboBox cboGrifero = new JComboBox();
		cboGrifero.setBounds(148, 148, 133, 20);
		cboGrifero.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D"}));
		getContentPane().add(cboGrifero);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(244, 37, 31, 30);
		lblNewLabel.setIcon(new ImageIcon(combustibles.class.getResource("/fds/galones.png")));
		getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setBounds(286, 73, 31, 30);
		label.setIcon(new ImageIcon(combustibles.class.getResource("/fds/tip_combus.png")));
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(244, 107, 31, 30);
		label_1.setIcon(new ImageIcon(combustibles.class.getResource("/fds/precio.png")));
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(301, 138, 31, 30);
		label_2.setIcon(new ImageIcon(combustibles.class.getResource("/fds/grifero.png")));
		getContentPane().add(label_2);
		
		JLabel lblSoles_1 = new JLabel("Soles:");
		lblSoles_1.setBounds(20, 14, 46, 14);
		getContentPane().add(lblSoles_1);
		
		txtSoles = new JTextField();
		txtSoles.setBounds(148, 11, 86, 20);
		getContentPane().add(txtSoles);
		txtSoles.setColumns(10);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(combustibles.class.getResource("/fds/precio.png")));
		label_3.setBounds(244, 3, 31, 30);
		getContentPane().add(label_3);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(arg0);
		}
		if (arg0.getSource() == btnVender) {
			actionPerformedBtnVender(arg0);
		}
	}
	protected void actionPerformedBtnVender(ActionEvent arg0) {
		try {
			double cantCombus = Double.parseDouble(txtPrecio.getText());
			
			precio= cantCombus;
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Ingrese la cantidad de combustible");
			
		}
		
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == comboBox) {
			itemStateChangedComboBox(e);
		}
	}
	protected void itemStateChangedComboBox(ItemEvent e) {
		
		
		try {
			double galones= Double.parseDouble(txtGalones.getText());
			int combustible= comboBox.getSelectedIndex();
			switch (combustible) {
			case 1:
				 txtPrecio.setText(""+galones*15.3);
				break;

			default:
				
				break;
			}
		} catch (Exception exception) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Ingrese la cantidad de galones");
		}
		
	}
	protected void actionPerformedBtnCancelar(ActionEvent arg0) {
		System.exit(0);
	}
}
