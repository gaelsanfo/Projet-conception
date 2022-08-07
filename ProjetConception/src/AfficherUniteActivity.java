import java.awt.Color;
import java.awt.EventQueue;
import java.awt.desktop.AboutHandler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.lang.ProcessBuilder.Redirect;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.management.modelmbean.ModelMBean;
import javax.swing.JButton;

public class AfficherUniteActivity {

	private JFrame frame;
	private JTextField nombreLot;
	private JTable table;
	private List<Unite> listUnites = new ArrayList<Unite>();
	private JButton btnRetour;
	private int nLot;
	private boolean interrompre=false;
	private JButton btnInterrompre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfficherUniteActivity window = new AfficherUniteActivity();
					window.frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AfficherUniteActivity() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 918, 529);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Entrer le nombre de lots");
		lblNewLabel.setBounds(408, 17, 281, 54);
		frame.getContentPane().add(lblNewLabel);
		
		nombreLot = new JTextField();
		nombreLot.setBounds(368, 82, 199, 20);
		frame.getContentPane().add(nombreLot);
		nombreLot.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 167, 894, 314);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Type de l'unite", "Adresse de l'unite", "Date de construction", "Aire de l'unite", "Nombre de chambres", "Nombre de salles de bain", "Condition de l'unite", "Etat de l'unite", "Nom du proprietaire", "Numero de telephone du proprietaire", "Adresse courriel du propritaire"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Integer.class, Integer.class, Integer.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setColumnHeaderView(table);
		
		DefaultTableModel model =(DefaultTableModel)table.getModel();
		model.addRow(new Object[] {"Type de l'unite", "Adresse", "Date construction",
				"Aire", "Nombre chambres", "Nombre salles bain", "Condition", 
				"Etat", "Nom proprietaire", "Numero proprietaire",
				"Adresse courriel propritaire"});
		
		
		
		
		JButton btnValider = new JButton("Valider");
	
		btnValider.setBounds(423, 113, 89, 23);
		frame.getContentPane().add(btnValider);
		
		btnRetour = new JButton("<- Retour");
		btnRetour.setBounds(10, 33, 89, 23);
		frame.getContentPane().add(btnRetour);
		
		btnInterrompre = new JButton("Interrompre");
		btnInterrompre.setBounds(721, 81, 119, 55);
		frame.getContentPane().add(btnInterrompre);
		btnInterrompre.setBackground(Color.red);
		btnInterrompre.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				interrompre =true;
				// TODO Auto-generated method stub
				
			}
		});
		
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
				Main.frame.setVisible(true);
				frame.dispose();
				
				
				
			}
		});
		btnValider.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					nLot= Integer.parseInt(nombreLot.getText());
					model.setRowCount(0);
					table.setModel(model);
					
					model.addRow(new Object[] {"Type de l'unite", "Adresse", "Date construction",
		    				"Aire", "Nombre chambres", "Nombre salles bain", "Condition", 
		    				"Etat", "Nom proprietaire", "Numero proprietaire",
		    				"Adresse courriel propritaire"});
					
					
					ObjectMapper objectMapper = new ObjectMapper();
					listUnites=  (objectMapper.readValue(new File("json/unite.json"),new TypeReference<List<Unite>>() {}));
			
					for (int i=0; i< listUnites.size();i++) {
						DefaultTableModel model =(DefaultTableModel)table.getModel();
						
						if(interrompre== true) {
							break;
						}
						
						if ((i!=0) & ((i % nLot)== 0)) {
							
							model.addRow(new Object[] {" "});
							
						}
						model.addRow(new Object[] { listUnites.get(i).getTypeUnite(),listUnites.get(i).getAdresse(),
								
						listUnites.get(i).getDateConstruction().afficheDate(),listUnites.get(i).getAire(),
						listUnites.get(i).getNombreChambres(),listUnites.get(i).getNombreSalleBains(),listUnites.get(i).getCondition(),
						listUnites.get(i).getEtat(),listUnites.get(i).getProprietaire().getNom(),listUnites.get(i).getProprietaire().getNumeroTelephone(),
						listUnites.get(i).getProprietaire().getAdresseCouriel()});
					}
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
				
			}
		});
	}

	public void showWindow() {
		
	
		
		frame.setVisible(true);
		
	}
}
