/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.util.Scanner;

/**
 *
 * @author gleidison.santos
 */
public class USUARIO {

    public String usuario;
    public String senha;
    public String tarefa;
    public String programa;

   public String getUsuario() {
        return usuario;
    }

    public void setUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========DADOS DOS USUARIO===========");
        System.out.print("Digite seu email: ");
        String email = sc.nextLine();
        System.out.print("");
        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();
        this.usuario = (email +(",  a senha é: " + senha));       
        
    }


    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma tarefa a ser realizada ");
        String tarefa = sc.nextLine();
        System.out.print("Digite a data de terminio ");
        String data = sc.nextLine();
        this.tarefa = (tarefa + (", e a data de terminio é : " + data));
        
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma() { 
        this.programa = programa;
    }

}

    
