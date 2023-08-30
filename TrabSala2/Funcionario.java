public class Funcionario{
    protected String nome;
    protected int matricula;
    protected boolean estrangeiro;
    protected Data dataContratacao;

    public Funcionario(String nome, int matricula, Data dataContratacao, boolean estrangeiro){
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setDataContratacao(dataContratacao);
        this.setEstrangeiro(estrangeiro);
    }

    public Funcionario(){

    }

    public String getNome(){
        return this.nome;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public Data getDataContratacao(){
        return this.dataContratacao;
    }

    public boolean getEstrangeiro(){
        return this.estrangeiro;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDataContratacao(Data dataContratacao){
        this.dataContratacao = dataContratacao;
    }

    public void setMatricula(int matricula){
        if(matricula > 0)
            this.matricula = matricula;
    }

    public void setEstrangeiro(boolean estrangeiro){
        this.estrangeiro = estrangeiro;
    }
}