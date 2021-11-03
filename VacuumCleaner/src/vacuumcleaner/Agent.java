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
public class Agent {
    
    private int score = 0;
    private int location = 1;
    
    public Agent()
    {
        
    }
    
    public void BeginCleaning(Environment e)
    {
        //If our location is in A
        if (location == 0)
            {
                System.out.println("Robot is in Place A");
                if (e.getPlace_A_Dirty()== 1)
                    {
                        e.changeA(0);
                        this.score = this.score + 1;
                        System.out.println("A has been cleaned. Robot will move the place B");
                        if(e.getPlace_B_Dirty() == 1)
                        {
                            e.changeB(0);
                            this.score = this.score + 1;
                            System.out.println("B has been cleaned. Robot has done its job. Its score is "+this.score);
                        }
                        else
                        {
                            System.out.println("B is clean already. Robot will not clean Place B. Its score is "+this.score);
                        }
                    }
                else
                {
                    System.out.println("Place A is clean already. Robot will move the place B");
                    if(e.getPlace_B_Dirty()==1)
                    {
                        System.out.println("B is dirty");
                        e.changeB(0);
                        this.score = this.score + 1;
                        System.out.println("Place B has been cleaned. Robot has done its job. Its score is "+this.score);
                        
                    }
                    else
                    {
                        System.out.println("Place B is clean already. Its score is "+this.score);
                        
                    }
                }
                    
            }
        //If our location is in B
        else if(location == 1 )
        {
            System.out.println("Robot is in Place B");
            if(e.getPlace_B_Dirty()==1)
            {
                System.out.println("B is dirty");
                e.changeB(0);
                this.score = this.score + 1;
                System.out.println("B has been cleaned. Robot will move the place A");
                if(e.getPlace_A_Dirty() == 1)
                {
                    System.out.println("A is dirty");
                    e.changeA(0);
                    this.score = this.score + 1;
                    System.out.println("A has been cleaned. has done its job. Its score is "+this.score);
                }
                else
                {
                    System.out.println("Place A clean already. Robot will not clean A. Its score is "+this.score);
                    
                }
            }
            else
            {
                System.out.println("B is clean already. Robot will move to place A");
                if(e.getPlace_A_Dirty()==1)
                    {
                        System.out.println("A is dirty");
                        e.changeA(0);
                        this.score = this.score + 1;
                        System.out.println("Place A has been cleaned. Robot has done its job. Its score is "+this.score);
                        
                    }
                    else
                    {
                        System.out.println("Place A is clean already. Its score is "+this.score);
                        
                    }
            }
          
        }
    }
}
