/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

import utility.GameUtils;

/**
 *
 * @author Administrator
 */
public class Game {
    
    public Team homeTeam;
    public Team awayTeam;
    public Goal[] goals;
    
    /* Practice 8-2. Add playGame() method here */
    
    public void playGame(){
        GameUtils.addGameGoals(this);
       
        
    }
    /* Practice 8-2. Add getDescription() method here */
    
      public String getDescription(){
       
       StringBuilder returnString = new StringBuilder();
       
       for(Goal gol: this.goals){
       returnString.append("Goal scored after "
                + gol.theTime + " mins by "
                + gol.thePlayer.playerName + " of "
                + gol.theTeam.teamName
       +"\n");
        }
       return returnString.toString();
      }
}
