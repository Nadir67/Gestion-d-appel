package app;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Appareil implements IAppareil {
	private List<Contact> contacts=new ArrayList<Contact>();
	private Map<Integer, Appel> appels=new HashMap<Integer, Appel>();
	

	@Override
	public void enregistrer(Contact C) {
		contacts.add(C);
		
	}

	@Override
	public void enregistrer(Appel a, String numTel) {
		Contact cApp=null;
		for(Contact C:contacts)
			if(C.getNumeroTel().equals(numTel)) {
				cApp=C;
				break;
			}
			a.setContact(cApp);
			appels.put(a.getNumero(), a);
			
		
	}

	@Override
	public Contact consulter(int numero) throws Exception {
		for(Contact C:contacts)
			if(C.getNumero()==numero)
		return C;
		throw new Exception("Contact "+numero+"Introuvable");
	}

	@Override
	public List<Contact> consulter(String mc) {
		List<Contact> cts=new ArrayList<Contact>();
		for(Contact C:contacts) {
			if(C.getNom().contains(mc))
				cts.add(C);
		}
			

	return cts;
	}

	@Override
	public double coutTotalAppels() {
		double total=0;
		for(Appel a:appels.values())
			total=total+a.cout();
		return total;
		
	}

	@Override
	public double coutAppels(Date d1, Date d2) {
		double total=0;
		for(Appel a:appels.values()) {
			if((a.getDateAppel().getTime()>=d1.getTime())&&((a.getDateAppel().getTime()<=d2.getTime())))
			total=total+a.cout();
		}
		return total;
	}

	@Override
	public double coutAppels(int numero) {
		double total=0;
		for(Appel a:appels.values()) {
			if(a.getContact().getNumero()==numero)
			total=total+a.cout();
		}
		return total;
	}
	

}
