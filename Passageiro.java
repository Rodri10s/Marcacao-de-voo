package prova1;

import java.util.Scanner;

public class Passageiro extends Pessoa{
	private int milhas;

	public Passageiro() {
		super();
		PreencherPassageiro();
	}

	public Passageiro(String nome, String cpf, int milhas) {
		super(nome, cpf);
		this.milhas = milhas;
	}
	
	public void PreencherPassageiro() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nNome do Passageiro: ");
		setNome(scan.nextLine());
		System.out.println("CPF do Passageiro: ");
		setCpf(scan.nextLine());
		System.out.println("Quantidade de Milhas: ");
		setMilhas(scan.nextInt());
	}

	public int getMilhas() {
		return milhas;
	}

	public void setMilhas(int milhas) {
		this.milhas = milhas;
	}

}
