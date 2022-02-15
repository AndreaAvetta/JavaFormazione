package model;

public class Officina {
String nomeOff;
String indirizzo;

public Officina(String nomeOff, String indirizzo) {
	this.nomeOff = nomeOff;
	this.indirizzo = indirizzo;
}


public String getNomeOff() {
	return nomeOff;
}

public void setNomeOff(String nomeOff) {
	this.nomeOff = nomeOff;
}

public String getIndirizzo() {
	return indirizzo;
}

public void setIndirizzo(String indirizzo) {
	this.indirizzo = indirizzo;
}


@Override
public String toString() {
	return "Officina [nomeOff=" + nomeOff + ", indirizzo=" + indirizzo + "]";
}




}
