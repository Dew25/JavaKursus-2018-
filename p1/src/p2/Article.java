/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

/**
 *
 * @author Melnikov
 */
public class Article implements Describable{
    protected String t, d;
    public Article(String title, String description){
       t=title; d=description;
    }
    @Override
    public String title() {
        return t;
    }

    @Override
    public String description() {
        return d;
    }
    
}
