import exe1.Aluno;

public class MainAluno {
    public static void main(String []args) {
        // instancia um aluno
        Aluno obj1 = new Aluno(); //chama o construct sem o nome na String
        System.out.println("Media do aluno " + obj1.nome + " é " + obj1.notaFinal());
        obj1.dadosAluno();
        Aluno obj2 = new Aluno(123, "Pedro", 12, 7.5f, 9.2f);
        System.out.println("\nMedia do aluno " + obj2.nome + " é " + obj2.notaFinal());
        obj2.dadosAluno();
    }
}
