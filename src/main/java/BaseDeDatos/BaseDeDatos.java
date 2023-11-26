package BaseDeDatos;

import Cuenta.Cuenta;
import TarjetaDeCredito.TarjetaDeCredito;
import java.util.ArrayList;
import Usuario.Usuario;
import TransaccionTarjeta.TransaccionTarjeta;

/**
 * La clase BaseDeDatos representa la base de datos principal del sistema.
 * Contiene listas de usuarios y transacciones de tarjetas.
 *
 * @author David Gomez
 */
public class BaseDeDatos {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Cuenta> cuentas;
    private ArrayList<TarjetaDeCredito> tarjetas;
    private ArrayList<TransaccionTarjeta> transaccionesTarjeta;
    

    /**
     * Constructor de la clase BaseDeDatos.
     * Inicializa las listas de usuarios y transacciones de tarjetas.
     */
    public BaseDeDatos() {
        usuarios = new ArrayList<>();
        transaccionesTarjeta = new ArrayList<>();
        tarjetas = new ArrayList<>();
        cuentas = new ArrayList<>();
    }

    /**
     * Agrega un nuevo usuario a la lista de usuarios.
     *
     * @param nuevoUser El usuario que se va a agregar.
     */
    public void addUsuario(Usuario nuevoUser) {
        this.usuarios.add(nuevoUser);
    }

    /**
     * Obtiene la lista de usuarios almacenados en la base de datos.
     *
     * @return La lista de usuarios.
     */
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Busca un usuario por su identificador único.
     *
     * @param id El identificador único del usuario.
     * @return El usuario con el identificador proporcionado.
     */
    public Usuario findUsuarioById(int id) {
        return usuarios.get(id);
    }

    /**
     * Busca un usuario por su número de cédula de identidad.
     *
     * @param cedula El número de cédula de identidad del usuario.
     * @return El usuario con la cédula proporcionada, o null si no se encuentra.
     */
    public Usuario getUserByCI(String cedula) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCi().compareTo(cedula) == 0) {
                return usuario;
            }
        }
        return null;
    }

    /**
     * Agrega una nueva transacción de tarjeta a la lista de transacciones.
     *
     * @param nuevaTransaccion La transacción de tarjeta que se va a agregar.
     */
    public void AddTranaccionTarjeta(TransaccionTarjeta nuevaTransaccion) {
        transaccionesTarjeta.add(nuevaTransaccion);
    }
    
    
    public void addCuenta(Cuenta nuevaCuenta) {
        cuentas.add(nuevaCuenta);
    }
    
    public void addTarjeta(TarjetaDeCredito nuevaTarjeta) throws Exception{
        for (TarjetaDeCredito tarjeta : tarjetas) {
            if(tarjeta.getNroTarjeta().compareTo(nuevaTarjeta.getNroTarjeta()) == 0){
                throw new Exception("Ya existe en la base un registro con numero de tarjeta" + nuevaTarjeta.getNroTarjeta());
            }
        }
        
        tarjetas.add(nuevaTarjeta);
    }
}
