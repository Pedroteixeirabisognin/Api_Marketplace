package br.com.pedro.models;

public class Produto extends ProdutoAbstract {

	@Override
	public void iniciaValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public Double getValor() {
		return this.valor;
	}

	@Override
	public void aplicaDesconto() {
		this.valor = this.valor - 10;
	}

	@Override
	public void retiraDesconto() {
		this.valor = this.valor + 10;
	}

	@Override
	public boolean isNull() {
		return false;
	}

}
