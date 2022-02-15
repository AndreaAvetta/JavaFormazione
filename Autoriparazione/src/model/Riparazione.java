package model;

import java.util.Date;

public class Riparazione {
int codRip;
Officina officinaRip;
Veicolo veicoloRip;
Date DataAccettaz;
Fattura fatt;


public Riparazione(int codRip, Officina officinaRip, Veicolo veicoloRip, Date dataAccettaz, Fattura fatt) {
	this.codRip = codRip;
	this.officinaRip = officinaRip;
	this.veicoloRip = veicoloRip;
	this.DataAccettaz = dataAccettaz;
	this.fatt= fatt;
}


public int getCodRip() {
	return codRip;
}


public Officina getOfficinaRip() {
	return officinaRip;
}



public Veicolo getVeicoloRip() {
	return veicoloRip;
}


public Date getDataAccettaz() {
	return DataAccettaz;
}


public Fattura getFatt() {
	return fatt;
}


@Override
public String toString() {
	return "Riparazione [codRip=" + codRip + ", officinaRip=" + officinaRip + ", veicoloRip=" + veicoloRip
			+ ", DataAccettaz=" + DataAccettaz + ", fatt=" + fatt + "]";
}






}
