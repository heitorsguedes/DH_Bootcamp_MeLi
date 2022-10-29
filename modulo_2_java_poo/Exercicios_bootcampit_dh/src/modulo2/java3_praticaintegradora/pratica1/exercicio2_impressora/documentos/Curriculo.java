package modulo2.java3_praticaintegradora.pratica1.exercicio2_impressora.documentos;

public class Curriculo extends Documento {
    private String nome;
    private String profissao;
    private int idade;

    public Curriculo(String nome, String profissao, int idade) {
        this.nome = nome;
        this.profissao = profissao;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Curriculo {" +
                "nome='" + nome + '\'' +
                ", profissao='" + profissao + '\'' +
                ", idade='" + idade + '\'' +
                "} ";
    }
}
