
public class Conta {

	//atritutos
	public int numero;
	public String titular; 
	public double saldo;
	
	public Conta(String titular, int numero, double saldo) {
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
		
	}
//getters & setters 
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}
	
	//metodos
	public void dados() {
		System.out.println("*********************");
		System.out.println("Titular da Conta: " + this.getTitular());
		System.out.println("Número da Conta: " + this.getNumero());
		System.out.printf("Saldo da conta R$ %.2f %n", this.getSaldo());
	}
	
}
