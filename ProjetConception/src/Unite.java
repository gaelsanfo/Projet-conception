import java.util.Date;

public class Unite {
	
	private String adresse,typeUnite;
	private Proprietaire proprietaire;  
	private MaDate dateConstruction;
	private int nombreChambres,nombreSalleBains;
	private int aire;
	private String condition;
	private String etat;
	
	public Unite() {
		
	}
	
	
	public Unite(String adresse, String typeUnite, Proprietaire proprietaire, MaDate dateConstruction,
			int nombreChambres, int nombreSalleBains, int aire, String condition, String etat) {
		super();
		this.adresse = adresse;
		this.typeUnite = typeUnite;
		this.proprietaire = proprietaire;
		this.dateConstruction = dateConstruction;
		this.nombreChambres = nombreChambres;
		this.nombreSalleBains = nombreSalleBains;
		this.aire = aire;
		this.condition = condition;
		this.etat = etat;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getTypeUnite() {
		return typeUnite;
	}


	public void setTypeUnite(String typeUnite) {
		this.typeUnite = typeUnite;
	}


	public Proprietaire getProprietaire() {
		return proprietaire;
	}


	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}


	public MaDate getDateConstruction() {
		return dateConstruction;
	}


	public void setDateConstruction(MaDate dateConstruction) {
		this.dateConstruction = dateConstruction;
	}


	public int getNombreChambres() {
		return nombreChambres;
	}


	public void setNombreChambres(int nombreChambres) {
		this.nombreChambres = nombreChambres;
	}


	public int getNombreSalleBains() {
		return nombreSalleBains;
	}


	public void setNombreSalleBains(int nombreSalleBains) {
		this.nombreSalleBains = nombreSalleBains;
	}


	public int getAire() {
		return aire;
	}


	public void setAire(int aire) {
		this.aire = aire;
	}


	public String getCondition() {
		return condition;
	}


	public void setCondition(String condition) {
		this.condition = condition;
	}


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}
	
	public String afficher () {
		return "Adresse : " + adresse ;
	}
	
	
	
	

	
	

}
