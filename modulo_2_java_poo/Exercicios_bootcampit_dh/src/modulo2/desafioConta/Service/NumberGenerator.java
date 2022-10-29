package modulo2.desafioConta.Service;

//SINGLETON - MY FIRST DESIGN PATTERNS
public class NumberGenerator {
    private int next;
    private final static NumberGenerator numberGeneratorInstance = new NumberGenerator();

    private NumberGenerator() {

    }

    public static NumberGenerator getInstance(){
        return numberGeneratorInstance;
    }
    public int getNext(){
        return ++this.next;
    }

}
