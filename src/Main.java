
public class Main {

	public static void main(String[] args) {
		
		Produto agua = new Produto(450, "Uma garrafa contendo 1L de água da fonte Ouro Fino", 3.50f, 0.50f, false);
		Vendedor jonas = new Vendedor("Jonas", "Rua professora anette macedo, 558", 13);
		
		Venda venda1 = new Venda();
		
		venda1.setProduto(agua);
		venda1.setVendedor(jonas);
		
		venda1.setQuantidadeDeItens(2);
		venda1.calcularValor();
		
		System.out.println("Comissão do vendedor: " + venda1.calcularComissao());
		
		venda1.imprimir();
		
		
		Produto mouseHyperx = new Produto(451, "Mouse gamer Pulsefire FPS", 100f, 80f, true);
		Vendedor mateus = new Vendedor("Mateus", "Rua panamá, 915", 14); 
		
		Venda venda2 = new Venda();
		
		venda2.setProduto(mouseHyperx);
		venda2.setVendedor(mateus);
		
		
		venda2.setQuantidadeDeItens(3);
		venda2.efetuarDesconto(10);
		venda2.calcularValor();
		
		System.out.println("Comissão do vendedor: " + venda2.calcularComissao());
		
		
		venda2.imprimir();
		
		
		Venda venda3 = new Venda();
		
		venda3.setProduto(mouseHyperx);
		venda3.setVendedor(mateus);
		
		venda3.setQuantidadeDeItens(2);
		venda3.efetuarDesconto(30);
		venda3.calcularValor();
		
		System.out.println("Comissão do vendedor: " + venda3.calcularComissao());
		
		venda3.imprimir();
	}
	
}
