/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

/**
 *
 * @author luizf
 */
public class LoginController {
        Login Login = new Login();
        InfopagDAO model = new InfopagDAO();
    public LoginController(Login Login, InfopagDAO model){
       this.Login = Login;
    }

    public LoginController() {
        
    }

       
            public void Logar(Login login, String cpf, String senha) throws SQLException, ClassNotFoundException{
        model.login(cpf, senha);
        }
    
    }
    

