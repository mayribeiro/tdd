package cap07;

public class CalculadoraDeSalario {

    public double calculaSalario(Funcionario funcionario) {
        return funcionario.getCargo().getRegraDeCalculo().calcula(funcionario);
    }
}
