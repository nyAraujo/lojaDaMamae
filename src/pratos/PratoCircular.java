package pratos;

public class PratoCircular extends PratoPersonalizado{
	
	// atributos
	private double raio;
	
	public PratoCircular(double precoBase, PersonalizacaoDoPrato personalizacao, double raio) {
		super(precoBase, personalizacao);
		
		this.raio = raio;
	}

	@Override
	double precoTotal() {
		double valor = super.getPrecoBase() + (0.01 * areaTotal());
		return valor;
	}

	@Override
	double areaTotal() {
		double valor = Math.PI * Math.pow(raio, 2);
		return valor;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

}
