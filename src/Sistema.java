public class Sistema {
    private static void exibirMenu() {
        System.out.println("\nMENU");
        System.out.println("1) Cadastrar Diretor");
        System.out.println("2) Cadastrar Professor");
        System.out.println("3) Cadastrar Coordenador");
        System.out.println("4) Buscar Funcionário");
        System.out.println("5) Excluir Funcionário");
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
        int experiencia;

        switch (op) {
            case 1:
                System.out.println("\nNovo Diretor:");

                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Anos de experiência como diretor:");
                experiencia = Console.lerInt();

                Diretor d = new Diretor(matricula, nome, experiencia);

                Cadastro.cadastrar(d);

                System.out.println("\nDiretor cadastrado com sucesso!");

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

            case 3:
                System.out.println("\nNovo Professor:");

                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Turno que atua:");
                turno = Console.lerString();

                System.out.print("Disciplina que leciona:");
                disciplina = Console.lerString();

                Professor p = new Professor(matricula, nome, turno, disciplina);

                Cadastro.cadastrar(p);

                System.out.println("\nProfessor cadastrado com sucesso!");

                break;

            case 4:
                System.out.println("\nProcurar Funcionário:");

                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                Funcionario f = Cadastro.buscar(matricula);

                if (f != null) {
                    System.out.println("\nFuncionário Localizado:");
                    System.out.println(f.toString());
                    return;
                }

                System.out.println("\nFuncionário " + matricula + " não foi encontrado");

                break;
                
            case 5:
                System.out.println("\nExcluir funcionário cadastrado:");

                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                boolean removido = Cadastro.remover(matricula);

                if (removido) {
                    System.out.println("Funcionário removido com sucesso");
                }
                
                System.out.println("Funcionário não encontrado");

                break;

            case 6:
                System.out.println("\nTodos os funcionários cadastrados:");

                if (Cadastro.getListaFuncionarios().size() == 0) {
                    System.out.println("\nNão há funcionários cadastrados...");
                    return;
                }

                for (Funcionario temp : Cadastro.getListaFuncionarios()) {
                    System.out.println(temp.toString());
                }

                break;

            case 7:
                System.out.println("\nExcluir todos os funcionários:");
    
                if (Cadastro.getListaFuncionarios().isEmpty()) {
                System.out.println("Não há funcionários para excluir.");
                }

                Cadastro.getListaFuncionarios().clear();
                System.out.println("Todos os funcionários foram excluídos");

                break;
            
            case 0:

                System.out.println("\nO programa foi finalizado...");
                break;

            default:

                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }
    }

    public static void executar() {

        int op;
        do {
           exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);
        } while (op != 0);
    }
}
