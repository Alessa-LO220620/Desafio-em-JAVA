
public class ContaCorrente extends Conta{
	
	//criando um atributo proprio da subclasse, porem ele tem o modificador final
	private final String ATENDIMENTO = "Sem prioridades";
	
	//o constructor ele já precisa receber os atributos da superClasse
	public ContaCorrente(String titular, int numero, double saldo){
		super(titular, numero, saldo);
	}
	
	//getter do atendimento
	public String getAtendimento() {
		return ATENDIMENTO; 
	}
	
	//aqui estou puxando os metodos da superClasse, são os Dados
	public void dados() {
		super.dados();
		System.out.println("Seu atendimento é: " + this.getAtendimento());
	}
	
	//metodo para sacar, criado dentro da subclasse
	public void sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso. Seu saldo é: " + this.getSaldo());
		}else{
			System.out.println("Sado insuficiente");		
		}
	}
	
	//metodo para depositar, criando dentro da subclasse
	public void depositar(double valor) {
		System.out.println("---------" + this.getTitular() + "------------");
		this.saldo += valor;
		System.out.println("Seu novo saldo é de : " + this.getSaldo());
	}
}
