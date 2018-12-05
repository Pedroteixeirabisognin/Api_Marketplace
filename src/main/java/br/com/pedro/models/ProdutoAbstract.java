package br.com.pedro.models;

public abstract class ProdutoAbstract {

	protected Double valor;

	public abstract void iniciaValor(Double value);

	public abstract Double getValor();

	public abstract void aplicaDesconto();

	public abstract void retiraDesconto();

	public abstract boolean isNull();

}
