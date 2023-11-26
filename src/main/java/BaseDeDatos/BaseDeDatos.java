package BaseDeDatos;

import java.util.ArrayList;
import java.util.Date;

import Cuenta.Cuenta;
import Cuenta.Transferencia;
import Extracto.Extracto;
import Servicio.PagoServicio;
import TarjetaDeCredito.PagoTarjeta;
import TarjetaDeCredito.TarjetaDeCredito;
import TarjetaDeCredito.TransaccionTarjeta;
import Usuario.Usuario;

/**
 * La clase BaseDeDatos representa la base de datos principal del sistema.
 * Contiene listas de usuarios, cuentas, tarjetas, transacciones de tarjetas,
 * transferencias, pagos de servicios y pagos de tarjetas.
 *
 * @author David Gomez
 */
public class BaseDeDatos {

    private ArrayList<Usuario> usuarios;
    private ArrayList<Cuenta> cuentas;
    private ArrayList<TarjetaDeCredito> tarjetas;
    private ArrayList<TransaccionTarjeta> transaccionesTarjeta;
    private ArrayList<Transferencia> transferencias;
    private ArrayList<PagoServicio> pagosServ;
    private ArrayList<PagoTarjeta> pagosTarjetas;

    /**
     * Constructor de la clase BaseDeDatos. Inicializa las listas de usuarios,
     * cuentas, tarjetas, transacciones de tarjetas, transferencias, pagos de
     * servicios.
     * 
     * @author David Gomez
     */
    public BaseDeDatos() {
        usuarios = new ArrayList<>();
        transaccionesTarjeta = new ArrayList<>();
        tarjetas = new ArrayList<>();
        cuentas = new ArrayList<>();
        transferencias = new ArrayList<>();
        pagosServ = new ArrayList<>();
        pagosTarjetas = new ArrayList<>();
    }

    // Métodos para agregar diferentes tipos de registros a la base de datos
    /**
     * Agrega un nuevo usuario a la lista de usuarios.
     *
     * @param nuevoUser El usuario que se va a agregar.
     * 
     * @author David Gomez
     */
    public void addUsuario(Usuario nuevoUser) throws Exception {
        for (Usuario usuario : usuarios) {
            if (usuario.getCi().compareTo(nuevoUser.getCi()) == 0) {
                throw new Exception("Duplicate entry 'ci' for key 'ci_UNIQUE'");
            }
        }

        usuarios.add(nuevoUser);
    }

    /**
     * Obtiene la lista de usuarios almacenados en la base de datos.
     *
     * @return La lista de usuarios.
     * 
     * @author David Gomez
     */
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Busca un usuario por su identificador único.
     *
     * @param id El identificador único del usuario.
     * @return El usuario con el identificador proporcionado.
     * 
     * @author David Gomez
     */
    public Usuario findUsuarioById(int id) {
        return usuarios.get(id);
    }

    /**
     * Busca un usuario por su número de cédula de identidad.
     *
     * @param cedula El número de cédula de identidad del usuario.
     * @return El usuario con la cédula proporcionada, o null si no se
     * encuentra.
     * 
     * @author David Gomez
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
     * 
     * @author David Gomez
     */
    public void AddTranaccionTarjeta(TransaccionTarjeta nuevaTransaccion) {
        transaccionesTarjeta.add(nuevaTransaccion);
    }

    /**
     * Agrega una nueva cuenta a la lista de cuentas.
     *
     * @param nuevaCuenta La cuenta que se va a agregar.
     * 
     * @author David Gomez
     */
    public void addCuenta(Cuenta nuevaCuenta) throws Exception {
        if (getCuentaByNro(nuevaCuenta.getNroCuenta()) != null) {
            throw new Exception("Duplicate entry 'nroCuenta' for key 'cuentas.nroCuenta_UNIQUE");
        }
        cuentas.add(nuevaCuenta);
    }

    public Cuenta getCuentaByNro(String numeroDeCuenta) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNroCuenta().compareTo(numeroDeCuenta) == 0) {
                return cuenta;
            }
        }
        return null;
    }

    /**
     * Agrega una nueva tarjeta a la lista de tarjetas.
     *
     * @param nuevaTarjeta La tarjeta que se va a agregar.
     * @throws Exception Si ya existe una tarjeta con el mismo número en la base
     * de datos.
     * 
     * @author David Gomez
     */
    public void addTarjeta(TarjetaDeCredito nuevaTarjeta) throws Exception {
        for (TarjetaDeCredito tarjeta : tarjetas) {
            if (tarjeta.getNroTarjeta().compareTo(nuevaTarjeta.getNroTarjeta()) == 0) {
                throw new Exception(
                        "Ya existe en la base un registro con numero de tarjeta" + nuevaTarjeta.getNroTarjeta());
            }
        }
        tarjetas.add(nuevaTarjeta);
    }

    /**
     * Agrega una nueva transferencia a la lista de transferencias.
     *
     * @param transf La transferencia que se va a agregar.
     * 
     * @author David Gomez
     */
    public void addtransferencia(Transferencia transf) {
        transferencias.add(transf);
    }

    /**
     * Agrega un nuevo pago de servicios a la lista de pagos de servicios.
     *
     * @param pago El pago de servicios que se va a agregar.
     * 
     * @author David Gomez
     */
    public void addPagoServicios(PagoServicio pago) {
        pagosServ.add(pago);
    }

    /**
     * Agrega un nuevo pago de tarjeta a la lista de pagos de tarjetas.
     *
     * @param pago El pago de tarjeta que se va a agregar.
     * 
     * @author David Gomez
     */
    public void addPagoTarjeta(PagoTarjeta pago) {
        pagosTarjetas.add(pago);
    }

    /**
     * Imprime la representación JSON de los usuarios en la consola.
     * 
     * @author David Gomez
     */
    public void printUsuarios() {
        // Lista para almacenar las representaciones JSON de los usuarios
        ArrayList<String> stringFormateado = new ArrayList<>();

        // Itera sobre la lista de usuarios
        for (Usuario usuario : usuarios) {
            // Convierte cada usuario a su representación JSON y lo agrega a la lista
            stringFormateado.add(usuario.toJsonString());
        }

        // Imprime la lista de representaciones JSON en la consola
        System.out.println(stringFormateado);
    }

    /**
     * Crea un nuevo objeto Usuario con los atributos proporcionados, lo agrega
     * a la lista de usuarios y lo devuelve.
     *
     * @param ci Cédula de identidad del nuevo usuario.
     * @param pin PIN de acceso del nuevo usuario.
     * @param pinTransaccional PIN para transacciones del nuevo usuario.
     * @param email Correo electrónico del nuevo usuario.
     * @param nacionalidad Nacionalidad del nuevo usuario.
     * @param nombre Nombre del nuevo usuario.
     * @param apellido Apellido del nuevo usuario.
     * @param fechaNacimiento Fecha de nacimiento del nuevo usuario.
     * @param telefono Número de teléfono del nuevo usuario.
     * @return El nuevo usuario creado y agregado a la lista.
     * 
     * @author David Gomez
     */
    public Usuario createUsuario(String ci, String pin, String pinTransaccional, String email, String nacionalidad,
            String nombre,
            String apellido, Date fechaNacimiento, String telefono) {
        try {
            // Crea un nuevo usuario con los atributos proporcionados
            Usuario nuevoUser = new Usuario(ci, pin, pinTransaccional, email, nacionalidad, nombre, apellido,
                    fechaNacimiento, telefono, this);

            // Agrega el nuevo usuario a la lista de usuarios
            usuarios.add(nuevoUser);

            // Devuelve el nuevo usuario creado
            return nuevoUser;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * Obtiene el extracto de una cuenta especificada a partir de las
     * transacciones y pagos almacenados en la base de datos.
     *
     * @param nroCuenta Número de cuenta para el cual se desea obtener el
     * extracto.
     * @return Una lista de objetos Extracto que representan las transacciones y
     * pagos asociados a la cuenta.
     * 
     * @author David Gomez
     */
    public ArrayList<Extracto> getExtractoCuenta(String nroCuenta) {
        ArrayList<Extracto> datos = new ArrayList<>();

        // Recorre las transferencias y agrega las que corresponden a la cuenta especificada al extracto
        for (Transferencia transf : transferencias) {
            if (transf.getCuentaOrigen().compareTo(nroCuenta) == 0
                    || transf.getBancoDestino().compareTo(nroCuenta) == 0) {
                datos.add(transf);
            }
        }

        // Recorre los pagos de servicio y agrega los que corresponden a la cuenta especificada al extracto
        for (PagoServicio pagoServicio : pagosServ) {
            if (pagoServicio.getCuentaNro().compareTo(nroCuenta) == 0) {
                datos.add(pagoServicio);
            }
        }

        // Recorre los pagos de tarjeta y agrega los que corresponden a la cuenta especificada al extracto
        for (PagoTarjeta pagoTarjeta : pagosTarjetas) {
            if (pagoTarjeta.getCuentaOrigen().compareTo(nroCuenta) == 0) {
                datos.add(pagoTarjeta);
            }
        }

        return datos;
    }

    /**
     * Crea una nueva cuenta para un usuario con la información proporcionada.
     *
     * @param ciUser Cédula de identidad del usuario asociado a la cuenta.
     * @param saldo Saldo inicial de la cuenta.
     * @param tipoCuenta Tipo de cuenta a crear.
     * @return Una instancia de la clase Cuenta recién creada o null si hay un
     * error durante la creación.
     * 
     * @author David Gomez
     */
    public Cuenta createCuenta(String ciUser, int saldo, String tipoCuenta) {
        try {
            Cuenta nuevaCuenta = new Cuenta(ciUser, tipoCuenta, saldo, this);
            return nuevaCuenta;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    /**
     * Obtiene la lista de cuentas almacenadas en la base de datos.
     *
     * @return Una lista de objetos Cuenta que representan las cuentas
     * almacenadas.
     * 
     * @author David Gomez
     */
    public ArrayList<Cuenta> getCuentas() {
        return this.cuentas;
    }
    
    
    /**
     * Imprime la representación JSON de las en la consola.
     * 
     * @author David Gomez
     */
    public void printCuentas() {
        // Lista para almacenar las representaciones JSON de los usuarios
        ArrayList<String> stringFormateado = new ArrayList<>();

        // Itera sobre la lista de cuentas
        for (Cuenta cuenta : cuentas) {
            // Convierte cada usuario a su representación JSON y lo agrega a la lista
            stringFormateado.add(cuenta.toJsonString());
        }

        // Imprime la lista de representaciones JSON en la consola
        System.out.println(stringFormateado);
    }

}
