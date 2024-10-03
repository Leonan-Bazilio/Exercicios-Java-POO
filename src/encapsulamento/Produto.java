package encapsulamento;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;
    
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEmEstoque(quantidadeEmEstoque);
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
    }
    
    
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        if (quantidadeEmEstoque >= 0) {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        } else {
            System.out.println("A quantidade em estoque não pode ser negativa.");
        }
    }
    
    public void aplicarDesconto(double porcentagem) throws IllegalArgumentException {
        if (porcentagem < 0 || porcentagem > 50) {
            throw new IllegalArgumentException("O desconto não pode ser menor que 0% ou maior que 50%.");
        }
        this.preco -= this.preco * (porcentagem / 100);
    }
    
    
    public void exibirDetalhes() {
        System.out.println("encapsulamento.Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }
}

