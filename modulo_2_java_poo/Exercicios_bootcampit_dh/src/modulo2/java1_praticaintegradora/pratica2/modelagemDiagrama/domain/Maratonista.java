package modulo2.java1_praticaintegradora.pratica2.modelagemDiagrama.domain;

public class Maratonista {
    private String codigo;
    private String RG;
    private String nome;
    private String sobrenome;
    private int idade;
    private String numeroCelular;
    private String numeroEmergencia;
    private String grupoSanguinario;

    public Maratonista(String codigo, String RG, String nome, String sobrenome, int idade, String numeroCelular, String numeroEmergencia, String grupoSanguinario) {
        this.codigo = codigo;
        this.RG = RG;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.numeroCelular = numeroCelular;
        this.numeroEmergencia = numeroEmergencia;
        this.grupoSanguinario = grupoSanguinario;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getRG() {
        return RG;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public String getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public String getGrupoSanguinario() {
        return grupoSanguinario;
    }

    @Override
    public String toString() {
        return "Maratonista{" +
                "codigo='" + codigo + '\'' +
                ", RG='" + RG + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", numeroCelular='" + numeroCelular + '\'' +
                ", numeroEmergencia='" + numeroEmergencia + '\'' +
                ", grupoSanguinario='" + grupoSanguinario + '\'' +
                '}';
    }
}
