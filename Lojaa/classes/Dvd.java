/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;


public class Dvd extends Produto {
    private int duracao;

    public Dvd(String nome, double preco, int duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }
    
    public int getDuracao() {
        return duracao;
    }

    
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    public void imprimirDetalhes() {
        System.out.println("DVD: " + getNome());
        System.out.println("Preco: $" + getPreco());
        System.out.println("Duracao: " + duracao + " minutos");
    }
}
