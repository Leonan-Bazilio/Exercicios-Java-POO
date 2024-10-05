package polimorfismo;

public class Bicicleta implements IMeioTransporte {

    public void acelerar() {
        System.out.println("A bicicleta esta acelerando");
    }

    public void frear() {
        System.out.println("A bicicleta esta freando.");
    }
}
