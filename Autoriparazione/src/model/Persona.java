package model;

public class Persona {
String codFiscale;
String indirizzo;
String telefono;


public Persona(String codFiscale, String indirizzo, String telefono) {
	this.codFiscale = codFiscale;
	this.indirizzo = indirizzo;
	this.telefono = telefono;
}


public String getCodFiscale() {
	return codFiscale;
}

public String getIndirizzo() {
	return indirizzo;
}

public String getTelefono() {
	return telefono;
}


@Override
public String toString() {
	return "Persona [codFiscale=" + codFiscale + ", indirizzo=" + indirizzo + ", telefono=" + telefono + "]";
}




}
