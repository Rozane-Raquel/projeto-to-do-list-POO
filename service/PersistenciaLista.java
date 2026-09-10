package service;
import model.Persistencia;
import model.Tarefa;

import java.util.ArrayList;
import java.util.List;


public  class PersistenciaLista implements Persistencia<Tarefa>{
    private List<Tarefa> tarefas = new ArrayList<>();

    @Override
    public void salvar(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa salva: " + tarefa.getNome());
    }
    @Override
    public void deletar(Tarefa tarefa) {
        tarefas.remove(tarefa);
        System.out.println("Tarefa deletada: " + tarefa.getNome());
        Tarefa.decrementarContador();
    }

    @Override
    public Tarefa buscar(String nome) {
        for (Tarefa t : tarefas) {
            if (t.getNome().equalsIgnoreCase(nome)) {
                return t;
            }
        }
        return null;
    }

    @Override
    public void listar() {
        System.out.println("\n=== LISTA DE TAREFAS ===\n");
        for (Tarefa t : tarefas) {
            t.exibirDetalhes();
        }
    }
    public boolean atualizar(String nome, Tarefa novaTarefa) {
        try {
            if (nome == null || novaTarefa == null) {
                throw new IllegalArgumentException("Nome ou tarefa não podem ser nulos.");
            }
    
            for (int i = 0; i < tarefas.size(); i++) {
                if (tarefas.get(i).getNome().equalsIgnoreCase(nome)) {
                    tarefas.set(i, novaTarefa);
                    return true; // Atualizou
                }
            }
    
            System.out.println("⚠ Tarefa não encontrada: " + nome);
            return false;
    
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            return false;
    
        } catch (Exception e) {
            System.out.println("Erro inesperado ao atualizar: " + e.getMessage());
            return false;
        }
    }
    
}

    
