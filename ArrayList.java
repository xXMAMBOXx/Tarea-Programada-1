package TP1;


class ArrayList {
	private int Maxsize;
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
        
        
	public void add(Cancion [] pArreglo){//Marvin construya una funcion en las listas enlazadas 
            int contador=0;               //la cual devuelva una lista con las canciones 
            while(contador<pArreglo.length){
			this.add(pArreglo[contador]);
                          contador++;
            }

	}
	public int getSize(){
		return this.size;
		}
	public int getMax_size(){
		return this.max_size;
		}
	public Cancion getElemento(int indice) throws Exception{//cuando se use este metodo tiene que ir entre un 
            //try catch
		if (indice>=this.size){
			throw new Exception ("El indice es mas grande que el max_size");
                   // return arreglo[0];//arreglar esto porque no se como arreglarlo
			}
		else{
			return arreglo[indice];
			}
		}
	public int find(Cancion e) throws Exception{
		if(this.size<=this.max_size){
			for(int i=0;i<this.size;i++){
				if(e==arreglo[i]){
					return i;
					}
				}	
			}
	//		throw new MiError("No se encontro nada");
                throw new Exception ("El indice es mas grande que el max_size");
		}
		
}	
	
