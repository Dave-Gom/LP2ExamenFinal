package BaseDeDatos;

import java.util.ArrayList;

import Usuario.Usuario;

class BaseDeDatos {
    private ArrayList<Usuario> usuarios;

    public BaseDeDatos() {
        usuarios = new ArrayList<Usuario>();
    }

    public void addUsuario(Usuario nuevoUser) {
        this.usuarios.add(nuevoUser);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public Usuario findUsuarioById(int id) {
        return usuarios.get(id);
    }

    public Usuario getUserByCI(String cedula) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCi() == cedula) {
                return usuario;
            }
        }
        return null;
    }
}