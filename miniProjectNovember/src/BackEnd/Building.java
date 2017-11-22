/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Krongrah
 */
    class Building {
  
    private String name;
    private String address;
    private Map<Integer, Sensor>sensors=new HashMap<>();
    
    Building(String name, String address, Sensor... sensors){
    this.name=name;
    this.address=address;
    for(Sensor sensor: sensors){
    this.sensors.put(this.sensors.size()+1, sensor);
    }
    }
    
    String getName(){
    return name;
    }
    
    String getAddress(){
    return address;
    }
    
    double getMeasurement(int sensor){
    return sensors.get(sensor).getMeasurement();
    }
    
    void addsensors(Sensor... sensors){
    for(Sensor sensor: sensors){
    this.sensors.put(this.sensors.size()+1, sensor);
    }
    }
    void removeSensor(int sensor){
    sensors.remove(sensor);
    }
    
    
}
