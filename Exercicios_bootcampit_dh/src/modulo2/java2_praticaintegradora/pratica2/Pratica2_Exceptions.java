package modulo2.java2_praticaintegradora.pratica2;

class PraticaExcecoes{
    public static int a = 0;
    public static int b = 300;

    public static void dividirBporA(){
        try{
            System.out.println(b/a);
        }catch(Exception e){
            System.out.println("Ocorreu um erro");
        }finally {
            System.out.println("Programa finalizado");
        }
    }

    public static void dividirBporAException(){
        try{
            System.out.println(b/a);
        }catch (Exception e){
            throw new IllegalArgumentException("Nao pode ser dividido por 0");
        }finally {
            System.out.println("Programa finalizado.");
        }
    }
}

public class Pratica2_Exceptions {

    public static void main(String[] args) {
        //PraticaExcecoes.dividirBporA();
        PraticaExcecoes.dividirBporAException();
    }
}
