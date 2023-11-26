package Cuenta;

import BaseDeDatos.BaseDeDatos;
import Usuario.Usuario;
import java.util.ArrayList;
import Extracto.Extracto;

public class Cuenta {

    private int idCuenta;
    private String ciUser;
    private double saldo;
    //para saber saber si la cuenta
    //es del tipo corriente
    private String tipoCuenta;
    private String infoPersonal;
    private String nroCuenta;
    public BaseDeDatos base;

    public Cuenta(int idCuenta, String ciUser, int saldo, String tipoCuenta, String infoPersonal, String nroCuenta,/* @Author: DG */ BaseDeDatos base) throws Exception {

        // validacion de existencia de Usuario, @author: David Gomez
        if (base.getUserByCI(ciUser) == null) {
            throw new Exception("Foreign key violation: El valor " + ciUser + " en la columna 'ci' no tiene una correspondencia en la tabla 'users'");
        }

        this.idCuenta = idCuenta;
        this.ciUser = ciUser;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.infoPersonal = infoPersonal;
        this.nroCuenta = nroCuenta;
        this.base = base;
        base.addCuenta(this);
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    /**
     * Obtiene la cédula de identidad asociada a la cuenta.
     *
     * @return La cédula de identidad del usuario asociado a la cuenta.
     *
     * @author David Gomez
     */
    public String getCiUser() {
        return ciUser;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public String getInfoPersonal() {
        return infoPersonal;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    /**
     *
     * Este método retorna el saldo de la cuenta
     *
     * @param saldo
     *
     * @author David Gomez
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Este método realiza una transferencia de saldo desde la cuenta actual
     * hacia la cuenta destino. Se actualizan los saldos de ambas cuentas y se
     * registra la transferencia en la base de datos proporcionada.
     *
     * @param destino La cuenta de destino a la que se va a transferir el saldo.
     * @param monto El monto que se va a transferir.
     *
     * @author David Gomez
     */
    public void transferir(Cuenta destino, double monto) {
        try {
            // Obtiene los saldos actuales de la cuenta de origen y la cuenta de destino.
            double saldoOrigen = this.getSaldo();
            double saldoDestino = destino.getSaldo();

            // Verifica si la cuenta de origen tiene saldo suficiente para la transferencia.
            if (saldoOrigen >= monto) {
                // Actualiza los saldos de ambas cuentas.
                this.setSaldo(saldoOrigen - monto);
                destino.setSaldo(saldoDestino + monto);

                // Crea una nueva instancia de la clase Transferencia.
                Transferencia nuevaTrans = new Transferencia(this, destino, monto, "Banco Grupo 13", "Banco Grupo 13");

                // Guarda la nueva transferencia en la base de datos.
                base.addtransferencia(nuevaTrans);
            } else {
                // Lanza una excepción si la cuenta de origen no tiene saldo suficiente.
                throw new Exception("La cuenta origen no cuenta con saldo suficiente");
            }

        } catch (Exception e) {
            // En caso de que ocurra una excepción, imprime el mensaje de la excepción en la consola.
            System.out.println(e.getMessage());
        }
    }

    /**
     * Obtiene el titular de la cuenta utilizando la cédula de identidad del
     * usuario asociado.
     *
     * @return El objeto Usuario que actúa como titular de la cuenta.
     *
     * @author David Gomez
     */
    public Usuario getTitular() {
        // Utiliza la cédula de identidad del usuario asociado para obtener al titular de la cuenta
        return base.getUserByCI(ciUser);
    }

    /**
     * Obtiene el extracto de la cuenta asociada a partir de la base de datos.
     *
     * @return Una lista de objetos Extracto que representan el extracto de la
     * cuenta.
     * 
     * @author David Gomez
     */
    public ArrayList<Extracto> getExtracto() {
        return this.base.getExtractoCuenta(this.nroCuenta);
    }

}
