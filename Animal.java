package POOHeranca;

public class Animal {
	
	private String nome;
	private int idade;
	private String origem;
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	void EmitirSom(String som) {
		System.out.println("Som emitido: " + som);
	}
}