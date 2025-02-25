import javax.swing.*;

public class Carro {
    // variaveis
    // do tipo primitivo

    public int ano;

    public float velocidade;
    // do tipo classe

    public String marca, modelo; // sempre que iniciar com letra maiuscula é class

    public Carro(){
        this.marca = "Marca inválida";
        this.modelo = "Modelo inválido ";

    }
    public Carro(int ano, float velocidade, String marca, String modelo){
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }
    // metodos
    public void exibirdetalhes(){
        JOptionPane.showMessageDialog(null, "Marca: " + this.marca + //JO abre caixa de diálogo
                " Modelo: " + this.modelo +
                " Ano: " + this.ano +
                " Velocidade: " + this.velocidade
        );
    }
    public void acelerar(float x){
        this.velocidade += x;
    }
    public void frear(float x){
        if(this.velocidade - x >= 0){
            this.velocidade -= x;
        }
        else{
            System.out.println("Não é possivel frear");
        }
    }
}
