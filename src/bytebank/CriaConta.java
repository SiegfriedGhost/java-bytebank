package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Primeira conta tem: " + primeiraConta.saldo);
		System.out.println("Segunda conta tem: " + segundaConta.saldo);
		
		//Java inicializa automaticamente vari�vel quando esta � criada/constru�da 
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		if (primeiraConta == segundaConta) {
			System.out.println("Primeira e segunda conta, s�o as mesmas contas!");
		} else {
			System.out.println("Primeira e segunda conta, s�o diferentes!");
			
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}
}
