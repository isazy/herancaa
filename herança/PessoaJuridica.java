package herança;

public class PessoaJuridica extends Pessoa{
	
	private String cpnj;

	public PessoaJuridica(String nome, String telefone, String cpnj) {
		super(nome, telefone);
		this.cpnj = cpnj;
	}

	public String getCpnj() {
		return cpnj;
	}

	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}
	
}
