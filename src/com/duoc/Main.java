package com.duoc;

import com.duoc.controlador.ControladorUsuarios;
import com.duoc.vista.Login;

import javax.swing.*;

public class Main {

    public static void main(String[]args){
        SwingUtilities.invokeLater(() -> {
            ControladorUsuarios controladorUsuarios = new ControladorUsuarios();
            Login login = new Login(controladorUsuarios);
            login.setVisible(true);
        });
    }

}
