package modulo2.java3_praticaintegradora.pratica1.exercicio2_impressora.interfaces;

import modulo2.java3_praticaintegradora.pratica1.exercicio2_impressora.documentos.Documento;

public interface Imprimir {
    void teste();

    static void imprimir(Documento doc){
        System.out.println("Imprimindo: "+doc.toString());
    }
}
