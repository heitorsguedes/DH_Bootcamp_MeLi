package modulo2.java2_praticaintegradora.pratica1;

class Pessoa {
    private String id;
    private String nome;
    private int idade;
    private int peso;
    private double altura;

    public Pessoa(String id, String nome, int idade, int peso, double altura) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa() {

    }

    public Pessoa(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC(){
        double result = this.peso/Math.pow(this.altura,2);
        if(result < 20) return -1;
        if(result >= 20 && result <=25) return 0;
        return 1;
    }
}

public class Pratica1_ClassPessoa {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("H23A","Heitor",24,60,1.686);
        if(p.calcularIMC() == 0) System.out.println("Peso Saudável");
        else if(p.calcularIMC() < 0) System.out.println("Abaixo do Peso");
        else System.out.println("Sobrepeso");
    }
}
