package p1;
import org.junit.Test;
import static org.junit.Assert.*;
public class ResistorTest {
    @Test
    public void creating(){
        Resistor r1=new Resistor(5000);
        assertEquals(5000, r1.getOhm(), 0.001); 
    }
    @Test 
    public void negative(){
       try{
          Resistor r1=new Resistor(-10);
          fail("resistor must give exception");
       } catch(Exception e){
           
       }
    }
    @Test
    public void resistor1000(){ 
       Resistor r1=new Resistor1000Ohm();
       assertEquals(1000, r1.getOhm(), 0.01);
    }
    @Test
    public void parallel(){
       ParallelCircuit pc1=new ParallelCircuit(); 
       Resistor r1=new Resistor1000Ohm();
       ElectricityComponent r2=new Resistor(500);
       pc1.add(r1);
       pc1.add(r2);  
       ElectricityComponent e1=pc1; 
       assertEquals(333.33, e1.getOhm(), 0.1);       
    } 
    @Test
    public void line(){
       LineCircuit lc1=new LineCircuit(); 
       Resistor r1=new Resistor1000Ohm();
       ElectricityComponent r2=new Resistor(500);
       lc1.add(r1);
       lc1.add(r2);
       assertEquals(1500, lc1.getOhm(), 0.1);
    }
}
