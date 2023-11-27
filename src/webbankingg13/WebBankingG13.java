package webbankingg13;


import BaseDeDatos.BaseDeDatos;
import BaseDeDatos.Seeders;
import Interfaz.InterfazLogin1;

/**
 *
 * @author bancocontinental05
 */
public class WebBankingG13 {

    public static void main(String[] args) {
        BaseDeDatos mainDB = new BaseDeDatos();
        
        Seeders.seed(mainDB);
        mainDB.printCuentas();
        InterfazLogin1 l1 = new InterfazLogin1(mainDB);
        l1.setVisible(true);
    }
}
