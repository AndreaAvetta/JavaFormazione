package model;

public class Veicolo {
String modello;
String tipo;
String targa;
Integer AnnoImm;
Persona proprietarioV;


public Veicolo(String modello, String tipo, String targa, Integer annoImm, Persona proprietarioV) {
	this.modello = modello;
	this.tipo = tipo;
	this.targa = targa;
	this.AnnoImm = annoImm;
	this.proprietarioV = proprietarioV;
}

public String getModello() {
	return modello;
}
public void setModello(String modello) {
	this.modello = modello;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getTarga() {
	return targa;
}
public void setTarga(String targa) {
	this.targa = targa;
}
public Integer getAnnoImm() {
	return AnnoImm;
}
public void setAnnoImm(Integer annoImm) {
	AnnoImm = annoImm;
}
public Persona getProprietarioV() {
	return proprietarioV;
}
public void setProprietarioV(Persona proprietarioV) {
	this.proprietarioV = proprietarioV;
}

@Override
public String toString() {
	return "Veicolo [modello=" + modello + ", tipo=" + tipo + ", targa=" + targa + ", AnnoImm=" + AnnoImm
			+ ", proprietarioV=" + proprietarioV + "]";
}


}
