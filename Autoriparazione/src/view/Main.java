package view;

import java.util.Date;
import java.util.ArrayList;

import controller.GeneralController;
import model.ContrattoDip;
import model.ContrattoDir;
import model.Dipendente;
import model.Direttore;
import model.Fattura;
import model.Officina;
import model.Persona;
import model.Riparazione;
import model.Veicolo;

public class Main {

	public static void main(String[] args) {
		
			
		GeneralController gc = new GeneralController();
		Dipendente d1 = new Dipendente("VTNLCS12F92H", "via Belluno 15" , "3384313923");
		Dipendente d2 = new Dipendente("AFGHPQ12F93F", "Corso Cairoli 27" , "3475313926");
		Dipendente d3 = new Dipendente("SMCPJA45P21M", "via Caudana 91" , "3330317921");
		Dipendente d4 = new Dipendente("SMCPJA45P21M", "via Caudana 91" , "3330317921");
		Dipendente d5 = new Dipendente("SMCPJA45P21M", "via Caudana 91" , "3330317921");
		Dipendente d6 = new Dipendente("AFGHPQ12F93F", "Corso Cairoli 27" , "3475313926");
		gc.addDipendente(d1);
		gc.addDipendente(d2);
		gc.addDipendente(d3);
		gc.addDipendente(d4);
		gc.addDipendente(d5);
		gc.addDipendente(d6);
		
		Officina o1 = new Officina("Officina Cernaia", "Piazzale Augusto 1/A");
		Officina o2 = new Officina("Officina Motori e Motori", "via Caudana 82");
		Officina o3 = new Officina("Officina Pirelli", "Lungo san Basilio 9");
		gc.addOfficina(o1);
		gc.addOfficina(o2);
		gc.addOfficina(o3);
		
		Direttore dir1 = new Direttore("MTLLCB125F92M", "via Belluno 22" , "3384313876",48, o2);
		Direttore dir2 = new Direttore("ASGNPV17F55L", "Corso Cairoli 33" , "3475313502", 55, o1);
		Direttore dir3 = new Direttore("SMYPJA34F21G", "via Caudana 51" , "3330317481", 60, o3);
		gc.addDirettore(dir1);
		gc.addDirettore(dir2);
		gc.addDirettore(dir3);
		
		
		Persona c1 = new Persona("FMLPJA34F85Z", "Lungo san Basilio 43" , "3337597222");
		Persona c2 = new Persona("FMSNJA32F90H", "via Torino 11" , "3337597333");
		Persona c3 = new Persona("LQLPJA34F29C", "Piazzale Augusto 8" , "3337597444");
		gc.addCliente(c1);
		gc.addCliente(c2);
		gc.addCliente(c3);
		
		
		Veicolo v1 = new Veicolo("Fiat punto" , "1.2", "XY356LP", 2011 , c1);
		Veicolo v2 = new Veicolo("Hyundai i20" , "5p sound", "AS221VT", 2015 ,c2);
		Veicolo v3 = new Veicolo("Renault Clio" , "Comfort 1.4", "VR528XT", 2007 ,c3);
		gc.addVeicolo(v1);
		gc.addVeicolo(v2);
		gc.addVeicolo(v3);
		
		Date dInizio1 =  gc.setData("21/01/2018");
		Date dInizio2 =  gc.setData("15/09/2021");
		Date dInizio3 =  gc.setData("7/01/2022");
		Date dFine2 =  gc.setData("15/07/2022");
		Date dFine3 =  gc.setData("7/01/2023");
		ContrattoDip cDip1 = new ContrattoDip(1, dInizio1 ,null ,  d2, o1);
		ContrattoDip cDip2 = new ContrattoDip(2, dInizio2 ,dFine2 ,  d3, o3);
		ContrattoDip cDip3 = new ContrattoDip(3, dInizio3 , dFine3 , d1, o2);
		gc.addContrattoDip(cDip1);
		gc.addContrattoDip(cDip2);	
		gc.addContrattoDip(cDip3);
		
		Date dInizio4 =  gc.setData("19/08/1998");
		Date dInizio5 =  gc.setData("22/02/2007");
		Date dInizio6 =  gc.setData("9/01/2021");
		Date dFine6 = gc.setData("9/01/2022");
		ContrattoDir cDir1 = new ContrattoDir(1 , dInizio4 , null, dir1 , o3);
		ContrattoDir cDir2 = new ContrattoDir(2 , dInizio5, null, dir2, o2);
		ContrattoDir cDir3 = new ContrattoDir(3 , dInizio6 , dFine6 , dir3 , o1);
		gc.addContrattoDir(cDir1);
		gc.addContrattoDir(cDir2);
		gc.addContrattoDir(cDir3);
		

		Date dataFatt1 = (Date) gc.setData("30/01/2022");
		Date dataFatt2 = (Date) gc.setData("3/02/2022");
		Date dataFatt3 = (Date) gc.setData("30/12/2021");
		ArrayList<Dipendente> off1 = gc.DipendentiRip1(o1); 
		ArrayList<Dipendente> off2 = gc.DipendentiRip1(o2); 
		ArrayList<Dipendente> off3 = gc.DipendentiRip1(o3); 
		Fattura fatt1 = new Fattura(1,dataFatt1, d1 , 150.22f , off1);
		Fattura fatt2 = new Fattura(2,dataFatt2, d2 , 80.78f , off3 );
		Fattura fatt3 = new Fattura(3,dataFatt3, d3, 331.15f , off2);
		gc.addFattura(fatt1);
		gc.addFattura(fatt2);
		gc.addFattura(fatt3);
		
		Date dataRip1 = (Date) gc.setData("26/01/2022");
		Date dataRip2 = (Date) gc.setData("1/02/2022");
		Date dataRip3 = (Date) gc.setData("20/12/2021");
		Riparazione rip1 = new Riparazione(1, o1 , v1, dataRip1, fatt1);
		Riparazione rip2 = new Riparazione(2, o3, v2 , dataRip2, fatt2);
		Riparazione rip3 = new Riparazione(3, o2, v3 , dataRip3, fatt3);
		gc.addRiparazione(rip1);
		gc.addRiparazione(rip2);
		gc.addRiparazione(rip3);
		
		
		
		gc.OfficineDip(d1);
		gc.veicoliRip( o1 );
		gc.OfficineRip(v1);
		gc.SpesaTotale(v1);
		System.out.println(gc.isDoppione(gc.dipendenti));
		System.out.println(gc.iDoppioni(gc.dipendenti));
	}

	

}
