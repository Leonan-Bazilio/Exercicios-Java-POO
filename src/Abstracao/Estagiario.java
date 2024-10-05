package Abstracao;

class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    @Override
    public double calcularSalario() {
        this.salarioBase= salarioBase *0.5;
        return this.salarioBase;
    }
    
    @Override
    public double calcularBonus() {
        return 0;
    }
    
    @Override
    public String getCargo() {
        return "Estagiario";
    }
}

