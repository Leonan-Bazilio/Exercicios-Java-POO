package Abstracao;

public class Main {
    public static void main(String[] args) {
        FormaPagamento cartao = new CartaoCredito("1234567891011121", "05/10", "123");
        FormaPagamento boleto = new Boleto("123451234512345123451234512345");
        FormaPagamento pix = new Pix("70707070");
        
        cartao.processarPagamento(100.00);
        boleto.processarPagamento(200.00);
        pix.processarPagamento(300.00);
        
        
        Empresa empresa = new Empresa();
        
        Funcionario funcionario1 = new Gerente("Hori", 3000);
        Funcionario funcionario2 = new Desenvolvedor("ichikawa", 2000);
        Funcionario funcionario3 = new Estagiario("Leorio", 1000);
        
        empresa.adicionarFuncionario(funcionario1);
        empresa.adicionarFuncionario(funcionario2);
        empresa.adicionarFuncionario(funcionario3);
        empresa.calcularFolhaPagamento();
        
        System.out.println("-----------------------------");
        empresa.promoverFuncionario(funcionario3, new Desenvolvedor("Leorio", 2500));
        empresa.calcularFolhaPagamento();
    }
}
