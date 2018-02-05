/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author Melnikov
 */
public class SecurityCode {
    protected String data;
    public SecurityCode(String contents){
       if(contents.length()!=11){
         throw new RuntimeException("invalid length");
       }
       data=contents;
    }
    public String getSex(){
       return (Integer.parseInt(data.substring(0,1)) % 2==0) ? "F" : "M";
    }
    public int getYear(){
      return 0;
    }
}
