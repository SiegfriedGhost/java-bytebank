package bytebank;

//Refer�ncias Vs. Objetos
public class TesteReferencias {
	
	public static void main(String[] args) {
		//Refer�ncia para um objeto do tipo Conta 
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		//C�pia Refer�ncia 
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo segunda conta: " + segundaConta.saldo);
		System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("Primeira e segunda conta, s�o as mesmas contas!");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
