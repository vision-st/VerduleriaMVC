package com.duoc.controlador;

import com.duoc.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ControladorUsuarios {

    private final List<Usuario> usuarios = new ArrayList<>();

    public ControladorUsuarios(){
        cargarUsuariosPorDefecto();
    }

    private void cargarUsuariosPorDefecto() {
        usuarios.add(new Usuario("admin","123", "admin"));
        usuarios.add(new Usuario("vendedor","123", "vendedor"));
    }

    public Usuario autenticar(String nombreUsuario, String contrasena){
        for(Usuario usuario: usuarios){
            if(usuario.getNombreUsuario().equals(nombreUsuario)
                    && usuario.getContrasena().equals(contrasena)){
                return usuario;
            }
        }
        return null;
    }

}
