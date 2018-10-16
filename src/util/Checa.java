/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author linux
 */
public class Checa {
    
    public static boolean nome(String nome) {
        String[] n = nome.split(" ");
        if (n.length < 2) return false;
        else return true;
    }
    
}
