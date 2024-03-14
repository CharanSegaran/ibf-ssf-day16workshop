package sg.edu.nus.iss.d16workshop.model;

import java.util.Date; 
import java.util.UUID; 
 
public class Game { 
     
    private String gameId; 
 
    private String homeTeam; 
 
    private String oppTeam; 
 
    private String venue; 
 
    private Date gameDate;       
 
    public Game() { 
    } 
 
    public Game(String homeTeam, String oppTeam, String venue, Date gameDate) { 
        this.gameId = UUID.randomUUID().toString(); 
        this.homeTeam = homeTeam; 
        this.oppTeam = oppTeam; 
        this.venue = venue; 
        this.gameDate = gameDate; 
    } 
 
    public String getGameId() { 
        return gameId; 
    } 
 
    public void setGameId(String gameId) { 
        this.gameId = gameId; 
    } 
 
    public String getHomeTeam() { 
        return homeTeam; 
    } 
 
    public void setHomeTeam(String homeTeam) { 
        this.homeTeam = homeTeam; 
    } 
 
    public String getOppTeam() { 
        return oppTeam; 
    } 
 
    public void setOppTeam(String oppTeam) { 
        this.oppTeam = oppTeam; 
    } 
 
    public String getVenue() { 
        return venue; 
    } 
 
    public void setVenue(String venue) { 
        this.venue = venue; 
    } 
 
    public Date getGameDate() { 
        return gameDate; 
    } 
 
    public void setGameDate(Date gameDate) { 
        this.gameDate = gameDate; 
    }  
}
