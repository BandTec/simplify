package com.simplify.api.entregaveis;

public class ListaObj <T> {

    private T[] vetor;
    private int nroElem;


    public ListaObj(int tam) {
        vetor= (T[]) new Object[tam];
        nroElem= 0;
    }


    public boolean adiciona(T valor) {
        if (nroElem >= vetor.length) {          // Verifica se a lista está cheia
            System.out.println("Lista está cheia");
            return false;
        }
        else {
            vetor[nroElem++] = valor;

            return true;
        }
    }

    public int getNroElem() {
        return nroElem;
    }

    // Método exibe - exibe os elementos da lista
    public void exibe() {
        System.out.println("\nExibindo elementos da lista:");
        for (int i=0; i< nroElem; i++) {
            System.out.print(vetor[i] + "\t");
        }
        System.out.println();
    }

    public int busca(T valor) {
        for (int i=0; i < nroElem; i++) {
            if (vetor[i].equals(valor)) {
                return i;
            }
        }
        return -1;
    }


    public boolean removePeloIndice(int indice) {
        if (indice < 0 || indice >= nroElem) {  // se índice for inválido
            return false;                       // retorna false
        }
        else {
            for (int i=indice; i < nroElem-1; i++) {
                vetor[i] = vetor[i+1];
            }
            nroElem--;      // decrementa nroElem
            return true;    // retorna true
        }
    }

    public boolean removeElemento(T valor) {
        return removePeloIndice(busca(valor));
    }

    // Método getTamanho - retorna o tamanho da lista (quantidade de elementos da lista)
    public int getTamanho() {
        return nroElem;
    }

    public T getElemento(int indice) {
        if (indice < 0 || indice >= nroElem) {  // se índice for inválido
            return null;                       // retorna false
        }
        else {
            return vetor[indice];
        }
    }

    // Método limpa - limpa a lista, zerando o nroElem
    public void limpa() {
        nroElem = 0;
    }
}
