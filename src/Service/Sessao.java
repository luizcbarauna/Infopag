/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author luizf
 */
    public class Sessao {
    private static String cpfLogado;
    private static String cargoLogado;
    private static String SenhaLogado;

    public static String getCpfLogado() {
       return cpfLogado;
    }

    public static void setCpfLogado(String cpf) {
        cpfLogado = cpf;
    }

    public static String getCargoLogado() {
        return cargoLogado;
    }

    public static void setCargoLogado(String cargo) {
        cargoLogado = cargo;
    }
    public static String getSenhaLogado() {
        return SenhaLogado;
    }

    public static void setSenhaLogado(String senha) {
        SenhaLogado = senha;
}

    
}
