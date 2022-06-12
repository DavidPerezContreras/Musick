package org.iesmurgi.proyectolevidaviddam.models;

public class Notifications {
    int id;
    String emisor;
    String receptor;
    String notification;

    public Notifications(int id, String emisor, String receptor, String notification){
        this.id = id;
        this.emisor = emisor;
        this.receptor = receptor;
        this.notification = notification;
    }

    /**
     * Obtiene el recepetor
     * @return
     */
    public String getReceptor() {
        return receptor;
    }

    /**
     * Establece el receptor
     * @param receptor
     */
    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    /**
     * Establece el id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Establece el emisor
     * @param emisor
     */
    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    /**
     * Obtiene el emisor
     * @return
     */
    public String getEmisor() {
        return emisor;
    }

    /**
     * Obtiene el id
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene las notificaciones
     * @return
     */
    public String getNotification() {
        return notification;
    }

    /**
     * Establece las notificaciones
     * @param notification
     */
    public void setNotification(String notification) {
        this.notification = notification;
    }

}
