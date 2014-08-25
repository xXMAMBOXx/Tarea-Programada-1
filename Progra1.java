/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *

package TP1;


 
public class Progra1 {

    
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaCanciones x=new ListaCanciones();
        
        Cancion c1=new Cancion("C:/Users/Public/Music/Sample Music/Kalimba.mp3");
        Cancion c2=new Cancion("C:/Users/Public/Music/Sample Music/Sleep Away.mp3");
        x.agregar(c1);
        x.agregar(c2);
        x.moverAlPrincipio();
        //System.out.println(x.obtenerCancion().Nombre);
        
        //System.out.println(x.obtenerCancion().Nombre);
        //x.moverAlPrincipio();
        //x.SiguienteNodo();
        //System.out.println(x.obteneranterior().Nombre);
        x.obtenerCancion().PLAY();
        
       
     
        
        
        
        
        
        
    }
    
}
*/