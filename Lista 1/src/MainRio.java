import exe4.Rio;

public class MainRio {
    public static void main(String[] args) {
        Rio obj1 = new Rio();
        obj1.poluir();
        obj1.ensolarar(0.5f);
        System.out.println(obj1.exibirDetalhes());
        Rio obj2 = new Rio("Amazonas", 1.4f, false);
        System.out.println(obj2.exibirDetalhes());
        obj2.poluir();
        obj2.chover(0.3f);
        System.out.println(obj2.exibirDetalhes());

    }
}
