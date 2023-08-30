public class FuncionarioMensalista extends Funcionario{
    private double salarioMensal;

    public FuncionarioMensalista(String nome, int matricula, Data dataContratacao, boolean estrangeiro, double salarioMensal){
        super(nome, matricula, dataContratacao, estrangeiro);
        this.setSalarioMensal(salarioMensal);
    }

    public FuncionarioMensalista(){
        super();
    }

    public double getSalarioMensal(){
        return this.salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal){
        if(salarioMensal > 0)
            this.salarioMensal = salarioMensal;
    }

    public double calcularSalario(){
        return this.salarioMensal;
    }
}   