
public class Venda {
	
	Produto produto;
	Vendedor vendedor;
	private float desconto;
	private int quantidadeDeItens;
	private float valor;
	
	public void efetuarDesconto(float desconto) {
		
		float desc = produto.valorVenda * (desconto/100);
		float valorFinal = produto.valorVenda - desc;
		
		if(valorFinal < produto.valorCusto) {
			System.out.println("O desconto aplicado não é válido.");
			return;
			
		}
		else {
			produto.valorVenda = valorFinal;
			this.desconto = desc;
		}
		
		
	}
	
	public float calcularValor() {
		/*if(desconto > 0) {
			efetuarDesconto(desconto);
		}*/
		valor = produto.valorVenda * quantidadeDeItens;
		return valor;
	}
	
	public float calcularComissao() {
		return calcularValor() * (vendedor.comissao/100);
	}
	
	public void imprimir() {
		System.out.println("\n--Venda--\n");
		
		System.out.println("Vendedor: " + vendedor.getNome() + "\n   Código - " + vendedor.getCodigo() + "\n   Comissão - " + vendedor.comissao);
		
		System.out.println("Quantidade de itens: " + quantidadeDeItens);
		System.out.println("Produto: Código - " + produto.getCodigo() + "\n   " + produto.getDescricao());
		System.out.println("Preço: R$" + produto.valorVenda);
		System.out.println("Promoção: " + (produto.promocao == true?"Sim":"Não"));
		System.out.println("Valor do desconto: " + (this.desconto));
		System.out.println("Valor total: " + valor + "\n\n\n");
		
		
		
		 
	}
	
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}
	public void setQuantidadeDeItens(int quantidadeDeItens) {
		this.quantidadeDeItens = quantidadeDeItens;
	}
	
	
}
