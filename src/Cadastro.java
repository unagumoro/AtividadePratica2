import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private static List<Funcionario> listaFuncionarios = new ArrayList<>();

    public static void cadastrar(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    public static boolean remover(int matricula) {
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getMatricula() == matricula) {
                listaFuncionarios.remove(funcionario);
                return true;
            }
        }
        return false;
    }

    public static List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public static Funcionario buscar(int matricula) {
        for (Funcionario temp : listaFuncionarios) {
            if (temp.getMatricula() == matricula) {
                return temp;
            }
        }
        return null;
    }
}
