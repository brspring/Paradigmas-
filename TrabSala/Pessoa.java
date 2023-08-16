public class Pessoa{
    private String nome;
    private int idade;
    private int dia;
    private int mes;
    private int ano;

    public Pessoa(String nome, int idade, int dia, int mes, int ano){
        this.nome = nome;
        this.idade = idade;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Pessoa(){
        
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
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

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        if(idade > 0){
            this.idade = idade;
        }else {
            System.out.println("Idade inválida");
        }
    }

    public void setDia(int dia){
        if(dia > 0 && dia <= 31){
            this.dia = dia;
        }else{
            System.out.println("Dia inválido");
        }
    }

    public void setMes(int mes){
        if(mes > 0 && mes <= 12){
            this.mes = mes;
        }else{
            System.out.println("Mês inválido");
        }
    }

    public void setAno(int ano){
        if(ano > 0){
            this.ano = ano;
        }else{
            System.out.println("Ano inválido");
        }
    }

    public void ajustarDataDeNascimento(int dia, int mes, int ano){
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public void calcularIdade(int dia_atual, int mes_atual, int ano_atual){
        int idade = ano_atual - this.ano;
        if(mes_atual < this.mes){
            idade--;
        }
        else if(mes_atual == this.mes && dia_atual < this.dia){
            idade--;
        }else if(mes_atual == this.mes && dia_atual == this.dia){
            System.out.println("Parabéns, hoje é seu aniversário!");
        }
    }

}