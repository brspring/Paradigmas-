public class Data{
    protected int dia;
    protected int mes;
    protected int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(){

    }

    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public int getAno(){
        return this.ano;
    }

    public void setDia(int dia){
        if(dia > 0 && dia <= 31)
            this.dia = dia;
    }

    public void setMes(int mes){
        if(mes > 0 && mes <= 12)
            this.mes = mes;
    }   

    public void setAno(int ano){
        if(ano > 0)
            this.ano = ano;
    }
}