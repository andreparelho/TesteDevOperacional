
public class Empresa {
    private Integer id;
    private String nome;
    private String cnpj;
    private Double taxa;
    private Double saldo;

    public Empresa() {
        super();
    }

    public Empresa(Integer id, String nome, String cnpj, Double taxa, Double saldo) {
        super();

        if (id == null || nome == null || cnpj == null || taxa == null || saldo == null) {
            throw new IllegalArgumentException("Todos os dados precisam ser informados para criação da Empresa!");
        }

        setId(id);
        setNome(nome);
        setCnpj(cnpj);
        setTaxa(taxa);
        this.saldo = saldo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if (id < 0) {
            throw new IllegalArgumentException("Erro! ID negativo.");
        }
        this.id = id;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if (cnpj.length() != 14 || cnpj.substring(0, 13).matches("^[0-9]{14}$")) {
            throw new IllegalArgumentException("CNPJ Inválido!");
        }
        this.cnpj = cnpj;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        if (taxa < 0) {
            throw new IllegalArgumentException("Taxa Negativa!");
        }
        this.taxa = taxa;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
