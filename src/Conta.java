
public class Conta {
	protected String numero;
	protected String cliente;
	protected double saldo;
	
	public Conta(String numero, String cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}
	
	public Conta(String numero, String cliente, double saldo) {
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public void creditar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}
	
	public void debitar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		}
		
	}
	
	private String mostra() {
		String saida = "------------------------";
		saida += "\nCliente: "+this.cliente;
		saida += "\nNumero: "+this.numero;
		saida += "\nSaldo:  "+this.saldo;
		return saida;
	}
	
	@Override
	public String toString() {
		return "\n------------------------\n"+super.toString() + "\n" + mostra();
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public double getSaldo( ) {
		return this.saldo;
	}
}
