package control;
import entity.*;
import java.util.ArrayList;

public class GestionePietanze {

	public GestionePietanze() {}
	
	public void inserisciPietanza(RistoratoreRegistrato rist,Pietanza p) {
		rist.get_ristorante().get_pietanze().add(p);
		
	}
	
	public void RimuoviPietanza(RistoratoreRegistrato rist,Pietanza p) {
		rist.get_ristorante().get_pietanze().remove(p);
	}
	
	
	public void ModificaPrezzoPietanza(RistoratoreRegistrato rist,Pietanza p,int nuovoprezzo) {
		for(Pietanza q: rist.get_ristorante().get_pietanze()) {
			if(q.get_nome()==p.get_nome()) p.set_prezzo(nuovoprezzo);
		}
	}
	
	public void ModificaNomePietanza(RistoratoreRegistrato rist,Pietanza p,String nuovonome) {
		for(Pietanza q: rist.get_ristorante().get_pietanze()) {
			if(q.get_nome()==p.get_nome()) p.set_nome(nuovonome);
		}
	}
	
	public void ModificaDescrizionePietanza(RistoratoreRegistrato rist,Pietanza p,String nuovadescr) {
		for(Pietanza q: rist.get_ristorante().get_pietanze()) {
			if(q.get_nome()==p.get_nome()) {p.set_desc(nuovadescr);}
		}
	}
	
	
			

	}
	

