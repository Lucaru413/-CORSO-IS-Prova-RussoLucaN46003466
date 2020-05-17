package entity;

public class CartaDiCredito {
private String tipo;
private int saldo;

public CartaDiCredito(String _tipo, int _saldo) {tipo=_tipo;saldo=_saldo;}


public void set_saldo(int _saldo) {saldo=_saldo;}
public void set_tipo(String _tipo) {tipo=_tipo;}
public int get_saldo() {return saldo;}
String get_tipo() {return tipo;}
}
