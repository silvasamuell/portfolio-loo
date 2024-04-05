package gerenciaBanco;

public class Usuario {
	
	private String nome;
	private String sobrenome;
	private String cpf;
	private float saldo;
	
	public Usuario(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void deposito(float valor) {
		if(valor > 0) {
			this.saldo = this.saldo + valor;
		}else {
			System.out.println("Valor inválido");
		}	
	}
	
	public void saque(float valor) {
		if(valor > 0 && valor <= this.saldo) {
			this.saldo = this.saldo - valor;
		}else {
			System.out.println("Valor inválido");
		}	
	}

	@Override
	public String toString() {
		return String.format("Até mais %s, o seu saldo é de R$ %.2f", this.nome, this.saldo);
	}
	
}
