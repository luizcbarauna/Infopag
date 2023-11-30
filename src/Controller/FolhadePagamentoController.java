/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Service.Sessao;
import Model.*;
import View.FolhaPagamento;
import java.util.ArrayList;

/**
 *
 * @author luizf
 */
public class FolhadePagamentoController {
    public FolhadePagamentoController(){
        
    }
   InfopagDAO model = new InfopagDAO();
   FolhaPagamento view = new FolhaPagamento();
 FolhaDePagamento folha =new FolhaDePagamento();
    public FolhadePagamentoController(FolhaPagamento View, InfopagDAO model,String mes,String ano) {
      
     folha.mes=mes;
     folha.ano=ano;
    
     
    }
   public void ExibirFolhadePagamento(){
   String cpf = Sessao.getCpfLogado();
ArrayList<Funcionario> funcionario = model.searchFuncionario(cpf);
       
 if(funcionario.size()>0){
    String nome = funcionario.get(0).getNome();
   Double salarioBruto =funcionario.get(0).getSalarioBruto();
   //view.TxtNome.setText(nome);
   //view.TxtCpf.setText(""+cpf);
   //view.txtSalarioBruto.setText(String.valueOf(salarioBruto));
   //double DescontoTot=Descontos.DescontoTotal(salarioBruto);
   //view.TxtSalarioLiquido.setText(String.valueOf(DescontoTot));
   //view.txtAno.setText(""+folha.ano);
   //view.txtMes.setText(""+folha.mes);
   
 }
}
 }
  
