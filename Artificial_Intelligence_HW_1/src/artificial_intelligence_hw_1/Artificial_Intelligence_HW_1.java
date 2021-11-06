/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artificial_intelligence_hw_1;

/**
 *
 * @author OMER
 */
public class Artificial_Intelligence_HW_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Environment e = new Environment(4,4);
        Agent a = new Agent(e);
        
        a.BeginAction(1, 3);
        System.out.println(a.getTotalNumberofActions());
    }
    
}
