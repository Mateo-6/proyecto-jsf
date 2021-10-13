/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maran
 */
public class Persona {

    private String nombre,
            apellido,
            edad,
            sexo,
            ciudad,
            user,
            pswd;
    private boolean edit;

    Persona(String nombre, String apellido, String edad, String sexo, String ciudad, String user, String pswd) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.ciudad = ciudad;
        this.user = user;
        this.pswd = pswd;
        this.edit = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }

    boolean containsUser(String user) {
        
           if( this.user.equals(user) ) {
               return true;
           }
           
           return false;
        
    }

    boolean containsPswd(String pswd) {
        
        if( this.pswd.equals(pswd) ) {
               return true;
           }
           
           return false;
           
    }

}
