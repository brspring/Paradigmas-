public class FuncionarioHorista extends Funcionario{
    private double valorHora;
    private int numeroHoras;

    public FuncionarioHorista(String nome, int matricula, Data dataContratacao, boolean estrangeiro, double valorHora, int numeroHoras){
        super(nome, matricula, dataContratacao, estrangeiro);
        this.setValorHora(valorHora);
        this.setNumeroHoras(numeroHoras);
    }

    public FuncionarioHorista(){
        super();
    }

    public double getValorHora(){
        return this.valorHora;
    }

    public int getNumeroHoras(){
        return this.numeroHoras;
    }

    public void setValorHora(double valorHora){
        if(valorHora > 0)
            this.valorHora = valorHora;
    }

    public void setNumeroHoras(int numeroHoras){
        if(numeroHoras > 0)
            this.numeroHoras = numeroHoras;
    }

    public double calcularSalario(){
        return this.valorHora * this.numeroHoras;
    }
}