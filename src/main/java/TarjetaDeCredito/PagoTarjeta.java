package TarjetaDeCredito;


import java.util.Date;

/**
 * La clase PagoTarjeta representa el pago de la tarjeta. Contiene información
 * sobre la cuenta de origen, el número de tarjeta, el monto y la fecha de
 * creación.
 *
 * @author David Gomez
 */
public class PagoTarjeta {

    private String CuentaOrigen;
    private String nroTarjeta;
    private double monto;
    private Date createdAt;

    /**
     * Constructor de la clase PagoTarjeta.
     *
     * @param cuenta La cuenta de origen del pago de tarjeta.
     * @param numeroTarjeta El número de la tarjeta utilizada en el pago.
     * @param monto El monto del pago de tarjeta.
     */
    public PagoTarjeta(String cuenta, String numeroTarjeta, double monto) {
        this.CuentaOrigen = cuenta;
        this.nroTarjeta = numeroTarjeta;
        this.monto = monto;
        this.createdAt = new Date();
    }

    /**
     * Obtiene la cuenta de origen del pago de tarjeta.
     *
     * @return La cuenta de origen del pago de tarjeta.
     */
    public String getCuentaOrigen() {
        return CuentaOrigen;
    }

    /**
     * Obtiene el número de tarjeta utilizado en el pago.
     *
     * @return El número de tarjeta utilizado en el pago.
     */
    public String getNroTarjeta() {
        return nroTarjeta;
    }

    /**
     * Obtiene el monto del pago de tarjeta.
     *
     * @return El monto del pago de tarjeta.
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Obtiene la fecha de creación del pago de tarjeta.
     *
     * @return La fecha de creación del pago de tarjeta.
     */
    public Date getCreatedAt() {
        return createdAt;
    }
}
