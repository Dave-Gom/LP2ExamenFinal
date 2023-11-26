package main.java.com.mycompany.webbankingg13;

import main.java.BaseDeDatos.BaseDeDatos;
import main.java.Interfaz.InterfazEstatica;
import main.java.Interfaz.InterfazLogin1;


public class WebBankingG13 {
    public static void main(String[] args) {
        BaseDeDatos B1 = new BaseDeDatos();
        InterfazLogin1 l1 = new InterfazLogin1(B1);
        l1.setVisible(true);
    }
}
