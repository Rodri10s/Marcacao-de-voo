package prova1;

import java.util.Arrays;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Passageiro pass1 = new Passageiro();
		Passageiro pass2 = new Passageiro();
		
		Piloto pilo = new Piloto("Ramon", "111.111.111-11", "2565325", 3);
		
		Assento ass1 = new Assento("33");
		Assento ass2 = new Assento("77");
		
		Aviao avi = new Aviao("777", "Ramflys", Arrays.asList(ass1, ass2));
		
		Date data = new Date();
		
		Voo voo = new Voo(data, Arrays.asList(pass1, pass2), pilo, avi);
		
		voo.ImprimirTudo();
	}

}
