/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

/**
 *
 * @author Melnikov
 */
public class P1 {
    public static void printNTimes(String text, int n){
        for(int i=0;i<n;i++){
          System.out.println(text);
        }
    }
    public static void printNTimes(String text){
       printNTimes(text, 5);
    }
    public static void main(String[] args) {
        System.out.println("hello");
        printNTimes("aaa", 3);
        printNTimes("aaa");
    }
    
}
