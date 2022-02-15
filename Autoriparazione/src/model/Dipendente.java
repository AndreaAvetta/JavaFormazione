package model;

public class Dipendente extends Persona {

	public Dipendente(String codFiscale, String indirizzo, String telefono) {
		super(codFiscale, indirizzo, telefono);
	}

	@Override
	public String toString() {
		return "Dipendente [codFiscale=" + codFiscale + ", indirizzo=" + indirizzo + ", telefono=" + telefono + "]";
	}



	

	
}

