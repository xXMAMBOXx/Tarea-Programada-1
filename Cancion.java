    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TP1;

//import java.io.IOException;


public class Cancion {
    String  Nombre,Artista,Album,genero,ruta,rutaI=null;
    int duracion;
    
    CustomPlayer reproducir=new CustomPlayer();
    Cancion(String ruta){
        this.ruta=ruta;
        MetaDatos datos=new MetaDatos();
        datos.meta(ruta);
        Artista=datos.getArtista();
        Album=datos.getAlbum();
        genero=datos.getgenero();
        duracion=datos.getduracion();
        Nombre=datos.getTitulo();
        try{
        datos.guardarImagen();
        rutaI=datos.getImagen();
        }catch(Exception e){}
    }

    
    public String getImagen(){
    return this.rutaI;
    }
    public String getArtista(){
    return this.Artista;
    }
    public String getTitulo(){
    return this.Nombre;
    }
    public String getAlbum(){
    return this.Album;
    }
    public int getduracion(){
    return duracion;
    }
    public String getgenero(){
    return this.genero;
    }
    public void setNombre(String m){
    this.Nombre=m;
    }
    public void setArtista(String m){
    this.Artista=m;
    }
    public void setAlbum(String m){
        this.Album=m;
    }
    public void setGenero(String m){
        this.genero=m;
    }
    public void setImage(String ruta){
        this.rutaI=ruta;
    }
    public void PLAY(){
        reproducir.setPath(this.ruta);
        reproducir.play(-1);
    }
    public void STOP(){
        reproducir.setPath(this.ruta);
        reproducir.pause();
    }
}
