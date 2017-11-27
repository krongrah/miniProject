/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author Krongrah
 */
    class Building {
  
    private String name;
    private String address;
    private Map<Integer, Sensor>sensors=new HashMap<>();
    private Map<Integer, Log>sensorLogs=new HashMap<>();
    
    
    Building(String name, String address, Sensor... sensors){
    this.name=name;
    this.address=address;
    for(Sensor sensor: sensors){
    this.sensors.put(this.sensors.size()+1, sensor);
    this.sensorLogs.put(this.sensorLogs.size()+1, new Log());
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
    void getMeasurements(){
        
        for(Entry entry:sensors.entrySet()){
        if(entry.getValue() instanceof CO2Sensor){
            CO2Sensor test = (CO2Sensor)entry.getValue();
            System.out.println("CO2 sensor "+entry.getKey()+" has measured "+((CO2Sensor)entry.getValue()).getMeasurement()+"ppm.");
        }}
        for(Entry entry:sensors.entrySet()){
        if(entry.getValue() instanceof HumiditySensor){
        System.out.println("Humidity sensor "+entry.getKey()+" has measured "+((HumiditySensor)entry.getValue()).getMeasurement()+"%.");
        }}
        for(Entry entry:sensors.entrySet()){
        if(entry.getValue() instanceof TempSensor){    
        System.out.println("Temperature sensor "+entry.getKey()+" has measured "+((TempSensor)entry.getValue()).getMeasurement()+" degrees.");
        }}
    }
    
    void addsensors(Sensor... sensors){
    for(Sensor sensor: sensors){
    this.sensors.put(this.sensors.size()+1, sensor);
    this.sensorLogs.put(this.sensorLogs.size()+1, new Log());
    
    }
    }
    void storeData(){
    for(int i=1;i<sensors.size()+1;i++){
    this.sensorLogs.get(i).addMeasurement(this.sensors.get(i).getMeasurement());
    }
    }
    
    
}
