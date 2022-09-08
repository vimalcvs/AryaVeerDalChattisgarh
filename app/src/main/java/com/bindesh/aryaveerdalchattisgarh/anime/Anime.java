package com.bindesh.aryaveerdalchattisgarh.anime;

public class Anime {
    private String name ;
    private String Description;


    private String categorie;


    private String image_url;

    public Anime() {
    }

    public Anime(String name, String description, String rating, int nb_episode, String categorie, String studio, String image_url) {
        this.name = name;
        Description = description;


        this.categorie = categorie;


        this.image_url = image_url;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }



    public String getCategorie() {
        return categorie;
    }



    public String getImage_url() {
        return image_url;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }



    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }



    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
