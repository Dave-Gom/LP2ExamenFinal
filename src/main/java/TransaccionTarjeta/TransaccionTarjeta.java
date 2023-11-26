package TransaccionTarjeta;

import java.util.Date;
import BaseDeDatos.BaseDeDatos;

/**
 * La clase TransaccionTarjeta representa una transacción realizada con una tarjeta.
 * Contiene información sobre la cuenta de origen, el número de tarjeta, el monto y la fecha de creación.
 *
 * @author David Gomez
 */
public class TransaccionTarjeta {
    private String CuentaOrigen;
    private String nroTarjeta;
    private double monto;
    private Date createdAt;

    /**
     * Constructor de la clase TransaccionTarjeta.
     *
     * @param cuenta La cuenta de origen de la transacción.
     * @param numeroTarjeta El número de la tarjeta utilizada en la transacción.
     * @param monto El monto de la transacción.
     * @param instanciaDeLa base de datos para guardar el registro nuevo
     */
    public TransaccionTarjeta(String cuenta, String numeroTarjeta, double monto, BaseDeDatos miBase) {
        this.CuentaOrigen = cuenta;
        this.nroTarjeta = numeroTarjeta;
        this.monto = monto;
        GuardarEnbase(miBase);
    }

    /**
     * Guarda la transacción en la base de datos proporcionada.
     *
     * @param miBase La instancia de la base de datos en la que se va a guardar la transacción.
     */
    private void GuardarEnbase(BaseDeDatos miBase) {
        miBase.AddTranaccionTarjeta(this);
    }
}
