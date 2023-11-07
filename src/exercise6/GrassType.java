/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise6;

/**
 *
 * @author PHOTON
 */
public class GrassType extends Monster{
    private int atk;
    private int def;
    private int maxhp;
    private int hp;
    
    public GrassType(String name, int maxHP, int base){
        super(name, "grass", "water", "fire", maxHP, base);
        atk = (int) (1.3*base);
        def = (int) (0.7*base);
    }
}
