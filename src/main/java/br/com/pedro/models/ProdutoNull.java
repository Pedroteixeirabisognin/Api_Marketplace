package br.com.pedro.models;

public class ProdutoNull extends ProdutoAbstract {

	@Override
	public void iniciaValor(Double valor) {
		this.valor = 0.0;
	}

	@Override
	public Double getValor() {
		return 0.0;
	}

	@Override
	public void aplicaDesconto() {
		this.valor = 0.0;
	}

	@Override
	public void retiraDesconto() {
		this.valor = 0.0;
	}

	@Override
	public boolean isNull() {
		return true;
	}

}
