
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
			System.out.println("Seu saldo é insuficiente para esta operação.");
		}else {
			this.saldo -= valor;
			System.out.println("Saque efetuado com sucesso \nSeu saldo é de R$ " + this.saldo);
		}
	}
	
	public void depositar(double valor) {
		System.out.println("---------DEPOSITO------------");
		if(valor > 0) {
			this.saldo += valor;
			System.out.println("Deposito efetuado com sucesso \nSeu saldo atual é R$ " + this.saldo);
		}else {
			System.out.println("Insira algum dinheiro");
		}
	}
	
	
	public void rendimento(){
		System.out.println("---------Rendimentos------------");
		if(saldo > 0){
			this.totalRendimento = saldo * TXRENDIMENTO;
			this.saldo += totalRendimento;
			System.out.println("Seu rendimento do mês é R$ " + totalRendimento);
			System.out.println("Seu saldo atual é R$ " + saldo);
		}else{
			System.out.println("Não houve rendimentos na sua Poupança");
		}
		System.out.println("-----------------------------");
	}	
}
