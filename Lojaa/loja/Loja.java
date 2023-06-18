
package loja;

import classes.Cd;
import classes.Dvd;
import classes.Livros;

public class Loja {

    
    public static void main(String[] args) {
        Livros livro1 = new Livros("Dom Casmurro", 29.99, "Machado de Assis");
        Cd cd1 = new Cd("Thriller", 14.99, 9);
        Dvd dvd1 = new Dvd("O Senhor dos Aneis: A Sociedade do Anel", 19.99, 178);

        Livros livro2 = new Livros("Harry Potter e a Pedra Filosofal", 39.99, "J.K. Rowling");
        Cd cd2 = new Cd("Abbey Road", 12.99, 17);

        livro1.imprimirDetalhes();
        System.out.println();
        cd1.imprimirDetalhes();
        System.out.println();
        dvd1.imprimirDetalhes();
        System.out.println();
        livro2.imprimirDetalhes();
        System.out.println();
        cd2.imprimirDetalhes();
    }
    
}
