package entity;

public class RichiestaPietanza {
private ClienteRegistrato richiedente;
private Pietanza pietanza;
private int numero_pezzi;
private int prezzo;

public RichiestaPietanza(ClienteRegistrato _rich,Pietanza _pietanza,int _num) {
	richiedente=_rich;pietanza=_pietanza;numero_pezzi=_num;prezzo=pietanza.get_prezzo()*numero_pezzi;}

public void set_rich(ClienteRegistrato _rich) {richiedente=_rich;}
public void set_piet(Pietanza piet) {pietanza=piet;}
public void set_num(int num) {numero_pezzi=num;}
public void set_prezz(int _prezzo) {prezzo=_prezzo;}

public ClienteRegistrato get_rich() {return richiedente;}
public Pietanza get_piet() {return pietanza;}
public int get_num() {return numero_pezzi;}
public int get_prezzo() {return prezzo;}
}
