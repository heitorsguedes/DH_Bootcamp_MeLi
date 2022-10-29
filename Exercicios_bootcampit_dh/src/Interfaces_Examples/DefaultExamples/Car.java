package Interfaces_Examples.DefaultExamples;

public class Car implements Vehicle{
    @Override
    public String getBrand() {
        return "Volkswagem";
    }

    @Override
    public String speedUp() {
        return "Acelerando";
    }

    @Override
    public String speedDown() {
        return "Freiando";
    }

    @Override
    public String turnOnVehicle() {
        return "Ligando Carro";
    }

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.speedUp());
        System.out.println(c.turnAlarmOn());
        System.out.println(c.turnOnVehicle()); //Obrigado a implementar por ser abstract
        System.out.println(c.turnOffVehicle()); //Default nao preciso implementar
        System.out.println(Vehicle.multiplicacao(10,10));
        Vehicle.imprimirAtributo();

    }
}
