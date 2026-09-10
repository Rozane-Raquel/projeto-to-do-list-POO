package model;
import java.time.LocalDate;


public class TarefaRecorrente extends Tarefa {

    private LocalDate prazo;

    public TarefaRecorrente (String nome, String descricao, Status status, LocalDate prazo ){
        super(nome, descricao,status);
        this.prazo=prazo;
    }

    public TarefaRecorrente (String nome, String descricao, LocalDate prazo ){
        super(nome, descricao);
        this.prazo=prazo;
    }

    public Status getStatus(){
        return status;
    }

    public void setStatus( Status status){
        this.status=status;
    }

    public LocalDate getPrazo(){
        return prazo;
    }
    public void setPrazo( LocalDate prazo){
        this.prazo=prazo;
    }

    public void reagendarTarefa(){
        if (status == Status.CONCLUIDO) {
            status = Status.EM_ANDAMENTO;
        }
    }

    
    @Override
   public void exibirDetalhes() {
        System.out.println("\n=== TAREFA RECORRENTE ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Status: " + getStatus());
        System.out.println("Prazo: " + getPrazo());
    }
    
}
