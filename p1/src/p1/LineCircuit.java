/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

public class LineCircuit extends PolyCircuit{
    public double getOhm(){
      return components.stream().mapToDouble(c -> c.getOhm()).sum();
    }
}
