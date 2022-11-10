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
	
	public String getLimite() {
		return ("\nSaldo Total: "+(limite+saldo));
	}
	
	@Override
	public void debitar(double valor) {
		double saldoTotal = (limite+saldo);
		String saida = "\n---------------SAQUE---------------";
		
		if (valor <= saldoTotal) {
			this.saldo -= valor;
			saldoTotal = limite+saldo;
			
			if (saldoTotal == 0) {
				saida += "\nSaque realizado com sucesso!!";
				saida += "\nValor: "+valor;
				saida += "\nNovo saldo: "+saldoTotal;
				saida += "\n\nVocê está pobre sem dindin nenhum";
			} else {
				saida += "\nSaque realizado com sucesso!!";
				saida += "\nValor: "+valor;
				saida += "\nNovo saldo: "+saldoTotal;
			}
			System.out.println(saida);
			
		} else {
			saida += "\nValor maior que o saldo total!!";
			saida += "\nValor: "+valor;
			System.out.println(saida);
		}
	}
	
	@Override
	public String toString() {
		return super.toString()+
				"\nLimite: "+this.limite+getLimite();
	}
}
