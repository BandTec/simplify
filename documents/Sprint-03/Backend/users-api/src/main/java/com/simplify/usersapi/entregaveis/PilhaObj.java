package com.simplify.usersapi.entregaveis;

public class PilhaObj <T> {
    private int topo;
    private T[] pilha;

    public PilhaObj(int tamanho) {
        topo = -1;
        pilha = (T[]) new Object[tamanho];
    }
    public boolean isEmpty(){
        return topo == -1;
    }
    public boolean isFull(){
        return (topo == pilha.length -1);
    }
    public void push (T info){
        if (!isFull()){
            pilha [++topo] = info;
        } else {
            System.out.println("XIIII PILHA CHEIA, NÃO FOI DESSA VEZ");
        }
    }
    public T pop(){
        if (!isEmpty()){
            return pilha[topo--];
        }
        return null;
    }
    public T peek(){
        if (!isEmpty()){
            return pilha[topo];
        }
        return null;
    }


}
