package model;

public interface Persistencia<T> {
    void salvar(T t);
    void deletar(T t);
    T buscar(String nome);
    void listar();
}