public class Cuenta{
    private int idCuenta;
    private String titular;
    private int saldo;
    private String tipoCuenta;
    private String infoPersonal;
    private String nroCuenta;
    
    
    public Cuenta(int idCuenta,String titular,int saldo,String tipoCuenta,String infoPersonal,String nroCuenta){
        this.idCuenta = idCuenta;
        this.titular = titular;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.infoPersonal = infoPersonal;
        this.nroCuenta = nroCuenta;
    }
    
    public void listarCuentas(){
    }
    public void seleccionarCuenta(){
    }
}