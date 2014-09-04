package TP1;

/**
 * Clase de listas basadas en arreglo para el listbox
 * @author guillermo
 */
class ArrayList {
	private int size;
	private int max_size;
	private Cancion [] arreglo;
	
	/**
         * constructor que recibe un tama;o determinado
         * @param max 
         */
	public ArrayList(int max){//Este es el constructor de las listas el max lo tiene que dar la funcion de determine los nodos
		this.size=0;
		this.max_size=max;
		this.arreglo=new Cancion[this.max_size];
		}
        /**
         * agrega una cancion a la lista
         * @param e 
         */
	public void add(Cancion e){//Agregar canciones una por una
		if(this.size<this.max_size){
			this.arreglo[this.size]=e;
			this.size++;
			}
			else{
				//throw new MiError("La lista esta llena"); 
				}
		}
        
        /**
         * devuelve el tama;o actual 
         * @return 
         */
	public int getSize(){
		return this.size;
		}
        /**
         * devuelve el tama;o maximo
         * @return 
         */
	public int getMax_size(){
		return this.max_size;
		}
        /**
         * devuelve la cancion  de un indice especifico
         * @param indice
         * @return
         * @throws Exception 
         */
	public Cancion getElemento(int indice) throws Exception{ 
            if(indice>max_size){
                throw new Exception("Indie mayor");
            }
            else{
                return arreglo[indice];
            }
            
        }
        /**
         * busquedas avanzadas por artista
         * @param busca
         * @return lista  por artista
         */
        public ArrayList busquedaArtista(String busca){
            ArrayList nueva=new ArrayList(this.max_size);
            int i = 0;
            while(i!=size){
                if (busca.equals(arreglo[i].getArtista())){
                    nueva.add(arreglo[i]);
                       
                }
                i++;
            }
            return nueva;
        }
        /**
         * busquedas avanzadas por genero
         * @param busca
         * @return lista  por genero
         */
	 public ArrayList busquedaGenero(String busca){
            ArrayList nueva=new ArrayList(this.max_size);
            int i = 0;
            while(i!=size){
                if (busca.equals(arreglo[i].getgenero())){
                    nueva.add(arreglo[i]);    
                }
                i++;
            }
            return nueva;
        }
         public ArrayList busquedaAlbum(String busca){
            
            ArrayList nueva=new ArrayList(this.max_size);
            int i = 0;
            while(i!=this.size){
                if (busca.equals(this.arreglo[i].getAlbum())){
                    nueva.add(this.arreglo[i]);  
                }
                i++;
            }
            
            return nueva;
        } 
         /**
         * busquedas avanzadas por cancion
         * @param busca
         * @return lista  por cancion
         */
         public ArrayList busquedaCancion(String busca){
            ArrayList nueva=new ArrayList(this.max_size);
            int i = 0;
            while(i!=size){
                if (busca.equals(this.arreglo[i].getTitulo())){
                    nueva.add(arreglo[i]);
                   
                }
                i++;
            }
            return nueva;
         }
         /**
          * borra una cancion determinada
          * @param x 
          */
         public void delete(Cancion x){
             int i=0;
             if (this.size==1){
                 this.size=0;
                 return;
             }
             while(this.size!=i){
                 System.out.println(arreglo[i].getTitulo());
                 Cancion temporal;
                 if (x==arreglo[i]){
                     temporal=arreglo[i];
                     arreglo[i]=arreglo[i+1];
                     arreglo[i+1]=temporal;  
                 }
                 i++;
             }
            this.size--;
         }
	@Override
        public String toString(){
            int sizet= 0;
            while(sizet!=size){
                System.out.println(this.arreglo[sizet++]);
                
            }
            return "son todos";
        }
}	
	
