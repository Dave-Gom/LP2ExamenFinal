package TarjetaDeCredito;

import BaseDeDatos.BaseDeDatos;
import Cuenta.Cuenta;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * La clase TarjetaDeCredito representa una tarjeta de crédito con información
 * como el número de tarjeta, el tipo de tarjeta, el PIN, la afinidad, la fecha
 * de vencimiento, la deuda total, la deuda al cierre, la línea de crédito y la
 * fecha de cierre.
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
    public BaseDeDatos miBase;

    /**
     * Constructor de la clase TarjetaDeCredito.
     *
     * @param nroT Número de la tarjeta.
     * @param tipo Tipo de tarjeta.
     * @param pinT PIN de la tarjeta.
     * @param afinidad Afinidad de la tarjeta.
     * @param lineaC Línea de crédito de la tarjeta.
     *
     * @author David Gomez
     */
    public TarjetaDeCredito(String nroT, String tipo, String pinT, String afinidad, Double lineaC, BaseDeDatos base) {
        this.miBase = base;
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
     *
     * @author David Gomez
     */
    public String getAfinidad() {
        return afinidad;
    }

    /**
     * Obtiene la deuda al cierre de la tarjeta.
     *
     * @return La deuda al cierre de la tarjeta.
     *
     * @author David Gomez
     */
    public Double getDeudaAlcierre() {
        return deudaAlcierre;
    }

    /**
     * Obtiene la deuda total de la tarjeta.
     *
     * @return La deuda total de la tarjeta.
     *
     * @author David Gomez
     */
    public Double getDeudaTotal() {
        return deudaTotal;
    }

    /**
     * Obtiene la fecha de cierre de la tarjeta.
     *
     * @return La fecha de cierre de la tarjeta.
     *
     * @author David Gomez
     */
    public Date getFechaCierre() {
        return fechaCierre;
    }

    /**
     * Obtiene la línea de crédito de la tarjeta.
     *
     * @return La línea de crédito de la tarjeta.
     *
     * @author David Gomez
     */
    public Double getLineaCredito() {
        return lineaCredito;
    }

    /**
     * Obtiene el número de la tarjeta.
     *
     * @return El número de la tarjeta.
     *
     * @author David Gomez
     */
    public String getNroTarjeta() {
        return nroTarjeta;
    }

    /**
     * Obtiene el PIN de la tarjeta.
     *
     * @return El PIN de la tarjeta.
     *
     * @author David Gomez
     */
    public String getPinTarjeta() {
        return pinTarjeta;
    }

    /**
     * Obtiene el tipo de la tarjeta.
     *
     * @return El tipo de la tarjeta.
     *
     * @author David Gomez
     */
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    /**
     * Obtiene la fecha de vencimiento de la tarjeta.
     *
     * @return La fecha de vencimiento de la tarjeta.
     *
     * @author David Gomez
     */
    public Date getVencimiento() {
        return vencimiento;
    }

    /**
     * Este método guarda la tarjeta actual en la base de datos proporcionada.
     *
     * @author David Gomez
     *
     */
    public void guardarEnbase() {
        try {
            // Llama al método addTarjeta de la base de datos para agregar la tarjeta actual.
            miBase.addTarjeta(this);
        } catch (Exception e) {
            // En caso de que ocurra una excepción, imprime el mensaje de la excepción en la consola.
            System.out.println(e.getMessage());
        }
    }

    /**
     * Realiza un pago de deuda utilizando una cuenta de origen y un monto
     * especificados.
     *
     * @param cuentaOrigen La cuenta desde la cual se realizará el pago.
     * @param monto El monto a pagar.
     * @throws Exception Si la cuenta de origen no tiene saldo suficiente para
     * cubrir el monto del pago.
     * 
     * @author David Gomez
     */
    public void pagarDeuda(Cuenta cuentaOrigen, double monto) throws Exception {
        if (cuentaOrigen.getSaldo() >= monto) {
            cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - monto);
            this.deudaTotal -= monto;
            this.deudaAlcierre -= monto;

            // Crea un objeto PagoTarjeta y lo agrega a la base de datos
            PagoTarjeta miPago = new PagoTarjeta(cuentaOrigen.getNroCuenta(), this.nroTarjeta, monto);
            this.miBase.addPagoTarjeta(miPago);
        } else {
            throw new Exception("No posees saldo suficiente para pagar este monto");
        }
    }

    /**
     * Realiza un pago utilizando la tarjeta de crédito con un monto y concepto
     * especificados.
     *
     * @param monto El monto del pago.
     * @param Concepto El concepto asociado al pago.
     * @throws Exception Si la suma de la deuda total y el monto supera la línea
     * de crédito de la tarjeta.
     * 
     * @author David Gomez
     */
    public void pagar(double monto, String Concepto) throws Exception {
        if (deudaTotal + monto <= lineaCredito) {
            deudaTotal += monto;
            deudaAlcierre += monto;

            // Crea un objeto TransaccionTarjeta y lo agrega a la base de datos
            TransaccionTarjeta transac = new TransaccionTarjeta(this.nroTarjeta, monto, Concepto);
            miBase.AddTranaccionTarjeta(transac);
        } else {
            throw new Exception("Tarjeta Sobregirada");
        }
    }

}
