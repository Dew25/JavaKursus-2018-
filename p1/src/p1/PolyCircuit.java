/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.util.ArrayList;

/**
 *
 * @author Melnikov
 */
public abstract class PolyCircuit extends ElectricityComponent {
    ArrayList<ElectricityComponent> components=new ArrayList<ElectricityComponent>();
    public void add(ElectricityComponent r){ 
        components.add(r);
    }
}
