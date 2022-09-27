package com.example.ArtGalleryApi;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Art {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;
    private String title;
    private String artist;
    private String image;
    private int year;
    private String medium;

    public Art(String id, String title, String artist, String image, int year, String medium) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.image = image;
        this.year = year;
        this.medium = medium;
    }

    public Art(){

    }

    public String getId(){
        return id;
    }

}
