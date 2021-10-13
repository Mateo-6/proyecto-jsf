/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Maran
 */
@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {

    private String nombre,
            apellido,
            edad,
            sexo,
            ciudad,
            user,
            pswd;

    private static final ArrayList<Persona> personas
            = new ArrayList<Persona>(Arrays.asList(
                    new Persona("Mateo", "Arango", "23", "M", "Cali", "mateo", "123456"),
                    new Persona("Laura", "Tenorio", "23", "F", "Cali", "laura", "123456")

            ));
    
    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public String login() {

        boolean user = false;
        boolean pswd = false;

        for (int i = 0; i < personas.size(); i++) {

            Persona persona = personas.get(i);

            user = persona.containsUser(this.user);
            pswd = persona.containsPswd(this.pswd);

            if (user && pswd) {
                return "principal";
            }

        }

        return "index";

    }
    
    public String register() {

        Persona persona = new Persona(
                nombre,
                apellido,
                edad,
                sexo,
                ciudad,
                user,
                pswd);
        
        personas.add(persona);

        /*if ((nombre == null)) {
            return "index";
        }*/

        return "principal";

    }

    public ArrayList<Persona> getEmployees() {
        return personas;
    }

    public void addEmployee() {
        Persona employee = new Persona(nombre,
                apellido,
                edad,
                sexo,
                ciudad,
                user,
                pswd);
        personas.add(employee);
    }

    public void deleteEmpleado(Persona employee) {
        personas.remove(employee);
    }

    public void editEmpleado(Persona employee) {
        employee.setEdit(true);
    }

    public void saveEmpleado() {

        for (Persona persona : personas) {
            persona.setEdit(false);
        }

    }

    /**
     * Creates a new instance of UserData
     */
    public UserData() {
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

}
