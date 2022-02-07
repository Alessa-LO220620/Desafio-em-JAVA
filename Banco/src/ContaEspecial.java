
public class ContaEspecial extends Conta{
	
	//atributos da propria subclasse
	private final String atendimento = "Com prioridade";
	private double chequeEspecial;

	//declaração do construtor da super classe e modificando o construtor
	public ContaEspecial(String titular, int numero, double saldo, double chequeEspecial) {
		super(titular, numero, saldo);
		this.chequeEspecial = chequeEspecial;
	}
	
	//chamando os metodos e rotinas da super
	public void dados() {
		super.dados();
		System.out.println("Seu atendimento é: " + getAtendimento());
		System.out.println("Limite do Cheque Especial é: " + getChequeEspecial());
	}
	
	
	
	//getters e setters
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
		System.out.println("O valor do Cheque Especial é: " + getChequeEspecial());
	}
	
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	
	
	public String getAtendimento() {
		return atendimento; 
	}
	
	//metodo para sacar
	public void sacar(double valor) {
		if (this.getSaldo() >= valor) {
			this.saldo -= valor;
			System.out.println("Você sacou: " + valor + " Seu saldo é: " + getSaldo());
		}else if(this.getSaldo() + this.getChequeEspecial() >= valor) {
			System.out.println("Você entrará no seu limite especial");
			this.chequeEspecial -= (valor - this.getSaldo());
			this.saldo -= valor;
			System.out.println("Seu saldo é: " + saldo + " Seu limite especial é: " + getChequeEspecial());	
		}	
		else {
			System.out.println("Seu saldo e Limite especial são insuficientes");
		}
	}
	
	//metodo para depositar
		public void depositar(double valor) {
		System.out.println("---------" + this.getTitular() + "------------");
		if(valor <= 0) {
			System.out.println("Depositar um valor valor válido");
		}else if(this.getSaldo() > 0){
			this.saldo += valor; 
		System.out.println("Deposito feito com sucesso! \nSeu saldo é R$: " + this.saldo);
		}else if(valor < Math.abs(this.saldo)){	
			this.chequeEspecial += valor;
			this.saldo += valor;
			System.out.println("!!!Seu saldo é R$: " + getSaldo() + " O valor do seu Cheque Especial é R$:" +getChequeEspecial());
		}else{
			this.chequeEspecial += Math.abs(this.saldo);
			this.saldo += valor;
			System.out.println("xxxSeu saldo é R$: " + getSaldo() + " O valor do seu Cheque Especial é R$:" +getChequeEspecial());
		}
}

}
