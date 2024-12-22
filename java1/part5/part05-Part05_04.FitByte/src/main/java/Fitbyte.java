/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adewunmi
 */
public class Fitbyte {
    
    private int age;
    private int restingHeartRate;
            
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double maximumHeartRate = this.maxHeartRate(this.age);
        double targHeartRate = 0.0;
        if (percentageOfMaximum > 0 && percentageOfMaximum <= 1){
            targHeartRate = (maximumHeartRate - this.restingHeartRate) * percentageOfMaximum + this.restingHeartRate;
        }
       return targHeartRate; 
    }
    
    private double maxHeartRate(int age){
        return 206.3 - (0.711 * age);
    }
}
