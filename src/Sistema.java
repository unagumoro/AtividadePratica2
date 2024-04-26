public class Sistema {
    private static void exibirMenu() {
        System.out.println("\nMENU");
        System.out.println("1) Cadastrar Diretor");
        System.out.println("2) Cadastrar Professor");
        System.out.println("3) Cadastrar Coordenador");
        System.out.println("4) Buscar Funcionario");
        System.out.println("5) Excluir Funcionario");
        System.out.println("6) Listar Todos");
        System.out.println("7) Excluir Todos");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção: ");
    }

    private static void verificarOpcao(int op) {
        int matricula;
        String nome;
        String turno;
        String disciplina;
        String curso;

        switch (op) {
            case 1:
                System.out.println("\nNovo Diretor:");
                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Linguagens que domina:");
                linguagens = Console.lerString();

                Programador p = new Programador(matricula, nome, linguagens);

                Cadastro.cadastrar(p);

                System.out.println("\nProgramador cadastrado com sucesso!");

                break;

            case 2:
                System.out.println("\nNovo Coordenador:");
                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Curso que coordena:");
                curso = Console.lerString();

                Coordenador c = new Coordenador(matricula, nome, curso);

                Cadastro.cadastrar(c);

                System.out.println("\nCoordenador cadastrado com sucesso!");

                break;
            }
        }
    }
}
