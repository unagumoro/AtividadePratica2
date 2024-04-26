public class Diretor extends Funcionario{
    private String coco;

    public Diretor() {
    }

    public Diretor(int matricula, String nome, String coco) {
        super(matricula, nome);
        this.coco = coco;
    }

    public String getCoco() {
        return coco;
    }

    public void setCoco(String coco) {
        this.coco = coco;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCoco: " + coco;
    }
}
