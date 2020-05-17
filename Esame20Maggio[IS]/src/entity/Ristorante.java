package entity;
import java.util.ArrayList;

public class Ristorante {
private String nome;
private Indirizzo indirizzo;
private String numerotelefono;
private String email;
private ArrayList<Pietanza> pietanze_disp;

public Ristorante(String _nome,Indirizzo _ind,String _num,String _email) {
	nome=_nome;
	indirizzo=_ind;
	numerotelefono=_num;
	email=_email;
	pietanze_disp= new ArrayList<Pietanza>();
}

public Ristorante() {
	pietanze_disp=new ArrayList<Pietanza>();
}



public void set_nome(String _nome) {nome=_nome;}
public void set_indirizzo(Indirizzo _ind) {indirizzo=_ind;}
public void set_numero(String _num) {numerotelefono=_num;}
public void set_email(String _email) {email=_email;}



public String get_nome() {return nome;}
public Indirizzo get_indirizzo() {return indirizzo;}
public String get_num() {return numerotelefono;}
public String get_email() {return email;}
public ArrayList<Pietanza> get_pietanze() {return pietanze_disp;}



  
    }



