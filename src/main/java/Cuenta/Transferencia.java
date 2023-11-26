package Cuenta;

import BaseDeDatos.BaseDeDatos;

/**
 * La clase Transferencia representa una transferencia de fondos entre dos cuentas bancarias.
 * Contiene información sobre las cuentas de origen y destino, los bancos de origen y destino, y el monto transferido.
 * Esta clase se utiliza para registrar transferencias en la base de datos.
 * 
 * @author bancocontinental05
 */
public class Transferencia {
    private String cuentaOrigen;
    private String cuentaDestino;
    private String bancoOrigen;
    private String bancoDestino;
    private double monto;

    /**
     * Constructor de la clase Transferencia.
     *
     * @param origen La cuenta de origen de la transferencia.
     * @param destino La cuenta de destino de la transferencia.
     * @param monto El monto transferido.
     * @param bDest El banco de destino de la transferencia.
     * @param bOrigin El banco de origen de la transferencia.
     */
    public Transferencia(Cuenta origen, Cuenta destino, double monto, String bDest, String bOrigin) {
        cuentaOrigen = origen.getNroCuenta();
        cuentaDestino = destino.getNroCuenta();
        bancoDestino = bDest;
        bancoOrigen = bOrigin;
        this.monto = monto;
    }

    /**
     * Obtiene la cuenta de origen de la transferencia.
     *
     * @return La cuenta de origen de la transferencia.
     */
    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    /**
     * Obtiene la cuenta de destino de la transferencia.
     *
     * @return La cuenta de destino de la transferencia.
     */
    public String getCuentaDestino() {
        return cuentaDestino;
    }

    /**
     * Obtiene el banco de origen de la transferencia.
     *
     * @return El banco de origen de la transferencia.
     */
    public String getBancoOrigen() {
        return bancoOrigen;
    }

    /**
     * Obtiene el banco de destino de la transferencia.
     *
     * @return El banco de destino de la transferencia.
     */
    public String getBancoDestino() {
        return bancoDestino;
    }

    /**
     * Obtiene el monto transferido en la transferencia.
     *
     * @return El monto transferido.
     */
    public double getMonto() {
        return monto;
    }
}
