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
    public String tarefa;
    public String programa;

    public String getUsuario() {
        return usuario;
    }

    public String setUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========DADOS DOS USUARIO===========");
        System.out.print("Digite seu email: ");
        String email = sc.nextLine();
        System.out.print("");
        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();
        return usuario;
    }

    public String getTarefa() {
        return tarefa;
    }

    public String setTarefa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma tarefa a ser realizada ");
        String tarefa1 = sc.nextLine();
        System.out.print("Digite a data de terminio ");
        String data = sc.nextLine();
        return tarefa;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    
}
