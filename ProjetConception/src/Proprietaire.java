
public class Proprietaire {
	
	public Proprietaire() {
		
	}
	
	public Proprietaire(String nom, String numeroTelephone, String adresseCouriel) {
		super();
		this.nom = nom;
		this.numeroTelephone = numeroTelephone;
		this.adresseCouriel = adresseCouriel;
	}

	private String nom,numeroTelephone,adresseCouriel;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public String getAdresseCouriel() {
		return adresseCouriel;
	}

	public void setAdresseCouriel(String adresseCouriel) {
		this.adresseCouriel = adresseCouriel;
	}

}
