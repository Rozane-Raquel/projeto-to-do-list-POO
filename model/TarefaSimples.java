package model;

public class TarefaSimples extends Tarefa {
 
    public TarefaSimples(String nome, String descricao, Status status) {
        super(nome, descricao,status);
        
    }
    public TarefaSimples(String nome, String descricao) {
        super(nome, descricao);
        
    }

    public Status getStatus(){
        return status;
    }
    public void setStatus(Status status){
        this.status=status;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\n=== TAREFA SIMPLES ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Status: " + getStatus());
    }
}
