package exe1;

public class Aluno {
    public int nroAluno, idade;

    public float p1, p2;

    public String nome;

    //metodo construtor

    public Aluno(){
        this.nome = "sem nome";
    }

    public Aluno(int nroAluno, String nome, int idade, float p1, float p2 ){
        this.nroAluno = nroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }
// verifica a media
    public float notaFinal(){
        return(this.p1 + this.p2)/ 2;
    }
    // verifica se o aluno passou
    public  String passou(){
        return (this.notaFinal() >= 6) ? "Passou": "Não Passou";
    }
    public void dadosAluno(){
        System.out.println("Nro do Aluno " + this.nroAluno +
                " Nome: " + this.nome +
                " Situação: " + this.passou());
    }
}
