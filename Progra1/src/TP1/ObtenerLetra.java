/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TP1;

/**
 *
 * @author Usuario
 */
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
 
public class ObtenerLetra {
 
   private final static String url = "http://www.songlyrics.com";
 
 
   public static String getLetra( String grupo, String Nombre) throws IOException {
     String letra = Nombre+"\n";
     Document pagina = Jsoup.connect(url+ "/"+grupo.replace(" ", "-").toLowerCase()+"/"+Nombre.replace(" ", "-").toLowerCase()+"-lyrics/").get();
     String titulo = pagina.title();
     Element p = pagina.select("p.songLyricsV14").get(0);
      for (Node e: p.childNodes()) {
          if (e instanceof TextNode) {
            letra=letra +((TextNode)e).getWholeText();
          }
      }
 
     return letra;
   }}