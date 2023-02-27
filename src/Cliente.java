
public class Cliente {
	private String cpf;
	private String nome;
	private String username;
	private Integer idade;

	public Cliente(String cpf, String nome, String username, Integer idade) {
		super();
		setCpf(cpf);
		setNome(nome);
		this.username = username;
		setIdade(idade);
	}

	public String getCpf() {
		return cpf;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setCpf(String cpf) {
		if (cpf.length() != 11 || cpf.substring(0, 10).matches("^[0-9]{11}$")) {
			throw new RuntimeException("CPF Inválido!");
		}
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome inválido!");
		}
		this.nome = nome.trim();
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		if (idade < 0) {
			throw new IllegalArgumentException("Idade inválida!");
		}
		this.idade = idade;
	}

}
