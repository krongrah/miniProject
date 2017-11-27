/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

/**
 *
 * @author Krongrah
 */
public abstract class Sensor {
    private double measurement=5;
    
    Sensor(){
    }
    
    public double getMeasurement(){
        return measurement;
    }
}
