/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Krongrah
 */
public class Log {
   List<Double> history =new ArrayList();
   Log(){} 
   
   void addMeasurement(double input){
   history.add(input);
   }
   
   
   
   
   
}
