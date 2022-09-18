public class CriaConta {
    
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);
    
        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);
        
        Conta segundaConta = new Conta();
        segundaConta.saldo = 300;
        
        segundaConta.agencia = 146;
        System.out.println("primeria conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);
        
        System.out.println(primeiraConta.agencia);
        
        segundaConta.agencia = 146;
        System.out.println("Agora a segunda conta esta na agencia " + segundaConta.agencia) ;   
        
        if(primeiraConta == segundaConta) {
        	System.out.println("mesma conta");
        }else {
        	System.out.println("contas diferentes");
        }
        //Referência para outra conta
        
		System.out.println(primeiraConta);
		System.out.println(segundaConta);


    }
}