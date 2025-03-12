package exe2;

public class Cliente {public int nroAgencia, nroConta;
    public String nome;

    public float saldo;

    public Cliente(){ // constructor para
        this.nome = "sem nome";
    }
    public Cliente(int nroAgencia, int nroConta, String nome, float saldo){
        this.nroAgencia = nroAgencia;
        this.nroConta = nroConta;
        this.nome = nome;
        this.saldo = saldo;
    }
    public void depositar(float x){
        this.saldo += x;
    }
    public void sacar(float x){
        if(this.saldo >= x){
            this.saldo -= x;
            System.out.println("Saque realizado com sucesso!");
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }
    public String exibirDetalhes(){
        return "\nAgencia " + this.nroAgencia  +
                    " Conta " + this.nroConta  +
                    " Nome " + this.nome  +
                    " Saldo " + this.saldo;
    }

}
