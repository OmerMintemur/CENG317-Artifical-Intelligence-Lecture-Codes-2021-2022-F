/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artificial_intelligence_hw_1;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author OMER
 */
public class Agent {
    private int number_of_actions = 0;
    private Environment E;
    private int position_x;
    private int position_y;
    private int[][] environment=new int [4][4];
    private int total_number_of_dirty_place = 0;
    
    public Agent(Environment E)
    {
        this.E = E;
        this.total_number_of_dirty_place = E.getNumberOfDirtyPlace();
        
    }
    private int randomNumber()
    {
        return ThreadLocalRandom.current().nextInt(0, 3 + 1);
    }
    public int getTotalNumberofActions()
    {
        return this.number_of_actions;
    }
    
   public void BeginAction(int a, int b)
   {
       this.position_x = a;
       this.position_y = b;
       while(this.total_number_of_dirty_place>0)
       {
           int number = this.randomNumber();
           if(number == 0)
           {
               
               if(!(position_y+1>3))
               {
                AgentInformation();
                number_of_actions++;
                position_x = position_x;
                position_y = position_y + 1;
                if(E.controlDirt(position_x,position_y)==1)
                {
                    E.clean(position_x,position_y);
                   
                    this.total_number_of_dirty_place--;
                 
                    
                }
                
               }

           }
           else if(number == 1)
           {
               
               if(!(position_y-1<0))
               {
                AgentInformation();
                number_of_actions++;
                position_y = position_y;
                position_y = position_y -1;
                if(E.controlDirt(position_x,position_y)==1)
                {
                    E.clean(position_x,position_y);
                    
                    this.total_number_of_dirty_place--;
                    
                    
                }
                
               }

           }
           else if(number == 2)
           {
               
               if(!(position_x-1<0))
               {
               AgentInformation();
               number_of_actions++;
               position_x = position_x - 1;
               position_y = position_y; 
               if(E.controlDirt(position_x,position_y)==1)
                {
                    E.clean(position_x,position_y);
                    
                    this.total_number_of_dirty_place--;
                    
                    
                }
               
               }

           }
           else if(number == 3)
           {

               if(!(position_x+1>3))
               {
               AgentInformation();
               number_of_actions++;
               position_x = position_x +1;
               position_y = position_y;
               if(E.controlDirt(position_x,position_y)==1)
                {
                    E.clean(position_x,position_y);
                   // number_of_actions++;
                    this.total_number_of_dirty_place--;
                    //AgentInformation();
                }
               
               }
               
               
           }
       }
   }
   
   public void AgentInformation()
   {
       this.environment = E.returnEnvironment();
       for(int x = 0; x<4;x++)
       {
           for (int y = 0; y<4; y++)
           {
               if(this.position_x==x && this.position_y==y)
               {
                   System.out.print("X ");
               }
               else{
                   System.out.print(this.environment[x][y]+" ");
               }
               
           }
           System.out.println();
       }
       System.out.println("Agent has the location " + this.position_x+"-"+this.position_y);
       System.out.println("-----------------------------------------------------------------");
       
   }
            
            
}
