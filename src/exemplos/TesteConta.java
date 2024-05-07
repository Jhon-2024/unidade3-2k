package exemplos;

public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.depositar(100);
        c.depositar(50);
        boolean saqueEfetuado = c.sacar(50);
        if (saqueEfetuado) {
            System.out.println("Saque efetuado com sucesso!");
        } else {
            System.out.println("Saque Não realizado!!!Saldo Insuficiente");
        }
        System.out.println("Saldo: " + c.getsaldo());
    
        System.out.println("Numero " + c.getnumero());
    
       System.out.println (" Nome do Titular " + c.getnomeTitular());
       
    }  
}
    
