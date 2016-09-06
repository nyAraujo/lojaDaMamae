package pratos;

public abstract class PratoPersonalizado {
	
	// atributos
	private double precoBase;
	private PersonalizacaoDoPrato personalizacao;
	
	public PratoPersonalizado(double precoBase, PersonalizacaoDoPrato personalizacao){
		
		this.setPrecoBase(precoBase);
		this.setPersonalizacao(personalizacao);
		
	}
	
	abstract double precoTotal();
	
	abstract double areaTotal();
	
	/**
	 * Metodos Get e Set
	 * HashCode
	 * Equals
	 * toString
	 */
	
	/**
	 * Getters
	 * @return
	 */
	public double getPrecoBase() {
		return precoBase;
	}
	public PersonalizacaoDoPrato getPersonalizacao() {
		return personalizacao;
	}
	
	/**
	 * Setters
	 * @param precoBase
	 * @param personalizacao
	 */
	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}
	public void setPersonalizacao(PersonalizacaoDoPrato personalizacao) {
		this.personalizacao = personalizacao;
	}
	/**
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((personalizacao == null) ? 0 : personalizacao.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof PersonalizacaoDoPrato)){
			return false;
		}
		PersonalizacaoDoPrato outro = (PersonalizacaoDoPrato) obj;
		return getPersonalizacao() == outro.getPersonalizacao();	
	}
	*/

	@Override
	public String toString() {
		return "Prato com " + this.getPersonalizacao() + "custa R$ " + this.getPrecoBase() + ".";
	}

	public double calculaPrecoFinal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
