package Cuenta;

import BaseDeDatos.BaseDeDatos;

public class Cuenta {
    private int idCuenta;
    private String titular;
    private double saldo;
    //para saber saber si la cuenta
    //es del tipo corriente
    private String tipoCuenta;
    private String infoPersonal;
    private String nroCuenta;
    public BaseDeDatos base;

    public Cuenta() {
    }

    public Cuenta(int idCuenta, String titular, int saldo, String tipoCuenta, String infoPersonal, String nroCuenta, BaseDeDatos base) {
        this.idCuenta = idCuenta;
        this.titular = titular;
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

    public String getTitular() {
        return titular;
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
    
    
}
