package Servicio;

import java.util.Date;

/**
 * La clase PagoServicio representa un registro de pago de un servicio.
 * Contiene información sobre el nombre del servicio, el monto pagado, el número de cuenta y la fecha de la operación.
 * Esta clase se utiliza para registrar pagos de servicios en la base de datos.
 * 
 * @author David Gomez
 */
public class PagoServicio {
    private String nombServicio;
    private Double monto;
    private String cuentaNro;
    private Date fechaOp;

    /**
     * Constructor de la clase PagoServicio.
     *
     * @param nombre El nombre del servicio.
     * @param monto El monto pagado.
     * @param numeroCuenta El número de cuenta asociado al pago.
     */
    public PagoServicio(String nombre, Double monto, String numeroCuenta) {
        this.nombServicio = nombre;
        this.monto = monto;
        this.cuentaNro = numeroCuenta;
        this.fechaOp = new Date();
    }

    /**
     * Obtiene el nombre del servicio asociado al pago.
     *
     * @return El nombre del servicio.
     */
    public String getNombServicio() {
        return nombServicio;
    }

    /**
     * Obtiene el monto pagado en el servicio.
     *
     * @return El monto pagado.
     */
    public Double getMonto() {
        return monto;
    }

    /**
     * Obtiene el número de cuenta asociado al pago.
     *
     * @return El número de cuenta asociado al pago.
     */
    public String getCuentaNro() {
        return cuentaNro;
    }

    /**
     * Obtiene la fecha de la operación de pago.
     *
     * @return La fecha de la operación de pago.
     */
    public Date getFechaOp() {
        return fechaOp;
    }
}
