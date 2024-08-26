/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Andres Gordillo
 */

import Vista.Login;
import java.text.DecimalFormat;
import javax.swing.JTable;

/**
 *
 * @author Andres Gordillo
 */
public class Principal {


    public static Login log;

    public static void main(String[] args) {

        //abrin login
        
        log = new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        
    
    
    }
}
