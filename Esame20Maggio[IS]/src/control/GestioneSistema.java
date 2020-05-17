package control;
import java.util.ArrayList;
import entity.*;
public class GestioneSistema {

private ArrayList<Rider> riders;
private ArrayList<ClienteRegistrato> clienti;
private ArrayList<RistoratoreRegistrato> ristoratori;


public GestioneSistema() {
	riders=new ArrayList<Rider>();
	clienti=new ArrayList<ClienteRegistrato>();
	ristoratori=new ArrayList<RistoratoreRegistrato>();
}

public void registra_cliente(ClienteRegistrato cliente) {
	clienti.add(cliente);
}
public void registra_ristoratore(RistoratoreRegistrato ristoratore) {
	ristoratori.add(ristoratore);
}

public void aggiungi_rider(Rider rider) {
	riders.add(rider);
}
}
