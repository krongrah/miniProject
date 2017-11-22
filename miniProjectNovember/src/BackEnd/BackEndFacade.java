/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import Acquaintance.IBackEnd;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Krongrah
 */
public class BackEndFacade implements IBackEnd{
    private Map<String,Building> buildings=new HashMap<>();
    public BackEndFacade(){}
    

    public void getBuildings(){
        System.out.println("test");
    }
    
    public void getMeasurements(){}
    
    public void addBuilding(String name,String address, int temp, int humidity, int CO2){
        Sensor[] sensors=new Sensor[temp+humidity+CO2];

        for(int i=0;i<temp;i++){
        sensors[i]=new TempSensor();
        }
        for(int j=temp;j<(humidity+temp);j++){
        sensors[j]=new HumiditySensor();
        }
        for(int k=(temp+humidity);k<(temp+humidity+CO2);k++){
        sensors[k]=new CO2Sensor();
        }
    buildings.put(name, new Building(name, address, sensors));
    }
    
    public void removeBuilding(String name){
    buildings.remove(name);
    }
    
    public void addMeasurement(String buildingName, int sensorNumber){
    //todo
    }
    
    
}
