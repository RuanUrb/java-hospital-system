
package exception;

import javax.swing.JOptionPane;

public class EmailException extends Exception{
    
    public EmailException(String email){
        
    }
    
    public void printError(){
        JOptionPane.showMessageDialog(null, "E-mail ou senha incorretos",
                    "Sistema", JOptionPane.ERROR_MESSAGE);
    }
    
}
