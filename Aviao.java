package prova1;

import java.util.List;

public class Aviao {
	private String numeros;
	private String modelo;
	private List<Assento> assentos;
	
	public Aviao() {
		super();
	}

	public Aviao(String numeros, String modelo, List<Assento> assentos) {
		super();
		this.numeros = numeros;
		this.modelo = modelo;
		this.assentos = assentos;
	}

	public String getNumeros() {
		return numeros;
	}

	public void setNumeros(String numeros) {
		this.numeros = numeros;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public List<Assento> getAssentos() {
		return assentos;
	}

	public void setAssentos(List<Assento> assentos) {
		this.assentos = assentos;
	}
	

}
