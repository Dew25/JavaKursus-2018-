
package p1;
/**
 * Highest class in electrical component system. All other 
 * conductivity classes are subclass of it.
 * @author Melnikov
 */
public abstract class ElectricityComponent {
    /**
     * Calculate resistance in ohms. Algorithm depends 
     * at class type.
     * @return resistance 
     */
    public abstract double getOhm();
    /**
     * Calculation of voltage. Uses resistance of object
     * @param amper Current in ampers
     * @return voltage
     */
    public double getVolt(double amper){
        return getOhm()*amper;
    }
}
