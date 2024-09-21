public class TarefaUrgente extends Tarefa implements Notificacao {
    private String razaoUrgencia;

    // Construtor da Tarefa Urgente
    public TarefaUrgente(String titulo, String descricao, String prazo, String razaoUrgencia) {
        super(titulo, descricao, prazo, 5);  // Define prioridade 5 como padrão para tarefas urgentes
        this.razaoUrgencia = razaoUrgencia;
    }

    // Métodos getters e setters
    public String getRazaoUrgencia() {
        return this.razaoUrgencia;
    }

    public void setRazaoUrgencia(String razaoUrgencia) {
        this.razaoUrgencia = razaoUrgencia;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Razão da Urgência: " + this.razaoUrgencia);
    }

    @Override
    public void enviarNotificacao() {
        System.out.println("Notificação: A tarefa '" + getTitulo() + "' é URGENTE! Razão: " + this.razaoUrgencia);
    }
}
