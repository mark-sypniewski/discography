package com.example.discography;

public class Disc {

    private Long id;
    private String artist;
    private String album;
    private String imageUrl;
    private String category;
    private String tracklist;

    public Long getId() {return id;}
    public String getArtist() {return artist;}
    public String getAlbum() {return album;}
    public String getImageUrl() {return imageUrl;}
    public String getCategory() {return category;}
    public String getTracklist() {return tracklist;}



    public Disc(Long id, String artist, String album, String imageURL, String category, String tracklist) {
        this.id = id;
        this.artist = artist;
        this.album = album;
        this.imageUrl = imageURL;
        this.category = category;
        this.tracklist = tracklist;
    }
}
