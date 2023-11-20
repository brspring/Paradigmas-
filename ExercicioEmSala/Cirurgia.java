public class Cirurgia extends ServicoMedico {
    private String tipoAnestesia;

    public Cirurgia(double preco, String tipoAnestesia) {
        super(preco);
        this.tipoAnestesia = tipoAnestesia;
    }
    public String getTipoAnestesia() {
        return tipoAnestesia;
    }

    public void setTipoAnestesia(String tipoAnestesia) {
        this.tipoAnestesia = tipoAnestesia;
    }

    @Override
    public double calcularPreco() {
        return getPreco();
    }
}