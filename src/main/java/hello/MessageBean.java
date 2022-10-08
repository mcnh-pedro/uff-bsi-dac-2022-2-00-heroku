package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.beans.*;
import java.io.Serializable;
import java.time.LocalDateTime;


/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
     
    private String aut;
    private String lang;
    private String msg;
    private String msg2;
        
    public MessageBean() {
    }
    
    public String getAut() {
        return "José Viterbo";
    }
    
    public void setLang(String value) {
        lang = value;
    }
    public String getMsg() {

        LocalDateTime d01 = LocalDateTime.now();
        int hora = d01.getHour();

        switch (this.lang){

            case "pt":

                if( (hora >=5) && (hora < 12)){
                    return "bom dia";
                }
                else if ( (hora >= 12) && (hora < 18)){
                    return "boa tarde";
                }
                else if ( (hora >= 18) || (hora < 5)){
                    return "boa noite";
                }


            case "en":

                if( (hora >=5) && (hora < 12)){
                    return "Good morning";
                }
                else if ( (hora >= 12) && (hora < 18)){
                    return "Good afternoon";
                }
                else if ( (hora >= 18) || (hora < 5)){
                    return "good evening";
                }


            case "de":

                if( (hora >=5) && (hora < 12)){
                    return "Guten Morgen";
                }
                else if ( (hora >= 12) && (hora < 18)){
                    return "Guten Nachmittag";
                }
                else if ( (hora >= 18) || (hora < 5)){
                    return "guten Abend";
                }

            case "fr":

                if( (hora >=5) && (hora < 12)){
                    return "Bonjour";
                }
                else if ( (hora >= 12) && (hora < 18)){
                    return "Bon après-midi";
                }
                else if ( (hora >= 18) || (hora < 5)){
                    return "bonsoir";
                }

        }
        return "";
    }
    public String getMsg2() {
        switch (this.lang){
            case "pt":
                return "Elaborado por";
            case "en":
                return "Created by";
            case "de":
                return "Erstellt von";
            case "fr":
                return "Créé par";
        }
        return "";
    }
}
