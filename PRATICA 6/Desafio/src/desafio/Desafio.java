/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gleidison.santos
 */
public class Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        USUARIO U = new USUARIO();

        /**
         * CRIAÇÃO DO MENU
         */
        System.out.println("===========CADASTRO DE USUARIO===========");
        System.out.println("[1] - Inserir novo usuário ");
        System.out.println("[2] - Inserir nova tarefa ");
        System.out.println("[3] - Finalizar programa ");
        System.out.print("Menu: ");
        int menu = sc.nextInt();

        /**
         * Escolha das opções do menu
         */
        if (menu == 1) {
            U.setUsuario();
           
            System.out.println("O dados do usuario é " + U.getUsuario());
           
            
        }
        if (menu == 2) {
            U.setTarefa();
            System.out.println(" O dados do usuario é " + U.getTarefa());
        }
        if (menu == 3) {

            System.out.println("Programa encerrado");;

        }

        /**
         * Apresentação dos dados
         */
        
        
    }

}
