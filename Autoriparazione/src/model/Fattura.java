package model;

import java.util.ArrayList;
import java.util.Date;

public class Fattura {
int idFatt;
Date DataFatt;
Dipendente dip;
float Costo;
ArrayList<Dipendente> DipendentiRip = new ArrayList<Dipendente>();


public Fattura(int idFatt, Date dataFatt, Dipendente dip, float costo, ArrayList<Dipendente> dipendentiRip) {
	this.idFatt = idFatt;
	this.DataFatt = dataFatt;
	this.dip = dip;
	this.Costo = costo;
	this.DipendentiRip = dipendentiRip;
}

public Date getDataFatt() {
	return DataFatt;
}
public void setDataFatt(Date dataFatt) {
	DataFatt = dataFatt;
}
public Dipendente getDip() {
	return dip;
}
public void setDip(Dipendente dip) {
	this.dip = dip;
}
public float getCosto() {
	return Costo;
}
public void setCosto(float costo) {
	Costo = costo;
}
public ArrayList<Dipendente> getDipendentiRip() {
	return DipendentiRip;
}
public void setDipendentiRip(ArrayList<Dipendente> dipendentiRip) {
	DipendentiRip = dipendentiRip;
}

public int getIdFatt() {
	return idFatt;
}

@Override
public String toString() {
	return "Fattura [idFatt=" + idFatt + ", DataFatt=" + DataFatt + ", dip=" + dip + ", Costo=" + Costo
			+ ", DipendentiRip=" + DipendentiRip + "]";
}




}
