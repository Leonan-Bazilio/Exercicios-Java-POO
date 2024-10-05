package Abstracao;

import java.util.ArrayList;

class Empresa {
private ArrayList<Funcionario> funcionarios = new ArrayList<>();

public void adicionarFuncionario(Funcionario funcionario) {
    funcionarios.add(funcionario);
}

public void promoverFuncionario(Funcionario funcionario, Funcionario novoFuncionario) {
    int index = funcionarios.indexOf(funcionario);
    if (index >= 0) {
        funcionarios.set(index, novoFuncionario);
    }
}

public void calcularFolhaPagamento() {
    double totalSalarios = 0;
    double totalBonus = 0;
    
    for (Funcionario funcionario : funcionarios) {
        double salario = funcionario.calcularSalario();
        double bonus = funcionario.calcularBonus();
        totalSalarios += salario;
        totalBonus += bonus;
    }
    
    System.out.println("Total de salarios " + totalSalarios);
    System.out.println("Total de bonus " + totalBonus);
}
}
