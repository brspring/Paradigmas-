public class Main {
    public static void main(String[] args) {
        Cirurgia cirurgia = new Cirurgia(1500.0, "Geral");
        Regulamentacao regulamentacao = new Regulamentacao();
        Agendamento agendamento = new Agendamento();

        Exame exame = new Exame(200.0, "Sangue", regulamentacao);
        if (exame.isCodigoEticaAdotado()) {
            System.out.println("Exame agendado com código de ética adotado.");
        } else {
            System.out.println("Exame agendado sem código de ética.");
        }

        agendamento.agendar(cirurgia);
        agendamento.agendar(exame);

        System.out.println("---- Serviços Agendados ----");
        for (ServicoMedico servico : agendamento.getServicosAgendados()) {
            System.out.println("Tipo: " + servico.getClass().getSimpleName());
            System.out.println("Preço: " + servico.calcularPreco());

            if (servico instanceof Exame) {
                Exame exameAgendado = (Exame) servico;
                exameAgendado.aderirCodigoEtica();
                System.out.println("Código de ética adotado: " + exameAgendado.isCodigoEticaAdotado());
            }

            System.out.println("---------------------------");
        }

        System.out.println("Preço total agendado: " + calcularPrecoTotal(agendamento));

        agendamento.cancelar(cirurgia);
        System.out.println();
        System.out.println("---- Serviços Agendados após cancelamento ----");
        for (ServicoMedico servico : agendamento.getServicosAgendados()) {
            System.out.println("Tipo: " + servico.getClass().getSimpleName());
            System.out.println("Preço: " + servico.calcularPreco());

            if (servico instanceof Exame) {
                Exame exameAgendado = (Exame) servico;
                exameAgendado.aderirCodigoEtica();
                System.out.println("Código de ética adotado: " + exameAgendado.isCodigoEticaAdotado());
            }

            System.out.println("---------------------------");
        }

        System.out.println("Preço total após cancelamento: " + calcularPrecoTotal(agendamento));
    }

    private static double calcularPrecoTotal(Agendamento agendamento) {
        double precoTotal = 0.0;
        for (ServicoMedico servico : agendamento.getServicosAgendados()) {
            precoTotal += servico.calcularPreco();
        }
        return precoTotal;
    }
}

