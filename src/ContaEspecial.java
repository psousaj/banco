public class ContaEspecial extends Conta {

	private double limite;
	
	public ContaEspecial (String numero, String cliente) {
		super(numero, cliente);
		this.limite = 500;
		this.numero += "/S";
	}
	
	public ContaEspecial(String numero, String cliente, double saldo) {
		this(numero, cliente);
		this.saldo = saldo;
	}

	public void setLimite(double valor) {
		this.limite = valor;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nLimite: "+this.limite+"\n";
	}
	
	@Override
	public void debitar(double valor) {
		
	}
}
