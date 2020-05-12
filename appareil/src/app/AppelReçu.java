package app;

import java.util.Date;

public class AppelReçu extends Appel {

	@Override
	public double cout() {
		
		return 0;
	}

	public AppelReçu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppelReçu(int numero, Date dateAppel, double dureeAppel) {
		super(numero, dateAppel, dureeAppel);
		
	}
	
	

}
