import java.util.ArrayList;
import java.util.List;

public class Agendamento {
    private List<ServicoMedico> servicosAgendados;

    public Agendamento() {
        this.servicosAgendados = new ArrayList<>();
    }

    public void agendar(ServicoMedico servico) {
        servicosAgendados.add(servico);
        System.out.println("Serviço agendado com sucesso.");
    }

    public void cancelar(ServicoMedico servico) {
        if (servicosAgendados.remove(servico)) {
            System.out.println("Serviço cancelado com sucesso.");
        } else {
            System.out.println("O serviço não estava agendado.");
        }
    }
    public List<ServicoMedico> getServicosAgendados() {
        return servicosAgendados;
    }
}