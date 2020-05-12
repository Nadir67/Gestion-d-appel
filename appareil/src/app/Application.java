package app;

import java.util.Date;

public class Application {

	public static void main(String[] args) {
		IAppareil appareil=new Appareil();
		appareil.enregistrer(new Contact(1, "Nadir", "0769489314"));
		appareil.enregistrer(new Contact(2, "C2", "0733483782"));
		appareil.enregistrer(new AppelEmi(1, new Date(), 55), "0769489314");
		appareil.enregistrer(new AppelEmi(2, new Date(), 120), "0769489314");
		appareil.enregistrer(new AppelReçu(4, new Date(), 98), "0765847383");
	
	try {
		Contact C=appareil.consulter(1);
		System.out.println("Num="+C.getNumero());
		System.out.println("Nom:"+C.getNom());
		System.out.println("Tel :"+C.getNumeroTel());
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
		
		e.printStackTrace();
	}
	
	
	}

}
