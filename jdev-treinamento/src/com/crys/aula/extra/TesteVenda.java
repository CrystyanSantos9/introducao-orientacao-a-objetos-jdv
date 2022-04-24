package com.crys.aula.extra;

import java.math.BigDecimal;

public class TesteVenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Samsung X200");
		produto1.setValor(BigDecimal.valueOf(900.50));

		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Motorola GX00");
		produto2.setValor(BigDecimal.valueOf(990.50));
		
		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome("ICeBloob 2022");
		produto3.setValor(BigDecimal.valueOf(690.90));
		
		Produto produto4 = new Produto();
		produto4.setId(3L);
		produto4.setNome("ICeBloob 2022");
		produto4.setValor(BigDecimal.valueOf(690.90));
		
		
		
		Venda venda = new Venda();
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		//outra maneira de criar lista
		//nessa lisa podemos fazer validações 
		venda.addProduto(produto3);
		venda.addProduto(produto4);
		
		//listando produtos
		
//		for (Produto produto : venda.getListaProdutos()) {
//			System.out.println(produto);
//			System.out.println("\n-------------------------\n");
//		}
		
		venda.setDescricaoVenda("Venda de Celular");
		venda.setEnderecoEntrega("Rua Tenório 900");
		venda.setId(10L);
		venda.setNomeCliente("Rodrigo");
//		venda.setValorTotal(BigDecimal.valueOf(207.00));
		
		System.out.println("Descrição venda" + venda.getDescricaoVenda());
//		System.out.println("Total da venda: " + venda.totalVenda());
		System.out.println("Total da venda: " + venda.getValorTotal());
		
		
	}

}
