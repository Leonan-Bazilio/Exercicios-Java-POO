package Abstracao;

class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    @Override
    public double calcularBonus() {
        return salarioBase * 0.15;
    }
    
    @Override
    public String getCargo() {
        return "Desenvolvedor";
    }
}
