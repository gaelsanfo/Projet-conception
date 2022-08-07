import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class MAJUniteActivite {

	private JFrame frame;
	private JTextField typeUnite;
	private JTextField dateConstruction;
	private JTextField adresseUnite;
	private JTextField aireUnite;
	private JTextField nombreChambre;
	private JTextField conditionUnite;
	private JTextField nombreBain;
	private JTextField etatUnite;
	private JTextField nomProprietaire;
	private JTextField adresseProprietaire;
	private JTextField numTel;
	private JTable table;
	private List<Unite> listUnites = new ArrayList<Unite>();
	private int selection;
	


	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MAJUniteActivite window = new MAJUniteActivite();
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
	public MAJUniteActivite() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 923, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnRetour = new JButton("<- Retour");
		btnRetour.setBounds(10, 11, 94, 37);
		frame.getContentPane().add(btnRetour);
		
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
				Main.frame.setVisible(true);
				frame.dispose();
				
				
				
			}
		});
		
		
		JLabel lblNewLabel = new JLabel("Type unité");
		lblNewLabel.setBounds(10, 65, 84, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Adresse unité");
		lblNewLabel_1.setBounds(146, 65, 70, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date de construction");
		lblNewLabel_2.setBounds(10, 142, 118, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Aire de l'unité");
		lblNewLabel_3.setBounds(146, 142, 75, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre de chambres");
		lblNewLabel_4.setBounds(287, 65, 118, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Condition de l'unité");
		lblNewLabel_5.setBounds(287, 142, 118, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Nombre salles de bain");
		lblNewLabel_6.setBounds(440, 65, 129, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Etat de l'unité");
		lblNewLabel_7.setBounds(440, 142, 106, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Informations du proprétaire");
		lblNewLabel_8.setBounds(657, 22, 158, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Nom");
		lblNewLabel_9.setBounds(591, 65, 84, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Adresse couriel");
		lblNewLabel_10.setBounds(591, 124, 79, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Numero de téléphone");
		lblNewLabel_11.setBounds(591, 184, 129, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		typeUnite = new JTextField();
		typeUnite.setBounds(10, 90, 96, 20);
		frame.getContentPane().add(typeUnite);
		typeUnite.setColumns(10);
		
		dateConstruction = new JTextField();
		dateConstruction.setBounds(8, 181, 96, 20);
		frame.getContentPane().add(dateConstruction);
		dateConstruction.setColumns(10);
		
		adresseUnite = new JTextField();
		adresseUnite.setBounds(146, 90, 96, 20);
		frame.getContentPane().add(adresseUnite);
		adresseUnite.setColumns(10);
		
		aireUnite = new JTextField();
		aireUnite.setBounds(146, 181, 96, 20);
		frame.getContentPane().add(aireUnite);
		aireUnite.setColumns(10);
		
		nombreChambre = new JTextField();
		nombreChambre.setBounds(287, 90, 96, 20);
		frame.getContentPane().add(nombreChambre);
		nombreChambre.setColumns(10);
		
		conditionUnite = new JTextField();
		conditionUnite.setBounds(287, 181, 96, 20);
		frame.getContentPane().add(conditionUnite);
		conditionUnite.setColumns(10);
		
		nombreBain = new JTextField();
		nombreBain.setBounds(440, 90, 96, 20);
		frame.getContentPane().add(nombreBain);
		nombreBain.setColumns(10);
		
		etatUnite = new JTextField();
		etatUnite.setBounds(440, 181, 96, 20);
		frame.getContentPane().add(etatUnite);
		etatUnite.setColumns(10);
		
		nomProprietaire = new JTextField();
		nomProprietaire.setBounds(735, 62, 137, 20);
		frame.getContentPane().add(nomProprietaire);
		nomProprietaire.setColumns(10);
		
		adresseProprietaire = new JTextField();
		adresseProprietaire.setBounds(735, 121, 137, 20);
		frame.getContentPane().add(adresseProprietaire);
		adresseProprietaire.setColumns(10);
		
		numTel = new JTextField();
		numTel.setBounds(735, 181, 137, 20);
		frame.getContentPane().add(numTel);
		numTel.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 266, 889, 131);
		frame.getContentPane().add(scrollPane);
		table= new JTable();
		
		
		
		
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
		
		
		JButton btnMAJ = new JButton("Mettre à jour");
		btnMAJ.setBounds(440, 223, 167, 32);
		frame.getContentPane().add(btnMAJ);
		btnMAJ.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				update();
				model.setRowCount(0);
				table.setModel(model);
				afficheUnite();
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		afficheUnite();
		
		
		
		
		
		
		JButton btnModifier = new JButton("Modifier la selection");
		btnModifier.setBounds(153, 223, 172, 32);
		frame.getContentPane().add(btnModifier);
	
		btnModifier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				selection = table.getSelectedRow() -1;
				typeUnite.setText(listUnites.get(selection).getTypeUnite());
				dateConstruction.setText(listUnites.get(selection).getDateConstruction().afficheDate());
				adresseUnite.setText(listUnites.get(selection).getAdresse());
				aireUnite.setText(String.valueOf(listUnites.get(selection).getAire()));
				nombreChambre.setText(String.valueOf(listUnites.get(selection).getNombreChambres()));
				nombreBain.setText(String.valueOf(listUnites.get(selection).getNombreSalleBains()));
				etatUnite.setText(listUnites.get(selection).getEtat());
				nomProprietaire.setText(listUnites.get(selection).getProprietaire().getNom());
				adresseProprietaire.setText(listUnites.get(selection).getProprietaire().getAdresseCouriel());
				numTel.setText(listUnites.get(selection).getProprietaire().getNumeroTelephone());
				conditionUnite.setText(listUnites.get(selection).getCondition());
				
				
				
				
				
				
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		
		
	}
	
        public void showWindow() {
		
	
		
		frame.setVisible(true);
		
	}
        
        public void afficheUnite() {
        	ObjectMapper objectMapper = new ObjectMapper();
        	
        
			try {
				listUnites=  (objectMapper.readValue(new File("json/unite.json"),new TypeReference<List<Unite>>() {}));
				DefaultTableModel model =(DefaultTableModel)table.getModel();
				model.setRowCount(0);
				table.setModel(model);
				
				model.addRow(new Object[] {"Type de l'unite", "Adresse", "Date construction",
	    				"Aire", "Nombre chambres", "Nombre salles bain", "Condition", 
	    				"Etat", "Nom proprietaire", "Numero proprietaire",
	    				"Adresse courriel propritaire"});
	        	
				for (int i=0; i< listUnites.size();i++) {
					
					
					
					model.addRow(new Object[] { listUnites.get(i).getTypeUnite(),listUnites.get(i).getAdresse(),
							
					listUnites.get(i).getDateConstruction().afficheDate(),listUnites.get(i).getAire(),
					listUnites.get(i).getNombreChambres(),listUnites.get(i).getNombreSalleBains(),listUnites.get(i).getCondition(),
					listUnites.get(i).getEtat(),listUnites.get(i).getProprietaire().getNom(),listUnites.get(i).getProprietaire().getNumeroTelephone(),
					listUnites.get(i).getProprietaire().getAdresseCouriel()});
				}
				table.setModel(model);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
       public void update(){
    	   ObjectMapper objectMapper = new ObjectMapper();
    	  
    	   
    	   Unite unite = new Unite();
    	   
    	   unite.setAdresse(adresseUnite.getText());
    	   unite.setAire(Integer.parseInt(aireUnite.getText()));
    	   unite.setCondition(conditionUnite.getText());
    	   String dateCons= new String(dateConstruction.getText());
    	   int jour =Integer.parseInt(Character.toString(dateCons.charAt(0))+Character.toString(dateCons.charAt(1)));
    	   int mois =Integer.parseInt(Character.toString(dateCons.charAt(3))+Character.toString(dateCons.charAt(4)));
    	   int annee =Integer.parseInt(Character.toString(dateCons.charAt(6))+Character.toString(dateCons.charAt(7))+
    			   Character.toString(dateCons.charAt(8)) + Character.toString(dateCons.charAt(9)));
    	   unite.setDateConstruction(new MaDate(jour, mois, annee));
    	   unite.setEtat(etatUnite.getText());
    	   unite.setNombreChambres(Integer.parseInt(nombreChambre.getText()));
    	   unite.setNombreSalleBains(Integer.parseInt(nombreBain.getText()));
    	   unite.setProprietaire(new Proprietaire(nomProprietaire.getText(),numTel.getText(),adresseProprietaire.getText()));
    	   unite.setTypeUnite(typeUnite.getText());
    	   listUnites.set(selection,unite);
    	   
    	   try {
			objectMapper.writeValue(new File("json/unite.json"), listUnites);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   
    	   
    	   
        	
        }
}
