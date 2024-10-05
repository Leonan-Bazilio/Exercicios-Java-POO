package Abstracao;

class CartaoCredito extends FormaPagamento {
    private String numeroCartao;
    private String validade;
    private String cvv;
    
    public CartaoCredito(String numeroCartao, String validade, String cvv) {
        this.numeroCartao = numeroCartao;
        this.validade = validade;
        this.cvv = cvv;
    }
    
    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento no cartao feito");
        } else {
            System.out.println("Falha no cartao");
        }
    }
    
    @Override
    public boolean validarPagamento() {
        return numeroCartao.length() == 16 && !cvv.isEmpty();
    }
}

