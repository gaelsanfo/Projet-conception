import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

import javax.swing.JFrame;
import javax.swing.JTextField;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.lang.model.element.NestingKind;
import javax.swing.JButton;
import java.lang.Object;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class CreerUniteActivity {
	private boolean valide;
	private List<Unite> listUnites = new ArrayList<Unite>();

	private JFrame frame;
	private JTextField typeUnite;
	private JTextField adresseUnite;
	private JTextField jourConstruction;
	private JTextField moisConstruction;
	private JTextField anneeConstruction;
	private JTextField aireUnite;
	private JTextField nombreChambre;
	private JTextField nombreBain;
	private JTextField conditionUnite;
	private JTextField EtatUnite;
	private JLabel lblNewLabel_10;
	private JTextField nomProprietaire;
	private JLabel lblNewLabel_11;
	private JTextField numProprietaire;
	private JLabel lblNewLabel_12;
	private JTextField courielProprietaire;
	private JButton btnEnregistrer;
	private Unite unite;
	private JButton btnRetour;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					
					CreerUniteActivity window = new CreerUniteActivity();
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
	public CreerUniteActivity() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		frame = new JFrame("Creer une unité ");
		frame.setBounds(100, 100, 1090, 424);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		typeUnite = new JTextField();
		typeUnite.setBounds(80, 53, 247, 20);
		frame.getContentPane().add(typeUnite);
		typeUnite.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Entrer le type d'unité");
		lblNewLabel.setBounds(142, 11, 165, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Entrer l'adresse");
		lblNewLabel_1.setBounds(158, 84, 184, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		adresseUnite = new JTextField();
		adresseUnite.setBounds(80, 109, 247, 20);
		frame.getContentPane().add(adresseUnite);
		adresseUnite.setColumns(10);
		
		
		JLabel lblNewLabel_2 = new JLabel("Entrer le jour de construction");
		lblNewLabel_2.setBounds(122, 151, 205, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		jourConstruction = new JTextField();
		jourConstruction.setBounds(80, 176, 247, 20);
		frame.getContentPane().add(jourConstruction);
		jourConstruction.setColumns(10);
		
		
		JLabel lblNewLabel_3 = new JLabel("Entrer le mois de construction");
		lblNewLabel_3.setBounds(122, 213, 247, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		moisConstruction = new JTextField();
		moisConstruction.setBounds(80, 251, 247, 20);
		frame.getContentPane().add(moisConstruction);
		moisConstruction.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Entrer l'année de construction");
		lblNewLabel_4.setBounds(122, 291, 247, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		anneeConstruction = new JTextField();
		anneeConstruction.setBounds(80, 328, 247, 20);
		frame.getContentPane().add(anneeConstruction);
		anneeConstruction.setColumns(10);
		
		
		
	
		
		JLabel lblNewLabel_5 = new JLabel("Entrer l'aire de l'unité");
		lblNewLabel_5.setBounds(533, 19, 196, 14);
		frame.getContentPane().add(lblNewLabel_5);
	
		
		aireUnite = new JTextField();
		aireUnite.setBounds(499, 53, 212, 20);
		frame.getContentPane().add(aireUnite);
		aireUnite.setColumns(10);
		
		
		
		JLabel lblNewLabel_6 = new JLabel("Entrer le nombre de chambres");
		lblNewLabel_6.setBounds(533, 84, 196, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		nombreChambre = new JTextField();
		nombreChambre.setBounds(499, 109, 212, 20);
		frame.getContentPane().add(nombreChambre);
		nombreChambre.setColumns(10);
		
		
		JLabel lblNewLabel_7 = new JLabel("Entrer le nombre de salle de bains");
		lblNewLabel_7.setBounds(527, 140, 202, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		
		nombreBain = new JTextField();
		nombreBain.setBounds(499, 177, 212, 20);
		frame.getContentPane().add(nombreBain);
		nombreBain.setColumns(10);
		
		
		
		JLabel lblNewLabel_8 = new JLabel("Entrer la condition de l'unité");
		lblNewLabel_8.setBounds(538, 213, 210, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		conditionUnite = new JTextField();
		conditionUnite.setBounds(499, 251, 212, 20);
		frame.getContentPane().add(conditionUnite);
		conditionUnite.setColumns(10);
		
		
		JLabel lblNewLabel_9 = new JLabel("Entrer l'état de l unite");
		lblNewLabel_9.setBounds(536, 291, 212, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		EtatUnite = new JTextField();
		EtatUnite.setBounds(499, 328, 212, 20);
		frame.getContentPane().add(EtatUnite);
		EtatUnite.setColumns(10);
		
		
		lblNewLabel_10 = new JLabel("Entrer nom du propiétaire");
		lblNewLabel_10.setBounds(799, 11, 205, 31);
		frame.getContentPane().add(lblNewLabel_10);
		
		nomProprietaire = new JTextField();
		nomProprietaire.setBounds(780, 53, 210, 20);
		frame.getContentPane().add(nomProprietaire);
		nomProprietaire.setColumns(10);
		
		
		
		lblNewLabel_11 = new JLabel("Entrer numero de téléphone du propietaire");
		lblNewLabel_11.setBounds(780, 84, 261, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		numProprietaire = new JTextField();
		numProprietaire.setBounds(780, 109, 196, 20);
		frame.getContentPane().add(numProprietaire);
		numProprietaire.setColumns(10);
		
		
		lblNewLabel_12 = new JLabel("Entrer adresse couriel du propriétaire");
		lblNewLabel_12.setBounds(780, 151, 247, 14);
		frame.getContentPane().add(lblNewLabel_12);
		
		courielProprietaire = new JTextField();
		courielProprietaire.setBounds(780, 176, 196, 20);
		frame.getContentPane().add(courielProprietaire);
		courielProprietaire.setColumns(10);
		
		btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.setBounds(780, 285, 199, 91);
		frame.getContentPane().add(btnEnregistrer);
		btnEnregistrer.setBackground(Color.red);
		
		btnRetour = new JButton("<- Retour");
		btnRetour.setBounds(10, 15, 89, 23);
		frame.getContentPane().add(btnRetour);
		
		
		btnRetour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				
				Main.frame.setVisible(true);
				frame.dispose();
				
				
				
			}
		});
		
		
		
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				updateUnite();
				UpdateDb();
				
				
				
			}
		});
		
	}
		
		
	
	public void showWindow() {
		
	
		
		frame.setVisible(true);
		
	}
	public void updateUnite() {
		valide = true;
		
		unite = new Unite();
		
		
		int jour=0;
		int mois =0;
		int annee=0;
		
		
				
		
		String nomProp = new String(nomProprietaire.getText());
		String numProp = new String (numProprietaire.getText());
		String courProp = new String (courielProprietaire.getText());
		
		
		
		
		if (adresseUnite.getText().isEmpty()){
			
			adresseUnite.setBackground(Color.red);
			
			adresseUnite.setText("Veillez entrer une adresse valide ");
			
			valide=false;
			
		}
		
		else {
			unite.setAdresse(adresseUnite.getText());
			
			
		}
		
		if (typeUnite.getText().isEmpty()) {
			typeUnite.setText("Entrer un type d'unité valide");
			valide=false;
		}
		else {
			
			unite.setTypeUnite(typeUnite.getText());
			
		}
		
		 
		try {
			
			unite.setAire(Integer.parseInt(aireUnite.getText()));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			aireUnite.setText("Entrer un nombre valide");
			valide=false;
		}
		if(nomProp.isEmpty()) {
			nomProprietaire.setText("Entrer un nom valide");
			valide=false;
		}
		else if(numProp.isEmpty()){
			numProprietaire.setText("Entrer un numero valide");
			valide=false;
			}
		else if(courProp.isEmpty()){
			courielProprietaire.setText("Entrer un couriel valide");
			valide=false;
				
		}
		else {
			unite.setProprietaire(new Proprietaire (nomProp,numProp,courProp));
		}
		
		if (EtatUnite.getText().isEmpty()){
			EtatUnite.setText("Entrer un état valide");
			valide=false;
		}
		else {
			unite.setEtat(EtatUnite.getText());
			
		}
		
		if (conditionUnite.getText().isEmpty()){
			conditionUnite.setText("Entrer une condition valide");
			valide=false;
		}
		else {
			unite.setCondition(conditionUnite.getText());
			
		}
		
		try {
			
			unite.setNombreChambres(Integer.parseInt(nombreChambre.getText()));
			
		}
		catch (Exception e) {
			// TODO: handle exception
			nombreChambre.setText("Entrer un nombre valide" );
			valide=false;
		}
		
		if(unite.getNombreChambres()<0) {
			nombreChambre.setText("Entrer un nombre valide" );
			valide=false;
		}
		
		try {
			
			unite.setNombreSalleBains(Integer.parseInt(nombreBain.getText()));;
			
		} catch (Exception e) {
			// TODO: handle exception
			nombreBain.setText("Entrer une valeur valide");
			valide=false;
		}
		
		if(unite.getNombreSalleBains()<0) {
			nombreBain.setText("Entrer une valeur valide");
			valide=false;
		}
		
		
		try {
			
			  jour = Integer.parseInt(jourConstruction.getText());
			
		
			
		} catch (Exception e) {
			// TODO: handle exception
			jourConstruction.setText("Entrer un jour valide");
			valide=false;
		}
		
		
		try {
			 mois = Integer.parseInt(moisConstruction.getText());
		} catch (Exception e) {
			// TODO: handle exception
			moisConstruction.setText("Entrer un mois valide");
			valide=false;
		}
		
		try {
			 annee = Integer.parseInt(anneeConstruction.getText());
			
		} catch (Exception e) {
			// TODO: handle exception
			anneeConstruction.setText("Entrer une année valide");
			valide=false;
		}
		
		try {
			unite.setDateConstruction(new MaDate(jour,mois,annee) );
			
		} catch (Exception e) {
			// TODO: handle exception
		}	
		
		
	}
	
	
	private void UpdateDb() {
		ObjectMapper objectMapper = new ObjectMapper();
		
		if (valide == true) {
			
		
		
		try {
			listUnites=  (objectMapper.readValue(new File("json/unite.json"),new TypeReference<List<Unite>>() {}));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		listUnites.add(unite);
		
		try {
			objectMapper.writeValue(new File("json/unite.json"), listUnites);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
	
		
		
		
		
		
		
		
		
		
		
	}
}
