
public class ContaEspecial extends Conta{
	
	//atributos da propria subclasse
	private final String atendimento = "Com prioridade";
	private double chequeEspecial;

	//declara��o do construtor da super classe e modificando o construtor
	public ContaEspecial(String titular, int numero, double saldo, double chequeEspecial) {
		super(titular, numero, saldo);
		this.chequeEspecial = chequeEspecial;
	}
	
	//chamando os metodos e rotinas da super
	public void dados() {
		super.dados();
		System.out.println("Seu atendimento �: " + getAtendimento());
		System.out.println("Limite do Cheque Especial �: " + getChequeEspecial());
	}
	
	
	
	//getters e setters
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
		System.out.println("O valor do Cheque Especial �: " + getChequeEspecial());
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
			System.out.println("Voc� sacou: " + valor + " Seu saldo �: " + getSaldo());
		}else if(this.getSaldo() + this.getChequeEspecial() >= valor) {
			System.out.println("Voc� entrar� no seu limite especial");
			this.chequeEspecial -= (valor - this.getSaldo());
			this.saldo -= valor;
			System.out.println("Seu saldo �: " + saldo + " Seu limite especial �: " + getChequeEspecial());	
		}	
		else {
			System.out.println("Seu saldo e Limite especial s�o insuficientes");
		}
	}
	
	//metodo para depositar
	public void depositar(double valor) {
		System.out.println("---------" + this.getTitular() + "------------");
		if(valor == 0) {
			System.out.println("Deposite um valor v�lido");
		}else if(this.getSaldo() > 0) {
			this.saldo += valor;
			System.out.println("Seu saldo �: " + getSaldo());
		}else{
			this.chequeEspecial += Math.abs(this.saldo);
			this.saldo += valor;
			System.out.println("Seu saldo �: " + getSaldo() + " O valor do seu Cheque Especial �:" +getChequeEspecial());
		}
}

}
