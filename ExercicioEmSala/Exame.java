public class Exame extends ServicoMedico {
    private String tipoExame;
    private Regulamentacao regulamentacao;

    public Exame(double preco, String tipoExame, Regulamentacao regulamentacao) {
        super(preco);
        this.tipoExame = tipoExame;
        this.regulamentacao = regulamentacao;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public Regulamentacao getRegulamentacao() {
        return regulamentacao;
    }

    public void setRegulamentacao(Regulamentacao regulamentacao) {
        this.regulamentacao = regulamentacao;
    }

    public void aderirCodigoEtica() {
        regulamentacao.aderirCodigoEtica();
        System.out.println("Código de ética adotado para o exame: " + tipoExame);
    }

    public boolean isCodigoEticaAdotado() {
        return regulamentacao.isCodigoEticaAdotado();
    }

    @Override
    public double calcularPreco() {
        return getPreco();
    }

}
