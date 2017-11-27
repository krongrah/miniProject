/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acquaintance;

import java.util.List;
import java.util.Set;



/**
 *
 * @author Krongrah
 */
public interface IBackEnd {
    public List<String> getBuildings();
    
    
    public void getMeasurements();
    
    public void addBuilding(String name,String address, int temp, int humidity, int CO2);

    
    public void removeBuilding(String name);
    
    public void addMeasurement(String buildingName, int sensorNumber);
    
}
