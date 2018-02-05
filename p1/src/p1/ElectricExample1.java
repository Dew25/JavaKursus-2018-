/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;
public class ElectricExample1 {
    public static void main(String[] args){
       ElectricityComponent e1=new Resistor(220);
       System.out.println(e1.getOhm());
       System.out.println(e1.getVolt(0.01));       
    }
}
