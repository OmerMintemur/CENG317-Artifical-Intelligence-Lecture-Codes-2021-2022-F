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
public class Environment {
    public int x;
    public int y;
    private int[][] environment;
    private int numberOfDirtyPlaces;
    
    public Environment(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.environment = new int[this.x][this.y];
        for(int a = 0; a<x;a++)
        {
            for(int b = 0;b<y;b++)
            {
                this.environment[a][b] = (int)Math.round(Math.random());
            }
        }
    }
    
    public int getNumberOfDirtyPlace()
    {
        for(int a = 0; a<x;a++)
        {
            for(int b = 0;b<y;b++)
            {
                if(environment[a][b]==1)
                {
                    this.numberOfDirtyPlaces++;
                }
            }
        }
        return this.numberOfDirtyPlaces;
    }
    public int controlDirt(int a, int b)
    {
        return this.environment[a][b];
    }
    public void clean(int a, int b)
    {
        this.environment[a][b] = 0;
    }
    public int[][] returnEnvironment()
    {
        return this.environment;
    }
    
    
    
}
