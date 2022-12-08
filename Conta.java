
public class Conta {
	protected String numero;
	protected Pessoa cliente;
	protected double saldo;

	public Conta() {
		int n =(int) (Math.random() * 10000 + 1);
		String numConta = "c" + n;
		this.numero = numConta;
	}
	public Conta(PessoaFisica cliente) {
		this();
		this.cliente = cliente;
	}
	public Conta(PessoaJuridica cliente) {
		this();
		this.cliente = cliente;
	}
	public Conta(Pessoa cliente) {
		this();
		this.cliente = cliente;
	}
	public Conta (Pessoa cliente, double saldo) {
		this(cliente);
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return  cliente + "\n\nSaldo: " + this.saldo;
	}
	public void creditar(double d) {
		// TODO Stub de método gerado automaticamente
		
	}
	public void debitar(int i) {
		// TODO Stub de método gerado automaticamente
		
	}
	
	}
	







