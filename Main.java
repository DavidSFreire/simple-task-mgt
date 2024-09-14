import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeParseException;

class Tarefa {
    // Atributos privados
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;

    // Método privado para validar prazo
    private boolean isPrazoValido(String prazo) {
        try {
            LocalDate.parse(prazo);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    // Método privado para validar prioridade
    private boolean isPrioridadeValida(int prioridade) {
        return prioridade >= 1 && prioridade <= 5;
    }

    // Método privado para definir a prioridade garantindo a validade
    private void setPrioridade(int prioridade) {
        if (isPrioridadeValida(prioridade)) {
            this.prioridade = prioridade;
        } else {
            System.out.println("Prioridade inválida. Deve ser entre 1 e 5.");
            this.prioridade = 5;  // Definindo um valor padrão para prioridade inválida
        }
    }

    // Construtor 1: Construtor completo.
    public Tarefa(String titulo, String descricao, String prazo, int prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        setPrioridade(prioridade);  // Usando o método de validação de prioridade
    }

    // Construtor 2: Construtor com menos parâmetros.
    public Tarefa(String titulo, String prazo) {
        this.titulo = titulo;
        this.prazo = prazo;
        this.descricao = "";    // Descrição padrão
        this.prioridade = 0;    // Prioridade padrão
    }

    // Construtor 3: Construtor com título e prioridade
    public Tarefa(String titulo, int prioridade) {
        this.titulo = titulo;
        this.descricao = "";    // Descrição padrão
        this.prazo = "2024-12-31"; // Prazo padrão
        setPrioridade(prioridade);  // Usando o método de validação de prioridade
    }

    // Métodos públicos para acessar os atributos
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

    public String getPrazo() {
        return this.prazo;
    }

    public void setPrazo(String prazo) {
        if (isPrazoValido(prazo)) {
            this.prazo = prazo;
        } else {
            System.out.println("Data inválida.");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Prazo: " + this.prazo);
        System.out.println("Prioridade: " + this.prioridade);
    }

    // Método para calcular dias restantes
    public long calcularDiasRestantes() {
        LocalDate dataPrazo = LocalDate.parse(this.prazo);
        LocalDate hoje = LocalDate.now();

        return ChronoUnit.DAYS.between(hoje, dataPrazo);
    }
}

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Estudar POO", "Revisar os conceitos de classes e objetos", "2024-15-48", 1);

        System.out.println("=============== Testando métodos gets ===============");
        System.out.println("Título: " + tarefa1.getTitulo());
        System.out.println("Descrição: " + tarefa1.getDescricao());
        System.out.println();

        System.out.println("=============== Imprimindo com método exibirDetalhes() ===============");
        tarefa1.exibirDetalhes();

        System.out.println("=============== Imprimindo tarefa com o construtor 2 ===============");

        Tarefa tarefa2 = new Tarefa("Estudar para provas", "2050-10-25");

        tarefa2.exibirDetalhes();

        System.out.println("Dias restantes para a tarefa 2: " + tarefa2.calcularDiasRestantes());

        System.out.print("Novo prazo da tarefa 1: ");
        tarefa1.setPrazo("2024-15-48");

        System.out.println("=============== Imprimindo tarefa com o construtor 3 ===============");

        Tarefa tarefa3 = new Tarefa("Ler livro", 3);
        tarefa3.exibirDetalhes();

        // Testando um caso com prioridade inválida
        System.out.println("=============== Testando prioridade inválida ===============");

        Tarefa tarefa4 = new Tarefa("Correr", 10); // Prioridade fora do intervalo válido
        tarefa4.exibirDetalhes();
    }
}