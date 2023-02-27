import java.util.List;

public class Venda {
	private Integer codigo;
	private List<Produto> itens;
	private Double valor;
	private Double comissaoSistema;
	private Empresa empresa;
	private Cliente cliente;

	public Venda(Integer codigo, List<Produto> itens, Double valor, Double comissaoSistema, Empresa empresa, Cliente cliente) {
		super();
		this.codigo = codigo;
		this.itens = itens;
		this.valor = valor;
		this.comissaoSistema = comissaoSistema;
		this.empresa = empresa;
		this.cliente = cliente;
	}

	public Venda() {
		super();
	}

	public Integer getCodigo() {
		return codigo;
	}

	public static Venda criarVenda(List<Produto> carrinho, Empresa empresa, Cliente cliente, List<Venda> vendas) {
		Double total = carrinho.stream().mapToDouble(Produto::getPreco).sum();
		Double comissaoSistema = total * empresa.getTaxa();
		int idVenda = vendas.isEmpty() ? 1 : vendas.get(vendas.size() - 1).getCodigo() + 1;
		Venda venda = new Venda(idVenda, carrinho.stream().toList(), total, comissaoSistema, empresa, cliente);
		empresa.setSaldo(empresa.getSaldo() + total);
		vendas.add(venda);
		return venda;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setCodigo(Integer codigo) {
		if (codigo == null || codigo <= 0) {
			throw new IllegalArgumentException("Código inválido");
		}
		this.codigo = codigo;
	}

	public List<Produto> getItens() {
		return itens;
	}

	public void setItens(List<Produto> itens) {
		if (itens == null || itens.isEmpty()) {
			throw new IllegalArgumentException("Itens inválidos");
		}
		this.itens = itens;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		if (valor == null || valor <= 0) {
			throw new IllegalArgumentException("Valor inválido");
		}
		this.valor = valor;
	}

	public Double getComissaoSistema() {
		return comissaoSistema;
	}

	public void setComissaoSistema(Double comissaoSistema) {
		if (comissaoSistema == null || comissaoSistema < 0) {
			throw new IllegalArgumentException("Comissão inválida");
		}
		this.comissaoSistema = comissaoSistema;
	}

}
