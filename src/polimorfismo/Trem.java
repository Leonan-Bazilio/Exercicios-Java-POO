package polimorfismo;

public class Trem implements IMeioTransporte {
    
    public void acelerar() {
        System.out.println("O trem esta acelerando");
    }
    
    public void frear() {
        System.out.println("O trem esta freando");
    }
}
