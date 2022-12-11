package oop6;

import javax.swing.JOptionPane;

public class Panel {
    
    Sistema sistema = new Sistema();
    
    private String username, email, password;
    
    public void iniciar(){
        Object[] possibleValues = {"Register", "Login"};
        
        
        JOptionPane painel = new JOptionPane();
        Object selectedValue = painel.showInputDialog(null, "Cadastre-se ou faça login.", "Facecuck",painel.INFORMATION_MESSAGE, null,
                possibleValues, possibleValues[0]);
        if(selectedValue == "Register"){
            this.username = painel.showInputDialog(null, "Type your username", "Register", 1);
            if(this.username != null){
                this.email = painel.showInputDialog(null, "Type your email", "Register", 1);
                if(this.email != null){
                    this.password = painel.showInputDialog(null, "Type your password", "Register", 1);
                    if(this.password != null){
                      if(sistema.register(this.email, this.username, this.password)){
                          if(painel.showConfirmDialog(null, "Cadastro realizado com sucesso!\nDeseja voltar ao menu?", "Facecuck", 1) == 0) iniciar();
                          else painel.showMessageDialog(null, "Email ou username já cadastrados!", "Facecuck", 0);
                      };
                      
                      
                }
            }   
        }
    }else if(selectedValue == "Login"){
           this.email = painel.showInputDialog(null, "Type your email", "Login Screen", 1);
           if(this.email != null){
               this.password = painel.showInputDialog(null, "Type your password", "Login Screen", 1);
           }if(this.password != null){
               Usuario dummy = sistema.login(this.email, this.password);
               if(dummy.username != null){
                   painel.showMessageDialog(null, "Login efetuado com sucesso! Olá, "+dummy.username+"!", "Facecuck", 1);
               }else{
                   painel.showMessageDialog(null, "Email ou senha incorretos.", "Facecuck", 0);
                   iniciar();
                   
               }
           }
        }
    
    }
}
