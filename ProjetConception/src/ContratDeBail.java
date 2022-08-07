import java.util.Date;

public class ContratDeBail {
	
	private String idUniteLoue, assuranceLocataire;
	private PeriodeLocation periodeLocation;
	private LoyerParPeriode loyerParPeriode;
	private int loyerBail;
	private MaDate dateDebutLocation, dateDeFinLocation;
	private Heure heureDebutLocation, heureFinLocation;
	private Boolean estRenouvellable;
	private Statut statutContrat;
	private Supplement supplement;

	
	
	public void setPeriodeLocation(PeriodeLocation periodeLocation) {
		this.periodeLocation = periodeLocation;
	}
	
	

	public Supplement getSupplement() {
		return supplement;
	}
	public void setSupplement(Supplement supplement) {
		this.supplement = supplement;
	}
	public MaDate getDateDebutLocation() {
		return dateDebutLocation;
	}
	public MaDate getDateDeFin() {
		return dateDeFinLocation;
	}
	public void setDateDeFin(MaDate dateDeFinLocation) {
		this.dateDeFinLocation = dateDeFinLocation;
	}
	public Statut getStatutContrat() {
		return statutContrat;
	}
	public void setStatutContrat(Statut statutContrat) {
		this.statutContrat = statutContrat;
	}
	public void setDateDebutLocation(MaDate dateDebutLocation) {
		this.dateDebutLocation = dateDebutLocation;
	}
	public String getIdUniteLoue() {
		return idUniteLoue;
	}
	public void setIdUniteLoue(String idUniteLoue) {
		this.idUniteLoue = idUniteLoue;
	}



	public String getAssuranceLocataire() {
		return assuranceLocataire;
	}



	public void setAssuranceLocataire(String assuranceLocataire) {
		this.assuranceLocataire = assuranceLocataire;
	}



	public LoyerParPeriode getLoyerParPeriode() {
		return loyerParPeriode;
	}



	public void setLoyerParPeriode(LoyerParPeriode loyerParPeriode) {
		this.loyerParPeriode = loyerParPeriode;
	}



	public int getLoyerBail() {
		return loyerBail;
	}



	public void setLoyerBail(int loyerBail) {
		this.loyerBail = loyerBail;
	}



	public MaDate getDateDeFinLocation() {
		return dateDeFinLocation;
	}



	public void setDateDeFinLocation(MaDate dateDeFinLocation) {
		this.dateDeFinLocation = dateDeFinLocation;
	}



	public Heure getHeureDebutLocation() {
		return heureDebutLocation;
	}



	public void setHeureDebutLocation(Heure heureDebutLocation) {
		this.heureDebutLocation = heureDebutLocation;
	}



	public Heure getHeureFinLocation() {
		return heureFinLocation;
	}



	public void setHeureFinLocation(Heure heureFinLocation) {
		this.heureFinLocation = heureFinLocation;
	}



	public Boolean getEstRenouvellable() {
		return estRenouvellable;
	}



	public void setEstRenouvellable(Boolean estRenouvellable) {
		this.estRenouvellable = estRenouvellable;
	}



	public PeriodeLocation getPeriodeLocation() {
		return periodeLocation;
	}
	
	

}
