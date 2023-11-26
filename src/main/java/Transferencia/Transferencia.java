package main.java.Transferencia;

/**
 * Clase Transferencia
 * @author Jaime Núñez
 */
public class Transferencia {
    private String cuentaOrigen;
    private String entidadDestino;
    private String monto;
    private String bancoOrigen;
    private String bancoDestino;
    private String transferenciasCol;

    public Transferencia(String cuentaOrigen, String entidadDestino, String monto, String bancoOrigen, String bancoDestino, String transferenciasCol) {
        this.cuentaOrigen = cuentaOrigen;
        this.entidadDestino = entidadDestino;
        this.monto = monto;
        this.bancoOrigen = bancoOrigen;
        this.bancoDestino = bancoDestino;
        this.transferenciasCol = transferenciasCol;
    }

    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    public String getEntidadDestino() {
        return entidadDestino;
    }

    public String getMonto() {
        return monto;
    }

    public String getBancoOrigen() {
        return bancoOrigen;
    }

    public String getBancoDestino() {
        return bancoDestino;
    }

    public String getTransferenciasCol() {
        return transferenciasCol;
    }
    
}
