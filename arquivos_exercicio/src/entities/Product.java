package entities;

public class Product {
	
	private String produto;
	private Double preco;
	private Integer quantidade;

	public Product(String produto, Double preco, Integer quantidade) {
		this.produto = produto;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public double valorTotal() {
		return preco*quantidade;
	}
	

}
