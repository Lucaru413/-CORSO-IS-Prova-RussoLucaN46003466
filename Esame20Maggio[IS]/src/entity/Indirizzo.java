package entity;

public class Indirizzo {
private String citta;
private String via;
private int num_civico;

public Indirizzo(String _citta,String _via,int _num) {citta=_citta;via=_via;num_civico=_num;}

public void set_citta(String _citta) {citta=_citta;}
public void set_via(String _via) {via=_via;}
public void set_num(int _num) {num_civico=_num;}

public String get_citta() {return citta;}
public String get_via() {return via;}
public int get_num() {return num_civico;}
}
