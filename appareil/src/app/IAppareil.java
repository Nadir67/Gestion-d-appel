package app;

import java.util.Date;
import java.util.List;

public interface IAppareil {
	
	public void enregistrer(Contact C);
	public void enregistrer(Appel a,String numTel);
	public Contact consulter(int numeo) throws Exception;
	public List<Contact> consulter(String mc);
	public double coutTotalAppels();
	public double coutAppels(Date d1,Date d2);
	public double coutAppels(int numero);
	
	
		
	

	
	
}
