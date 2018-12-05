/*
 * Classname             ApiMarketplaceApplication
 * 
 * Version information   1.0
 *
 * Date                  04/12/2018
 * 
 * author                Pedro Teixeira Bisognin
 * 
 * Copyright notice      Essa aplicação foi criada para fins de estudo. 
 */

package br.com.pedro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.pedro.factories.ProdutoFactory;
import br.com.pedro.models.ProdutoAbstract;


@SpringBootApplication
public class ApiMarketplaceApplication implements CommandLineRunner {

	protected static final Logger logger = LoggerFactory.getLogger(ApiMarketplaceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ApiMarketplaceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		ProdutoAbstract produto = ProdutoFactory.geraProduto(000.0);
		logger.info(produto.getValor().toString());
		

	}
}
