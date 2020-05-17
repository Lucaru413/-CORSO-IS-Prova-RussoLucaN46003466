package entity;
import java.util.ArrayList;

public class Rider {
private String nome;
private String cognome;
private int numerotelefono;
private ArrayList<OrdineConfermato> consegne;

public Rider(String _nome,String _cognome, int _num) {
	nome=_nome;
	cognome=_cognome;
	numerotelefono=_num;
	consegne= new ArrayList<OrdineConfermato>();
}

public void set_nome(String _nome) {nome=_nome;}
public void set_cognome(String _cognome) {cognome=_cognome;}
public void set_numero(int _num) {numerotelefono=_num;}
public void set_consegna(ArrayList<OrdineConfermato> _consegne) {consegne=_consegne;}


public String get_nome() {return nome;}
public String get_cognome() {return cognome;}
public int get_num() {return numerotelefono;}
public ArrayList<OrdineConfermato> get_consegne(){return consegne;}

public void aggiungi_consegna(OrdineConfermato O) {consegne.add(O);}
public void rimuovi_consegna(OrdineConfermato O) {consegne.remove(O);}
}
