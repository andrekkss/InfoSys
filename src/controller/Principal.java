/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import util.Configura;
import view.TelaCadastro;

/**
 *
 * @author linux
 */
public class Principal {
    public static void main(String[] args) {
       Configura.lookAndFeel("GTK+");
       TelaCadastro tela = new TelaCadastro();
       tela.setVisible(true);
    }
    
}
