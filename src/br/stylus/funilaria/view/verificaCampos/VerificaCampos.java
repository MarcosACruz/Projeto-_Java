package br.stylus.funilaria.view.verificaCampos;

import javax.swing.JOptionPane;


public class VerificaCampos {
    
        
    public  static boolean validaCampos(String campo) {
        
     
      try{  
       if (campo.isEmpty()){
         JOptionPane.showMessageDialog(null, "Ainda existe campo vazio! \nVerifique e preencha para continuar!"); 
         return(true); 
          }
       } catch (Exception ex) {
         
         
       }
        return(false);
    }
     
}
