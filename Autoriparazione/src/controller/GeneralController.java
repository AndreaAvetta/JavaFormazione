package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import model.ContrattoDip;
import model.ContrattoDir;
import model.Dipendente;
import model.Direttore;
import model.Fattura;
import model.Officina;
import model.Persona;
import model.Riparazione;
import model.Veicolo;


public class GeneralController {

	public ArrayList<Dipendente> dipendenti = new ArrayList<Dipendente>();  
	public ArrayList<Persona> persone = new ArrayList<Persona>();
	public ArrayList<Direttore> direttori = new ArrayList<Direttore>();		
	public ArrayList<Officina> officine = new ArrayList<Officina>();		
	public ArrayList<Fattura> fatture = new ArrayList<Fattura>();			
	public ArrayList<Riparazione> riparazioni = new ArrayList<Riparazione>();	
	public ArrayList<Veicolo> veicoli = new ArrayList<Veicolo>();			
	public ArrayList<ContrattoDir> contrattiDir = new ArrayList<ContrattoDir>();		
	public ArrayList<ContrattoDip> contrattiDip = new ArrayList<ContrattoDip>();		


	
//aggiunta dipendente nell'arraylist dipendenti
	public void addDipendente(Dipendente d) {
		if(dipendenti.isEmpty()) {			//controllo se la lista è vuota
			dipendenti.add(d);
		}else {
			/*			boolean thereIs = false;		
		for(Dipendente dip : dipendenti) {				//controllo se l'oggetto che si sta immettendo è già presente nella lista			
			if(dip.getCodFiscale().equals(d.getCodFiscale())) {
				System.out.println("Dipendente già esistente");
				thereIs =true;
			}
		}
		if (!thereIs)
		{*/
		dipendenti.add(d);						

	}}
	
	
	public void addDirettore(Direttore dir) {
		if(direttori.isEmpty()) {
			direttori.add(dir);
		}else {
			boolean thereIs = false;
		for(Direttore d : direttori) {
			if(d.getCodFiscale().equals(dir.getCodFiscale())) {
				System.out.println("Direttore già esistente");
				thereIs =true;
			}
		}
		if (!thereIs)
		{
		direttori.add(dir);

	}}
	}

	
	public void addCliente(Persona cli) {
		if(persone.isEmpty()) {
			persone.add(cli);
		}else {
			boolean thereIs = false;
		for(Persona p : persone) {
			if(p.getCodFiscale().equals(cli.getCodFiscale())) {
				System.out.println("Cliente già esistente");
				thereIs =true;
			}
		}
		if (!thereIs)
		{
		persone.add(cli);

	}}
	}
	
	public void addVeicolo(Veicolo v) {
		if(veicoli.isEmpty()) {
			veicoli.add(v);
		}else {
			boolean thereIs = false;
		for(Veicolo vel : veicoli) {
			if(vel.getTarga().equals(v.getTarga())) {
				System.out.println("Veicolo già esistente");
				thereIs =true;
			}
		}
		if (!thereIs)
		{
		veicoli.add(v);

	}}
	}
	
	
	public void addOfficina(Officina o) {
		if(officine.isEmpty()) {
			officine.add(o);
		}else {
			boolean thereIs = false;
		for(Officina off : officine) {
			if(off.getNomeOff().equals(o.getNomeOff())) {
				System.out.println("Officina già esistente");
				thereIs =true;
			}
		}
		if (!thereIs)
		{
		officine.add(o);

	}}
	}
	
	public void addRiparazione(Riparazione r) {
		if(riparazioni.isEmpty()) {
			riparazioni.add(r);
		}else {
			boolean thereIs = false;
		for(Riparazione rip : riparazioni) {
			if(rip.getCodRip() == r.getCodRip()) {
				System.out.println("Riparazione già esistente");
				thereIs =true;
			}
		}
		if (!thereIs)
		{
		riparazioni.add(r);
	}}
		
	}
	

	public void addFattura(Fattura f) {
		if(fatture.isEmpty()) {
			fatture.add(f);
		}else {
			boolean thereIs = false;
		for(Fattura fatt : fatture) {
		if(fatt.getIdFatt() == f.getIdFatt()) {
			System.out.println("Fattura già esistente");
				thereIs =true;
				fatture.add(f);
			}
		}
		if (!thereIs)
		{
		fatture.add(f);

	}}
	}
	

	public void addContrattoDir(ContrattoDir cDir) {
		if(contrattiDir.isEmpty()) {
			contrattiDir.add(cDir);
		}else {
			boolean thereIs = false;
		for(ContrattoDir cDirr : contrattiDir) {
			if(cDirr.getIdContr() == cDirr.getIdContr()) {
				System.out.println("Contratto già esistente");
				thereIs =true;
			}
		}
		if (!thereIs)
		{
		contrattiDir.add(cDir);
	}}	
	}
	
	public void addContrattoDip(ContrattoDip cDip) {
		if(contrattiDip.isEmpty()) {
			contrattiDip.add(cDip);
		}else {
			boolean thereIs = false;
		for(ContrattoDip cDipp : contrattiDip) {
			if(cDipp.getIdContr() == cDip.getIdContr()) {
				System.out.println("Contratto già esistente");
				thereIs =true;
			}
		}
		if (!thereIs)
		{
		contrattiDip.add(cDip);
	}}		
	}
	
	public Date setData(String data) {
		Date date = null;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try{
		format.setLenient(false);
		date = format.parse(data);
		return date;
		} catch (ParseException e) {
		System.out.println("Formato data non valido.");
		return null;
		}
		
	}

		
	public Officina getOfficinaByNome(String nomeOff) {
		Officina o = null;
		for(Officina off : officine) {
			if(off.getNomeOff().equals(nomeOff)) {
				o = off;
			}
		}
		return o;
	}
	
	public boolean isDoppione(ArrayList<?> obj){
	//	System.out.println(obj.size());
		for(int i=0; i< obj.size(); i++) {
			for(int j=0; j< obj.size(); j++){
				if(i != j && obj.get(i).toString().equals(obj.get(j).toString())){
					System.out.println(obj.get(i).toString());
					System.out.println(obj.get(j).toString());
					return true;
				}
			}
		}return false;
		}
	
	
		
	public ArrayList<?> iDoppioni(ArrayList<?> obj){
		ArrayList<Object> doppioni = new ArrayList<Object>();
		for(int i=0; i< obj.size(); i++) {
			for(int j=0; j< obj.size(); j++){
				if(i != j && obj.get(i).toString().equals(obj.get(j).toString())){
					doppioni.add(obj.get(i));
		//			doppioni.add(obj.get(j));

				}
			}
		}return doppioni;
	}
	
		
	/*
	private Dipendente getDipendenteByCodF(String codFiscale) {
		Dipendente d = null;
		for(Dipendente dip : dipendenti) {
			if(dip.getCodFiscale().equals(codFiscale)) {
				d = dip;
			}
		}
		return d;
	}
	
	private Direttore getDirettoreByCodF(String codFiscale) {
		Direttore dir = null;
		for(Direttore d : direttori) {
			if(d.getCodFiscale().equals(codFiscale)) {
				dir = d;
			}
		}
		return dir;
	}
	
	private Persona getPersonaByCodF(String codF) {
		Persona cli = null;
		for(Persona p : persone) {
			if(p.getCodFiscale().equals(codF)) {
				cli = p;
			}
		}
		return cli;
	}*/
	
	public Veicolo getVeicoloByTarga(String targa) {
		Veicolo vel = null;
		for(Veicolo v : veicoli) {
			if(v.getTarga().equals(targa)) {
				vel = v;
			}
		}
		return vel;
	}
	
	/*
	private Riparazione getRiparazioneByCodRip(int codRip) {
		Riparazione rip = null;
		for(Riparazione r : riparazioni) {
			if(r.getCodRip() == codRip) {
				rip = r;
			}
		}
		return rip;
	}*/
	
	public ArrayList<Dipendente>  DipendentiRip1(Officina o) {
		ArrayList<Dipendente> DipendentiRip = new ArrayList<Dipendente>();
	for ( ContrattoDip cDip : contrattiDip) {
		if(cDip.getOffDip().getNomeOff().equals(o.getNomeOff())) {
			DipendentiRip.add(cDip.getDipendente());
		}
	} return DipendentiRip;

}
	/*
	private Fattura getFatturaById(int idFatt) {
		Fattura fatt = null;
		for(Fattura f : fatture) {
			if(f.getIdFatt() == idFatt) {
				fatt = f;
			}
		}
		return fatt;
	}*/
	
	
	public ArrayList<Officina> OfficineDip(Dipendente dip){
		ArrayList<Officina> officineDip = new ArrayList<Officina>();
		for(ContrattoDip cDip : contrattiDip) {
		if(cDip.getDipendente().equals(dip)){
		officineDip.add(cDip.getOffDip());
		}	
		}return officineDip;
		}

	public Dipendente getDipendenteById(int id) {
		Dipendente d = null;
		d = dipendenti.get(id);
		return d;
	}
	
	public ArrayList<Veicolo> veicoliRip(Officina officina){
		ArrayList<Veicolo> veicoliRip = new ArrayList<Veicolo>();
		for(Riparazione rip : riparazioni){
		if(rip.getOfficinaRip().getNomeOff().equals(officina.getNomeOff())){
		veicoliRip.add(rip.getVeicoloRip());
		}	
		}return veicoliRip;
		}

	public ArrayList<Officina> OfficineRip(Veicolo veicolo){
		ArrayList<Officina> officineRip = new ArrayList <Officina>();
		for(Riparazione rip : riparazioni){
		if(rip.getVeicoloRip().getTarga().equals(veicolo.getTarga())){
		officineRip.add(rip.getOfficinaRip());
		}
		}return officineRip;
		}
	
	public float SpesaTotale(Veicolo veicolo){
		float totale = 0;
		for(Riparazione rip : riparazioni){
		if(rip.getVeicoloRip().getTarga().equals(veicolo.getTarga())){
		totale= totale + rip.getFatt().getCosto();
		}	
		}return totale;
		}



	
}
