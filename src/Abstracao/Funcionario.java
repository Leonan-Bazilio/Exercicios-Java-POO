package Abstracao;

class Funcionario {
    protected String nome;
    protected double salarioBase;
    
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalario() {
        return salarioBase;
    }
    
    public double calcularBonus() {
        return salarioBase * 0.10;
    }
    
    public String getCargo() {
        return "Funcionario";
    }
}
