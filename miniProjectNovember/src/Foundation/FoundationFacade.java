/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Foundation;

import java.util.ArrayList;
import Acquaintance.IFoundation;

/**
 *
 * @author Krongrah
 */
public class FoundationFacade implements IFoundation{

    private HiScore hiscore=new HiScore();
    


    @Override
    public void saveData(ArrayList<String> list) {
        hiscore.writeHiScore(list);
    }

    @Override
    public ArrayList<String> getData() {
return hiscore.pullHiScore();
        }


    

    
    

}
