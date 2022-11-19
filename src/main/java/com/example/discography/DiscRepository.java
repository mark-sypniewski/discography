package com.example.discography;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DiscRepository {

    Map<Long, Disc> discsList = new HashMap<>();

    public DiscRepository() {
        Disc sampleDisc = new Disc(1234L, "sampleArtist", "sampleAlbum", "sampleImageUrl", "sampleCategory", "sampleTracklist");

        discsList.put(sampleDisc.getId(), sampleDisc);
    }

    public DiscRepository(Disc discOne, Disc discTwo) {
    }

    public Disc findOne(Long id) {return discsList.get(id);}

    public Collection<Disc> findAll() {return discsList.values();}
}
