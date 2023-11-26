package com.mycompany.webbankingg13;

import java.util.Date;

import BaseDeDatos.BaseDeDatos;
import Cuenta.Cuenta;
import Interfaz.InterfazLogin1;
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
        InterfazLogin1 l1 = new InterfazLogin1(mainDB);
        l1.setVisible(true);
    }
}
