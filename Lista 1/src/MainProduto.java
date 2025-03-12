import exe3.Produto;

public class MainProduto {
    public static void main(String[] args) {

        Produto obj1 = new Produto(); // objeto criado via constructor
        obj1.comprar(3); //chamar o obj e a função criada comprar
        obj1.vender(1);
        obj1.subir(470);
        System.out.println(obj1.exibirDetalhes());
        //
        Produto obj2 = new Produto(123, 10, "bola basquete", 50);
        obj2.exibirDetalhes();
        obj2.vender(12);
        obj2.descer(540);
        System.out.println(obj2.exibirDetalhes());
    }
}
