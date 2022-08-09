package biblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author Ueno Souza Silva
 */
public class Biblioteca {

    private static Livro[] livros = new Livro[100];

    public Biblioteca() {
    }

    //cadastrar um livro se no indice indicado do array estive vazio
    public void cadastrarLivro(Livro livro) {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                System.out.printf("[%d] OK\n", i);
                i = livros.length;
            }
        }
    }

    //remover um livro
    public void removerLivro(int i) {

        if (livros[i] != null) {
            JOptionPane.showMessageDialog(null, "Livro Removido\n" + livros[i].toString(), "", 3);
            livros[i] = null;
        } else {
            JOptionPane.showMessageDialog(null, "Indice retornou um local vazio", "", 2);
        }
    }

    //emprestar um determinado livro do array de Livro
    public void emprestarLivro(int i) {
        if (livros[i] == null) {
            JOptionPane.showMessageDialog(null, "Não é possivel concluir.");
        } else {
            if (livros[i].isEmprestado() == false) {
                livros[i].setEmprestado(true);
                JOptionPane.showMessageDialog(null, "Livro emprestado com sucesso!");
            } else {
                if (livros[i].isEmprestado() == true || livros[i] == null) {
                    JOptionPane.showMessageDialog(null, "Não é possível empresta o livro:/n" + "  " + livros[i].toString(), "", 1);
                }
            }
        }
    }

    public void devolverLivro(int i) {
        if (livros[i] == null) {
            JOptionPane.showMessageDialog(null, "Livro informada não constar no acervo!", "", 2);
        } else {
            if (livros[i].isEmprestado() == true) {
                livros[i].setEmprestado(false);
                JOptionPane.showMessageDialog(null, "Livro devolvido com Sucesso", "", 1);
            } else {
                JOptionPane.showMessageDialog(null, "O livro informado não foi emprestado", "", 2);
            }
        }
    }

    //lista todos os livros emprestados
    public void livrosEmprestados() {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null && livros[i].isEmprestado() == true) {
                JOptionPane.showMessageDialog(null, "Livro " + i + "\n" + livros[i].toString() + "\n");
            }
        }
    }

    //lista todos os livro disponíveis
    public void livrosDisponiveis() {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] != null && livros[i].isEmprestado() == false) {
                JOptionPane.showMessageDialog(null, "Livro " + i + "\n" + livros[i].toString() + "\n");
            }
        }
    }

}
