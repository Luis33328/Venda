
public class Vendedor {

	private String nome;
	private int codigo;
	public static float comissao = 15.0f;
	private String endereco;
	
	
	
	public Vendedor(String nome, String endereco, int codigo) {
		this.nome = nome;
		this.endereco = endereco;
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public static float getComissao() {
		return comissao;
	}
	public static void setComissao(float comissao) {
		Vendedor.comissao = comissao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
