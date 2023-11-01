package prova1;

public class Piloto extends Pessoa{
	private String carteira;
	private int horasDeVoo;
	
	public Piloto() {
		super();
	}

	public Piloto(String nome, String cpf, String carteira, int horasDeVoo) {
		super(nome, cpf);
		this.carteira = carteira;
		this.horasDeVoo = horasDeVoo;
	}

	public String getCarteira() {
		return carteira;
	}

	public void setCarteira(String carteira) {
		this.carteira = carteira;
	}

	public int getHorasDeVoo() {
		return horasDeVoo;
	}

	public void setHorasDeVoo(int horasDeVoo) {
		this.horasDeVoo = horasDeVoo;
	}

}
