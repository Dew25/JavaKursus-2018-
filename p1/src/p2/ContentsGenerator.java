/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author Melnikov
 */
public class ContentsGenerator {
    static String generateContents(List<Describable> objects){
       StringBuilder sb=new StringBuilder();
       sb.append("<html><body><table>");
       for(Describable d: objects){
          sb.append("<tr><td>").append(d.title()).append("</td><td>");
          sb.append(d.description());
          sb.append("</td></tr>");
       }
       sb.append("</table></body></html>");
       return sb.toString();
    }
    static void saveContents(String filename, List<Describable> objects){
     try{   
       Files.write(Paths.get(filename), generateContents(objects).getBytes());
     } catch(Exception ex){
       ex.printStackTrace();
     }
    }
}
