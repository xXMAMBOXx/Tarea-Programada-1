
package TP1;//Librerias de uso
import java.io.*;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.KeyNotFoundException;
import org.jaudiotagger.tag.Tag;
public class MetaDatos
{
    private String Artista,Album,Titulo,year,BPM,genero,ruta;
    
    private int duracion;
    Tag tag;
    public MetaDatos(){
        
    } 
    public void meta(String ruta){
        this.ruta=ruta;
      
       
       
        File oSourceFile = new File(ruta);
        try {
    AudioFile audioFile = AudioFileIO.read(oSourceFile);
    duracion = audioFile.getAudioHeader().getTrackLength();
    tag=audioFile.getTag();
    
    } catch (Exception e) {
    e.printStackTrace();

}
         try{
                Artista=tag.getFirst(FieldKey.ARTIST);
                Album=tag.getFirst(FieldKey.ALBUM);
                Titulo=tag.getFirst(FieldKey.TITLE);
                year=tag.getFirst(FieldKey.YEAR);
                genero=tag.getFirst(FieldKey.GENRE);
                 BPM = tag.getFirst(FieldKey.FBPM);
        }catch(KeyNotFoundException e){
        
        }
    }



    public String getArtista(){
    return this.Artista;
    }
    public String getTitulo(){
    return this.Titulo;
    }
    public String getAlbum(){
    return this.Album;
    }
    public String getyear(){
    return this.year;
    }
    public int getduracion(){
    return duracion;
    }
    public String getgenero(){
    return this.genero;
    }
    public void setTitulo(String m){
    this.Titulo=m;
    }
    public void setArtista(String m){
    this.Artista=m;
    }
   
    
    
   
    }
    


