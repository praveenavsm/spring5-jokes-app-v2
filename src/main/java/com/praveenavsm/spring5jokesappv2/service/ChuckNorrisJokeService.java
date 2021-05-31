package com.praveenavsm.spring5jokesappv2.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class ChuckNorrisJokeService implements JokeService{

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokeService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
