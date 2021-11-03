/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vacuumcleaner;

/**
 *
 * @author OMER
 */
public class VacuumCleaner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Environment e = new Environment();
        Agent a = new Agent();
        
        a.BeginCleaning(e);
    }
    
}
