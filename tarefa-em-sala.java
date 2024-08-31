class Tarefa {
    // Atributos privados
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;

    // Construtor
    public Tarefa(String titulo, String descricao, String prazo, int prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
    }

    public Tarefa(String titulo) {
        this.titulo = titulo;
        this.descricao = new String();
        this.prazo = "";
        this.prioridade = 0;
    }

    // Métodos Get e Set
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getprazo() {
        return this.prazo;
    }

    public void setprazo(String titulo) {
        this.prazo = prazo;
    }
    public int prioridade() {
        return this.prioridade;
    }

    public void prioridade(int titulo) {
        this.prioridade = prioridade;
    }
    // Implementar getters e settes para os outros atributos
    public void exibirDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Prazo: " + this.prazo);
        System.out.println("Prioridade: " + this.prioridade);
    }
}

public class Main {
    public static void main(String[] args){
        Tarefa tarefa1 = new Tarefa("Estudar POO", "Revisar os conceitos de classes e objetos", "06-09-2024", 1);
        System.out.println("Título: " + tarefa1.getTitulo());
        tarefa1.exibirDetalhes();
    }
}
public class Categoria {
    private String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class Tarefa {
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;
    private Categoria categoria; // Associação com a classe Categoria

    public Tarefa(String titulo, String descricao, String prazo, int prioridade, Categoria categoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
        this.categoria = categoria;
    }

    // Métodos get e set para os atributos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes da Tarefa:");
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Prazo: " + prazo);
        System.out.println("Prioridade: " + prioridade);
        System.out.println("Categoria: " + categoria.getNome());
    }

    public static void main(String[] args) {
        Categoria categoria = new Categoria("Estudos");

        Tarefa tarefa = new Tarefa("Estudar Java", "Revisar conceitos de OOP", "2024-09-10", 1, categoria);

        tarefa.exibirDetalhes();
    }
}