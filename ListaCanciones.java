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

    /**
    * La clase Nodo es usada únicamente a nivel interno dentro de la lista
    * Tiene dos atributos: el dato y el enlace al siguiente nodo
    *
    */
    private class Nodo
    {

        private Object cancion;
        private Nodo siguiente;
        

        public Nodo(Object cancion)
        {
            this.cancion = cancion;
            this.siguiente = null;
        }

        public Object obtenerCancion()
        {
            return cancion;
        }

        public void establecerCancion(Object cancion)
        {
            this.cancion = cancion;
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
    public void agregar(Object cancion)
    {
          Nodo nodo = new Nodo(cancion);

        
        if (this.primerNodo.obtenerCancion() == null)
        {
            this.primerNodo = nodo;
            this.ultimoNodo = nodo;
        }
        else
        {
            this.ultimoNodo.establecerSiguiente(nodo);
            this.ultimoNodo = nodo;
        }   

        this.size++;
    }
    

    
}
