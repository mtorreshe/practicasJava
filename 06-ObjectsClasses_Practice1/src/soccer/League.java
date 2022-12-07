/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soccer;

/**
 *
 * @author mtorreshe
 */
public class League {
    public static void main(String[] args) {
        Player unoEquipo1= new Player();
        unoEquipo1.playerName = "Ochoa";
        
        Player dosEquipo1= new Player();
        dosEquipo1.playerName = "Marquez";
        
        Player[] playersEquipo1 =  { unoEquipo1, dosEquipo1 };
        
        Team mexico= new Team();
        mexico.teamName = "Mexico";
        mexico.playerArray = playersEquipo1;
        
        for(Player thePlayer: mexico.playerArray){
            System.out.println(thePlayer.playerName);
        }
        
        Team espania= new Team();
        espania.playerArray = new Player[3];
        
        espania.playerArray[0] = new Player();
        espania.playerArray[0].playerName = "Casillas";
        
        espania.playerArray[1] = new Player();
        espania.playerArray[1].playerName = "Pique";
        espania.playerArray[2] = new Player();
        espania.playerArray[2].playerName = "Puyol";
        
        
       
        for(Player thePlayer: espania.playerArray){
            System.out.println(thePlayer.playerName);
        }
        
        
        Game juego= new Game();
        
        juego.homeTeam = mexico;
        juego.awayTeam = espania;
        
        Goal goool = new Goal();
        
        goool.theTeam = juego.homeTeam;
        goool.thePlayer = juego.homeTeam.playerArray[1];
        goool.Tiempo = 55;
        
        Goal[] goles ={goool};
        
        juego.goals = goles;
        
        
        for(Goal elGol: juego.goals){
            System.out.println("Gol de " + elGol.theTeam.teamName + " en el minuto "+ elGol.Tiempo);
        }
    }
}
