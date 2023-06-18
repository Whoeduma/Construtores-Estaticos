/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;


public class Livros extends Produto{
    private String autor;

    public Livros(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }
    
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
     public void imprimirDetalhes() {
        System.out.println("Livro: " + getNome());
        System.out.println("Preco: $" + getPreco());
        System.out.println("Autor: " + getAutor());
    }
}
