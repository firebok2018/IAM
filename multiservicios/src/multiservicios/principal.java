package multiservicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
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
	public principal() {
		setFont(new Font("Chiller", Font.BOLD | Font.ITALIC, 20));
		setTitle("Multiservicios Rodrich");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 567, 334);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnVentas = new JMenu("Ventas");
		mnVentas.setIcon(new ImageIcon(principal.class.getResource("/fds/vender.png")));
		mnVentas.setFont(new Font("Arial", Font.BOLD, 14));
		menuBar.add(mnVentas);
		
		JMenuItem mntmCombustibles = new JMenuItem("Combustibles");
		mntmCombustibles.setIcon(new ImageIcon(principal.class.getResource("/fds/estacion.jpg")));
		mntmCombustibles.setFont(new Font("Arial", Font.BOLD, 14));
		mnVentas.add(mntmCombustibles);
		
		JMenuItem mntmProductos = new JMenuItem("Productos");
		mntmProductos.setIcon(new ImageIcon(principal.class.getResource("/fds/producto.png")));
		mntmProductos.setFont(new Font("Arial", Font.BOLD, 14));
		mnVentas.add(mntmProductos);
		
		JMenu mnConfiguracion = new JMenu("Configuracion");
		mnConfiguracion.setIcon(new ImageIcon(principal.class.getResource("/fds/engineering.png")));
		mnConfiguracion.setFont(new Font("Arial", Font.BOLD, 14));
		menuBar.add(mnConfiguracion);
		
		JMenuItem mntmPrecios = new JMenuItem("Precios");
		mntmPrecios.setIcon(new ImageIcon(principal.class.getResource("/fds/precio.png")));
		mntmPrecios.setFont(new Font("Arial", Font.BOLD, 14));
		mnConfiguracion.add(mntmPrecios);
		
		JMenuItem mntmPersonal = new JMenuItem("Personal");
		mntmPersonal.setFont(new Font("Arial", Font.BOLD, 14));
		mnConfiguracion.add(mntmPersonal);
		
		JMenuItem mntmContometros = new JMenuItem("Contometros");
		mntmContometros.setFont(new Font("Arial", Font.BOLD, 14));
		mnConfiguracion.add(mntmContometros);
		
		JMenu mnHistorial = new JMenu("Historial");
		mnHistorial.setIcon(new ImageIcon(principal.class.getResource("/fds/list.png")));
		mnHistorial.setFont(new Font("Arial", Font.BOLD, 14));
		menuBar.add(mnHistorial);
		
		JMenuItem mntmVentas = new JMenuItem("Ventas");
		mntmVentas.setFont(new Font("Arial", Font.BOLD, 14));
		mnHistorial.add(mntmVentas);
		
		JMenuItem mntmDescargas = new JMenuItem("Descargas");
		mntmDescargas.setFont(new Font("Arial", Font.BOLD, 14));
		mnHistorial.add(mntmDescargas);
		
		JMenuItem mntmPagos = new JMenuItem("Pagos");
		mntmPagos.setFont(new Font("Arial", Font.BOLD, 14));
		mnHistorial.add(mntmPagos);
		
		JMenuItem mntmVarillajes = new JMenuItem("Varillajes");
		mntmVarillajes.setFont(new Font("Arial", Font.BOLD, 14));
		mnHistorial.add(mntmVarillajes);
		
		JMenu mnInformacion = new JMenu("Informacion");
		mnInformacion.setIcon(new ImageIcon(principal.class.getResource("/fds/info.png")));
		mnInformacion.setFont(new Font("Arial", Font.BOLD, 14));
		menuBar.add(mnInformacion);
		
		JMenu mnConsultas = new JMenu("Consultas");
		mnConsultas.setFont(new Font("Arial", Font.BOLD, 14));
		mnInformacion.add(mnConsultas);
		
		JMenuItem mntmPersonal_1 = new JMenuItem("Personal");
		mntmPersonal_1.setFont(new Font("Arial", Font.BOLD, 14));
		mnConsultas.add(mntmPersonal_1);
		
		JMenuItem mntmVarillaje = new JMenuItem("Varillaje");
		mntmVarillaje.setFont(new Font("Arial", Font.BOLD, 14));
		mnConsultas.add(mntmVarillaje);
		
		JMenuItem mntmContometros_1 = new JMenuItem("Contometros ");
		mntmContometros_1.setFont(new Font("Arial", Font.BOLD, 14));
		mnConsultas.add(mntmContometros_1);
		
		JMenuItem mntmEmpresa = new JMenuItem("Empresa");
		mntmEmpresa.setFont(new Font("Arial", Font.BOLD, 14));
		mnInformacion.add(mntmEmpresa);
		
		JMenuItem mntmCreadores = new JMenuItem("Creadores");
		mntmCreadores.setFont(new Font("Arial", Font.BOLD, 14));
		mnInformacion.add(mntmCreadores);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
