package bytebank;

//Referências Vs. Objetos
public class TesteReferencias {
	
	public static void main(String[] args) {
		//Referência para um objeto do tipo Conta 
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		//Cópia Referência 
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo segunda conta: " + segundaConta.saldo);
		System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("Primeira e segunda conta, são as mesmas contas!");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
