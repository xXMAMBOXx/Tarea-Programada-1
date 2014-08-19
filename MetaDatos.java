
package TP1;//Librerias de uso
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.KeyNotFoundException;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.images.Artwork;
public class MetaDatos
{
    private String Artista,Album,Titulo,year,BPM,genero,ruta,rutaI;
    private Artwork portada;
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
                 portada=tag.getFirstArtwork();
                 
        }catch(KeyNotFoundException e){
        
        }
    }


    public void guardarImagen(){
    try{ 
               InputStream RecibirDatos =new ByteArrayInputStream(portada.getBinaryData());
               BufferedImage bImageFromConvert = ImageIO.read(RecibirDatos);
                File JPG=new File(ruta+".jpg");
                rutaI=ruta+".jpg";
                ImageIO.write(bImageFromConvert,"jpg",JPG);
                }catch(Exception e){
                
                }
    }
    public String getImagen(){
    return this.rutaI;
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
    public double getduracionMin(){
    return duracion/60;
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
    


