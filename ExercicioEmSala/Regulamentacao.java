public class Regulamentacao {
    private boolean codigoEticaAdotado;

    public Regulamentacao(boolean codigoEticaAdotado) {
        this.codigoEticaAdotado = codigoEticaAdotado;
    }

    public Regulamentacao() {
        this.codigoEticaAdotado = false;
    }

    public void setCodigoEticaAdotado(boolean codigoEticaAdotado) {
        this.codigoEticaAdotado = codigoEticaAdotado;
    }

    public void aderirCodigoEtica() {
        this.codigoEticaAdotado = true;
        System.out.println("Código de ética adotado com sucesso.");
    }

    public boolean isCodigoEticaAdotado() {
        return codigoEticaAdotado;
    }
}
