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
        private Nodo anterior;
        

        public Nodo()
        {
            this.dato = null;
            this.siguiente = null;
           
        }

        public Nodo(Cancion inputDato)
        {
            this.dato = inputDato;
            this.siguiente = null;
            this.anterior=null;
           
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
    public void setsize(){
        if(this.size==0){
            return;
        }
        this.size--;
    }
    public void moverAlPrincipio(){
        nodoActual=primerNodo;
    }
    public Cancion obtenerCancion(){
        return nodoActual.obtenerDato();
    }
    public  void SiguienteNodo(){
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
    public Cancion getlast(){
        this.moverAlPrincipio();
        return this.ultimoNodo.obtenerDato();
    }

    public ListaCanciones eliminar(Cancion x){
        this.moverAlPrincipio();
        ListaCanciones temporal=new ListaCanciones();
        int i=0;
        while(i!=this.size){
            System.out.println("es "+this.nodoActual.obtenerDato().getTitulo()+"igual a "+x.getTitulo());
            if (this.obtenerCancion()!=x){
                temporal.agregar(this.nodoActual.obtenerDato());}
            
                this.SiguienteNodo();
            i++;
        }
        return temporal;


    }
   

   
        
    
        
    }

    

