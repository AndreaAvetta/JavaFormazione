package model;

import java.util.Date;

public class ContrattoDip {
int idContr;
Date dataInizio;
Date dataFine;
Dipendente dipendente;
Officina offDip;



public ContrattoDip(int idContr, Date dataInizio, Date dataFine, Dipendente dipendente, Officina offDip) {
	this.idContr = idContr;
	this.dataInizio = dataInizio;
	this.dataFine = dataFine;
	this.dipendente = dipendente;
	this.offDip = offDip;
}
public ContrattoDip(int idContr, Date dataInizio, Dipendente dipendente, Officina offDip) {
	this.idContr = idContr;
	this.dataInizio = dataInizio;
	this.dipendente = dipendente;
	this.offDip = offDip;
}
public int getIdContr() {
	return idContr;
}
public void setIdContr(int idContr) {
	this.idContr = idContr;
}
public Date getDataInizio() {
	return dataInizio;
}
public void setDataInizio(Date dataInizio) {
	this.dataInizio = dataInizio;
}
public Date getDataFine() {
	return dataFine;
}
public void setDataFine(Date dataFine) {
	this.dataFine = dataFine;
}
public Dipendente getDipendente() {
	return dipendente;
}
public void setDipendente(Dipendente dipendente) {
	this.dipendente = dipendente;
}
public Officina getOffDip() {
	return offDip;
}
public void setOffDip(Officina offDip) {
	this.offDip = offDip;
}
@Override
public String toString() {
	return "ContrattoDip [idContr=" + idContr + ", dataInizio=" + dataInizio + ", dataFine=" + dataFine
			+ ", dipendente=" + dipendente + ", offDip=" + offDip + "]";
}



}
