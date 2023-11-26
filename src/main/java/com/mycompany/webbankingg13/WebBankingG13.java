
package com.mycompany.webbankingg13;

import java.util.Date;

import BaseDeDatos.BaseDeDatos;
import Cuenta.Cuenta;
import Interfaz.InterfazEstatica;
import Usuario.Usuario;

/**
 *
 * @author bancocontinental05
 */
public class WebBankingG13 {
    public static void main(String[] args) {
        
        BaseDeDatos mainDB = new BaseDeDatos();
        Usuario user1 = mainDB.createUsuario("6660354", "123456", "654321", "davegomez426@gmail.com", "Paraguaya",
                "David Emmanuel", "Gomez Arca", new Date(1, 23, 1983), "0772411806");
        
        Usuario user2 = mainDB.createUsuario("5173040", "123456", "654321", "davegomez426@gmail.com", "Paraguaya",
                "Jaime", "Nuñez", new Date(1, 23, 1983), "0772411806");
        
        Cuenta nuevaCuenta = mainDB.createCuenta(user1.getCi(), 0, "Cuenta Corriente");
        Cuenta segundaCuenta = mainDB.createCuenta(user2.getCi(), 0, "Caja de Ahorro");
        
        mainDB.printCuentas();
        
        
        
        

        // java.awt.EventQueue.invokeLater(new Runnable() {
        // public void run() {
        // new InterfazEstatica().setVisible(true);
        // }
        // });
        InterfazEstatica p1 = new InterfazEstatica();
        p1.setVisible(true);
    }
}
