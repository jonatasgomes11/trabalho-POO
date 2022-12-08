
public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private String razaoSocial;
	
	public PessoaJuridica (String nome, String cnpj, String razaoSocial) {
		super(nome);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void SetRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj =cnpj;
	}
	public String toString() {
		return "/n------------------------------------------\n"
				+ "\n---|conta tipo Juridica/n" + "\n---|Nome:"
				+this.getNome() + "\n---|cnpj:"+this.getNome()
				+"\n---|razao Social:" + this.getRazaoSocial();
				
	}

}
