
package construtores.estaticos;
public class ConstrutoresEstaticos {

    
    public static void main(String[] args) {
        Pessoa einstein = new Pessoa("Albert Einstein", 14, 3, 1879);
        Pessoa newton = new Pessoa("Isaac Newton", 4, 1, 1643);

        System.out.println("Idade de Albert Einstein: " + einstein.informarIdade());
        System.out.println("Idade de Isaac Newton: " + newton.informarIdade());
    }
    
}
