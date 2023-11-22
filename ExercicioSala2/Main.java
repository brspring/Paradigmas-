public class Main {
    public static void main(String[] args) {
        CorridaBeneficente corridaBeneficente = new CorridaBeneficente("Corrida Solidária Hospital São Lucas", 50.0, "Ambulância", "Hospital São Lucas");
        corridaBeneficente.exibirDetalhes();

        CorridaRegular corridaRecreativa = new CorridaRegular("Corrida Amadora CWB", 30.0, "Ambulância", true);
        corridaRecreativa.exibirDetalhes();

        CorridaRegular corridaCompetitiva = new CorridaRegular("CWB Runners", 40.0, "Ambulância", false);
        corridaCompetitiva.exibirDetalhes();
    }
}
