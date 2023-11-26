package main.java.Cuenta;
public class Cuenta{
    private int idCuenta;
    private String titular;
    private int saldo;
    //para saber saber si la cuenta
    //es del tipo corriente
    private String tipoCuenta;
    private String infoPersonal;
    private String nroCuenta;
    
    public Cuenta(){
    }
    
    public Cuenta(int idCuenta,String titular,int saldo,String tipoCuenta,String infoPersonal,String nroCuenta){
        this.idCuenta = idCuenta;
        this.titular = titular;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.infoPersonal = infoPersonal;
        this.nroCuenta = nroCuenta;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public int getSaldo() {
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
    
    
    public void listarCuentas(){
    }
    public void seleccionarCuenta(){
    }
}