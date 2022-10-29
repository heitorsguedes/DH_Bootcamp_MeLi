package modulo2.java3_praticaintegradora.pratica1.exercicio3_animais;

import modulo2.java3_praticaintegradora.pratica1.exercicio3_animais.domain.Cachorro;
import modulo2.java3_praticaintegradora.pratica1.exercicio3_animais.domain.Gato;
import modulo2.java3_praticaintegradora.pratica1.exercicio3_animais.domain.Vaca;

public class Main {

    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        Gato g1 = new Gato();
        Vaca v1 = new Vaca();

        c1.comerCarne();
        g1.comerCarne();
        v1.comerMato();

    }
}
