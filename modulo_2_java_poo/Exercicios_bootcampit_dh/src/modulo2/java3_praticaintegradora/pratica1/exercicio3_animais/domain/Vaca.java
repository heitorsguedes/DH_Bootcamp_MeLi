package modulo2.java3_praticaintegradora.pratica1.exercicio3_animais.domain;

import modulo2.java3_praticaintegradora.pratica1.exercicio3_animais.interfaces.Herbivoro;

public class Vaca extends Animal implements Herbivoro {
    @Override
    public String emitirSom(String som) {
        return som;
    }

    @Override
    public void comerMato() {
        System.out.println("Comendo matinho humm :B " + emitirSom("Muuuuuh"));
    }
}
