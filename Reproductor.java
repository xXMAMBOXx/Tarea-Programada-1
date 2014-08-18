import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;

import javazoom.jl.player.Player;


public class Reproductor {
private Player reproducion;
private FileInputStream FIS;
private BufferedInputStream BIS;
private boolean canResume;
private String path;
private int total;
private int stopped;
private boolean valid;

public Reproductor(){
    reproducion = null;
    FIS = null;
    valid = false;
    BIS = null;
    path = null;
    total = 0;
    stopped = 0;
    canResume = false;
    
}

public boolean canResume(){
    return canResume;
}

public void setPath(String path){
    this.path = path;
    //JFileChooser seleccionar = new JFileChooser();
}

public void pause(){
    try{
    stopped = FIS.available();
    reproducion.close();
    FIS = null;
    BIS = null;
    reproducion = null;
    if(valid) canResume = true;
    }catch(Exception e){

    }
}

public void resume(){
    if(!canResume) return;
    if(play(total-stopped)) canResume = false;
}

public boolean play(int pos){
    valid = true;
    canResume = false;
    try{
       
        
    // archivo = seleccionar.getSelectedFile();
    
    FIS = new FileInputStream(path);
    total = FIS.available();
    if(pos > -1) FIS.skip(pos);
    BIS = new BufferedInputStream(FIS);
    
    reproducion = new Player(BIS);
    new Thread(
            new Runnable(){
                public void run(){
                    try{
                        reproducion.play();
                        
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Error en reproducir el mp3");
                        valid = false;
                    }
                }
            }
    ).start();
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error en reproducir el mp3");
        valid = false;
    }
    return valid;
}
public boolean getComplete() throws JavaLayerException{
return reproducion.isComplete();
}

}
