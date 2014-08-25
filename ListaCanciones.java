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
        }else{
            ultimoNodo.establecerSiguiente(nodo);
            nodoAnterior=nodoActual;
            nodoActual=nodo;
            ultimoNodo=nodo;
        }
        size++;
    }   
    public int getsize(){
        return this.size;
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
    public ArrayList ListatoArray(){
        ArrayList artistas=new ArrayList(this.size);
        int sizet=this.size;
        this.moverAlPrincipio();
        while(sizet--!=0){
            System.out.println(obtenerCancion().getArtista());
            artistas.add(obtenerCancion());
            nodoActual=nodoActual.obtenerSiguiente();
        }
        nodoActual=primerNodo;
        return artistas;
          
    }
    public Cancion obteneranterior(){
         return nodoAnterior.obtenerDato();
    }
    public void buscarplay(String nombre){
        this.moverAlPrincipio();
        int sizet=this.size;
        while(sizet!=0){
            if(nombre==obtenerCancion().Nombre){
                obtenerCancion().PLAY();
                return;
            }
            nodoActual=nodoActual.obtenerSiguiente();
        }
    }

   
        
    
        
    }

    

