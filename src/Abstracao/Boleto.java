package Abstracao;

class Boleto extends FormaPagamento {
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }
    
    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("pagamento no boleto feito");
        } else {
            System.out.println("Código invalido");
        }
    }
    
    @Override
    public boolean validarPagamento() {
        return codigoBarras.length() == 30;
    }
}