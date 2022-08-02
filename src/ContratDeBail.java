import java.util.Date;

public class ContratDeBail {
	
	private String idUniteLoue,periodeLocation;
	private int loyerBail;
	private MaDate dateDebutLocation, dateDeFin;
	private Boolean statutDeRenouvellement;
	private Statut statutContrat;
	private Supplement supplement;
	
	
	public Boolean getStatutDeRenouvellement() {
		return statutDeRenouvellement;
	}
	public void setStatutDeRenouvellement(Boolean statutDeRenouvellement) {
		this.statutDeRenouvellement = statutDeRenouvellement;
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
		return dateDeFin;
	}
	public void setDateDeFin(MaDate dateDeFin) {
		this.dateDeFin = dateDeFin;
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
	public String getPeriodeLocation() {
		return periodeLocation;
	}
	public void setPeriodeLocation(String periodeLocation) {
		this.periodeLocation = periodeLocation;
	}
	public int getLoyerBail() {
		return loyerBail;
	}
	public void setLoyerBail(int loyerBail) {
		this.loyerBail = loyerBail;
	}
	
	

}
