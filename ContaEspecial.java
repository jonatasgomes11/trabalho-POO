
public class ContaEspecial extends Conta {
	private double limite;
	
	public ContaEspecial( Pessoa cliente) {
		super(cliente);
		this.limite = 500;
		this.numero += "S";
	}
	
	public ContaEspecial(PessoaFisica cliente) {
		super(cliente);
		this.limite = 500;
		this.numero += "s";
	}
	
	
	public ContaEspecial(PessoaFisica cliente, double saldo ) {
		this (cliente);
		this.saldo = saldo;
	}
	
	public ContaEspecial( PessoaJuridica cliente) {
	    super (cliente);
	    this.limite = 500;
	    this.numero +="s";
	    		
	}
	
	public ContaEspecial(PessoaJuridica cliente, double saldo) {
		this (cliente);
		this.saldo = saldo;
	}
	public void Setlimite(double valor) {
		this.limite = valor;
	}
	public void setLimite(String valor) {
		double num = Double.parseDouble(valor);
		this.limite = num;
	}
	public double getLimite() {
		return this.limite;
	}
	@Override
	public String toString() {
	return super.toString()
	+ " Limite: "
	+ this.limite + "\nSaldo Total: "
	+ (this.limite + this.saldo);
	}
	
	
		
	
	
	}
