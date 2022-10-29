package modulo2.java3_praticaintegradora.pratica1.exercicio2_impressora;

import modulo2.java3_praticaintegradora.pratica1.exercicio2_impressora.documentos.Curriculo;
import modulo2.java3_praticaintegradora.pratica1.exercicio2_impressora.documentos.Livro;
import modulo2.java3_praticaintegradora.pratica1.exercicio2_impressora.documentos.Relatorio;
import modulo2.java3_praticaintegradora.pratica1.exercicio2_impressora.interfaces.Imprimir;

public class Main {

    public static void main(String[] args) {
        Livro book1 = new Livro(200,"J.K Rolling","HarryPotter");
        Curriculo curriculo1 = new Curriculo("Heitor","Desenvolvedor",24);
        Relatorio relatorio1 = new Relatorio("Os animais secos sao aqueles que estao em toda a parte",
                1,"Jennifer More");


        Imprimir.imprimir(book1);
        Imprimir.imprimir(curriculo1);
        Imprimir.imprimir(relatorio1);


    }
}
