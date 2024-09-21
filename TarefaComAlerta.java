public class TarefaComAlerta extends Tarefa Implements Notificacao {
    @override
    public void enviarNotificacao() {
        System.out.printLn("A tarefa " + super.getTitulo() + "Foi criada");
    }
    public TarefaComAlerta (String titulo, String descricao, String prazo, int prioridade){
        super(titulo, descricao, prazo, prioridade);
        this.enviarNotificacao();
    }
}