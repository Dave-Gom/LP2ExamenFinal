package Usuario;

import java.util.Date;

/**
 * Usuario
 */
public class Usuario {
    private String ci;
    private String pin;
    private String pinTransaccional;
    private String email;
    private String nacionalidad;
    private String nombre;
    private String apellido;
    private String telefono;
    private Date fechaNacimiento;

    public Usuario(String ci, String pin, String pinTransaccional, String email, String nacionalidad, String nombre,
            String apellido, Date fechaNacimiento, String telefono) {

        this.ci = ci;
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
        this.pin = pin;
        this.nombre = nombre;
        this.pinTransaccional = pinTransaccional;

    }

    public String getApellido() {
        return apellido;
    }

    public String getCi() {
        return ci;
    }

    public String getEmail() {
        return email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPin() {
        return pin;
    }

    public String getPinTransaccional() {
        return pinTransaccional;
    }

    public String getTelefono() {
        return telefono;
    }

}