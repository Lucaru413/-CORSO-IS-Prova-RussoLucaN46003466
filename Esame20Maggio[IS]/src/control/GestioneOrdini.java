package control;
import entity.*;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class GestioneOrdini {
	private ArrayList<Ordine> Ordini;
	private ArrayList<OrdineConfermato> OrdiniConfermati;
	private ArrayList<Ristorante> Ristoranti;
	
	public GestioneOrdini(){
		Ordini=new ArrayList<Ordine>();
		OrdiniConfermati=new ArrayList<OrdineConfermato>();
	    Ristoranti=new ArrayList<Ristorante>();	}
	
	public void stampaRistoranti() {
		for(Ristorante r:Ristoranti) {
			System.out.println(r.get_nome() + " " + "numero: " +r.get_num() + " "+ "email: "+r.get_email() +"\n");
		}
	}
public void pietanzeRistorante(Ristorante R) {
	    for(Pietanza p: R.get_pietanze()) {
	        System.out.println("|Nome " + p.get_nome());
	        System.out.println("|Descrizione " + p.get_descrizione());
	        System.out.println("|Prezzo " + p.get_prezzo());
	        System.out.println("\n");
	    }
	}

public void StampaOrdini() {
    for(Ordine O: Ordini) {
        System.out.println("|Cliente " + O.get_cliente().get_nome());
        System.out.println("|Ristorante " + O.get_ristorante().get_nome());
        System.out.println("|Prezzo " + O.get_prezzo());
        System.out.println("\n");
    }
}

public void GeneraReport(Ristorante R,int mese,int anno) {int counter=0;
    if(mese>12 || anno >2020) {System.out.println("Data non Valida");return;}
	if(this.trovaRistorante(R)==false) {System.out.println("Ristorante non registrato");return;}
    
	for(OrdineConfermato O: OrdiniConfermati) { 
      if(O.get_ristorante()==R&& O.get_data().getMonth()==mese && O.get_data().getYear()==anno) {
    	counter++;
        System.out.println("|Cliente " + O.get_cliente().get_nome());
        System.out.println("|Ristorante " + O.get_ristorante().get_nome());
        System.out.println("|Prezzo " + O.get_prezzo());
        System.out.println("\n");}
    }
	
	if (counter==0){System.out.println("Nessun Ordine ultimato in questo periodo");}
    }



public void StampaPietanzeOrdinate(Ordine O) {
	for (RichiestaPietanza P: O.get_cibi() )  {
		System.out.println(P.get_piet().get_nome() + " " + P.get_num() + "  " + P.get_prezzo()+" euro\n ");
	}
}

public void aggiungiOrdine(Ordine O) {
	Ordini.add(O);
	this.aggiungiRistorante(O.get_ristorante());
}
public void confermaOrdine(Ordine O) {
	OrdineConfermato ordine= new OrdineConfermato(O.get_cliente(),O.get_ristorante(),O.get_cibi(),O.get_data());
	OrdiniConfermati.add(ordine);
	ordine.get_cliente().get_carta().set_saldo(ordine.get_cliente().get_carta().get_saldo()-ordine.get_prezzo());
	}

public void aggiungiRistorante(Ristorante R) {
	if(this.trovaRistorante(R)==false) {
	Ristoranti.add(R);}else {return;}
}

public void aggiungiAllOrdine(RichiestaPietanza Richi,Ordine Ordi) {
	for(Pietanza P: Ordi.get_ristorante().get_pietanze()) {
		if(P==Richi.get_piet()) {Ordi.aggiungiCibo(Richi); return;}
		};
	}



public void notificaRider(Rider R, OrdineConfermato O)
{R.aggiungi_consegna(O);}

public void notificaConsegnaEffettuata(Rider R,OrdineConfermato O) {
	O.set_stato(Stato_Ordine.CONSEGNATO);
	R.rimuovi_consegna(O);
}


public boolean trovaRistorante(Ristorante Ris) {int counter=0;for(Ristorante R:Ristoranti) { if(R==Ris) { counter++;}} if(counter>0) { return true;}else return false;} 

}

