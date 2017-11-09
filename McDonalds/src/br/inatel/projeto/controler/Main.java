
package br.inatel.projeto.controler;

import br.inatel.projeto.view.*;


public class Main {
    
    public static void main(String[] args) {
        //Inicial inicial = new Inicial();
        //new ControlerInicial(inicial);
        
        Login login = new Login();
        new ControlerLogin(login);
        
        
    }
    
}
