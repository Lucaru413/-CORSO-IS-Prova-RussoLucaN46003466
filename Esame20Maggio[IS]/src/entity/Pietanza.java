package entity;

public class Pietanza {
private String nome;
private String descrizione;
private int prezzo;

public Pietanza(String _nome,String _desc,int _prezzo) {
	nome=_nome;
	descrizione=_desc;
	prezzo=_prezzo;
}
public Pietanza(String _nome,int _prezzo) {
	nome=_nome;
	descrizione=null;
	prezzo=_prezzo;
}

public void set_nome(String _nome) {nome=_nome;}
public void set_desc(String _desc) {descrizione=_desc;}
public void set_prezzo(int _prezzo) {prezzo=_prezzo;}

public int get_prezzo() {return prezzo;}
public String get_nome() {return nome;}
public String get_descrizione() {return descrizione;}
}
