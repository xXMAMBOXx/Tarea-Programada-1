/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TP1;


public class Cancion {
    String  Nombre,Artista,Album,genero,ruta,rutaI;
    int duracion;
    
    
    Cancion(String ruta){
        this.ruta=ruta;
        MetaDatos datos=new MetaDatos();
        datos.meta(ruta);
        Artista=datos.getArtista();
        Album=datos.getAlbum();
        genero=datos.getgenero();
        duracion=datos.getduracion();
        Nombre=datos.getTitulo();
        
    }
    
    
    
    
    
}