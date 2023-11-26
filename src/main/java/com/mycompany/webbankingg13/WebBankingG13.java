/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.webbankingg13;

import BaseDeDatos.BaseDeDatos;
import Interfaz.InterfazEstatica;
import Usuario.Usuario;
import java.util.Date;

/**
 *
 * @author bancocontinental05
 */
public class WebBankingG13 {

    public static void main(String[] args) {
        BaseDeDatos mainDB = new BaseDeDatos();
        Usuario user1 = mainDB.createUsuario("6660354", "123456", "654321", "davegomez426@gmail.com", "Paraguaya", "David Emmanuel", "Gomez Arca", new Date(1,23,1983), "0772411806");
        Usuario user2 = mainDB.createUsuario("6660354", "123456", "654321", "davegomez426@gmail.com", "Paraguaya", "David Emmanuel", "Gomez Arca", new Date(1,23,1983), "0772411806");

        if(user2 != null){
            System.out.println("Creo el user2");
        }
        else{
            System.out.println("No creo el user2");
        }

//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InterfazEstatica().setVisible(true);
//            }
//        });
    }
}
