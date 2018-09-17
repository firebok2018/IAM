package multiservicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtUsers;
	private JPasswordField txtContrasena;
	private JButton btnIniciarSesin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setLocationRelativeTo(frame);
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario ");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsuario.setBounds(110, 198, 64, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblContrasea.setBounds(100, 268, 92, 14);
		contentPane.add(lblContrasea);
		
		txtUsers = new JTextField();
		txtUsers.setMargin(new Insets(3, 5, 5, 5));
		txtUsers.setFont(new Font("Segoe UI", Font.BOLD, 14));
		txtUsers.setBounds(30, 223, 224, 29);
		contentPane.add(txtUsers);
		txtUsers.setColumns(10);
		
		txtContrasena = new JPasswordField();
		txtContrasena.setMargin(new Insets(3, 5, 5, 5));
		txtContrasena.setFont(new Font("Segoe UI", Font.BOLD, 14));
		txtContrasena.setBounds(30, 284, 224, 29);
		contentPane.add(txtContrasena);
		
		btnIniciarSesin = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesin.addActionListener(this);
		btnIniciarSesin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnIniciarSesin.setBounds(72, 340, 140, 23);
		contentPane.add(btnIniciarSesin);
		
		JLabel lblNewLabel = new JLabel((String) null);
		lblNewLabel.setIcon(new ImageIcon(login.class.getResource("/fds/users.png")));
		lblNewLabel.setBounds(59, 11, 187, 187);
		contentPane.add(lblNewLabel);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnIniciarSesin) {
			actionPerformedBtnIniciarSesin(e);
		}
	}
	protected void actionPerformedBtnIniciarSesin(ActionEvent e) {
		String useers = txtUsers.getText();
		char[] contraseña = txtContrasena.getPassword();
		String contra= new String(contraseña);
		
		if (useers.equals("admin") && contra.equals("12345")) {
			
			this.dispose();
			JOptionPane.showMessageDialog(null, "Bienvendo al Sistema");
			principal fp = new principal();
			fp.setLocationRelativeTo(fp);
			fp.setVisible(true);
			
		}else{
			JOptionPane.showMessageDialog(null, "Ingrese correctamente los datos");
		}
		
	}
	
}
