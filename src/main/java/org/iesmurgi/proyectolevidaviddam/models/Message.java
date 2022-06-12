package org.iesmurgi.proyectolevidaviddam.models;

import java.security.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Message  {

    String body;
    String emisor;
    String receptor;
    Date datetime;
    String date;

    public Message(){

    }

    public Message(String body, String emisor, String receptor, String date){
        this.body = body;
        this.emisor = emisor;
        this.receptor = receptor;
        this.date = date;
    }

    /**
     * Establece el emisor
     * @param username
     */
    public void setEmisor(String username) {
        this.emisor = username;
    }

    /**
     * Establece el receptor
     * @param receptor
     */
    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    /**
     * Obtiene el receptor
     * @return
     */
    public String getReceptor() {
        return receptor;
    }

    /**
     * Obtiene el emisor
     * @return
     */
    public String getEmisor() {
        return emisor;
    }

    /**
     * Obtiene el mensaje
     * @return
     */
    public String getMessage() {
        return body;
    }

    /**
     * Establece el mensaje
     * @param message
     */
    public void setMessage(String message) {
        this.body = message;
    }

    /**
     * Obtiene la fecha del mensaje
     * @return
     */
    public String getDatetime() {
        return date;
    }

    /**
     * Establece la fecha del mensaje
     * @param datetime
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString(){
        return  "{"
                +"\"body\":\""+ body+ "\","
                +"\"emisor\":\""+ emisor + "\","
                +"\"receptor\":\""+ receptor + "\","
                +"\"date\":\""+ date + "\""
                +"}";
    }

//    private String parseDate() {
//        String formatedDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(datetime);
//        return formatedDate;
//    }
}
