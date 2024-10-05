package Abstracao;

class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    @Override
    public double calcularSalario() {
        return salarioBase + 1000;
    }
    
    @Override
    public double calcularBonus() {
        return salarioBase * 0.20;
    }
    
    @Override
    public String getCargo() {
        return "Gerente";
    }
}
