
public class PessoaFisica extends Pessoa{
	
	protected String cpf;
	protected String sobrenome;
	
	public PessoaFisica(String nome, String Sobrenome, String cpf) {
		super(nome);
		this.cpf = cpf;
		this.sobrenome = sobrenome;
	}
	public String getSobreNome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String toString() {
		return " \n-------------------------------\n "
				+" \n---|conta tipo fisica/n " + " \n---|name: "
				+ this.getNome() + " \n ---|sobrenome: " 
				+ this.getSobreNome() + " \n---|cpf: " + this.getCpf();
	}
	
	
	
	

}
