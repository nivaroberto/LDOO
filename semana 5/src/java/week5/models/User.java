package week5.models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Iván Hernández Chavarría 1452359
 */

public class User {

    private String username;
    private String password;

    private String nombre;
    private String apellido;

    public User(String user, String pass, String name, String lastName) {
        username = user;
        password = pass;
        nombre = name;
        apellido = lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return nombre;
    }

    public String getLastName() {
        return apellido;
    }

    public String getFullName() {
        String str;
        str = nombre + " " + apellido;
        return str;
    }
}


