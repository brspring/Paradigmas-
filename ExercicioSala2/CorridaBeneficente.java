class CorridaBeneficente extends Corrida {
    private String instituicaoBeneficiada;

    public CorridaBeneficente(String nome, double taxaInscricao, String assistenciaMedica, String instituicaoBeneficiada) {
        super(nome, taxaInscricao, assistenciaMedica);
        this.instituicaoBeneficiada = instituicaoBeneficiada;
    }

@Override
public void exibirDetalhes() {
    System.out.println("---------------Corrida Beneficente Cadastrada-----------"+ "\n"+
            "Nome da Corrida: " + getNome() + "\n" +
            "Taxa de inscrição: " + getTaxaInscricao() + "\n" +
            "Assistência Médica: " + getAssistenciaMedica() + "\n" +
            "Instituição Beneficiada: " + instituicaoBeneficiada + "\n" +
            "----------------------------------------------------------");
}

}