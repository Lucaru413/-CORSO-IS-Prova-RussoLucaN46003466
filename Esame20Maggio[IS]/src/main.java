import control.*;
import entity.*;
import java.util.Date;

public class main {

	public static void main(String[] args) {
		//gestori
		GestioneOrdini gestore= new GestioneOrdini();
		GestionePietanze gestorePietanze=new GestionePietanze();
		
		//creazioni di date da usare per gli ordini
		Date data1=new Date(2020,01,12);
		Date data2=new Date(2020,02,14);
		Date data3=new Date(2020,11,12);
		
		//creazioni di pietanze
		Pietanza margherita=new Pietanza("Margherita",5);
		Pietanza marinara= new Pietanza("Marinara",3);
		Pietanza funghetto=new Pietanza("funghetto",7);
		Pietanza carbonara= new Pietanza("carbonara",6);
		Pietanza cacio=new Pietanza("CacioePepe",5);
		Pietanza hamburger=new Pietanza("Hamburger",4);
		Pietanza tacchino= new Pietanza("Tacchino",3);
		Pietanza pesto=new Pietanza("PastaPesto",4);
		
		//creazioni di indirizzi da assegnare ai Ristoranti
		Indirizzo address1= new Indirizzo("Napoli","Via Cupa",676);
		Indirizzo address2= new Indirizzo("Napoli","Via Male",221);
		Indirizzo address3= new Indirizzo("Roma","Via Prova",112);
		
		//creazioni di cartedicredito per i clienti
		CartaDiCredito cartaLuca= new CartaDiCredito("Mastercard",500);
		CartaDiCredito cartaPeppe= new CartaDiCredito("Visa",100);
		
		//Registrazioni Clienti
		ClienteRegistrato Luca=new ClienteRegistrato("Luca","Russo",cartaLuca,"331761");
		ClienteRegistrato Peppe=new ClienteRegistrato("Peppe","Savano",cartaPeppe,"333141");
		
		//creazioni Ristoranti
		Ristorante LaCicala= new Ristorante("LaCicala",address1,"08111","lacicala@gmail.com");
		Ristorante Domino= new Ristorante("Domino",address2,"081222","Domino@pizza.it");
		Ristorante Gattara=new Ristorante("Gattara",address3,"081222","Gattara@outlook.it");
		
		//Registrazione di Ristoratori
		RistoratoreRegistrato Pino= new RistoratoreRegistrato("Pino","Martire",LaCicala);
		RistoratoreRegistrato Daniele=new RistoratoreRegistrato("Daniele","Ricciardi",Domino);
		RistoratoreRegistrato Silvia= new RistoratoreRegistrato("Silvia","Finizi",Gattara);
		
		//Ristoratore Pino inserisce Pietanze nel proprio ristorante
		gestorePietanze.inserisciPietanza(Pino, margherita);
		gestorePietanze.inserisciPietanza(Pino, carbonara);
		gestorePietanze.inserisciPietanza(Pino,funghetto);
		gestorePietanze.inserisciPietanza(Pino, cacio);
		
		//Ristoratore Daniele inserisce Pietanze nel proprio ristorante
		gestorePietanze.inserisciPietanza(Daniele, marinara);
		gestorePietanze.inserisciPietanza(Daniele, tacchino);
		gestorePietanze.inserisciPietanza(Daniele, hamburger);
		gestorePietanze.inserisciPietanza(Daniele, margherita);
		
		//Ristoratore Silvia inserisce Pietanze nel proprio ristorante
		gestorePietanze.inserisciPietanza(Silvia, cacio);
		gestorePietanze.inserisciPietanza(Silvia, carbonara);
		gestorePietanze.inserisciPietanza(Silvia, margherita);
		gestorePietanze.inserisciPietanza(Silvia, pesto);
		
		//Effettuazione Ordine del Cliente Luca: aggiunge le sue richieste, che vengono aggiunte all'ordine, e infine confermato(opzionale)
		Ordine ordi1= new Ordine(Luca,LaCicala,data2);
		gestore.aggiungiOrdine(ordi1);
		RichiestaPietanza richi1=new RichiestaPietanza(Luca,margherita,3);
		RichiestaPietanza richi2=new RichiestaPietanza(Luca,carbonara,2);
		RichiestaPietanza richi3=new RichiestaPietanza(Luca, funghetto ,1);
		gestore.aggiungiAllOrdine(richi1,ordi1);
		gestore.aggiungiAllOrdine(richi2, ordi1);
		gestore.aggiungiAllOrdine(richi3, ordi1);
		gestore.confermaOrdine(ordi1);
		
		//Effettuazione Ordine del Cliente Peppe: aggiunge le sue richieste, che vengono aggiunte all'ordine, e infine confermato(opzionale)
		Ordine ordi2= new Ordine(Peppe,LaCicala,data2);
		gestore.aggiungiOrdine(ordi2);
		RichiestaPietanza richi4=new RichiestaPietanza(Peppe,margherita,3);
		RichiestaPietanza richi5=new RichiestaPietanza(Peppe,cacio,2);
		gestore.aggiungiAllOrdine(richi4,ordi2);
		gestore.aggiungiAllOrdine(richi5, ordi2);
		gestore.confermaOrdine(ordi2);
		
		//Effettuazione Ordine del Cliente Luca, aggiunge le sue richieste, che vengono aggiunte all'ordine, e infine confermato(opzionale)
		Ordine ordi3= new Ordine(Luca,Gattara,data1);
		gestore.aggiungiOrdine(ordi3);
		RichiestaPietanza richi6=new RichiestaPietanza(Luca,pesto,3);
		RichiestaPietanza richi7=new RichiestaPietanza(Luca,cacio,2);
		gestore.aggiungiAllOrdine(richi6,ordi3);
		gestore.aggiungiAllOrdine(richi7, ordi3);
		gestore.confermaOrdine(ordi3);
		
		
		//Effettuazione Ordine del Cliente Luca, aggiunge le sue richieste, che vengono aggiunte all'ordine, e infine confermato(opzionale)
		Ordine ordi4= new Ordine(Luca,LaCicala,data3);
		gestore.aggiungiOrdine(ordi4);
		RichiestaPietanza richi8=new RichiestaPietanza(Luca,pesto,3);
		RichiestaPietanza richi9=new RichiestaPietanza(Luca,cacio,2);
		gestore.aggiungiAllOrdine(richi8,ordi4);
		gestore.aggiungiAllOrdine(richi9, ordi4);
		
		
		
		//GeneraReport degli Ordini Confermati effettuati dal ristorante, ricerca per mese e anno.
	gestore.GeneraReport(LaCicala,2,2020);
		
	}

}
