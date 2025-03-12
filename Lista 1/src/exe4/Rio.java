package exe4;

public class Rio {
    public String nome;

    public float nivel;

    public boolean poluido;

    public Rio(){
        this.nome= nome= "sem nome";
    }

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    //poluir o rio
    public void poluir(){
       this.poluido = true;
    }
    public void limpar(){
        this.poluido = false;
    }
    public void chover(float x){
        this.nivel += x;
    }
    public void ensolarar(float x){
        if(this.nivel >= x) {
            this.nivel -= this.nivel;
        }
        else{
            System.out.println("Nivel do Rio não alterado");
        }
    }

    public String exibirDetalhes() {
        return "Rio{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", poluido=" + (poluido? " Sim " : " Nao ") +
                '}';
    }
}
