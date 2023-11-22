abstract class Corrida {
    private String nome;
    private double taxaInscricao;
    private String assistenciaMedica;

    public Corrida(String nome, double taxaInscricao, String assistenciaMedica) {
        this.nome = nome;
        this.taxaInscricao = taxaInscricao;
        this.assistenciaMedica = assistenciaMedica;
    }

    public String getNome() {
        return nome;
    }

    public double getTaxaInscricao() {
        return taxaInscricao;
    }

    public String getAssistenciaMedica() {
        return assistenciaMedica;
    }

    public abstract void exibirDetalhes();
}