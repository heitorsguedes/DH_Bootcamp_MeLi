package modulo2.java3_praticaintegradora.pratica1.exercicio3_animais.domain;

import modulo2.java3_praticaintegradora.pratica1.exercicio3_animais.interfaces.Carnivoro;

public class Gato extends Animal implements Carnivoro {
    @Override
    public String emitirSom(String som) {
        return som;
    }

    @Override
    public void comerCarne() {
        System.out.println("Comendo carninha nha :B " + emitirSom("Miau"));
    }
}
