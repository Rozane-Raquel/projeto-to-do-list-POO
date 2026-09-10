package model;
import java.time.LocalDate;

public class TarefaComPrazo extends Tarefa{

    private LocalDate prazo;
    public TarefaComPrazo(String nome, String descricao, Status status, LocalDate prazo) {
        super(nome, descricao,status);
        
        this.prazo=prazo;
    }

    public TarefaComPrazo(String nome, String descricao, LocalDate prazo) {
        super(nome, descricao); // status = PENDENTE
        this.prazo = prazo;
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


    @Override
    public void exibirDetalhes() {
        System.out.println("\n=== TAREFA COM PRAZO ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Status: " + getStatus());
        System.out.println("Prazo: " + getPrazo());
    }
}
