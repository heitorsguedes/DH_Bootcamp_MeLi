package modulo2.java1_praticaintegradora.pratica2;
//---------------REGRAS NEGOCIO---------------------------------
//Inscrição no circuito pequeno: Menores de 18 anos R$1.300. Acima de 18 anos R$ 1.500.
//Inscrição no Circuito Médio: Menores de 18 anos R$ 2.000. Acima de 18 anos R$ 2.300.
//Inscrição no Circuito Avançado: A inscrição não é permitida para menores de 18 anos. Maiores de 18 anos R$ 2.800
//Informações Cadastro: RG, nome, sobrenome, idade, número de celular, número de emergência e grupo sanguíneo.
// O Participante terá uma ID que será SUBSEQUENTE.
//-----------------O APLICATIVO SERÁ CAPAZ DE---------------------
//a) Inscrever um novo participante em uma categoria. (Observe que cada categoria tem uma lista de entradas diferente).
//b) Mostra na tela todos os cadastrados em uma determinada categoria com seus respectivos dados e número de registro.
//c) Cancelar a inscrição de um participante de uma categoria.
//d) Determine o valor que cada participante deve pagar ao se inscrever.
// Por exemplo: se o participante se inscrever na categoria Circuito Pequeno e tiver 21 anos, o valor a ser
// pago é de R$ 1.500.

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Candidato {
    private String nome;
    private String sobrenome;
    private int idade;
    private String RG;
    private String celular;
    private String numeroEmergencia;
    private String grupoSanguineo;
    private String categoria;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public void setNumeroEmergencia(String numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", RG='" + RG + '\'' +
                ", celular='" + celular + '\'' +
                ", numeroEmergencia='" + numeroEmergencia + '\'' +
                ", grupoSanguineo='" + grupoSanguineo + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    public Candidato(String nome, String sobrenome, int idade, String RG, String celular, String numeroEmergencia, String grupoSanguineo, String categoria) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.RG = RG;
        this.celular = celular;
        this.numeroEmergencia = numeroEmergencia;
        this.grupoSanguineo = grupoSanguineo;
        this.categoria = categoria;
    }

    public Candidato() {

    }
}

public class Pratica2_CorridaNaSelva {

    public static void main(String[] args) {
        boolean novoParticipante = true;
        Map<Integer, Candidato> listaParticipantes = new HashMap<>();
        //CANDIDATOS PRE INSCRITOS ------------------------------------------------
        Candidato c1 = new Candidato("Heitor", "G", 24, "34J", "1199999", "1990", "AB", "Pequeno");
        Candidato c2 = new Candidato("Nunes", "G", 24, "34J", "1199999", "1990", "AB", "Pequeno");
        Candidato c3 = new Candidato("Brasa", "G", 24, "34J", "1199999", "1990", "AB", "Medio");
        Candidato c4 = new Candidato("Ana", "G", 24, "34J", "1199999", "1990", "AB", "Medio");
        Candidato c5 = new Candidato("Ferdinanda", "G", 24, "34J", "1199999", "1990", "AB", "Medio");
        Candidato c6 = new Candidato("Laila", "G", 33, "34J", "1199999", "1990", "AB", "Avancado");
        listaParticipantes.put(1, c1);
        listaParticipantes.put(2, c2);
        listaParticipantes.put(3, c3);
        listaParticipantes.put(4, c4);
        listaParticipantes.put(5, c5);
        listaParticipantes.put(6, c6);

        int id = 6;
        int opcaoCadastro = 0;
        do {
            id++;
            opcaoCadastro = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem vindo a competição\n" +
                    "Categorias\n" +
                    "1-Cadastrar No Circuito Pequeno\n" +
                    "2-Cadastrar No Circuito Médio\n" +
                    "3-Cadastrar No Circuito Avançado\n" +
                    "4-Ver competidores por categoria\n" +
                    "5-Cancelar inscrição participante\n" +
                    "6-Ver todos os competidores\n" +
                    "0-Sair"
            ));
            Candidato c;

            switch (opcaoCadastro) {
                case 1:
                    c = cadastrarCandidato(1);

                    listaParticipantes.put(id, c);
                    break;

                case 2:
                    c = cadastrarCandidato(2);

                    listaParticipantes.put(id, c);
                    break;

                case 3:
                    c = cadastrarCandidato(3);
                    listaParticipantes.put(id, c);
                    break;
                case 4:

                    int categoria = Integer.parseInt(JOptionPane.showInputDialog("Digite a categoria de competiçao que deseja analisar\n" +
                            "Categorias\n" +
                            "1-Circuito Pequeno\n" +
                            "2-Circuito Médio\n" +
                            "3-Circuito Avançado"));


                    visualizarCompetidoresByCategoria(listaParticipantes, categoria);
                    break;
                case 5:
                    int idExcluir = visualizarTodosParticipantes(listaParticipantes, true);
                    listaParticipantes.remove(idExcluir);
                    break;
                case 6:
                    visualizarTodosParticipantes(listaParticipantes, false);
                    break;
                case 0:
                    opcaoCadastro = 0;
                    JOptionPane.showMessageDialog(null, "Tchau, até a próxima");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }

        } while (opcaoCadastro != 0);


    }

    public static Candidato cadastrarCandidato(int categoria) {
        Candidato c = new Candidato();
//Inscrição no circuito pequeno: Menores de 18 anos R$1.300. Acima de 18 anos R$ 1.500.
//Inscrição no Circuito Médio: Menores de 18 anos R$ 2.000. Acima de 18 anos R$ 2.300.
//Inscrição no Circuito Avançado: A inscrição não é permitida para menores de 18 anos. Maiores de 18 anos R$ 2.800
//Informações Cadastro: RG, nome, sobrenome, idade, número de celular, número de emergência e grupo sanguíneo.
        double valorInsc = 0;
        String nome = JOptionPane.showInputDialog("Digite o nome");
        c.setNome(nome);
        String sobrenome = JOptionPane.showInputDialog("Digite o sobrenome");
        c.setSobrenome(sobrenome);
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));

        if (categoria == 1) {
            c.setCategoria("Pequeno");
            valorInsc = idade > 18 ? 1500 : 1300;
        } else if (categoria == 2) {
            valorInsc = idade > 18 ? 2300 : 2000;
            c.setCategoria("Medio");
        } else if (categoria == 3 && idade < 18) {
            boolean idadeValida = false;
            valorInsc = 2000;
            while (!idadeValida) {
                idade = Integer.parseInt(JOptionPane.showInputDialog("Proibido menores de idade nessa categoria"));
            }
            c.setCategoria("Avancado");
        }
        c.setIdade(idade);
        String RG = JOptionPane.showInputDialog("Digite o RG");
        c.setRG(RG);
        String celular = JOptionPane.showInputDialog("Digite o celular");
        c.setCelular(celular);
        String numeroEmergencia = JOptionPane.showInputDialog("Digite o numero de emergencia");
        c.setNumeroEmergencia(numeroEmergencia);
        String tipoSanguinero = JOptionPane.showInputDialog("Digite o tipo sanguinero");
        c.setGrupoSanguineo(tipoSanguinero);

        JOptionPane.showMessageDialog(null, "VALOR A SER PAGO R$:" + valorInsc);
        return c;
    }

    public static void visualizarCompetidoresByCategoria(Map<Integer, Candidato> listaCandidatos, int categoria) {
        List<String> arrayCandidatos = new ArrayList<>();

        for (Map.Entry<Integer, Candidato> candidato : listaCandidatos.entrySet()) {
            if (categoria == 1 && candidato.getValue().getCategoria() == "Pequeno") {
                arrayCandidatos.add(candidato.getKey() + " - " + candidato.getValue());
                continue;
            }

            if (categoria == 2 && candidato.getValue().getCategoria() == "Medio") {

                arrayCandidatos.add(candidato.getKey() + " - " + candidato.getValue());
                continue;
            }
            if (categoria == 3 && candidato.getValue().getCategoria() == "Avancado") {
                arrayCandidatos.add(candidato.getKey() + " - " + candidato.getValue());
                continue;
            }

        }
        String candidatos = "";
        for (String c : arrayCandidatos) {
            candidatos += c + "\n";
        }
        JOptionPane.showMessageDialog(null, candidatos);
    }

    public static int visualizarTodosParticipantes(Map<Integer, Candidato> listaParticipantes, boolean excluir) {
        String candidatos = "";

        for (Map.Entry<Integer, Candidato> c : listaParticipantes.entrySet()) {
            candidatos += c.getKey() + " - " + c.getValue() + "\n";
        }
        if (excluir) {
            int idCandidato = Integer.parseInt(JOptionPane.showInputDialog(candidatos + "Digite o nome do candidato que deseja excluir"));
            return idCandidato;
        }
        JOptionPane.showMessageDialog(null,candidatos);
        return -1;
    }
}