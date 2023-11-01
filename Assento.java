package prova1;

public class Assento {
	private String numero;

	public Assento() {
		super();
	}

	public Assento(String numero) {
		super();
		this.numero = numero;
	}
	
	/*public void GerarAssento() {
		Random gerador = new Random();
		this.numero = gerador.nextInt(99);
	} Fica pra uma próxima*/ 

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
