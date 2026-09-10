import model.Tarefa;
import model.TarefaComPrazo;
import model.TarefaRecorrente;
import model.TarefaSimples;
import service.PersistenciaLista;
import java.time.LocalDate;



public class Main {
    public static void main(String[] args) {
        PersistenciaLista persistencia = new PersistenciaLista();
         LocalDate prazo = LocalDate.of(2024, 8, 24);
        Tarefa tarefasimples = new TarefaSimples("Estudar BD", "Estudar o modelo entidade e relacionamento");
        Tarefa tarefacomprazo = new TarefaComPrazo("Fazer a atividade de AEDII", "Implementar o código de busca", prazo);
        Tarefa tarefarecorrente = new TarefaRecorrente("Ir ao mercado", "Fazer compras no mercado", prazo);
        persistencia.salvar(tarefasimples);
        persistencia.salvar(tarefacomprazo);
        persistencia.salvar(tarefarecorrente);
        tarefacomprazo.concluirTarefa();
        persistencia.listar();
        Tarefa.getContadorTarefas();
        persistencia.deletar(tarefarecorrente);
        persistencia.listar();
        Tarefa.getContadorTarefas();
        persistencia.deletar(tarefasimples);
        Tarefa.getContadorTarefas();


    }
}
