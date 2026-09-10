package model;

public abstract class Tarefa {
    private String nome;
    private String descricao;
    protected Status status;
    private static int contadorTarefas = 0;
  
    public Tarefa(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = Status.PENDENTE;
        contadorTarefas++;
    }
    public Tarefa(String nome, String descricao,  Status status) {
        this.nome = nome;
        this.descricao = descricao;
        this.status=status;
        contadorTarefas++;
       
    }
    public Tarefa() {
        contadorTarefas++;
    }
      public static void decrementarContador() {
        if (contadorTarefas > 0) {
            contadorTarefas--;
        }
    }
    public static void getContadorTarefas() {
         System.out.println("\n====================================");
         System.out.println("Quantidade de tarefas na lista: " + contadorTarefas);
         System.out.println("====================================");
    }
    
    public Status getStatus() { return status; }

    public String getNome (){
        return nome;

    }

    public void setNome( String nome){
        this.nome=nome;

    }

    public String getDescricao (){
        return descricao;
        
    }

    public void setDescricao( String descricao){
        this.descricao=descricao;

    }
    

    protected enum Status  {
        PENDENTE,
        EM_ANDAMENTO,
        CONCLUIDO
    }

   public abstract void exibirDetalhes();
     
        public void iniciarTarefa() {
            if (status == Status.PENDENTE) {
                status = Status.EM_ANDAMENTO;
            }
        }
    
        public void concluirTarefa() {
            status = Status.CONCLUIDO;
        }
    
    
    
}



