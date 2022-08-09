package biblioteca;

/**
 *
 * @author Ueno Souza Silva
 */
public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private int anoEdicao;
    private String editora;
    private boolean emprestado = false;

    public Livro(String titulo, String autor, String isbn, int anoEdicao, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoEdicao = anoEdicao;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnoEdicao() {
        return anoEdicao;
    }

    public void setAnoEdicao(int anoEdicao) {
        this.anoEdicao = anoEdicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s %s%n%s %s %s %d%n%s %s%n",
                "Titulo:", getTitulo(), "Autor:", getAutor(),
                "ISBN:", getIsbn(), "Ano de edição:", getAnoEdicao(),
                "Disponibilidade:", (isEmprestado() == false) ? "Disponível" : "Não disponível");
    }

}
