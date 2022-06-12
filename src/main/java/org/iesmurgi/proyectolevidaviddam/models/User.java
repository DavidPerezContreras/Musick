package org.iesmurgi.proyectolevidaviddam.models;


public class User {

    String name;
    String surname;
    String username;
    String password;
    String profileimage;
    String email;
    String state;
    int online;

    /**
     * Obtiene la contraseña
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece la contraseña
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Obtiene el estado de conexión
     * @return
     */
    public int getOnline() {
        return online;
    }

    /**
     * Obtiene si es admin o no en formato int 0, 1
     * @return
     */
    public int getAdmin() {
        return admin;
    }

    /**
     * Establece si es o no admin
     * @param admin
     */
    public void setAdmin(int admin) {
        this.admin = admin;
    }

    int admin;

    public User(String name, String surname, String username, String password, String email, String profileimage, String state, int online, int admin){
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.profileimage = profileimage;
        this.state = state;
        this.online = online;
        this.admin=admin;
    }

    public User(String name, String surname, String username, String password, String email, String profileimage, String state){
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.profileimage = profileimage;
        this.state = state;
    }

    public User(){

    }

    public User(String username){
        this.username = username;
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    /**
     * Obtiene el estado de usuario
     * @return
     */
    public String getState() {
        return state;
    }

    /**
     * Establece el estado de usuario
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Obtiene si está o no en línea
     * @return
     */
    public int isOnline() {
        return online;
    }

    /**
     * Establece si está o no en línea
     * @param online
     */
    public void setOnline(int online) {
        this.online = online;
    }

    /**
     * Establece el mail de usuario
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Establece el nombre de usuario
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Establece la imagen de perfil
     * @param profileimage
     */
    public void setProfileimage(String profileimage) {
        this.profileimage = profileimage;
    }

    /**
     * Establece los apellidos
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Establece el username
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Obtiene el nombre
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Obtiene el email
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * Obtiene el apellido
     * @return
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Obtiene el username
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * Obtiene la imagen de perfil de usuario
     * @return
     */
    public String getProfileimage() {
        return profileimage;
    }
}
