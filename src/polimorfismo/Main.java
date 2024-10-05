package polimorfismo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IMeioTransporte[] transportes = new IMeioTransporte[3];
        
        transportes[0] = new Carro();
        transportes[1] = new Bicicleta();
        transportes[2] = new Trem();
        
        for (IMeioTransporte transporte : transportes) {
            transporte.acelerar();
            transporte.frear();
            System.out.println();
        }
        
        
        ArrayList<Animal> animais = new ArrayList<>();
        
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Vaca());
        
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
