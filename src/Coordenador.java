public class Coordenador extends Funcionario{
    private String curso;

    public Coordenador() {
    }

    public Coordenador(int matricula, String nome, String curso) {
        super(matricula, nome);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCurso: " + curso;
    }
}
