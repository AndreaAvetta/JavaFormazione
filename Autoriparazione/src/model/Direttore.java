package model;

public class Direttore extends Persona{
	int eta;
	Officina officinaPresidiata;
	
	
	public Direttore(String codFiscale, String indirizzo, String telefono, int eta, Officina officinaPresidiata) {
		super(codFiscale, indirizzo, telefono);
		this.eta = eta;
		this.officinaPresidiata = officinaPresidiata;
	}


	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}


	public Officina getOfficinaPresidiata() {
		return officinaPresidiata;
	}


	@Override
	public String toString() {
		return "Direttore [codFiscale=" + codFiscale + ", indirizzo=" + indirizzo + ", telefono=" + telefono + ", età=" + eta + ", Officina= " + officinaPresidiata + "]";
	}

	
	
}
