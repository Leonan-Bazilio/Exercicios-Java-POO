package heranca;

public class Funcionario {
    protected String nome;
    protected double salario;
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    
    public double calcularBonus() {
        return 0;
    }
    
    public void trabalhar() {
        System.out.println(nome + " esta trabalhando");
    }
    
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario: R$ " + salario);
        System.out.println("Bonus: R$ " + calcularBonus());
    }
}

