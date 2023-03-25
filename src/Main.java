public class Main {
    public static void main(String[] args) {

        Pessoa[] vetor = new Pessoa[10];
        while (true){
            System.out.println("...:::sistema de escolha:::...");
            System.out.println("qual opção deseja?");
            int op = Teclado.lerInteiro("1 - cadastrar. 2 Alterar. 3 Excluir. 4 consultar. 5 Sair");
            switch (op){
                case 1:
                    String nome = Teclado.lerString("Digite o nome: ");
                    int CPF = Teclado.lerInteiro("digite o cpf: ");
                    Pessoa pessoa = new Pessoa();
                    pessoa.CPF = CPF;
                    pessoa.nome = nome;
                    for (int i = 0; i < vetor.length; i++){
                        if (vetor[i] == null){
                            vetor[i] = pessoa;
                            System.out.println("pessoa incluida com sucesso");
                        }
                    }

                    break;

                case 2:
                    CPF = Teclado.lerInteiro("Digite o CPF da pessoa que deseja alterar: ");
                    nome = Teclado.lerString("Digite o Novo nome:");
                    for (int i =0; i < vetor.length; i++){
                        if (vetor[i] != null && vetor[i].CPF == CPF){
                            vetor[i].nome = nome;
                            System.out.println("Nome alterado com sucesso");
                        }
                    }
                    break;

                case 3:
                    CPF = Teclado.lerInteiro("digite o cpf que deseja excluir: ");
                    for (int i =0; i < vetor.length; i++){
                        if (vetor[i] != null && vetor[i].CPF == CPF){
                            vetor[i] = null;
                            System.out.println("pessoa excluida com sucesso");
                        }
                    }

                    break;

                case 4:
                    for (int i =0; i < vetor.length; i++){
                        if (vetor[i]!= null){
                            System.out.println(vetor[i].verInf());
                        }
                    }
                    break;

                case 5:
                    System.exit(0);

                    break;
            }
        }

    }
}