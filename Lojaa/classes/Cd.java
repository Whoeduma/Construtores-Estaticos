
package classes;


public class Cd extends Produto {
    private int numeroFaixas;

    public Cd(String nome, double preco, int numeroFaixas) {
        super(nome, preco);
        this.numeroFaixas = numeroFaixas;
    }
    
    public int getNumeroFaixas() {
        return numeroFaixas;
    }

    /**
     * @param numeroFaixas the numeroFaixas to set
     */
    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }
    
     public void imprimirDetalhes() {
        System.out.println("CD: " + getNome());
        System.out.println("Preco: $" + getPreco());
        System.out.println("Numero de Faixas: " + numeroFaixas);
    }
}
