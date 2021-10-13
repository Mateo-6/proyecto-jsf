/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Maran
 */
@ManagedBean
@RequestScoped
public class test {
    
    String user, pswd;

    /**
     * Creates a new instance of test
     */
    public test() {
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
    
    public String getRespuesta() {
        
        if( (user.equals("mateo")) && (pswd.equals("123456")) ) {
            return "principal";
        } else {
            return "index";
        }
        
    }
    
}
