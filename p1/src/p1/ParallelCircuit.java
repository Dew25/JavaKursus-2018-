/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

public class ParallelCircuit extends PolyCircuit{
    public double getOhm(){
      //double sum=0;
      /*for(int i=0;i<components.size();i++){
        sum+=1/components.get(i).getOhm();
      }*/
      /*for(ElectricityComponent e: components){
        sum+=1/e.getOhm();
      }*/
//      sum=components.stream().mapToDouble(ElectricityComponent::getOhm).sum();
      return 1/components.stream().mapToDouble(c -> 1/c.getOhm()).sum();
      //return 1/sum;
    }
}
