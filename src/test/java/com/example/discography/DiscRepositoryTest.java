package com.example.discography;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThat;

import java.util.Collection;

public class DiscRepositoryTest {

    private DiscRepository underTest;
    private Disc discOne = new Disc(1L, "discOne artist", "discOne album", "discOne imageUrl",
            "discOne category", "discOne tracklist");
    private Disc discTwo = new Disc(2L, "discTwo artist", "discTwo album", "discTwo imageUrl",
            "discTwo category", "discTwo tracklist");

    private Collection<Object> assertThat(Collection<Disc> foundDiscs) {
    }


    @Test
    public void shouldFindDiscOne(){
        underTest = new DiscRepository(discOne);
        Disc foundDisc = underTest.findOne(1L);
        assertEquals(discOne, foundDisc);
    }

    @Test
    public void shouldFindDiscOneAndDiscTwo(){
        underTest = new DiscRepository(discOne, discTwo);
        Collection<Disc> foundDiscs = underTest.findAll();
        assertThat(foundDiscs).contains(discOne);

    }



}
