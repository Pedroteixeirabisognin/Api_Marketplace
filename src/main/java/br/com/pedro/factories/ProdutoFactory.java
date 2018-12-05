package br.com.pedro.factories;

import br.com.pedro.models.Produto;
import br.com.pedro.models.ProdutoAbstract;
import br.com.pedro.models.ProdutoNull;

public class ProdutoFactory {

	public static ProdutoAbstract geraProduto(Double value) {

		ProdutoAbstract produto;

		if (value != null) {
			if (!value.isNaN()) {
				produto = new Produto();
				produto.iniciaValor(value);
			} else {
				produto = new ProdutoNull();

			}
		} else {
			produto = new ProdutoNull();
		}

		return produto;

	}
}
