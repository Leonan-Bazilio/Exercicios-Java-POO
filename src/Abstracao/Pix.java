package Abstracao;

class Pix extends FormaPagamento {
    private String chavePix;
    
    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }
    
    @Override
    public void processarPagamento(double valor) {
        if (validarPagamento()) {
            System.out.println("Pagamento feito no pix");
        } else {
            System.out.println("pix invalido");
        }
    }
    
    @Override
    public boolean validarPagamento() {
        return !chavePix.isEmpty();
    }
}
