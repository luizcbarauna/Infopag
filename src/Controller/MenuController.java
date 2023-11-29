/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.InfopagDAO;
import View.Menu;

/**
 *
 * @author luizf
 */
public class MenuController {
        Menu Menu = new Menu();
        InfopagDAO model = new InfopagDAO();
    public MenuController(Menu Menu, InfopagDAO model){
       this.Menu = Menu;
    }
}
