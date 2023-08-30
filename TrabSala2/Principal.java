public class Principal{
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario("Diogo", 123, new Data(1, 1, 2000), false);
        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Bruno", 1234, new Data(1, 1, 2000), false, 10, 10);

        System.out.println(funcionarioHorista.calcularSalario());
    }
}