public class Diretor extends Funcionario{
    private int experiencia;

    public Diretor() {
    }

    public Diretor(int matricula, String nome, int experiencia) {
        super(matricula, nome);
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nExperiência: " + experiencia;
    }
}
