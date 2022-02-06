
public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta("Luís Otávio", 100, 300.50);
		Conta c2 = new Conta("Josué Santiago", 101, 200.80);
		Conta c3 = new Conta("Nilde Mendes", 102, 900.80);
		
		//c1.dados();
		//c2.dados();
		//c3.dados();
		
		ContaCorrente c4 = new ContaCorrente("Luís Otávio", 100, 729.15);
		ContaCorrente c5 = new ContaCorrente("Alessandraxx", 115, 874.15);
		
		//c4.dados();		
		//c4.sacar(500);
		//c4.depositar(600);
		
		//c5.dados();
		//c5.sacar(500);
		
		ContaEspecial c6 = new ContaEspecial("Josué Santiago", 200, 300, 1000);
		
		//c6.dados();
		//c6.setChequeEspecial();
		//c6.sacar(400);
		//c6.dados();
		//c6.depositar(500);
		
		ContaPoupanca c7 = new ContaPoupanca("Armando Lopes", 78900,600,0);
		ContaPoupanca c8 = new ContaPoupanca("Thiago Mendes", 85200, 1300,0);
		
		c7.dados();
		c7.sacar(500);
		c7.depositar(300);
		c7.rendimento();
		c8.dados();
		c8.sacar(800);
		c8.depositar(1000);
		c8.rendimento();
				
	}
}
