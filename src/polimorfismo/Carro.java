package polimorfismo;

public class Carro implements IMeioTransporte {
    public void acelerar() {
        System.out.println("O carro esta acelerando");
    }
    
    public void frear() {
        System.out.println("O carro esta freando");
    }
}