import java.util.ArrayList;

public class LocataireActuel extends Locataire {
	ArrayList <ContratDeBail> contratsDeBail;
	private Paiement paiement;
	
	
	
	public Paiement getPaiement() {
		return paiement;
	}

	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}

	public String getHistoriquePaiment() {
		return historiquePaiment;
	}

	public void setHistoriquePaiment(String historiquePaiment) {
		this.historiquePaiment = historiquePaiment;
	}

	private String historiquePaiment;

	public ArrayList<ContratDeBail> getContratsDeBail() {
		return contratsDeBail;
	}

	public void setContratsDeBail(ArrayList<ContratDeBail> contratsDeBail) {
		this.contratsDeBail = contratsDeBail;
	}
	

}
