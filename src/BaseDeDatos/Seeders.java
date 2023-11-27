/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDeDatos;

import Usuario.Usuario;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author bancocontinental05
 */
public abstract class Seeders {

    public void seed(BaseDeDatos base) {
        createUsuarios(base);
    }

    private void createUsuarios(BaseDeDatos base) {
        Usuario user1 = base.createUsuario("6660354", "123456", "654321", "davegomez426@gmail.com", "Paraguaya",
                "David Emmanuel", "Gomez Arca", new Date(1, 23, 1983), "0772411806");

        Usuario user2 = base.createUsuario("5173040", "123456", "654321", "davegomez426@gmail.com", "Paraguaya",
                "Jaime", "Nuñez", new Date(1, 23, 1983), "0772411806");

        Usuario user3 = base.createUsuario("1234567", "123456", "654321", "user3@example.com", "Nationality",
                "Alice", "Smith", new Date(3, 15, 1992), "123456789");

        Usuario user4 = base.createUsuario("7654321", "123456", "654321", "user4@example.com", "Nationality",
                "Bob", "Johnson", new Date(5, 8, 1985), "987654321");

        Usuario user5 = base.createUsuario("9876543", "123456", "654321", "user5@example.com", "Nationality",
                "Charlie", "Williams", new Date(7, 20, 1980), "543216789");

        Usuario user6 = base.createUsuario("2345678", "123456", "654321", "user6@example.com", "Nationality",
                "David", "Jones", new Date(9, 10, 1995), "987123654");

        Usuario user7 = base.createUsuario("8765432", "123456", "654321", "user7@example.com", "Nationality",
                "Eva", "Brown", new Date(11, 3, 1988), "654321987");

        Usuario user8 = base.createUsuario("3456789", "123456", "654321", "user8@example.com", "Nationality",
                "Frank", "Miller", new Date(12, 5, 1990), "147258369");

        Usuario user9 = base.createUsuario("6789123", "123456", "654321", "user9@example.com", "Nationality",
                "Grace", "Davis", new Date(4, 18, 1982), "159753468");

        Usuario user10 = base.createUsuario("8912345", "123456", "654321", "user10@example.com", "Nationality",
                "Henry", "Garcia", new Date(8, 1, 1987), "369852147");

        Usuario user11 = base.createUsuario("4567891", "123456", "654321", "user11@example.com", "Nationality",
                "Ivy", "Rodriguez", new Date(2, 25, 1993), "753159852");

        Usuario user12 = base.createUsuario("1122334", "123456", "654321", "user12@example.com", "Nationality",
                "Jack", "Martinez", new Date(6, 12, 1984), "852963741");

    }

    private void createCuentas(BaseDeDatos base) throws Exception {
        
       ArrayList<Usuario> usuarios = base.getUsuarios();
       
        for (Object usuario : usuarios) {
            
        }

    }
}
