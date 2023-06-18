
package construtores.estaticos;

import java.util.Scanner;


public class Pessoa {
    private String nome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private int idade;

    public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        calcularIdade();
    }
    
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the diaNascimento
     */
    public int getDiaNascimento() {
        return diaNascimento;
    }

    /**
     * @param diaNascimento the diaNascimento to set
     */
    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    /**
     * @return the mesNascimento
     */
    public int getMesNascimento() {
        return mesNascimento;
    }

    /**
     * @param mesNascimento the mesNascimento to set
     */
    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    /**
     * @return the anoNascimento
     */
    public int getAnoNascimento() {
        return anoNascimento;
    }

    /**
     * @param anoNascimento the anoNascimento to set
     */
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
     private void calcularIdade() {
         int diaAtual;
         int mesAtual;
         int anoAtual;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira a data atual");
            System.out.print("Dia: ");
            diaAtual = scanner.nextInt();
            System.out.print("Mes: ");
            mesAtual = scanner.nextInt();
            System.out.print("Ano: ");
            anoAtual = scanner.nextInt();
        }

        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idade = anoAtual - anoNascimento - 1;
        } else {
            idade = anoAtual - anoNascimento;
        }
    }

    public int informarIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Data de Nascimento: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + ", Idade: " + idade;
    }
}
