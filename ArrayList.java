package TP1;


class ArrayList {
	private int size;
	private int max_size;
	private Cancion [] arreglo;
	
	
	public ArrayList(int max){//Este es el constructor de las listas el max lo tiene que dar la funcion de determine los nodos
		this.size=0;
		this.max_size=max;
		this.arreglo=new Cancion[this.max_size];
		}
	public void add(Cancion e){//Agregar canciones una por una
		if(this.size<this.max_size){
			this.arreglo[this.size]=e;
			this.size++;
			}
			else{
				//throw new MiError("La lista esta llena"); 
				}
		}
        
        /*
	public void add(Cancion [] pArreglo){//Marvin construya una funcion en las listas enlazadas 
            int contador=0;               //la cual devuelva una lista con las canciones 
            while(contador<pArreglo.length){
			this.add(pArreglo[contador]);
                          contador++;
            }

	}
        **/
	public int getSize(){
		return this.size;
		}
	public int getMax_size(){
		return this.max_size;
		}
	public Cancion getElemento(int indice) throws Exception{ 
            if(indice>max_size){
                throw new Exception("Indie mayor");
            }
            else{
                return arreglo[indice];
            }
            
        }
        public ArrayList busquedaArtista(String busca){
            ArrayList nueva=new ArrayList(this.max_size);
            int i = 0;
            while(i!=size){
                if (busca==arreglo[i].getArtista()){
                    nueva.add(arreglo[i]);
                    nueva.size++;     
                }
            }
            return nueva;
        }
	 public ArrayList busquedaGenero(String busca){
            ArrayList nueva=new ArrayList(this.max_size);
            int i = 0;
            while(i!=size){
                if (busca==arreglo[i].getGenero()){
                    nueva.add(arreglo[i]);
                    nueva.size++;     
                }
            }
            return nueva;
        }
         public ArrayList busquedaAlbum(String busca){
            ArrayList nueva=new ArrayList(this.max_size);
            int i = 0;
            while(i!=size){
                if (busca==arreglo[i].getAlbum()){
                    nueva.add(arreglo[i]);
                    nueva.size++;     
                }
            }
            return nueva;
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
	
