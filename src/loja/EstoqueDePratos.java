package loja;

import java.util.ArrayList;

import pratos.PersonalizacaoDoPrato;
import pratos.PratoCircular;
import pratos.PratoPersonalizado;
import pratos.PratoRetangular;
import pratos.PratoTriangular;
import excecoes.CriaPratoInvalidoException;

public class EstoqueDePratos {
	
	private ArrayList<PratoPersonalizado> estoque;
	
	public EstoqueDePratos(){
		estoque = new ArrayList<>();
	}
	
	public PratoTriangular criaPratoTriangular(double preco, String tipo, double base, double altura) throws CriaPratoInvalidoException{
		if (tipo.toUpperCase().equals(PersonalizacaoDoPrato.ESTAMPA)){
			PersonalizacaoDoPrato personalizacao = null;
			personalizacao = PersonalizacaoDoPrato.ESTAMPA;
			return new PratoTriangular(preco, personalizacao, base, altura);
		} else if (tipo.toUpperCase().equals(PersonalizacaoDoPrato.FOTO)){
			PersonalizacaoDoPrato personalizacao = null;
			personalizacao = PersonalizacaoDoPrato.FOTO;
			return new PratoTriangular(preco, personalizacao, base, altura);
		}else if (tipo.toUpperCase().equals(PersonalizacaoDoPrato.PINTURA)){
			PersonalizacaoDoPrato personalizacao = null;
			personalizacao = PersonalizacaoDoPrato.PINTURA;
			return new PratoTriangular(preco, personalizacao, base, altura);
		}
		throw new CriaPratoInvalidoException("Criacao nao efetivada");
		
	}
	public PratoRetangular criaPratoRetangular(double preco, String tipo, double base, double altura) throws CriaPratoInvalidoException {
		if (tipo.toUpperCase().equals(PersonalizacaoDoPrato.ESTAMPA)){
			PersonalizacaoDoPrato personalizacao = null;
			personalizacao = PersonalizacaoDoPrato.ESTAMPA;
			return new PratoRetangular(preco, personalizacao, base, altura);
		}
		if (tipo.toUpperCase().equals(PersonalizacaoDoPrato.FOTO)){
			PersonalizacaoDoPrato personalizacao = null;
			personalizacao = PersonalizacaoDoPrato.FOTO;
			return new PratoRetangular(preco, personalizacao, base, altura);
		}
		if (tipo.toUpperCase().equals(PersonalizacaoDoPrato.PINTURA)){
			PersonalizacaoDoPrato personalizacao = null;
			personalizacao = PersonalizacaoDoPrato.PINTURA;
			return new PratoRetangular(preco, personalizacao, base, altura);
		}
		throw new CriaPratoInvalidoException("Criacao nao efetivada");
	
	}
	
	public PratoCircular criaPratoCircular(double preco, String tipo, double raio) throws CriaPratoInvalidoException{
		if (tipo.toUpperCase().equals(PersonalizacaoDoPrato.ESTAMPA)){
			PersonalizacaoDoPrato personalizacao = null;
			personalizacao = PersonalizacaoDoPrato.ESTAMPA;
			return new PratoCircular(preco, personalizacao, raio);
		} else if (tipo.toUpperCase().equals(PersonalizacaoDoPrato.FOTO)){
			PersonalizacaoDoPrato personalizacao = null;
			personalizacao = PersonalizacaoDoPrato.FOTO;
			return new PratoCircular(preco, personalizacao, raio);
		}else if (tipo.toUpperCase().equals(PersonalizacaoDoPrato.PINTURA)){
			PersonalizacaoDoPrato personalizacao = null;
			personalizacao = PersonalizacaoDoPrato.PINTURA;
			return new PratoCircular(preco, personalizacao, raio);
		}
		throw new CriaPratoInvalidoException("Criacao nao efetivada");
	}
	
	public boolean adicionaPrato(PratoPersonalizado prato){
		return estoque.add(prato);
	}
	
	public boolean removePrato(PratoPersonalizado prato){
		if(estoque.contains(prato)){
			estoque.remove(prato);
			return true;
		}
		return false;
	}
	
	public int qtdPratos(){
		return estoque.size();
	}
	
	public boolean contemPrato(PratoPersonalizado prato){
		for (PratoPersonalizado pratos : estoque) {
			if(estoque.contains(prato)){
				return true;
			}
		}
		return false;
	}
	
	public PratoPersonalizado pesquisaPorPersonalizacao(PersonalizacaoDoPrato personalizacao){
		for (PratoPersonalizado prato : estoque) {
			if(prato.getPersonalizacao() == personalizacao){
				return prato;
			}
		}
		return null; //o ideal aqui era lançar a exceção para evitar retornar null 
		//e poder gerar NullPointerException em algum momento
	}
	
	public double rendaTotalEstoque(){
		double total = 0;
		for (PratoPersonalizado prato : estoque) {
			total += prato.getPrecoBase();
		}
		return total;
	}
	
	/**
	public ArrayList<PratoPersonalizado> getPratosOrdenados(){
		Collections.sort(estoque);
		return estoque;
	}
	*/
	
	public double calculaLucroTotal() {
		double lucroTotal = 0.0;
		
		for (PratoPersonalizado prato : estoque) {
			
			lucroTotal = lucroTotal + prato.getPrecoBase();
		}
		return lucroTotal;
	}
	
}
