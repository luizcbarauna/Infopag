package Model;

import Controller.LoginController;
import Controller.MenuController;
import Controller.MenuFuncionarioController;
import Service.Sessao;
import View.Login;
import View.Menu;
import View.MenuFuncionario;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author luizf
 */
public class InfopagDAO {
    
Conectar conectar;
 //construtor instanciando variavel conectar
    public InfopagDAO(){
        conectar=new Conectar();
    }
    //metodo para inserir um funcionario no banco de dados
    public void insertFuncionario(String cpf,String  nome,String  senha,String  cargo,Double  salarioBruto){
        String respReg = null;
        //tenta obter conexão com o banco de dados
        try{
            Connection acessoDB= conectar.getConnection();
            //Prepara uma chamada de um procedure no banco de dados com todos os parametros 
        CallableStatement cs =acessoDB.prepareCall("{call SP_InsertFuncionario(?,?,?,?,?)}");
           //define o valor dos parametros da procedure
        cs.setString(1,cpf);
        cs.setString(2, nome);
        cs.setString(3, senha);
        cs.setString(4, cargo);
        cs.setDouble(5, salarioBruto);
        //executa a procedure
        int numRegAfetados=cs.executeUpdate();
        //se criou algum registro novo exibe a mensagem registro gravado
        if(numRegAfetados>0){
            JOptionPane.showMessageDialog(null,"Registro gravado");
        }
        //exibe o erro em caso de exceção
        }catch (Exception e){
            
        }
        //retorna a resposta
        
    }

   //declara um metodo de uma lista de objetos funcionario
 
 
 public int excluirFuncionario(String cpf)
 {int numReg=0;
 try{
     Connection acessoDB = conectar.getConnection();
      CallableStatement cs =acessoDB.prepareCall("{call SP_DeleteFuncionario(?)}");
      cs.setString(1,cpf);
      numReg=cs.executeUpdate();
 }catch(Exception e){
        
 }
     return numReg;
 }
 public ArrayList<Funcionario> searchFuncionario(String cpf){
    //instanciando a lista
    ArrayList<Funcionario> listaFuncionario = new ArrayList();
    Funcionario funcionario;
    //tentando a conexão com o banco de dados
    try{
         Connection acessoDB = conectar.getConnection();
         //preparando a procedure
         CallableStatement cs =acessoDB.prepareCall("{call SP_LocalizaFuncionario(?)}");
         //define qual variavel sera usada na procedure
         cs.setString(1, cpf);
         //executando a query
         ResultSet rs =cs.executeQuery();
         //laço de repetição para cada registro encontrado
         while(rs.next()){
  
             //busca cada atributo
             funcionario = new Funcionario();
             funcionario.setCpf(rs.getString(1));
             funcionario.setNome(rs.getString(2));
             funcionario.setSenha(rs.getString(3));
             funcionario.setCargo(rs.getString(4));
             funcionario.setSalarioBruto(rs.getDouble(6));
             //adiciona a lista de funcionarios
             listaFuncionario.add(funcionario);
         }
         //captura a exceção
         }catch(Exception e){
                 }
    //retorna a lista com os funcionarios encontrados
         return listaFuncionario;
    }//metodo para fazer o update
public void login(String cpf,String senha) throws SQLException, ClassNotFoundException{
         Connection acessoDB = conectar.getConnection();
         CallableStatement cs =acessoDB.prepareCall("{call SP_searchFuncionario(?,?)}");
         cs.setString(1,    cpf);
            cs.setString(2, senha);
         ResultSet rs =cs.executeQuery();
        if(rs.next()){
             String cargo = rs.getString("Cargo"); // Substitua "Cargo" pelo nome correto da coluna no seu ResultSet

            if ("Gerente".equals(cargo)) {
            Menu View = new Menu();
        InfopagDAO model= new InfopagDAO();
            MenuController controller= new MenuController(View,model);
    View.setVisible(true);
    View.setLocationRelativeTo(null);
    Sessao.setCpfLogado(cpf);
    Sessao.setCargoLogado(cargo);
    Sessao.setSenhaLogado(senha);
            }
            else{
                Login Login = new Login();
                 MenuFuncionario MenuFuncionario = new MenuFuncionario();
        InfopagDAO model= new InfopagDAO();
            MenuFuncionarioController controller= new MenuFuncionarioController(MenuFuncionario,model);
            
    MenuFuncionario.setVisible(true);
    MenuFuncionario.setLocationRelativeTo(null);
    Sessao.setCpfLogado(cpf);
    Sessao.setCargoLogado(cargo);
    Sessao.setSenhaLogado(senha);
            }
        }else{
             JOptionPane.showMessageDialog(null, "Login incorreto");
        }
         
    }
public int updateFuncionario(String cpf, String nome, String senha, String cargo, Double salarioBruto){
    int numReg=0;
    try{ 
        Connection acessoDB= conectar.getConnection();
        CallableStatement cs =acessoDB.prepareCall("{call SP_updateFuncionario(?,?,?,?,?)}");
        cs.setString(1,cpf);
        cs.setString(2, nome);
        cs.setString(3, senha);
        cs.setString(4, cargo);
        cs.setDouble(5, salarioBruto);
        numReg=cs.executeUpdate();
    }catch(Exception e){
}
    return numReg;
}

    }

