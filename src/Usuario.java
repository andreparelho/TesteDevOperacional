
public class Usuario {
	private String username;
	private String senha;
	private Cliente cliente;
	private Empresa empresa;

	public Usuario() {
		super();
	}

	public Usuario(String username, String senha, Cliente cliente, Empresa empresa) {
		super();

		if (username == null || username.isEmpty() || senha == null || senha.isEmpty()) {
			throw new IllegalArgumentException("É preciso ter um Username e uma Senha para logar.");
		}

		this.username = username;
		this.senha = senha;
		this.cliente = cliente;
		this.empresa = empresa;
	}

	private String getUserType(){
		String type = "";
		if (this.empresa == null && this.cliente == null){
			type = "admin";
		} else if (this.empresa != null) {
			type = "empresa";
		} else if (this.cliente != null) {
			type = "cliente";
		}
		return type;
	}


	public boolean IsAdmin() {
		return getUserType().equalsIgnoreCase("admin");
	}

	public boolean IsEmpresa() {
		return getUserType().equalsIgnoreCase("empresa");
	}

	public boolean IsCliente() {
		return getUserType().equalsIgnoreCase("cliente");
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
