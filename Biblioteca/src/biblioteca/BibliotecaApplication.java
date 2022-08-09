package biblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author Ueno Souza Silva
 */
public class BibliotecaApplication {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        Livro livro;

        boolean fecharAplicativo = true;
        String menu = "--- Bem- vindo a Biblioteca do Ueno ---\n\n"
                + "Escolhar umas das opções abaixo:\n"
                + " 1 - Cadrastrar um livro\n"
                + " 2 - Remover um livro\n"
                + " 3 - Emprestar um livro\n"
                + " 4 - Devolver um livro\n"
                + " 5 - Lista livros emprestados\n"
                + " 6 - Lista livros disponíveis\n"
                + " 7 - Encerrar";

        do {
            String opcao = JOptionPane.showInputDialog(null, menu, "Sistema de Gestão da Biblioteca", 1);

            switch (opcao) {
                case "1":
                    String titulo = JOptionPane.showInputDialog(null, "Digite o titulo do livro", "Cadastramento de livro", 3);
                    String autor = JOptionPane.showInputDialog(null, "Digite o nome do autor", "Cadastramento de livro", 3);
                    String isbn = JOptionPane.showInputDialog(null, "Digite a ISBN do livro", "Cadastramento de livro", 3);
                    int anoEdicao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano da edição", "Cadastramento de livro", 3));
                    String editora = JOptionPane.showInputDialog(null, "Digite o nome da editora", "Cadastramento de livro", 3);
                    livro = new Livro(titulo, autor, isbn, anoEdicao, editora);
                    biblioteca.cadastrarLivro(livro);
                    break;
                case "2":
                    int indiceToRemover = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o indice do livro\nque deseja remover?", "Remoção de livro", 3));
                    biblioteca.removerLivro(indiceToRemover);
                    break;
                case "3":
                    int indiceToEmprestar = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o indici do livro\nque deseja emprestar", "Emprestimo de livro", 3));
                    biblioteca.emprestarLivro(indiceToEmprestar);
                    break;
                case "4":
                    int indiceToDevolver = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o indice do livro\nque deseja devolver", "Devolução de livro", 3));
                    biblioteca.devolverLivro(indiceToDevolver);
                    break;
                case "5":
                    biblioteca.livrosEmprestados();
                    break;
                case "6":
                    biblioteca.livrosDisponiveis();
                    break;
                case "7":
                    fecharAplicativo = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção não emcrontrada!\nDigite novamente.", "ERRO", 2);
            }

        } while (fecharAplicativo);

    }
}
