package entity;

public class RistoratoreRegistrato {
	private String nome;
	private String cognome;
	private Ristorante ristorante;
	
	public RistoratoreRegistrato(String _nome,String _cognome,Ristorante _rist){
		nome=_nome;
		cognome=_cognome;
		ristorante=_rist;
	}
	
	public void set_nome(String _nome) {nome=_nome;}
	public void set_cognome(String _cognome) {cognome=_cognome;}
	public void set_ristorante(Ristorante rist) {ristorante=rist;}
	
	public String get_nome() {return nome;}
	public String get_cognome() {return cognome;}
	public Ristorante get_ristorante() {return ristorante;}

}
