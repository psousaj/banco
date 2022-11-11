
public class Principal {

	public static void main(String[] args) {
		Conta c = new Conta("234-0", "Jeová");
		c.creditar(2000);
		c.debitar(100);
		
		c.setCliente("Jeová Tavares");
		
		ContaEspecial c2 = new ContaEspecial("345-1", "José", 2500);
		c2.setLimite(2000);
		
		System.out.println(c2.getLimite());
		
		c2.debitar(4000);
		
		System.out.println(c);
		
		
		System.out.println(c2);
		
		
	}

}
