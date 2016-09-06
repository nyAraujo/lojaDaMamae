package pratos;

public class PratoTriangular extends PratoPersonalizado{
	
	// atributos
	private double base, altura;
	
	public PratoTriangular(double precoBase,PersonalizacaoDoPrato personalizacao, double base, double altura) {
		super(precoBase, personalizacao);
		
		this.base = base;
		this.altura = altura;
		
	}

	@Override
	double precoTotal() {
		double valor = super.getPrecoBase() + (0.01 * areaTotal());
		return valor;
	}

	@Override
	double areaTotal() {
		double valor = (getBase() * getAltura()) / 2.0;
		return valor;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
