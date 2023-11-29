/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package infopagdesk;

import Controller.LoginController;
import View.*;
import Model.*;
/**
 *
 * @author luizf
 */
public class InfoPagDesk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login View = new Login();
        InfopagDAO model= new InfopagDAO();
        LoginController controller= new LoginController(View,model);
    View.setVisible(true);
    View.setLocationRelativeTo(null);
    }
    }
    

