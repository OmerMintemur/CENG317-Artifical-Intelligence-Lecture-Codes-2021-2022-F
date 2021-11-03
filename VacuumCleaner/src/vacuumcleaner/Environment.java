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
public class Environment {
    
    public final int place_A = 0;
    public final int place_B = 1;
    private int A_Dirty;
    private int B_Dirty;
    
    public Environment()
    {
        A_Dirty = (int) Math.round(Math.random());
        B_Dirty = (int) Math.round(Math.random());
    }
    
    public int getPlace_A_Dirty()
    {
        return A_Dirty;
    }
    
    public int getPlace_B_Dirty()
    {
        return B_Dirty;
    }
    
    public void changeA(int cleaned)
    {
        A_Dirty = cleaned;
    }
    public void changeB(int cleaned)
    {
        B_Dirty = cleaned;
    }
    
    
}
