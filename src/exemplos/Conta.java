package exemplos;

public class Conta {
    int numero;
    String nomeTitular;
   private double saldo;
    
    void depositar(double valor) {
        // this.saldo += valor;
        this.saldo = this.saldo + valor;
    }
    
    boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor; // this.saldo=this.saldo - valor
            return true;
        } else
            return false;        
    }
    public double getsaldo(){
        return this.saldo;
    }
    public int getnumero(){
        return this.numero;
    }
    public String getnomeTitular(){
        return this.nomeTitular;
    }
    public void setNumero (int numero){
        this.numero = numero;
    }
    public void setnomeTitular (String nomeTitular){
        this.nomeTitular = nomeTitular;
    }
}
