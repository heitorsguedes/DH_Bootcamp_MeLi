package modulo2.java1_praticaintegradora.pratica2.modelagemDiagrama.domain;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Testando a modelagem das classes apenas sem as regras de negocio.
        /*
            Estou apenas modelando de acordo com o diagrama de forma super simploria.


        */
        Maratonista m1 = new Maratonista("INS1", "000.0", "Heitor", "Silva", 24,
                "1195900000", "1198800000", "B");
        Maratonista m2 = new Maratonista("INS2", "000.0", "Frederico", "Silva", 24,
                "1195900000", "1198800000", "B");
        Maratonista m3 = new Maratonista("INS3", "000.0", "Ana", "Silva", 24,
                "1195900000", "1198800000", "B");

        Maratonista m4 = new Maratonista("INS1", "000.0", "Xeb", "Silva", 24,
                "1195900000", "1198800000", "B");
        Maratonista m5 = new Maratonista("INS2", "000.0", "Larissa", "Silva", 24,
                "1195900000", "1198800000", "B");
        Maratonista m6 = new Maratonista("INS3", "000.0", "Markra", "Silva", 24,
                "1195900000", "1198800000", "B");


        Maratonista m7 = new Maratonista("INS1", "000.0", "Brana", "Silva", 24,
                "1195900000", "1198800000", "B");
        Maratonista m8 = new Maratonista("INS2", "000.0", "Bruneto", "Silva", 24,
                "1195900000", "1198800000", "B");
        Maratonista m9 = new Maratonista("INS3", "000.0", "Tok", "Silva", 24,
                "1195900000", "1198800000", "B");

        Inscricao i1 = new Inscricao(m1, "Pequeno", 10000);
        Inscricao i2 = new Inscricao(m2, "Pequeno", 10000);
        Inscricao i3 = new Inscricao(m3, "Pequeno", 10000);
        Inscricao i4 = new Inscricao(m2, "Medio", 10000);
        Inscricao i5 = new Inscricao(m3, "Medio", 10000);
        Inscricao i6 = new Inscricao(m2, "Avancado", 10000);
        Inscricao i7 = new Inscricao(m3, "Avancado", 10000);

        List<Inscricao>listaInscricao = new ArrayList<>(List.of(i1,i2,i3));
        List<Inscricao>listaInscricao2 = new ArrayList<>(List.of(i4,i5));
        List<Inscricao>listaInscricao3 = new ArrayList<>(List.of(i6,i7));

        Circuito circuitoPequeno = new Circuito("Pequeno", 10,listaInscricao);
        Circuito circuitoMedio = new Circuito("Medio", 15,listaInscricao2);
        Circuito circuitoAvancado = new Circuito("Avancado", 30,listaInscricao3);

        List<Circuito>listaCircuitos = new ArrayList<>(List.of(circuitoPequeno,circuitoMedio,circuitoAvancado));
        MaratonaSelva maratonaSelva = new MaratonaSelva(listaCircuitos,7,70000);

        System.out.println(maratonaSelva);

    }
}
