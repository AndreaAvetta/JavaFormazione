package model;

import java.util.Date;

public class ContrattoDir {
	int idContr;
	Date dataInizio;
	Date dataFine;
	Direttore direttore;
	Officina offDir;
	
	
	
	public ContrattoDir(int idContr, Date dataInizio, Date dataFine, Direttore direttore, Officina offDir) {
		this.idContr = idContr;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.direttore = direttore;
		this.offDir = offDir;
	}
		
		
	public ContrattoDir(int idContr, Date dataInizio, Direttore direttore, Officina offDir) {
		this.idContr = idContr;
		this.dataInizio = dataInizio;
		this.direttore = direttore;
		this.offDir = offDir;
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
	public Direttore getDirettore() {
		return direttore;
	}
	public void setDirettore(Direttore direttore) {
		this.direttore = direttore;
	}
	public Officina getOffDir() {
		return offDir;
	}
	public void setOffDir(Officina offDir) {
		this.offDir = offDir;
	}


	@Override
	public String toString() {
		return "ContrattoDir [idContr=" + idContr + ", dataInizio=" + dataInizio + ", dataFine=" + dataFine
				+ ", direttore=" + direttore + ", offDir=" + offDir + "]";
	}
	
	
	
}
