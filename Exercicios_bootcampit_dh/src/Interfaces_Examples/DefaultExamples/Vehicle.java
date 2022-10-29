package Interfaces_Examples.DefaultExamples;

public interface Vehicle {

    static final String atributoTeste = "Oi, sou um atributo";
    String getBrand();
    String speedUp();
    String speedDown();
    String turnOnVehicle();
    default String turnAlarmOn(){
        return "Turning the vehicle alarm on.";
    }

    default String turnAlarmOff(){
        return "Turning the vehicle alarm off.";
    }
    default String turnOffVehicle(){
        return "Turning off the car.";
    }

    static double multiplicacao(double a, double b){
        return a*b;
    }

    static void imprimirAtributo(){
        System.out.println(Vehicle.atributoTeste);
    }

}
