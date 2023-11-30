/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;
import View.*;
import com.sun.jdi.connect.spi.Connection;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author luizf
 */
public class FuncionarioController{
  
    CadastroFuncionario TelaCadastro = new CadastroFuncionario();
        InfopagDAO model = new InfopagDAO();
public FuncionarioController(CadastroFuncionario TelaCadastro, InfopagDAO model){
 this.model = model;
 this.TelaCadastro = TelaCadastro;

 
}

    public FuncionarioController() {
    }

    public FuncionarioController(Menu View, InfopagDAO model) {
       }
            public void Cadastro(CadastroFuncionario TelaCadastro) throws SQLException{
        String cpf = TelaCadastro.TxtCpf.getText();
        String senha = TelaCadastro.txtsenha.getText();
        Double salarioBruto =Double.parseDouble(TelaCadastro.TxtSalarioBruto.getText());
        String cargo = TelaCadastro.TxtCargo.getText();
        String nome = TelaCadastro.txtNome.getText();
        model.insertFuncionario(cpf,nome,senha,cargo,salarioBruto);
        } 
      
  
}
