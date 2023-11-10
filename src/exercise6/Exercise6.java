/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise6;

/**
 *
 * @author PHOTON
 */
public class Exercise6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FireType slugma = new FireType("Slugma", 100, 30);
        GrassType cherubi = new GrassType("Cherubi", 100, 30);
        WaterType clawitzer = new WaterType("Clawitzer", 200, 80);
        
        Monster.fight(slugma, cherubi);
        Monster.fight(clawitzer, cherubi);
        Monster.fight(slugma, clawitzer);           
    }
    
}
