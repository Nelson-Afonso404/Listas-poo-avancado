package br.ucsal.lab.tarefas;

public class Programa {
    public static void main(String[] args) {
        Lista listaTarefas = new Lista();
        listaTarefas.adicionarTarefa("Estudar 00","Devo estudar 00");
        listaTarefas.adicionarTarefa("Tomar café","Tomar café");
        listaTarefas.adicionarTarefa("Ouvir musica","Ouvir musica",true);
        listaTarefas.getTarefas().add(new Tarefa("Titulo","Descrição"));
        new InterfaceGrafica(listaTarefas);
    }
}
