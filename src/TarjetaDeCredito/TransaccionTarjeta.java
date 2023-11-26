package TarjetaDeCredito;

import java.util.Date;

/**
 * La clase TransaccionTarjeta representa una transacción realizada con una tarjeta.
 * Contiene información sobre el número de tarjeta, el monto, el concepto y la fecha de creación.
 *
 * @author David Gomez
 */
public class TransaccionTarjeta {
    private String nroTarjeta;
    private double monto;
    private String concepto;
    private Date createdAt;

    /**
     * Constructor de la clase TransaccionTarjeta.
     *
     * @param numeroTarjeta El número de la tarjeta utilizada en la transacción.
     * @param monto El monto de la transacción.
     * @param concepto El concepto de la transacción.
     */
    public TransaccionTarjeta(String numeroTarjeta, double monto, String concepto) {
        this.nroTarjeta = numeroTarjeta;
        this.monto = monto;
        this.concepto = concepto;
        this.createdAt = new Date();
    }

    /**
     * Obtiene el número de tarjeta utilizado en la transacción.
     *
     * @return El número de tarjeta utilizado en la transacción.
     */
    public String getNroTarjeta() {
        return nroTarjeta;
    }

    /**
     * Obtiene el monto de la transacción.
     *
     * @return El monto de la transacción.
     */
    public double getMonto() {
        return monto;
    }

    /**
     * Obtiene el concepto de la transacción.
     *
     * @return El concepto de la transacción.
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * Obtiene la fecha de creación de la transacción.
     *
     * @return La fecha de creación de la transacción.
     */
    public Date getCreatedAt() {
        return createdAt;
    }
}
