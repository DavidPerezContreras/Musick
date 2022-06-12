package org.iesmurgi.proyectolevidaviddam.models;

public class Item {

    public String username;
    public int id;
    public String name;
    public String item;
    public String description;
    public String image;
    public String genre;
    public int copyright;       //1 si   0 no
    public String uploadDate;

    public Item(String username, int id, String name, String item, String description, String image, String genre, int copyright, String uploadDate) {
        this.username = username;
        this.id = id;
        this.name = name;
        this.item = item;
        this.description = description;
        this.image = image;
        this.genre = genre;
        this.copyright = copyright;
        this.uploadDate=uploadDate;
    }

    /**
     * Obtiene la descripción
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * Establece la descripción
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Obtiene el nombre de la imagen
     * @return
     */
    public String getImage() {
        return image;
    }

    /**
     * Establece el nombre de la imagen
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Obtiene el género de la canción
     * @return
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Establece el género de la canción
     * @param genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Devuelve el copyright en formato int
     * @return
     */
    public int isCopyright() {
        return copyright;
    }

    /**
     * Establece el copyright en formato int
     * @param copyright
     */
    public void setCopyright(int copyright) {
        this.copyright = copyright;
    }

    public Item(){

    }

    /**
     * Obtiene el nombre de usuario
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * Establece el nombre de usuario
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Obtiene el id
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Devuelve el nombre de la canción
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre de la canción
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve la referencia al .mp3 en el servidor
     * @return
     */
    public String getItem() {
        return item;
    }

    /**
     * Establece la referencia al .mp3 en el servidor
     * @param item
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * Obtiene la fecha de subido
     * @return
     */
    public String getUploadDate() {
        return uploadDate;
    }

    /**
     * Establece la fecha de subida
     * @param uploadDate
     */
    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }
}
