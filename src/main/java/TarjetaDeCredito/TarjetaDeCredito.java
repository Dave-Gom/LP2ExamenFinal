package main.java.TarjetaDeCredito;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

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

    public String getAfinidad() {
        return afinidad;
    }

    public Double getDeudaAlcierre() {
        return deudaAlcierre;
    }

    public Double getDeudaTotal() {
        return deudaTotal;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public Double getLineaCredito() {
        return lineaCredito;
    }

    public String getNroTarjeta() {
        return nroTarjeta;
    }

    public String getPinTarjeta() {
        return pinTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public Date getVencimiento() {
        return vencimiento;
    }
}
