package br.ucsal.lab.tarefas;

import java.util.ArrayList;
import java.util.List;

public class Lista {
   List<Tarefa> tarefas = new ArrayList<>();

    public Lista() {
        this.tarefas = tarefas;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
    public void adicionarTarefa(Tarefa tarefa){
        this.tarefas.add(tarefa);
    }
    public void adicionarTarefa(String titulo, String descricao){
        this.adicionarTarefa(titulo,descricao,false);
    }
    public void adicionarTarefa(String titulo, String descricao, Boolean concluida){
        Tarefa tarefa = new Tarefa(titulo,descricao,concluida);
        this.adicionarTarefa(tarefa);
    }
}
