
public class ContaPoupanca extends Conta{
	public final double TXRENDIMENTO = 0.03;
	public double totalRendimento;
	
	public ContaPoupanca(String titular, int numero, double saldo, double totalRendimento){
		super(titular,numero, saldo);
		this.totalRendimento = totalRendimento;
	}
	
	public void dados() {
		super.dados();
	}
	
	public void sacar(double valor) {
		System.out.println("---------SAQUE------------");
		if(valor > this.saldo) {
			System.out.println("Seu saldo � insuficiente para esta opera��o.");
		}else {
			this.saldo -= valor;
			System.out.println("Saque efetuado com sucesso \nSeu saldo � de R$ " + this.saldo);
		}
	}
	
	public void depositar(double valor) {
		System.out.println("---------DEPOSITO------------");
		if(valor > 0) {
			this.saldo += valor;
			System.out.println("Deposito efetuado com sucesso \nSeu saldo atual � R$ " + this.saldo);
		}else {
			System.out.println("Insira algum dinheiro");
		}
	}
	
	
	public void rendimento(){
		System.out.println("---------Rendimentos------------");
		if(saldo > 0){
			this.totalRendimento = saldo * TXRENDIMENTO;
			this.saldo += totalRendimento;
			System.out.println("Seu rendimento do m�s � R$ " + totalRendimento);
			System.out.println("Seu saldo atual � R$ " + saldo);
		}else{
			System.out.println("N�o houve rendimentos na sua Poupan�a");
		}
		System.out.println("-----------------------------");
	}	
}
