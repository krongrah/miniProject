/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Starter;

import Acquaintance.IBackEnd;
import Acquaintance.IFrontEnd;
import BackEnd.BackEndFacade;
import FrontEnd.FrontEndFacade;

/**
 *
 * @author Krongrah
 */
public class Driver {
 
    public static void main(String[] args) {
	IBackEnd backEnd = new BackEndFacade();
	IFrontEnd frontEnd = new FrontEndFacade();
        
	frontEnd.injectBackEnd(backEnd);
        
        frontEnd.begin(args);
    }
    
    
}
