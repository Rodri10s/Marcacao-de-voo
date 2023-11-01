package prova1;

import java.util.Date;
import java.util.List;

public class Voo {
	private Date data;
	private List<Passageiro> passageiros;
	private Piloto piloto;
	private Aviao aviao;
	
	public Voo() {
		super();
	}
	
	public Voo(Date data, List<Passageiro> passageiros, Piloto piloto, Aviao aviao) {
		super();
		this.data = data;
		this.passageiros = passageiros;
		this.piloto = piloto;
		this.aviao = aviao;
	}
	
	public void ImprimirTudo() {
		System.out.println("=============== ENRIBA ===============");
		
		System.out.printf("Avião: %s(%s)\n", getAviao().getModelo(), getAviao().getNumeros());
		System.out.printf("Piloto: %s (CPF:%s)\n(Carteira:%s)\n", getPiloto().getNome(), getPiloto().getCpf(), getPiloto().getCarteira());
		System.out.println("--------------------------------------");
		
		System.out.printf("Tempo de Voo: %d horas\n", getPiloto().getHorasDeVoo());
		System.out.printf("Assentos: ");
			for(int i = 0; i < getAviao().getAssentos().size(); i++) {
				System.out.print(getAviao().getAssentos().get(i).getNumero());
				System.out.printf(" ");
			}
		System.out.println("\nData: "+getData());
		System.out.println("--------------------------------------");
		
		System.out.println("Passageiros:");
		for(int i = 0; i < passageiros.size(); i++) {
			System.out.printf("\nNome: %s(CPF:%s)\n", getPassageiros().get(i).getNome(), getPassageiros().get(i).getCpf());
			System.out.println("Milhas: "+getPassageiros().get(i).getMilhas());
		}
		System.out.println("======================================");
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<Passageiro> getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(List<Passageiro> passageiros) {
		this.passageiros = passageiros;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public Aviao getAviao() {
		return aviao;
	}

	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}
	
	

}
