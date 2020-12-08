package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ingresso {
	private Sessao sessao;
	private BigDecimal preco;

	public Ingresso(Sessao sessao, Desconto tipoDeDesconto) {
		this.sessao = sessao;
		this.preco = tipoDeDesconto.aplicarDescontoSobre(sessao.getPreco());
	}

	public BigDecimal getPreco() {
		return preco.setScale(2, RoundingMode.HALF_UP);
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
}
