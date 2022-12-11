 
package oop6;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Usuario> user_list;
    private Usuario current_user;
    
    public Sistema(){
        user_list = new ArrayList<Usuario>();
    }
    
    public boolean register(String email, String username, String password){
        if(user_list.isEmpty()){
            Usuario new_user = new Usuario(email, username, password);
            user_list.add(new_user);
            return true;
        }
        
        for(int i = 0; i < this.user_list.size(); i++){
            if(username.compareTo(this.user_list.get(i).username) == 0){
                return false;
            }else if(email.compareTo(this.user_list.get(i).email) == 0){
                return false;
            }else{
                Usuario new_user = new Usuario(email, username, password);
                user_list.add(new_user);
                return true;
                //cadastrado com sucesso
            }
        }
        return false;
    };
    
    public Usuario login(String email, String password){
        for(int i = 0; i < this.user_list.size(); i++){
            if(email.compareTo(this.user_list.get(i).email)==0 && password.compareTo(this.user_list.get(i).password)==0){
                current_user = this.user_list.get(i);
                return current_user;
            }
        }
        return new Usuario();
    };

    private static class bool {

        public bool() {
        }
    }
    
}
