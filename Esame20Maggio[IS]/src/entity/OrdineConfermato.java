package entity;

import java.util.ArrayList;
import java.util.Date;

public class OrdineConfermato extends Ordine{
private static int counter=0;
private int codice;
private Stato_Ordine stato;

public OrdineConfermato() {
	super();codice=++counter;stato=Stato_Ordine.NON_CONSEGNATO;
}

public OrdineConfermato(ClienteRegistrato _cliente,Ristorante _risto,Date _data) {
	super(_cliente,_risto,_data);codice=++counter;stato=Stato_Ordine.NON_CONSEGNATO;
}

public OrdineConfermato(ClienteRegistrato _cliente,Ristorante _risto,ArrayList<RichiestaPietanza> _cibi,Date _data) {
	super(_cliente,_risto,_cibi,_data);codice=++counter;stato=Stato_Ordine.NON_CONSEGNATO;
}
public OrdineConfermato(ClienteRegistrato _cliente,Ristorante _risto,ArrayList<RichiestaPietanza> _cibi,int _prezzo,Date _data) {
	super(_cliente,_risto,_cibi,_prezzo,_data);codice=++counter;stato=Stato_Ordine.NON_CONSEGNATO;
}

public void set_codice(int _cod) {codice=_cod;}
public void set_stato(Stato_Ordine _stato) {stato=_stato;}

public int get_codice() {return codice;}
public Stato_Ordine get_ordine() {return stato;}

}
