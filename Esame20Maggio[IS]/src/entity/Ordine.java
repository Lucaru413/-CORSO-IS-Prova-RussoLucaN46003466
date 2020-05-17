package entity;
import java.util.ArrayList;
import java.util.Date;
public class Ordine {
private ClienteRegistrato cliente;
private Ristorante ristorante;
private ArrayList<RichiestaPietanza> cibi;
private int prezzo;
private Date data;

public Ordine() {
	cibi=new ArrayList<RichiestaPietanza>();
};

public Ordine(ClienteRegistrato _cliente,Ristorante _risto,Date _data) {
	
	cliente=_cliente;
	ristorante=_risto;
	cibi=new ArrayList<RichiestaPietanza>();
	data=_data;

}

public Ordine(ClienteRegistrato _cliente,Ristorante _risto,ArrayList<RichiestaPietanza> _cibi,Date _data) {
	cliente=_cliente;
	ristorante=_risto;
	cibi=_cibi;
	data=_data;

}
public Ordine(ClienteRegistrato _cliente,Ristorante _risto,ArrayList<RichiestaPietanza> _cibi,int _prezzo,Date _data) {
	cliente=_cliente;
	ristorante=_risto;
	cibi=_cibi;
	prezzo=_prezzo;
	data=_data;
}

public Ordine(ClienteRegistrato _cliente,Ristorante _risto,int _prezzo,Date _data) {
	cliente=_cliente;
	ristorante=_risto;
	cibi=new ArrayList<RichiestaPietanza>();
	prezzo=_prezzo;
	data=_data;
}


public void set_cliente(ClienteRegistrato _cliente) {cliente=_cliente;}
public void set_risto(Ristorante _rist) {ristorante=_rist;}
public void set_cibi(ArrayList<RichiestaPietanza> _cibi ) {cibi=_cibi;}
public void set_prezzo(int _prezzo) {prezzo=_prezzo;}
public void set_data(Date _data) {data=_data;}

public ArrayList<RichiestaPietanza> get_cibi(){return cibi;}

public int get_prezzo() {int a=0;
for(RichiestaPietanza p:cibi) {
	a+=p.get_prezzo();
}
return a;}

public ClienteRegistrato get_cliente() {return cliente;}
public Ristorante get_ristorante() {return ristorante;}
public Date get_data() {return data;}

public void aggiungiCibo(RichiestaPietanza R) {cibi.add(R);}


}
