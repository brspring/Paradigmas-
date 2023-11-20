public abstract class ServicoMedico {
    private double preco;
    public ServicoMedico() {
        this.preco = 0.0;
    }
    public ServicoMedico(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public abstract double calcularPreco();
}

