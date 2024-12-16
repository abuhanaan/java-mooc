/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adewunmi
 */
public class Statistics {
    
    private String home;
    private String visiting;
    private int homePoint;
    private int visitingPoint;
    
    public Statistics(String homeTeam, String awayTeam, int homePoint, int awayPoint){
        this.home = homeTeam;
        this.visiting = awayTeam;
        this.homePoint = homePoint;
        this.visitingPoint = awayPoint;
    }
    
    public String getHome(){
        return this.home;
    }
    
    public String getVisiting(){
        return this.visiting;
    }
    
    public int getHomePoint(){
        return this.homePoint;
    }
    
    public int getVisitingPoint(){
        return this.visitingPoint;
    }
    
}
