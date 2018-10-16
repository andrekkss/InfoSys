/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author linux
 */
public class Formata {
    
    public static DefaultFormatterFactory cpf(){
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("###.###.###-##");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            System.out.println("Erro na Formatação do CPF");
        }
        return (new DefaultFormatterFactory(mask,mask));
    }

    //  criar formatação para telefone (11) 1234-5678
    public static DefaultFormatterFactory fone(){
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("(##) ####-####");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            System.out.println("Erro na Formatação do Telefone");
        }
        return (new DefaultFormatterFactory(mask,mask));
    }

    // criar formatação para celular (11) 123-456-789
     public static DefaultFormatterFactory celular(){
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("(##) ###-###-###");
            mask.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            System.out.println("Erro na Formatação do Celular");
        }
        return (new DefaultFormatterFactory(mask,mask));
    }    
   
}
