package TarjetaDeCredito;

import BaseDeDatos.BaseDeDatos;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * La clase TarjetaDeCredito representa una tarjeta de crédito con información como el número de tarjeta,
 * el tipo de tarjeta, el PIN, la afinidad, la fecha de vencimiento, la deuda total, la deuda al cierre,
 * la línea de crédito y la fecha de cierre.
 *
 * @author David Gomez
 */
public class TarjetaDeCredito {
    private String nroTarjeta;
    private String tipoTarjeta;
    private String pinTarjeta;
    private String afinidad;
    private Date vencimiento;
    private Double deudaTotal;
    private Double deudaAlcierre;
    private Double lineaCredito;
    private Date fechaCierre;

    /**
     * Constructor de la clase TarjetaDeCredito.
     *
     * @param nroT     Número de la tarjeta.
     * @param tipo     Tipo de tarjeta.
     * @param pinT     PIN de la tarjeta.
     * @param afinidad Afinidad de la tarjeta.
     * @param lineaC   Línea de crédito de la tarjeta.
     */
    public TarjetaDeCredito(String nroT, String tipo, String pinT, String afinidad, Double lineaC) {
        this.nroTarjeta = nroT;
        this.tipoTarjeta = tipo;
        this.pinTarjeta = pinT;
        this.afinidad = afinidad;
        this.lineaCredito = lineaC;

        // Fecha de vencimiento: una semana después de la fecha actual
        Calendar calendarVencimiento = new GregorianCalendar();
        calendarVencimiento.setTime(new Date(0));
        calendarVencimiento.add(Calendar.DATE, 7);
        this.vencimiento = (Date) calendarVencimiento.getTime();

        // Fecha de cierre: primero del mes siguiente al actual
        Calendar calendarCierre = new GregorianCalendar();
        calendarCierre.setTime(new Date(0));
        calendarCierre.add(Calendar.MONTH, 1);
        calendarCierre.set(Calendar.DAY_OF_MONTH, 1);
        this.fechaCierre = (Date) calendarCierre.getTime();
    }

    // Métodos getter para acceder a la información de la tarjeta

    /**
     * Obtiene la afinidad de la tarjeta.
     *
     * @return La afinidad de la tarjeta.
     */
    public String getAfinidad() {
        return afinidad;
    }

    /**
     * Obtiene la deuda al cierre de la tarjeta.
     *
     * @return La deuda al cierre de la tarjeta.
     */
    public Double getDeudaAlcierre() {
        return deudaAlcierre;
    }

    /**
     * Obtiene la deuda total de la tarjeta.
     *
     * @return La deuda total de la tarjeta.
     */
    public Double getDeudaTotal() {
        return deudaTotal;
    }

    /**
     * Obtiene la fecha de cierre de la tarjeta.
     *
     * @return La fecha de cierre de la tarjeta.
     */
    public Date getFechaCierre() {
        return fechaCierre;
    }

    /**
     * Obtiene la línea de crédito de la tarjeta.
     *
     * @return La línea de crédito de la tarjeta.
     */
    public Double getLineaCredito() {
        return lineaCredito;
    }

    /**
     * Obtiene el número de la tarjeta.
     *
     * @return El número de la tarjeta.
     */
    public String getNroTarjeta() {
        return nroTarjeta;
    }

    /**
     * Obtiene el PIN de la tarjeta.
     *
     * @return El PIN de la tarjeta.
     */
    public String getPinTarjeta() {
        return pinTarjeta;
    }

    /**
     * Obtiene el tipo de la tarjeta.
     *
     * @return El tipo de la tarjeta.
     */
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    /**
     * Obtiene la fecha de vencimiento de la tarjeta.
     *
     * @return La fecha de vencimiento de la tarjeta.
     */
    public Date getVencimiento() {
        return vencimiento;
    }
    
    public void guardarEnbase(BaseDeDatos miBase){
        try {
            miBase.addTarjeta(this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
