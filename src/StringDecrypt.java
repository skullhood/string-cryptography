/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oscar
 */
public class StringDecrypt {
    
    String decryptedString;
    private String text;
    private String passkey;
    
    public StringDecrypt(String text, String passkey){
        this.text = text;
        this.passkey = passkey;
    }
    
    public OperationReport decrypt(){
        
        if(this.passkey == null){
            if(text != null && !text.equals("")){    
                
                
                
                
                
            }
            else{
                return new OperationReport(false, "TEXT STRING EMPTY", "Input text to decrypt.");
            }
        }
        else{
        
        }
        
        return null;
    }
    
    public String getDecryptedString(){
        
        return this.decryptedString;
    }
}
