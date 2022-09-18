
public class TestaMetodo {

	public static void main (String[] args) {
		Conta contaDoPaulo = new Conta();	
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
	
		boolean conseguiRetirar = contaDoPaulo.saca(20);	
		System.out.println("Sacado " + contaDoPaulo.saldo);
		System.out.println("Saque realizado " + conseguiRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(3000, contaDoPaulo);
		
		if(sucessoTransferencia) {
			System.out.println("\nTransferência feita com sucesso");	
		} else {
			System.out.println("Faltou dinheiro");
		}
		
		System.out.println("Saldo após transferência " + contaDaMarcela.saldo);
		
		System.out.println("Saldo da conta do Paulo após receber a transferência " + contaDoPaulo.saldo);
	}

}
