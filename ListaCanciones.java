/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TP1;

/**
 *
 * @author xXMAMBOXx
 */
public class ListaCanciones {
    // atributos
    private Nodo primerNodo;
    private Nodo ultimoNodo;
    private int size;

     private class Nodo
    {

        private Cancion dato;
        private Nodo siguiente;

        public Nodo()
        {
            this.dato = null;
            this.siguiente = null;
        }

        public Nodo(Cancion inputDato)
        {
            this.dato = inputDato;
            this.siguiente = null;
        }

        public Cancion obtenerDato()
        {
            return dato;
        }

        public void establecerDato(Cancion dato)
        {
            this.dato = dato;
        }

        public Nodo obtenerSiguiente()
        {
            return siguiente;
        }

        public void establecerSiguiente(Nodo siguiente)
        {
            this.siguiente = siguiente;
        }
    }
           


    public ListaCanciones() {
        primerNodo=null;
        ultimoNodo=null;
        this.size=0;
    }
    
        
    public void agregar(Cancion i){
        Nodo nodo=new Nodo(i);
        primerNodo=nodo;
        ultimoNodo=nodo;
        System.out.println(primerNodo.obtenerDato().getTitulo());
        
        
        
    }

    
}
