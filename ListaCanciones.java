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
    private Nodo nodoActual;
    private Nodo nodoAnterior;
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
        nodoActual=null;
        nodoAnterior=null;
        this.size=0;
    }
    
        
    public void agregar(Cancion i){
        Nodo nodo=new Nodo(i);
        if(primerNodo==null){
            primerNodo=nodo;
            ultimoNodo=nodo;
            nodoActual=nodo;
            nodoAnterior=null;
            size++;
        }else{
            ultimoNodo.establecerSiguiente(nodo);
            nodoAnterior=nodoActual;
            nodoActual=nodo;
            ultimoNodo=nodo;
        }
    }    
    public void moverAlPrincipio(){
        nodoActual=primerNodo;
    }
    public Cancion obtenerCancion(){
        return nodoActual.obtenerDato();
    }
    public void SiguienteNodo(){
        nodoAnterior=nodoActual;
        nodoActual=nodoActual.obtenerSiguiente();
        }
    public String getArtistas(){
        String tome="";
        while(nodoActual.obtenerDato()!=null){
            tome+=obtenerCancion().getArtista();
            nodoActual=nodoActual.obtenerSiguiente();
        }
        return tome;   
    }
    public Cancion obteneranterior(){
         return nodoAnterior.obtenerDato();
    }

   
        
    
        
    }

    

