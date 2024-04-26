public class Professor extends Funcionario{
    private String turno;
    private String disciplina;

    public Professor() {
    }

    public Professor(int matricula, String nome, String turno, String disciplina) {
        super(matricula, nome);
        this.turno = turno;
        this.disciplina = disciplina;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return super.toString() +
            "\nTurno: " + turno +
            "\nDisciplina: " + disciplina;
     }
}
