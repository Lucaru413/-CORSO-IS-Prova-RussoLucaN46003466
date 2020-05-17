package entity;

public class ClienteRegistrato {
	private String nome;
	private String cognome;
	private CartaDiCredito carta;
	private String numerotelefono;
	
	public ClienteRegistrato(String _nome,String _cognome, CartaDiCredito _carta,String _num) {
		nome=_nome;
		cognome=_cognome;
		carta=_carta;
		numerotelefono=_num;
	}
	
	public void set_nome(String _nome) {nome=_nome;}
	public void set_cognome(String _cognome) {cognome=_cognome;}
	public void set_carta(CartaDiCredito _carta) {carta=_carta;}
	public void set_num(String _num) {numerotelefono=_num;}
	
	public String get_nome() {return nome;}
	public String get_cognome() {return cognome;}
	public CartaDiCredito get_carta() {return carta;}
	public String get_num() {return numerotelefono;}

}
