package br.com.pedro;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.pedro.factories.ProdutoFactory;
import br.com.pedro.models.ProdutoAbstract;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiMarketplaceApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void produtoNull() {
		
		ProdutoAbstract produto = ProdutoFactory.geraProduto(null);
		
		Assert.assertEquals("Valor Incorreto",0.0, produto.getValor(),0.1 );
	}
}
