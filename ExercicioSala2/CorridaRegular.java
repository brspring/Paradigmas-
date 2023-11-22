class CorridaRegular extends Corrida {
    private boolean recreativa;

    public CorridaRegular(String nome, double taxaInscricao, String assistenciaMedica, boolean recreativa) {
        super(nome, taxaInscricao, assistenciaMedica);
        this.recreativa = recreativa;
    }

@Override
public void exibirDetalhes() {
    System.out.println("---------------Corrida Regular Cadastrada---------------" + "\n" +
            "Nome da Corrida: " + getNome() + "\n" +
            "Taxa de inscrição: " + getTaxaInscricao() + "\n" +
            "Assistência Médica: " + getAssistenciaMedica() + "\n" +
            "Recreativa: " + recreativa + "\n" +
            "----------------------------------------------------------");
}

}