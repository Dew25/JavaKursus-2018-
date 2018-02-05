package p1;
import p2.Describable;

public class Resistor extends ElectricityComponent implements Describable{
    protected double r;
    public Resistor(double r){
      if(r<0){
          throw new RuntimeException("negative resistance");
      }
      this.r=r;
    }
    public double getOhm(){
       return r;
    }
    public String title(){return "Resistor";}
    public String description(){return getOhm()+" ohms";}
}
