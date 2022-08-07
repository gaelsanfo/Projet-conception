import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

import org.json.JSONArray;

import javax.swing.JPanel;

public class Main {

	public static JFrame frame;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Acceuil");
		frame.setBounds(100, 100, 983, 330);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnMAJUnite = new JButton("Mettre à jour une unite");
		btnMAJUnite.setBounds(51, 75, 288, 23);
		frame.getContentPane().add(btnMAJUnite);
		
		btnMAJUnite.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				
				MAJUniteActivite majUniteActivite = new MAJUniteActivite();
				majUniteActivite.showWindow();
			}
		});
		
		
		
		JButton btnAfficheUnite = new JButton("Afficher la liste des unités");
		btnAfficheUnite.setBounds(51, 126, 288, 23);
		frame.getContentPane().add(btnAfficheUnite);
		btnAfficheUnite.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frame.setVisible(false);
				AfficherUniteActivity afficherUniteActivity = new AfficherUniteActivity();
				afficherUniteActivity.showWindow();
			}
		});
		
		JButton btnNewButton_3 = new JButton("Creer un bail");
		btnNewButton_3.setBounds(51, 170, 288, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Modifier un bail");
		btnNewButton_4.setBounds(51, 220, 288, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Marquer un bail comme terminé");
		btnNewButton_5.setBounds(440, 75, 259, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Saisir les montants payés par les locataires");
		btnNewButton_6.setBounds(440, 126, 259, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Afficher le solde d'un bail");
		btnNewButton_7.setBounds(440, 170, 259, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Renouveler un bail");
		btnNewButton_8.setBounds(440, 32, 259, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnCreeUnite = new JButton("Creer une unite");
		btnCreeUnite.setBounds(51, 32, 288, 23);
		frame.getContentPane().add(btnCreeUnite);
		btnCreeUnite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.setVisible(false);
				
				CreerUniteActivity  cu= new CreerUniteActivity ();
				cu.showWindow();
				
				
				
			}
		});
		
		JButton btnNewButton_9 = new JButton("Afficher la liste des taches à accomplir");
		btnNewButton_9.setBounds(440, 220, 259, 23);
		frame.getContentPane().add(btnNewButton_9);
	}
}
